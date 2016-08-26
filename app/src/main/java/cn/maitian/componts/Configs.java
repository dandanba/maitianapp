package cn.maitian.componts;

import cn.maitian.componts.guide.GuideActivity;

/**
 * Created by geng on 2016/8/26.
 */
public class Configs extends cn.maitian.base.utils.ConfigUtil {

    public static final String KEY_STRING_NAME = "name";
    // ...
    public static final String KEY_INTEGER_AGE = "age";
    // ...
    public static final String KEY_BOOLEAN_GUIDEACTIVITY = GuideActivity.class.getSimpleName();
    // ...

    private static final String[] sStrings = new String[]{KEY_STRING_NAME,/*...*/};
    private static final String[] sIntegers = new String[]{KEY_INTEGER_AGE,/*...*/};
    private static final String[] sBooleans = new String[]{KEY_BOOLEAN_GUIDEACTIVITY,/*...*/};

    public static void init() {
        init(sStrings, sIntegers, sBooleans);
    }
}
