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

public class Select_not_soup extends AppCompatActivity implements ListViewBtnAdapter.ListBtnClickListener{


    @Override
    public void onListBtnClick(int position) {
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
        item.setText("송백식당") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_disorder_2)) ;
        item.setText("쌈스토리") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_search)) ;
        item.setText("그림비") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_snack)) ;
        item.setText("두번째이야기") ;
        list.add(item) ;

        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_not_soup);

        ListView listview=(ListView)findViewById(R.id.listview5); // 리스트뷰 객체화
        ListViewBtnAdapter adapter;
        ArrayList<ListViewBtnItem> items = new ArrayList<ListViewBtnItem>() ;

        loadItemsFromDB(items);

        adapter = new ListViewBtnAdapter(this, R.layout.listview_btn_item, items, this);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v,int position, long id){

            }
        });


        /*
        ArrayList<String> data = new ArrayList<String>(); // 리스트뷰에 담을 배열
        data.add("송백식당");
        data.add("쌈스토리");
        data.add("그림비");
        data.add("두번째이야기");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);

        listview.setAdapter(adapter);
        */
    }




}
