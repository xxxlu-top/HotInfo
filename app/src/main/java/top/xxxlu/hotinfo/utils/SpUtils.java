package top.xxxlu.hotinfo.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;

import top.xxxlu.hotinfo.BaseApplication;
import top.xxxlu.hotinfo.Config;

import top.xxxlu.hotinfo.BaseApplication;
import top.xxxlu.hotinfo.Config;

/**
 * 数据存储类
 */
public class SpUtils {
    /**
     * Preferences记录名称
     */
    private static final String NAME = Config.SP_NAME;

    public static void setStr(String key, String value) {
        SharedPreferences preferences = BaseApplication.getAppContext().getSharedPreferences(NAME, Context.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getStr(String key) {
        SharedPreferences preferences = BaseApplication.getAppContext().getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return preferences.getString(key, "");
    }

    public static void setInt(String key, int value) {
        SharedPreferences preferences = BaseApplication.getAppContext().getSharedPreferences(NAME, Context.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static int getInt(Context context, String key) {
        SharedPreferences preferences = BaseApplication.getAppContext().getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return preferences.getInt(key, 0);
    }

    public static void setFloat(String key, Float value) {
        SharedPreferences preferences = BaseApplication.getAppContext().getSharedPreferences(NAME, Context.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putFloat(key, value);
        editor.apply();
    }

    public static Float getFloat(Context context, String key) {
        SharedPreferences preferences = BaseApplication.getAppContext().getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return preferences.getFloat(key, 0);
    }

    public static void setLong(String key, long value) {
        SharedPreferences preferences = BaseApplication.getAppContext().getSharedPreferences(NAME, Context.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    public static long getLong(Context context, String key) {
        SharedPreferences preferences = BaseApplication.getAppContext().getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return preferences.getLong(key, 0L);
    }


    public static void setBool(String key, boolean value) {
        SharedPreferences preferences = BaseApplication.getAppContext().getSharedPreferences(NAME, Context.MODE_PRIVATE);
        Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public static boolean getBool(Context context, String key) {
        SharedPreferences preferences = BaseApplication.getAppContext().getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return preferences.getBoolean(key, false);
    }
}
