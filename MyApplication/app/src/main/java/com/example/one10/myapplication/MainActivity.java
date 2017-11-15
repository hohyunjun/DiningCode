package com.example.one10.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

//    private SimpleSideDrawer mSlidingMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mSlidingMenu=new SimpleSideDrawer(this);
//        mSlidingMenu.setLeftBehindContentView(R.layout.left_menu);
//
//        Button btn3=(Button) findViewById(R.id.button3);
//        btn3.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                mSlidingMenu.toggleLeftDrawer();
//                Button btn_left=(Button) findViewById((R.id.button4));
//                btn_left.setOnClickListener(new View.OnClickListener(){
//                    public void onClick(View v){
//                        Intent intent=new Intent(getApplicationContext(),Select_main.class);
//                        startActivity(intent);
//                    }
//                });
//            }
//        });
//
//        ImageButton ib=(ImageButton) findViewById(R.id.imageButton);
//        ib.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                mSlidingMenu.toggleLeftDrawer();
//                Button ib_left=(Button) findViewById((R.id.button4));
//                ib_left.setOnClickListener(new View.OnClickListener(){
//                    public void onClick(View v){
//                        Intent intent=new Intent(getApplicationContext(),Select_main.class);
//                        startActivity(intent);
//                    }
//                });
//            }
//        });

        Button btn=(Button) findViewById(R.id.button_what);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Select_main.class);
                startActivity(intent);
            }
        });

        Button btn2=(Button) findViewById(R.id.button_search);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}
