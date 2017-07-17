package com.yalin.componentapk.wrapper;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.yalin.componentapk.wrapper.classloader.WrapperClassLoader;
import com.yalin.componentapk.wrapper.component.ComponentContext;

import org.xmlpull.v1.XmlPullParser;

/**
 * @author jinyalin
 * @since 2017/7/1.
 */

public class ActivityDelegate {
    protected Activity host;
    private ComponentContext coreContext;

    public ActivityDelegate(Activity host) {
        this.host = host;
        this.coreContext = new ComponentContext(host);
    }

    public void onCreate(Bundle savedInstanceState) {
    }

    public void setContentView(@LayoutRes int layoutResID) {
        XmlPullParser xmlResourceParser = getResources().getLayout(layoutResID);
        View viewFromPlugin;
        try {
//            LayoutInflater inflater = LayoutInflater.from(host);
            LayoutInflater componentInflater = LayoutInflater.from(host).cloneInContext(coreContext);
//            inflater.setFactory(componentInflater.getFactory());
//            inflater.setFactory2(componentInflater.getFactory2());
            viewFromPlugin = componentInflater.inflate(xmlResourceParser, null);
            setContentView(viewFromPlugin);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void setContentView(View view) {
        host.setContentView(view);
    }

    public void onPostCreate(@Nullable Bundle savedInstanceState) {
    }

    public void onStart() {
    }

    public void onResume() {
    }

    public void onPostResume() {
    }

    public void onPause() {
    }

    public void onStop() {
    }

    public void onDestroy() {
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
    }

    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
    }

    public void onSaveInstanceState(Bundle outState) {
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
    }

    public void onAttachedToWindow() {
    }

    public void onDetachedFromWindow() {
    }

    public void onConfigurationChanged(Configuration newConfig) {
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }

    public View findViewById(@IdRes int id) {
        return host.findViewById(id);
    }

    public Resources getResources() {
        return WrapperClassLoader.getResources();
    }
}
