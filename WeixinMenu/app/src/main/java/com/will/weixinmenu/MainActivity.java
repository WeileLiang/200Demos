package com.will.weixinmenu;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMenu(View view){
        LayoutInflater inflater=LayoutInflater.from(this);
        View v=inflater.inflate(R.layout.menu_layout,null);

        popupWindow=new PopupWindow(v, ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);

        if(Build.VERSION.SDK_INT>=21){
            popupWindow.setElevation(5.0f);
        }

        popupWindow.setOutsideTouchable(true);
        popupWindow.showAsDropDown(view,-50,0);
    }

    public void popupDismiss(View view){
        popupWindow.dismiss();
    }
}
