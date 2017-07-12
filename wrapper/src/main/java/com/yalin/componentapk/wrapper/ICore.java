package com.yalin.componentapk.wrapper;

import android.app.Activity;

/**
 * @author jinyalin
 * @since 2017/7/3.
 */

public interface ICore {
    ActivityDelegate getBusinessActivity(Activity host);
}
