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
        item.setText("김밥고을") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_disorder_2)) ;
        item.setText("엽기떡볶이") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_search)) ;
        item.setText("빙수야") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_disorder)) ;
        item.setText("불난집") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_disorder_2)) ;
        item.setText("전설의냄비떡볶이") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_search)) ;
        item.setText("신전떡볶이") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_disorder_2)) ;
        item.setText("국민상회") ;
        list.add(item) ;
        i++ ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.select_search)) ;
        item.setText("맛사랑") ;
        list.add(item) ;
        i++ ;

        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_snack);

        ListView listview = (ListView) findViewById(R.id.listview6); // 리스트뷰 객체화
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
        ListView listview=(ListView)findViewById(R.id.listview6); // 리스트뷰 객체화
        ArrayList<String> data = new ArrayList<String>(); // 리스트뷰에 담을 배열
        data.add("김밥고을");
        data.add("엽기떡볶이");
        data.add("빙수야");
        data.add("불난집");
        data.add("전설의냄비떡볶이");
        data.add("신전떡볶이");
        data.add("국민상회");
        data.add("맛사랑");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);

        listview.setAdapter(adapter);
    */
}
