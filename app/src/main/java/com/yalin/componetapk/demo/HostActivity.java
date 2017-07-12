package com.yalin.componetapk.demo;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.yalin.componentapk.wrapper.ActivityDelegate;
import com.yalin.componentapk.wrapper.WrapperApi;

public class HostActivity extends AppCompatActivity {
    private ActivityDelegate activityDelegate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityDelegate = WrapperApi.getActivityDelegate(this);
        if (activityDelegate != null) {
            activityDelegate.onCreate(savedInstanceState);
        }
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if (activityDelegate != null) {
            activityDelegate.onPostCreate(savedInstanceState);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (activityDelegate != null) {
            activityDelegate.onStart();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (activityDelegate != null) {
            activityDelegate.onResume();
        }
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        if (activityDelegate != null) {
            activityDelegate.onPostResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (activityDelegate != null) {
            activityDelegate.onPause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (activityDelegate != null) {
            activityDelegate.onStop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (activityDelegate != null) {
            activityDelegate.onDestroy();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (activityDelegate != null) {
            activityDelegate.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (activityDelegate != null) {
            activityDelegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (activityDelegate != null) {
            activityDelegate.onSaveInstanceState(outState);
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (activityDelegate != null) {
            activityDelegate.onRestoreInstanceState(savedInstanceState);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (activityDelegate != null) {
            activityDelegate.onAttachedToWindow();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (activityDelegate != null) {
            activityDelegate.onDetachedFromWindow();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (activityDelegate != null) {
            activityDelegate.onConfigurationChanged(newConfig);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (activityDelegate != null) {
            return activityDelegate.onCreateOptionsMenu(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (activityDelegate != null) {
            return activityDelegate.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }
}
