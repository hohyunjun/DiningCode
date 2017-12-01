package com.example.one10.myapplication;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by one10 on 2017-11-01.
 */

public class Select_western extends AppCompatActivity implements ListViewBtnAdapter.ListBtnClickListener{

    @Override
    public void onListBtnClick1(int position) {
        Toast.makeText(this, Integer.toString(position+1) + " Item is selected..", Toast.LENGTH_SHORT).show() ;
    }

    @Override
    public void onListBtnClick2(int position) {
        Toast.makeText(this, Integer.toString(position+1) + " Item is selected..", Toast.LENGTH_SHORT).show() ;
    }


    public boolean loadItemsFromDB(ArrayList<ListViewBtnItem> list) {
        ListViewBtnItem item ;
        int i ;

        if (list == null) {
            list = new ArrayList<ListViewBtnItem>() ;
        }

        // 순서를 위한 i 값을 1로 초기화.
        i = 1 ;

        // 아이템 생성.
        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_disorder)) ;
        item.setText("맘스터치") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_disorder_2)) ;
        item.setText("델리버스") ;
        list.add(item) ;
        i++ ;

        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_western);

        ListView listview = (ListView) findViewById(R.id.listview8); // 리스트뷰 객체화
        ListViewBtnAdapter adapter;
        ArrayList<ListViewBtnItem> items = new ArrayList<ListViewBtnItem>();

        loadItemsFromDB(items);

        adapter = new ListViewBtnAdapter(this, R.layout.listview_btn_item, items, this);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {

            }
        });
    }

/*
        ListView listview=(ListView)findViewById(R.id.listview8); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>(); // 리스트뷰에 담을 배열
        data.add("맘스터치");
        data.add("델리버스");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);

        listview.setAdapter(adapter);

*/

}
