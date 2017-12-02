package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by KMUCS on 2017-12-02.
 */

public class MenuMattzang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("오리지널 치킨 ========== 10000원");
        data.add("자이언트 포테이토 ========== 9900원");
        data.add("스파이시 치킨 ======= 12000원");
        data.add("무인도 골뱅이섬 ========== 12000원");
        data.add("수구레탕 ========== 12000원");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }

}
