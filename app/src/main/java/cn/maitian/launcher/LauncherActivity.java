package cn.maitian.launcher;

import android.os.Bundle;
import android.os.Message;

import cn.maitian.actions.Actions;
import cn.maitian.actions.IntentUtils;
import cn.maitian.base.BaseActivity;
import cn.maitian.utils.os.LogHandler;


public class LauncherActivity extends BaseActivity {
    private final LogHandler mHandler = new LogHandler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            startActivity(IntentUtils.generageIntent(Actions.ACTION_MAIN));
            startActivity(IntentUtils.generageIntent(Actions.ACTION_GUIDE));
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
