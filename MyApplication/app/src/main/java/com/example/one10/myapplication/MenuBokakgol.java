package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MenuBokakgol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("삼겹살 ========== 6000원");
        data.add("숯불돼지갈비 ========== 6000원");
        data.add("소금구이 ========== 8000원");
        data.add("생삼겹살 ========== 13000원");
        data.add("소갈비살 ========== 12000원");
        data.add("물냉면 ========== 5000원");
        data.add("비빔냉면 ========== 5000원");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }
}