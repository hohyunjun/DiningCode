package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by jhh51 on 2017-12-02.
 */

public class MenuSongBaek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("만두전골 ========== 9,000");
        data.add("참치찌개 ========== 9,000");
        data.add("순두부찌개 ========== 9,000");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }

}
