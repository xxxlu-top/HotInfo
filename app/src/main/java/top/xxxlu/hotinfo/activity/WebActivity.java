package top.xxxlu.hotinfo.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

import org.xutils.common.util.LogUtil;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import top.xxxlu.hotinfo.R;

@ContentView(R.layout.activity_web)
public class WebActivity extends BaseFragmentActivity {

    @ViewInject(R.id.web_view)
    WebView mWebView;
    private String mUrl;
    private FloatingActionButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initView() {
//        mWebView = (WebView) findViewById(R.id.web_view);
        mWebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, String s) {
                return super.shouldOverrideUrlLoading(webView, s);
            }
        });
        mWebView.getSettings().setJavaScriptEnabled(true);
        mFab = (FloatingActionButton) findViewById(R.id.fab);

        mUrl = getIntent().getStringExtra("url");
        String content = getIntent().getStringExtra("content");
        if (mUrl != null) {
            LogUtil.i("地址："+mUrl);
            mWebView.loadUrl(mUrl);
        }else if (content!=null){
            mWebView.loadData(content, "text/html; charset=UTF-8", null);
        }
    }

    @Override
    public void initListener() {
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mWebView.canGoBack()){
                    mWebView.goBack();
                }else {
                    finish();
                }
            }
        });
    }

    @Override
    public void initData() {

    }

    @Override
    public void reqData() {

    }
}
