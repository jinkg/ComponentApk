package com.yalin.componentapk.wrapper;

import android.app.Activity;
import android.content.Context;

import com.yalin.componentapk.wrapper.classloader.WrapperClassLoader;


/**
 * @author jinyalin
 * @since 2017/7/1.
 */

public class WrapperApi {
    private static final String CORE_IMPL_CLASS
            = "com.yalin.componentapk.demo.core.CoreImpl";

    private static ICore sCore = null;

    private static void check(Context context) throws Exception {
        if (sCore == null) {
            synchronized (WrapperApi.class) {
                if (sCore == null) {
                    ICore core;
                    Class business1Class = WrapperClassLoader.loadClass(context, CORE_IMPL_CLASS);
                    if (business1Class != null) {
                        core = (ICore) business1Class.newInstance();
                    } else {
                        throw new IllegalStateException("Load sCore error.");
                    }
                    sCore = core;
                }
            }
        }
    }

    public static ActivityDelegate getActivityDelegate(Activity host) {
        try {
            check(host);
            return sCore.getBusinessActivity(host);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
