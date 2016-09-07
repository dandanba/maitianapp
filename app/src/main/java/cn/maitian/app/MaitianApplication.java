package cn.maitian.app;

import com.crashlytics.android.Crashlytics;
import com.squareup.leakcanary.RefWatcher;

import cn.maitian.BuildConfig;
import cn.maitian.base.BaseApplication;
import cn.maitian.componts.Configs;
import cn.maitian.customactivityoncrash.CustomCrashUtil;
import cn.maitian.fraudmetrix.FMAgentUtil;
import cn.maitian.leakcanary_android.LeakCanaryUtil;
import cn.maitian.leancloud.LeanCloudUtil;
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
        initSocial(true, true);
        FMAgentUtil.init(this, true, true);
        Fabric.with(this, new Crashlytics());
        CustomCrashUtil.install(this);
        Configs.init();
        mRefWatcher = LeakCanaryUtil.install(this);
        LeanCloudUtil.init(this, false, BuildConfig.LEANCLOUD_APPID, BuildConfig.LEANCLOUD_APPKEY);
        sMaitianApplication = this;
    }

    public RefWatcher getRefWatcher() {
        return mRefWatcher;
    }
}
