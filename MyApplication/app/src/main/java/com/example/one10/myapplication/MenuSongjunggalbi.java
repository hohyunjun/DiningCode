package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MenuSongjunggalbi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("꽃삼겹살(100g) ========== 2500원");
        data.add("갈매기살(100g) ========== 2500원");
        data.add("대패삼겹살(100g) ========== 2500원");
        data.add("목삼겹살(100g) ========== 2500원");
        data.add("갈비(200g) ========== 5000원");
        data.add("돼지불고기 ========== 5000원");
        data.add("김치찌개 ========== 5000원");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }

}