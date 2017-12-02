package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by jhh51 on 2017-12-02.
 */

public class MenuJuiMara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("마라샹궈 (2인) ========== 20000원");
        data.add("소고기 훠궈 (1인) ========== 15000원");
        data.add("마오차이 (사천식 마라탕) ======= 6000~7000원");
        data.add("마라샹궈 (3~4인) ========== 28000원");
        data.add("양고기 훠궈(1인) ========== 16000원");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }

}
