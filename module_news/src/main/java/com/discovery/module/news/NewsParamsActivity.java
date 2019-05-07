package com.discovery.module.news;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.discovery.module.common.base.RouterPath;

@Route(path = RouterPath.MODEULE_NEWS_PARAMS_ACTIVITY)
public class NewsParamsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity_main);
        ARouter.getInstance().inject(this);

        Intent intent = getIntent();
        if (intent != null){
            String result = intent.getStringExtra("params");
            Toast.makeText(this,result,Toast.LENGTH_SHORT).show();
        }

        //跳转到fragment的时候，只需要跳转到对应的activity即可，然后根据路由加载对应的fragment。
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragment = (Fragment) ARouter.getInstance()
                .build(RouterPath.MODEULE_NEWS_FRAGMENT).navigation();
        transaction.replace(R.id.news_fragment_content, fragment);
        transaction.commit();

    }
}
