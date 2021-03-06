package com.ch1;
import com.example.androidprj.R;

import android.app.TabActivity; //3.0이상 버전에서는 더 이상 권장하지 않음.
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabTestActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_main);
        
        TabHost tabHost=getTabHost();
        TabSpec spec1=tabHost.newTabSpec("tag1").setIndicator("첫번째탭");
        spec1.setContent(R.id.lay1);
        tabHost.addTab(spec1);
        
        TabSpec spec2=tabHost.newTabSpec("tag2").setIndicator("두번째탭");
        spec2.setContent(R.id.text2);
        tabHost.addTab(spec2);
        
        Drawable image=getResources().getDrawable(R.drawable.ic_launcher);
        //탭에 이미지를 탭에 꽉채우게 하는 경우
       /* 
        ImageView img=new ImageView(this);
        BitmapDrawable bmd1=new BitmapDrawable();
        Resources res=getResources();
        bmd1=(BitmapDrawable)res.getDrawable(R.drawable.android);
        img.setImageDrawable(bmd1);
        img.setScaleType(ImageView.ScaleType.FIT_XY);
        TabSpec spec3=tabHost.newTabSpec("tag3").setIndicator(img);
        */
        TabSpec spec3=tabHost.newTabSpec("tag3").setIndicator("세번째탭",image);
        spec3.setContent(R.id.text3);
        tabHost.addTab(spec3);
        
        tabHost.setCurrentTab(0);
        
        
    }

}
