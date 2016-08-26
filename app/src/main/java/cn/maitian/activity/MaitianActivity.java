package cn.maitian.activity;

import android.os.Bundle;

import cn.maitian.app.MaitianApplication;
import cn.maitian.base.BaseActivity;
import cn.maitian.leakcanary_android.LeakCanaryUtil;
import cn.maitian.logger.LoggerUtil;

/**
 * Created by geng on 2016/8/26.
 */
public class MaitianActivity extends BaseActivity {

    private static final String TAG = MaitianActivity.class.getSimpleName();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoggerUtil.i(TAG, "onCreate");
    }

    protected void onDestroy() {
        super.onDestroy();
        LoggerUtil.i(TAG, "onDestroy");
        LeakCanaryUtil.watch(MaitianApplication.getMaitianApplication().getRefWatcher(), this);
    }
}
