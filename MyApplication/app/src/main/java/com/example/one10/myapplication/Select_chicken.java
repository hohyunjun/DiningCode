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

public class Select_chicken extends AppCompatActivity implements ListViewBtnAdapter.ListBtnClickListener{

    @Override
    public void onListBtnClick1(int position) {
        if(position == 0) {
            Intent intent=new Intent(getApplicationContext(),SearchNomchicken.class);
            startActivity(intent);
        }
        if(position == 1) {
            Intent intent=new Intent(getApplicationContext(),SearchMattJJang.class);
            startActivity(intent);
        }
        if(position == 2) {
            Intent intent=new Intent(getApplicationContext(),SearchGGolGarlic.class);
            startActivity(intent);
        }
    }
    @Override
    public void onListBtnClick2(int position) {
        if(position == 0) {
            Intent intent=new Intent(getApplicationContext(),MenuNomchicken.class);
            startActivity(intent);
        }
        if(position == 1) {
            Intent intent=new Intent(getApplicationContext(),MenuMattzang.class);
            startActivity(intent);
        }
        if(position == 2) {
            Intent intent=new Intent(getApplicationContext(),MenuGulgaric.class);
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
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.nomchicken)) ;
        item.setText("놈치킨") ;
        list.add(item) ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.mattjjang)) ;
        item.setText("맛짱") ;
        list.add(item) ;

        item = new ListViewBtnItem() ;
        item.setIcon(ContextCompat.getDrawable(this, R.drawable.ggol)) ;
        item.setText("꿀양파닭") ;
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
