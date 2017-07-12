package com.yalin.componentapk.wrapper.classloader;

import android.content.Context;
import android.content.res.Resources;
import android.os.Environment;


import com.yalin.componentapk.resourcesmanager.ResourcesManager;

import java.io.File;

import dalvik.system.DexClassLoader;

/**
 * @author jinyalin
 * @since 2017/7/1.
 */

public class WrapperClassLoader {
    private static final String CORE_APK_FILE_NAME = "component.apk";
    private static volatile ClassLoader classLoader;
    private static volatile Resources resources;

    private static void init(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context can not be null.");
        } else if (classLoader == null) {
            synchronized (WrapperClassLoader.class) {
                if (classLoader == null) {
                    File coreFilePath =
                            new File(Environment.getExternalStorageDirectory(), CORE_APK_FILE_NAME);
                    resources = ResourcesManager.createResources(context.getApplicationContext(),
                            coreFilePath.getAbsolutePath());
                    classLoader = new DexClassLoader(coreFilePath.getAbsolutePath(),
                            context.getCacheDir().getAbsolutePath(),
                            null, context.getClassLoader());
                }
            }
        }
    }

    public static Class<?> loadClass(Context context, String str) throws Exception {
        init(context);
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException e) {
            throw e;
        }
    }

    public static ClassLoader getClassLoader() {
        return classLoader;
    }

    public static Resources getResources() {
        return resources;
    }
}