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
            Intent intent=new Intent(getApplicationContext(),SearchSohanmari.class);
            startActivity(intent);
        }
        if(position == 4) {
            Intent intent=new Intent(getApplicationContext(),SearchSongjalbi.class);
            startActivity(intent);
        }
        if(position == 5) {
            Intent intent=new Intent(getApplicationContext(),SearchBokakjul.class);
            startActivity(intent);
        }
        if(position == 6) {
            Intent intent=new Intent(getApplicationContext(),SearchChuline.class);
            startActivity(intent);
        }
    }
    @Override
    public void onListBtnClick2(int position) {
        if(position == 0) {
            Intent intent=new Intent(getApplicationContext(),MenuWangdaepo.class);
            startActivity(intent);
        }
        if(position == 1) {
            Intent intent=new Intent(getApplicationContext(),MenuJokyung.class);
            startActivity(intent);
        }
        if(position == 2) {
            Intent intent=new Intent(getApplicationContext(),MenuBaebatgol.class);
            startActivity(intent);
        }
        if(position == 3) {
            Intent intent=new Intent(getApplicationContext(),MenuSohanmari.class);
            startActivity(intent);
        }
        if(position == 4) {
            Intent intent=new Intent(getApplicationContext(),MenuSongjunggalbi.class);
            startActivity(intent);
        }
        if(position == 5) {
            Intent intent=new Intent(getApplicationContext(),MenuBokakgol.class);
            startActivity(intent);
        }
        if(position == 6) {
            Intent intent=new Intent(getApplicationContext(),MenuChuline.class);
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
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.wangdaepo)) ;
        item.setText("왕대포") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.jokyung)) ;
        item.setText("주경야돈") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.baebat)) ;
        item.setText("배밭골") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.sohanmari)) ;
        item.setText("소한마리") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.songjungjalbi)) ;
        item.setText("송정갈비") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.bokakgol)) ;
        item.setText("북악골") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.chuline)) ;
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
}
