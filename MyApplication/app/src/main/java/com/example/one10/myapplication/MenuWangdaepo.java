package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MenuWangdaepo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("삼겹살(1인분) ========== 2500원");
        data.add("소갈비살(1인분) ========== 20000원");
        data.add("닭도리탕 ========== 15000원");
        data.add("김치찌개(1인분) ========== 6000원");
        data.add("제육볶음(1인분) ========== 6000원");
        data.add("불고기(1인분) ========== 6000원");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }

}