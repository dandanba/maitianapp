package cn.maitian.componts;

import cn.maitian.componts.auth.AuthActivity;
import cn.maitian.componts.guide.GuideActivity;
import cn.maitian.componts.launcher.LauncherActivity;
import cn.maitian.componts.main.MainActivity;
import cn.maitian.componts.share.ShareActivity;

/**
 * Created by geng on 2016/8/20.
 */
public class Actions {
    public static final String ACTION_LAUNCHER = LauncherActivity.class.getName();
    public static final String ACTION_GUIDE = GuideActivity.class.getName();
    public static final String ACTION_MAIN = MainActivity.class.getName();
    public static final String ACTION_AUTH = AuthActivity.class.getName();
    public static final String ACTION_SHARE = ShareActivity.class.getName();
}
