package com.yalin.componentapk.wrapper.component;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

import com.yalin.componentapk.wrapper.classloader.WrapperClassLoader;

/**
 * @author jinyalin
 * @since 2017/7/3.
 */

public class ComponentContext extends ContextWrapper {
    public ComponentContext(Context base) {
        super(base);
    }

//    @Override
//    public Resources getResources() {
//        return WrapperClassLoader.getResources();
//    }

    @Override
    public ClassLoader getClassLoader() {
        return WrapperClassLoader.getClassLoader();
    }
}

