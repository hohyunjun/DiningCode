package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by KMUCS on 2017-12-02.
 */

public class MenuGulgaric extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_array);

        ListView listview = (ListView) findViewById(R.id.listviewmenu); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>();
        data.add("허니 머스타드,데리야끼,양념 1마리 ========== 11000원");
        data.add("허니 갈릭, 어니언 크리미 1마리 ========== 12000원");
        data.add("허니 머스타드,데리야끼,양념 2마리 ======= 17000원");
        data.add("허니 갈릭, 어니언 크리미 2마리 ========== 18000원");
        data.add("콜라 1.25L ========== 2000원");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(adapter);
    }

}
