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

public class Select_snack extends AppCompatActivity implements ListViewBtnAdapter.ListBtnClickListener{

    @Override
    public void onListBtnClick1(int position) {
        if(position == 0) {
            Intent intent=new Intent(getApplicationContext(),SearchKimGoeul.class);
            startActivity(intent);
        }
        else if(position == 1) {
            Intent intent=new Intent(getApplicationContext(),SearchYeopKi.class);
            startActivity(intent);
        }
        else if(position == 2) {
            Intent intent=new Intent(getApplicationContext(),SearchBingSoo.class);
            startActivity(intent);
        }
        else if(position == 3) {
            Intent intent=new Intent(getApplicationContext(),SearchBoolNan.class);
            startActivity(intent);
        }
        else if(position == 4) {
            Intent intent=new Intent(getApplicationContext(),SearchLegendNaemBi.class);
            startActivity(intent);
        }
        else if(position == 5) {
            Intent intent=new Intent(getApplicationContext(),SearchSinJeon.class);
            startActivity(intent);
        }
        else if(position == 6) {
            Intent intent=new Intent(getApplicationContext(),SearchKookminSang.class);
            startActivity(intent);
        }
        else if(position == 7) {
            Intent intent=new Intent(getApplicationContext(),SearchMatLove.class);
            startActivity(intent);
        }
    }

    @Override
    public void onListBtnClick2(int position) {
        if(position == 0) {
            Intent intent=new Intent(getApplicationContext(),MenuKimGoeul.class);
            startActivity(intent);
        }
        else if(position == 1) {
            Intent intent=new Intent(getApplicationContext(),MenuYeopki.class);
            startActivity(intent);
        }
        else if(position == 2) {
            Intent intent=new Intent(getApplicationContext(),MenuBingsoo.class);
            startActivity(intent);
        }
        else if(position == 3) {
            Intent intent=new Intent(getApplicationContext(),MenuBoolnan.class);
            startActivity(intent);
        }
        else if(position == 4) {
            Intent intent=new Intent(getApplicationContext(),MenuLegendNaembi.class);
            startActivity(intent);
        }
        else if(position == 5) {
            Intent intent=new Intent(getApplicationContext(),MenuSinjeon.class);
            startActivity(intent);
        }
        else if(position == 6) {
            Intent intent=new Intent(getApplicationContext(),MenuKookminSang.class);
            startActivity(intent);
        }
        else if(position == 7) {
            Intent intent=new Intent(getApplicationContext(),MenuMatLove.class);
            startActivity(intent);
        }
    }


    public boolean loadItemsFromDB(ArrayList<ListViewBtnItem> list) {
        ListViewBtnItem item ;

        if (list == null) {
            list = new ArrayList<ListViewBtnItem>() ;
        }

        // 아이템 생성.
        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.goeul)) ;
        item.setText("김밥고을") ;
        list.add(item) ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.yeopki)) ;
        item.setText("엽기떡볶이") ;
        list.add(item) ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.bingsoo)) ;
        item.setText("빙수야") ;
        list.add(item) ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.boolnan)) ;
        item.setText("불난집") ;
        list.add(item) ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.naembi)) ;
        item.setText("전설의냄비떡볶이") ;
        list.add(item) ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.sinjeon)) ;
        item.setText("신전떡볶이") ;
        list.add(item) ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.kookminsang)) ;
        item.setText("국민상회") ;
        list.add(item) ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.matlove)) ;
        item.setText("맛사랑") ;
        list.add(item) ;

        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listview = (ListView) findViewById(R.id.listview3); // 리스트뷰 객체화
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
