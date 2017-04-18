package com.ppjun.android.common.utils;

/**
 * Package :com.ppjun.android.common.utils
 * Description :
 * Author :Rc3
 * Created at :2017/04/18 21:49.
 */

public class LogUtil {

    private  static String tag = LogUtil.class.getSimpleName();
    private static boolean log = true;

    public static void setTag(String tag) {
        LogUtil.tag = tag;
    }

    public static void setLog(boolean log) {
        LogUtil.log = log;
    }

    public static void i(String msg) {
        if (log)
            android.util.Log.i(tag, msg);
    }

    public static void i(String tag, String msg) {
        if (log)
            android.util.Log.i(tag, msg);
    }

    public static void d(String msg) {
        if (log)
            android.util.Log.d(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (log)
            android.util.Log.d(tag, msg);
    }

    public static void w(String msg) {
        if (log)
            android.util.Log.w(tag, msg);
    }

    public static void w(String tag, String msg) {
        if (log)
            android.util.Log.w(tag, msg);
    }

    public static void v(String msg) {
        if (log)
            android.util.Log.v(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (log)
            android.util.Log.v(tag, msg);
    }

    public static void e(String msg) {
        android.util.Log.e(tag, msg);
    }

    public static void e(String tag, String msg) {
        android.util.Log.e(tag, msg);
    }
}
