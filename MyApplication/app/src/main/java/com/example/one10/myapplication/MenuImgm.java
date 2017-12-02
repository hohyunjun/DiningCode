package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by jhh51 on 2017-12-02.
 */

public class MenuImgm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("수타간짜장 ========== 6000원");
        data.add("유산슬밥 ========== 12000원");
        data.add("수타짜장 ======= 5000원");
        data.add("마파두부밥 ========== 6500원");
        data.add("수타짬뽕 ========== 6000원");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }

}
