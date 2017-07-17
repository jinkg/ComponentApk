package com.yalin.componentapk.wrapper.classloader;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

import dalvik.system.DexClassLoader;

/**
 * @author jinyalin
 * @since 2017/7/17.
 */

public class CompatClassLoader extends DexClassLoader {
    private ClassLoader mHostClassLoader;

    public CompatClassLoader(String dexPath, String optimizedDirectory,
                             String librarySearchPath, ClassLoader parent) {
        super(dexPath, optimizedDirectory, librarySearchPath, parent);
        mHostClassLoader = parent;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        try {
            return super.loadClass(name);
        } catch (Exception e) {
            return mHostClassLoader.loadClass(name);
        }
    }

    @Override
    public URL getResource(String name) {
        try {
            return super.getResource(name);
        } catch (Exception e) {
            return mHostClassLoader.getResource(name);
        }
    }

    @Override
    public Enumeration<URL> getResources(String name) throws IOException {
        try {
            return super.getResources(name);
        } catch (Exception e) {
            return mHostClassLoader.getResources(name);
        }
    }

    @Override
    public InputStream getResourceAsStream(String name) {
        try {
            return super.getResourceAsStream(name);
        } catch (Exception e) {
            return mHostClassLoader.getResourceAsStream(name);
        }
    }
}
