package cn.maitian.componts.launcher;

import android.os.Bundle;
import android.os.Message;

import cn.maitian.activity.MaitianActivity;
import cn.maitian.componts.Actions;
import cn.maitian.componts.Configs;
import cn.maitian.utils.IntentUtils;
import cn.maitian.utils.os.LogHandler;


public class LauncherActivity extends MaitianActivity {
    private LogHandler mHandler = new LogHandler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            startActivity(IntentUtils.generageIntent(Actions.ACTION_SHARE));
            if (!Configs.getValue(Configs.KEY_BOOLEAN_GUIDEACTIVITY, false)) {
                Configs.setValue(Configs.KEY_BOOLEAN_GUIDEACTIVITY, true);
                startActivity(IntentUtils.generageIntent(Actions.ACTION_GUIDE));
            }
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHandler.sendEmptyMessageDelayed(1, 3000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHandler.removeCallbacksAndMessages();
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }

}
