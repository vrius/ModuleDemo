package com.discovery.module.demo;

import com.alibaba.android.arouter.launcher.ARouter;
import com.discovery.module.common.BaseApplication;

/**
 * Created by ruanwenjiang
 * on 19-5-6
 */
public class CoreApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        //在壳工程中初始化ARouter
        if (BuildConfig.DEBUG) {
            //一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ARouter.getInstance().destroy();
    }
}
