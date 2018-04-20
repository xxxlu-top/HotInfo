package top.xxxlu.hotinfo.activity.content;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.xutils.view.annotation.ViewInject;

import top.xxxlu.hotinfo.R;
import top.xxxlu.hotinfo.activity.BaseFragmentActivity;

public class ContentActivity extends BaseFragmentActivity {

    @ViewInject(R.id.hot_content)
    TextView mHotContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public void initView() {
        String content = getIntent().getStringExtra("content");
        mHotContent.setText(content);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void reqData() {

    }

}
