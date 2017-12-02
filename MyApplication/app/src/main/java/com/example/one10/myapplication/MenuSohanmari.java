package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MenuSohanmari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("소한마리 (600g+600g) ========== 39000원");
        data.add("등심(400g) ========== 20000원");
        data.add("갈비살(400g) ========== 20000원");
        data.add("안창살(400g) ========== 24000원");
        data.add("차돌박이(400g) ========== 12000원");
        data.add("한우채끝등심(150g) ========== 26000원");
        data.add("한우부채살(150g) ========== 26000원");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }

}