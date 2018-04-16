package top.xxxlu.hotinfo.activity;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import top.xxxlu.hotinfo.utils.Ahttp;
import top.xxxlu.hotinfo.utils.ArequestCallBack;
import top.xxxlu.hotinfo.utils.ConInterface;
import top.xxxlu.hotinfo.utils.SpKey;
import top.xxxlu.hotinfo.utils.SpUtils;

import org.json.JSONObject;


/**
 * Created by LiBin on 15/11/26.
 */

@SuppressLint("NewApi")
public class AppCatchService extends Service {
    private static final int NOTIFY_ID = 1;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        try {
            if (intent.getStringExtra("initMainData") != null) {
                getHttpData();
                return START_NOT_STICKY;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return START_NOT_STICKY;
    }


    /**
     * 获取首页全部数据
     */
    public void getHttpData() {
        Ahttp ahttp = null;
        JSONObject ob = new JSONObject();
        if (SpUtils.getBool(this, ConInterface.Sample)) {
            ahttp = new Ahttp(ConInterface.Sample, ob.toString());
        } else {
            ahttp = new Ahttp(ConInterface.Sample, ob.toString());
        }
        ahttp.send(new ArequestCallBack<String>(ahttp) {
            @Override
            public void onMySuccess(String responseInfo) {
                SpUtils.setStr(SpKey.initMainData, responseInfo);
                SpUtils.setStr(SpKey.initMainData_Time, System.currentTimeMillis() + "");
                System.out.println("获取首页初始化数据=========================");

            }

            @Override
            public void onFinished() {
                super.onFinished();
            }

        });
    }
}
