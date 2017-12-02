package com.example.one10.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by one10 on 2017-11-01.
 */

public class Select_not_chicken extends AppCompatActivity implements ListViewBtnAdapter.ListBtnClickListener{

    @Override
    public void onListBtnClick1(int position) {
        if(position == 0) {
            Intent intent=new Intent(getApplicationContext(),SearchWangdaePo.class);
            startActivity(intent);
        }
        if(position == 1) {
            Intent intent=new Intent(getApplicationContext(),SearchJoKyung.class);
            startActivity(intent);
        }
        if(position == 2) {
            Intent intent=new Intent(getApplicationContext(),SearchBaebattgul.class);
            startActivity(intent);
        }
        if(position == 3) {
            Intent intent=new Intent(getApplicationContext(),SearchPighouse.class);
            startActivity(intent);
        }
        if(position == 4) {
            Intent intent=new Intent(getApplicationContext(),SearchSohanmari.class);
            startActivity(intent);
        }
        if(position == 5) {
            Intent intent=new Intent(getApplicationContext(),SearchSongjalbi.class);
            startActivity(intent);
        }
        if(position == 6) {
            Intent intent=new Intent(getApplicationContext(),SearchBokakjul.class);
            startActivity(intent);
        }
        if(position == 7) {
            Intent intent=new Intent(getApplicationContext(),SearchChuline.class);
            startActivity(intent);
        }
    }
    @Override
    public void onListBtnClick2(int position) {

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
        item.setText("왕대포") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_disorder_2)) ;
        item.setText("주경야돈") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_search)) ;
        item.setText("배밭골") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_search)) ;
        item.setText("돼지하우스") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_search)) ;
        item.setText("소한마리") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_search)) ;
        item.setText("송정갈비") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_search)) ;
        item.setText("북악골") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_search)) ;
        item.setText("철이네") ;
        list.add(item) ;
        i++ ;

        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_not_chicken);

        ListView listview = (ListView) findViewById(R.id.listview1); // 리스트뷰 객체화
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
        ListView listview=(ListView)findViewById(R.id.listview1); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>(); // 리스트뷰에 담을 배열
        data.add("왕대포");
        data.add("주경야돈");
        data.add("배밭골");
        data.add("돼지하우스");
        data.add("소한마리");
        data.add("송정갈비");
        data.add("북악골");
        data.add("철이네");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);

        listview.setAdapter(adapter);
        */

}
