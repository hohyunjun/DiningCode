package com.example.one10.myapplication;

import android.graphics.drawable.Drawable;
import android.util.Log;

/**
 * Created by jhh51 on 2017-11-30.
 */

public class ListViewBtnItem {
    private Drawable iconDrawable;
    private String textStr;

    public void setIcon(Drawable icon){
        iconDrawable = icon;
        Log.d("ListViewBtnItem","(로그 메시지) setIcon 실행.");
    }
    public void setText(String text){
        textStr = text;
        Log.d("ListViewBtnItem","(로그 메시지) setText 실행.");
    }

    public Drawable getIcon(){
        Log.d("ListViewBtnItem","(로그 메시지) getIcon 실행.");
        return this.iconDrawable;
    }
    public String getText(){
        Log.d("ListViewBtnItem","(로그 메시지) getText 실행.");
        return this.textStr;
    }
}
