package cn.maitian.config;

import android.content.Context;

import java.util.HashMap;

import cn.maitian.app.MaitianApplication;
import cn.maitian.guide.GuideActivity;
import cn.maitian.secure_pref_manager.SecurePrefUtils;

/**
 * Created by geng on 2016/8/26.
 */
public class Configs {

    public static final String KEY_STRING_NAME = "name";
    // ...
    public static final String KEY_INTEGER_AGE = "age";
    // ...
    public static final String KEY_BOOLEAN_GUIDEACTIVITY = GuideActivity.class.getSimpleName();
    // ...

    private static final String[] sStrings = new String[]{KEY_STRING_NAME,/*...*/};
    private static final String[] sIntegers = new String[]{KEY_INTEGER_AGE,/*...*/};
    private static final String[] sBooleans = new String[]{KEY_BOOLEAN_GUIDEACTIVITY,/*...*/};

    private static final HashMap<String, String> sStringMap = new HashMap<>();
    private static final HashMap<String, Integer> sIntegerMap = new HashMap<>();
    private static final HashMap<String, Boolean> sBooleanMap = new HashMap<>();

    public static void init(Context context) {
        SecurePrefUtils.initialize(context);
        for (String name : sStrings) {
            sStringMap.put(name, SecurePrefUtils.getValue(context, name, ""));
        }
        for (String name : sIntegers) {
            sIntegerMap.put(name, SecurePrefUtils.getValue(context, name, 0));
        }
        for (String name : sBooleans) {
            sBooleanMap.put(name, SecurePrefUtils.getValue(context, name, false));
        }
    }

    public static void setValue(String name, String value) {
        SecurePrefUtils.setValue(MaitianApplication.getMaitianApplication(), name, value);
        sStringMap.put(name, value);
    }

    public static void setValue(String name, int value) {
        SecurePrefUtils.setValue(MaitianApplication.getMaitianApplication(), name, value);
        sIntegerMap.put(name, value);
    }

    public static void setValue(String name, boolean value) {
        SecurePrefUtils.setValue(MaitianApplication.getMaitianApplication(), name, value);
        sBooleanMap.put(name, value);
    }

    public static String getValue(String name, String defaultValue) {
        return sStringMap.containsKey(name) ? sStringMap.get(name) : defaultValue;
    }

    public static int getValue(String name, int defaultValue) {
        return sIntegerMap.containsKey(name) ? sIntegerMap.get(name) : defaultValue;
    }

    public static boolean getValue(String name, boolean defaultValue) {
        return sBooleanMap.containsKey(name) ? sBooleanMap.get(name) : defaultValue;
    }
}
