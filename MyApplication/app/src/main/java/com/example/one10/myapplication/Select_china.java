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

public class Select_china extends AppCompatActivity  implements ListViewBtnAdapter.ListBtnClickListener {

    @Override
    public void onListBtnClick1(int position) { // 지도검색 버튼의 수행을 position에 따라 다르게 지정
        if(position == 0) {
            Intent intent=new Intent(getApplicationContext(),SearchSamSung.class);
            startActivity(intent);
        }
        if(position == 1) {
            Intent intent=new Intent(getApplicationContext(),SearchBoSung.class);
            startActivity(intent);
        }
        if(position == 2) {
            Intent intent=new Intent(getApplicationContext(),SearchImgm.class);
            startActivity(intent);
        }
        if(position == 3) {
            Intent intent=new Intent(getApplicationContext(),SearchQuaiLe.class);
            startActivity(intent);
        }
        if(position == 4) {
            Intent intent=new Intent(getApplicationContext(),SearchBukAkLu.class);
            startActivity(intent);
        }
        if(position == 5) {
            Intent intent=new Intent(getApplicationContext(),SearchJuiMaRa.class);
            startActivity(intent);
        }
        if(position == 6) {
            Intent intent=new Intent(getApplicationContext(),SearchHuaGua.class);
            startActivity(intent);
        }
        if(position == 7) {
            Intent intent=new Intent(getApplicationContext(),SearchChungRok.class);
            startActivity(intent);
        }

    }

    @Override
    public void onListBtnClick2(int position) {
        if(position == 0) {
            Intent intent=new Intent(getApplicationContext(),MenuSamSung.class);
            startActivity(intent);
        }
        if(position == 1) {
            Intent intent=new Intent(getApplicationContext(),MenuBoSung.class);
            startActivity(intent);
        }
        if(position == 5) {
            Intent intent=new Intent(getApplicationContext(),MenuJuiMara.class);
            startActivity(intent);
        }

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
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.samsung)) ;
        item.setText("삼성원") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.bosung)) ;
        item.setText("보성각") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.imgm)) ;
        item.setText("임금님") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.quaile)) ;
        item.setText("콰이러") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.bukaklu)) ;
        item.setText("북악루") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.juimara)) ;
        item.setText("주이마라") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.huagua)) ;
        item.setText("훠궈집") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.chungrok)) ;
        item.setText("청록원") ;
        list.add(item) ;
        i++ ;

        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_china);

        ListView listview = (ListView) findViewById(R.id.listview2); // 리스트뷰 객체화
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
        ListView listview=(ListView)findViewById(R.id.listview2); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>(); // 리스트뷰에 담을 배열
        data.add("삼성원");
        data.add("보성각");
        data.add("임금님");
        data.add("콰이러");
        data.add("북악루");
        data.add("주이마라");
        data.add("훠거집");
        data.add("청록원");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);

        listview.setAdapter(adapter);
*/
}
