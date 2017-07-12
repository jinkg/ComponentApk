package com.yalin.componentapk.wrapper.component;

import android.content.Context;
import android.view.LayoutInflater;

/**
 * @author jinyalin
 * @since 2017/7/3.
 */

public class ComponentLayoutInflater extends LayoutInflater {

    protected ComponentLayoutInflater(LayoutInflater original, Context newContext) {
        super(original, newContext);
    }

    @Override
    public LayoutInflater cloneInContext(Context newContext) {
        return null;
    }
}
