package com.discovery.module.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.discovery.module.common.base.RouterPath;

@Route(path = RouterPath.MODEULE_NEWS_ACTIVITY)
public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity_main);
        ARouter.getInstance().inject(this);
    }
}
