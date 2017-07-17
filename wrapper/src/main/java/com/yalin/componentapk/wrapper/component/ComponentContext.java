package com.yalin.componentapk.wrapper.component;

import android.content.ContextWrapper;
import android.content.res.Resources;

import com.yalin.componentapk.wrapper.classloader.WrapperClassLoader;

/**
 * @author jinyalin
 * @since 2017/7/3.
 */

public class ComponentContext extends ContextWrapper {
    private Resources.Theme mTheme;

    public ComponentContext(ContextWrapper base) {
//        super(base.getBaseContext());
        super(base);
    }

    @Override
    public Resources getResources() {
        return WrapperClassLoader.getResources();
    }

    @Override
    public ClassLoader getClassLoader() {
        return WrapperClassLoader.getClassLoader();
    }

}

