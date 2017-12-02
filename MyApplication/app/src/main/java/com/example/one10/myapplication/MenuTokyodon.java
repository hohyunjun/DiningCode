package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MenuTokyodon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("베이직 돈카츠 ========== 9000원");
        data.add("히레카츠 ========== 15000원");
        data.add("마늘돈카츠 ======= 9000원");
        data.add("고추돈카츠 ========== 9000원");
        data.add("후추 돈카츠 ========== 9000원");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }

}
