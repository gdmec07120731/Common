package com.ppjun.android.common.utils;

import android.content.Context;

/**
 * Package :com.ppjun.android.common.utils
 * Description :
 * Author :Rc3
 * Created at :2017/04/18 21:35.
 */

public class ScreenUtil {
    public static int dip2px(Context content, float dpValue) {
        final float scale = content.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}