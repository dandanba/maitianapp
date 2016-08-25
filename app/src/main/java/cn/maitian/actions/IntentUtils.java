package cn.maitian.actions;

import android.content.Intent;

/**
 * Created by geng on 2016/8/20.
 */
public class IntentUtils {
    public static Intent generageIntent(String action) {
        return new Intent(action);
    }
}
