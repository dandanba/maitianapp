package cn.maitian.app;

import com.squareup.leakcanary.RefWatcher;

import cn.maitian.base.BaseApplication;
import cn.maitian.config.Configs;
import cn.maitian.leakcanary_android.LeakCanaryUtil;

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
        Configs.init(this);
        mRefWatcher = LeakCanaryUtil.install(this);
        sMaitianApplication = this;
    }

    public RefWatcher getRefWatcher() {
        return mRefWatcher;
    }
}
