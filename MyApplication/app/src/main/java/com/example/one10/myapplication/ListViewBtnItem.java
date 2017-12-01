package com.example.one10.myapplication;

import android.graphics.drawable.Drawable;

/**
 * Created by jhh51 on 2017-11-30.
 */

public class ListViewBtnItem {
    private Drawable iconDrawable;
    private String textStr;

    public void setIcon(Drawable icon){
        iconDrawable = icon;
    }
    public void setText(String text){
        textStr = text;
    }

    public Drawable getIcon(){
        return this.iconDrawable;
    }
    public String getText(){
        return this.textStr;
    }
}
