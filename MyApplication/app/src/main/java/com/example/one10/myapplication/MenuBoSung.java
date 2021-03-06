package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by jhh51 on 2017-12-02.
 */

public class MenuBoSung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("자장면(현금가) ========== 2500원");
        data.add("짬뽕(현금가) ========== 3000원");
        data.add("볶음밥(현금가) ========== 3000원");
        data.add("간짜장(현금가) ========== 3000원");
        data.add("배달 시 500원씩 추가");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }

}
