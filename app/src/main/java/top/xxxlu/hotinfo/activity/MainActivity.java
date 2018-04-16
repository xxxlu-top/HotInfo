package top.xxxlu.hotinfo.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.alibaba.fastjson.JSON;
import com.allenliu.versionchecklib.v2.AllenVersionChecker;
import com.allenliu.versionchecklib.v2.builder.UIData;
import com.allenliu.versionchecklib.v2.callback.RequestVersionListener;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import top.xxxlu.hotinfo.Config;
import top.xxxlu.hotinfo.R;
import top.xxxlu.hotinfo.adapter.HotSearchAdapter;
import top.xxxlu.hotinfo.adapter.TouTiaoAdapter;
import top.xxxlu.hotinfo.adapter.WeiXinAdapter;
import top.xxxlu.hotinfo.bean.CurrentArticleBean;
import top.xxxlu.hotinfo.bean.HotSearch;

import org.xutils.common.util.LogUtil;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import top.xxxlu.hotinfo.bean.TouTiaoBean;
import top.xxxlu.hotinfo.bean.VersionBean;
import top.xxxlu.hotinfo.utils.AAMethod;
import top.xxxlu.hotinfo.utils.Ahttp;
import top.xxxlu.hotinfo.utils.ArequestCallBack;

@ContentView(R.layout.activity_main)
public class MainActivity extends BaseFragmentActivity implements NavigationView.OnNavigationItemSelectedListener {

    @ViewInject(R.id.hot_search_list)
    private RecyclerView mHotSearchList;
    @ViewInject(R.id.nav_menu)
    private NavigationView mNavMenu;
    @ViewInject(R.id.hot_toolbar)
    private Toolbar mHotToolbar;
    @ViewInject(R.id.hot_drawer_layout)
    private DrawerLayout mHotDrawerLayout;
    @ViewInject(R.id.hot_refresh)
    SmartRefreshLayout mHotRefresh;
    private HotSearch mHotSearch;
    private int type = 0;
    private TouTiaoBean mTouTiaoBean;
    private String mDataUrl = Config.WEIBO_URL;
    private CurrentArticleBean mWeixin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        reqData();
        upAPP();
    }

    @Override
    public void initView() {
        mHotSearchList.setLayoutManager(new LinearLayoutManager(this));
        mNavMenu.setNavigationItemSelectedListener(this);
        setSupportActionBar(mHotToolbar);
        mHotToolbar.setTitle("微博热搜榜");

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mHotDrawerLayout, mHotToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mHotDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void initListener() {
        mHotRefresh.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                reqData();
            }
        });
    }

    @Override
    public void initData() {

    }

    @Override
    public void reqData() {
        getWebData(null);
    }

    /**
     * 请求接口数据
     *
     * @param url
     */
    private void getWebData(String url) {
        if (url == null) {
            url = mDataUrl;
        }else {
            mDataUrl = url;
        }
        Ahttp ahttp = new Ahttp(myActivity, url);
        ahttp.sendGet(new ArequestCallBack<String>(ahttp) {
            @Override
            public void onMySuccess(String res) {
                LogUtil.i("请求结果" + res);
                switch (type) {
                    case 0:
                        //微博热搜榜
                        mHotSearch = JSON.parseObject(res, HotSearch.class);
                        mHotSearchList.setAdapter(new HotSearchAdapter(mHotSearch));
                        break;
                    case 1:
                        //今日头条
                        mTouTiaoBean = JSON.parseObject(res, TouTiaoBean.class);
//                        mHotSearchList
                        mHotSearchList.setAdapter(new TouTiaoAdapter(mTouTiaoBean));
                        break;

                    case 2:
                        mWeixin = JSON.parseObject(res,CurrentArticleBean.class);
                        mHotSearchList.setAdapter(new WeiXinAdapter(mWeixin));
                        break;
                    default:
                        break;
                }

                mHotRefresh.finishRefresh();
            }
        });
    }


    /**
     * 抽屉菜单
     *
     * @param item
     * @return
     */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        mHotDrawerLayout.closeDrawers();

        switch (item.getItemId()) {
            case R.id.nav_weibo:
                //微博
                type = 0;
                getWebData(Config.WEIBO_URL);
                break;

            case R.id.nav_news:
                toastShow("功能开发中...");
                break;

            case R.id.nav_weixin:
                //微信
                type = 2;
                getWebData(Config.WEIXIN_URL);
                break;

            case R.id.nav_toutiao:
                type = 1;
                getWebData(Config.JINRITOUTIAO_URL);
                break;

            case R.id.nav_article:
                toastShow("功能开发中...");
                break;

            case R.id.nav_setting:
                toastShow("功能开发中...");
                break;

            case R.id.nav_share:
                toastShow("功能开发中...");
                break;

            case R.id.nav_send:
                toastShow("功能开发中...");
                break;
            default:
                break;
        }

        return true;
    }

    /**
     * 版本升级检测
     */
    private void upAPP(){
        AllenVersionChecker
                .getInstance()
                .requestVersion()
                .setRequestUrl(Config.APP_VERSION)
                .request(new RequestVersionListener() {
                    @Nullable
                    @Override
                    public UIData onRequestVersionSuccess(String result) {
                        VersionBean bean = JSON.parseObject(result,VersionBean.class);
                        if (bean.getData().getVersionCode()> AAMethod.getVersionCode(getApplicationContext())){
                            UIData uiData = UIData.create()
                                    .setDownloadUrl(bean.getData().getAppUrl())
                                    .setTitle(bean.getData().getTitle())
                                    .setContent(bean.getData().getMsg());
                            return uiData;
                        }else {
                            return null;
                        }
                    }

                    @Override
                    public void onRequestVersionFailure(String message) {

                    }
                }).excuteMission(myActivity);
    }
}
