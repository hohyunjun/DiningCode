package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MenuJokyung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("일품삼겹살 ========== 4500원");
        data.add("포키생고기 ========== 5000원");
        data.add("목살 ========== 4500원");
        data.add("상추모듬버섯 ========== 3000원");
        data.add("냄비누룽지 ========== 3000원");
        data.add("치즈볶음밥 ========== 3000원");
        data.add("생고기김치전골 ========== 10000원");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }

}