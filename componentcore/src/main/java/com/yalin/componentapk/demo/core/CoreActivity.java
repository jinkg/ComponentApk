package com.yalin.componentapk.demo.core;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.yalin.componentapk.wrapper.ActivityDelegate;

import org.xmlpull.v1.XmlPullParser;

/**
 * @author jinyalin
 * @since 2017/7/1.
 */

public class CoreActivity extends ActivityDelegate {

    public CoreActivity(Activity hostActivity) {
        super(hostActivity);

    }

    private ImageView imageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        Button button = (Button) findViewById(R.id.button);
        button.setText(R.string.haha);
//        getResources().getXml(0x7f0a0011);

//        imageView = (ImageView) findViewById(R.id.content);

//        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.logo, null);

//        imageView.setImageDrawable(drawable);

//        imageView.setImageResource(R.drawable.logo);
    }
}
