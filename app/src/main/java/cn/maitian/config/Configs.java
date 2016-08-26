package cn.maitian.config;

import android.content.Context;

import cn.maitian.secure_pref_manager.SecurePrefUtils;

/**
 * Created by geng on 2016/8/26.
 */
public class Configs extends SecurePrefUtils {

    public static final String KEY_STRING_NAME = "name";
    // ...
    public static final String KEY_INTEGER_AGE = "age";
    // ...
    public static final String KEY_BOOLEAN_PASSED = "passed";
    // ...

    private static final String[] sStrings = new String[]{KEY_STRING_NAME,/*...*/};
    private static final String[] sIntegers = new String[]{KEY_INTEGER_AGE,/*...*/};
    private static final String[] sBooleans = new String[]{KEY_BOOLEAN_PASSED,/*...*/};

    public static void init(Context context) {
        SecurePrefUtils.initialize(context, sStrings, sIntegers, sBooleans);
    }
}
