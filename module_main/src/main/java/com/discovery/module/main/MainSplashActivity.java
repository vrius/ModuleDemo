package com.discovery.module.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.discovery.module.common.base.RouterPath;

@Route(path = RouterPath.MODEULE_MAIN_SPLASH_ACTIVITY)
public class MainSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_main);
        ARouter.getInstance().inject(this);

        //普通的跳转
        findViewById(R.id.main_to_news).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouterPath.MODEULE_NEWS_ACTIVITY).navigation();
            }
        });

        //带参数的跳转
        findViewById(R.id.main_to_news_params).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance()
                        .build(RouterPath.MODEULE_NEWS_PARAMS_ACTIVITY)
                        .withString("params","我是参数")
                        //.withChar()
                        //...
                        .navigation();
            }
        });
    }
}
