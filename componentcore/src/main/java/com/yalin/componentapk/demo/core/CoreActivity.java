package com.yalin.componentapk.demo.core;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.yalin.componentapk.wrapper.ActivityDelegate;

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
//        Context context = button.getContext();
//        System.out.println(context);
        button.setText(R.string.haha);
//        getResources().getXml(0x7f0a0011);

//        imageView = (ImageView) findViewById(R.id.content1);
//        System.out.println(imageView);
//        imageView.setImageResource(R.drawable.logo);

//        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.logo, null);

//        imageView.setImageDrawable(drawable);

//        imageView.setImageResource(R.drawable.logo);
    }
}
