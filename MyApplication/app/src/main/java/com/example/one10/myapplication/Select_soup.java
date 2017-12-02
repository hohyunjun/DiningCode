package com.example.one10.myapplication;

import android.content.Intent;
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

public class Select_soup extends AppCompatActivity implements ListViewBtnAdapter.ListBtnClickListener{

    @Override
    public void onListBtnClick1(int position) {
        if(position == 0) {
            Intent intent=new Intent(getApplicationContext(),SearchSeolAk.class);
            startActivity(intent);
        }
        if(position == 1) {
            Intent intent=new Intent(getApplicationContext(),SearchHalMae.class);
            startActivity(intent);
        }
        if(position == 2) {
            Intent intent=new Intent(getApplicationContext(),SearchEunHye.class);
            startActivity(intent);
        }
        if(position == 3) {
            Intent intent=new Intent(getApplicationContext(),SearchHyunJoo.class);
            startActivity(intent);
        }
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
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.seolak)) ;
        item.setText("설악추어탕") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.halmae)) ;
        item.setText("할매순대국") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.eunhye)) ;
        item.setText("은혜감자탕") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.hyunjoo)) ;
        item.setText("현주네포차") ;
        list.add(item) ;
        i++ ;

        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_soup);

        ListView listview = (ListView) findViewById(R.id.listview7); // 리스트뷰 객체화
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
        ListView listview=(ListView)findViewById(R.id.listview7); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>(); // 리스트뷰에 담을 배열
        data.add("설악추어탕");
        data.add("할매순대국");
        data.add("은혜감자탕");
        data.add("현주네포차");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);

        listview.setAdapter(adapter);
    */
}
