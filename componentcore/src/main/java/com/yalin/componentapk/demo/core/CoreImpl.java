package com.yalin.componentapk.demo.core;

import android.app.Activity;

import com.yalin.componentapk.wrapper.ActivityDelegate;
import com.yalin.componentapk.wrapper.ICore;

/**
 * @author jinyalin
 * @since 2017/7/3.
 */

public class CoreImpl implements ICore {
    @Override
    public ActivityDelegate getBusinessActivity(Activity host) {
        return new CoreActivity(host);
    }
}
