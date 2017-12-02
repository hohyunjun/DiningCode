package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MenuChuline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("갈매기살(100g) ========== 2500원");
        data.add("삼겹살(100g) ========== 2500원");
        data.add("불고기 ========== 6000원");
        data.add("설렁탕 ========== 5000원");
        data.add("김치찌개 ========== 5000원");
        data.add("갈비탕 ========== 5000원");
        data.add("돼지갈비찜(1인분) ========== 5000원");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }
}