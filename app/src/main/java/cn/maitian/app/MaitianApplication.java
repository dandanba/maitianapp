package cn.maitian.app;

import com.crashlytics.android.Crashlytics;
import com.squareup.leakcanary.RefWatcher;

import cn.maitian.base.BaseApplication;
import cn.maitian.componts.Configs;
import cn.maitian.leakcanary_android.LeakCanaryUtil;
import io.fabric.sdk.android.Fabric;

/**
 * Created by geng on 2016/8/26.
 */
public class MaitianApplication extends BaseApplication {
    private static MaitianApplication sMaitianApplication;
    private RefWatcher mRefWatcher;

    public static MaitianApplication getMaitianApplication() {
        return sMaitianApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        Configs.init();
        mRefWatcher = LeakCanaryUtil.install(this);
        sMaitianApplication = this;
    }

    public RefWatcher getRefWatcher() {
        return mRefWatcher;
    }
}
