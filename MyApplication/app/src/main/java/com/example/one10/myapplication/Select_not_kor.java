package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by one10 on 2017-11-01.
 */

public class Select_not_kor extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_not_kor);

        ListView listview=(ListView)findViewById(R.id.listview4); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>(); // 리스트뷰에 담을 배열
        data.add("도쿄돈카츠");
        data.add("카츠동");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);

        listview.setAdapter(adapter);
    }
}
