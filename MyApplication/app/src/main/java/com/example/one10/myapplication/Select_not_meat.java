package com.example.one10.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by one10 on 2017-11-01.
 */

public class Select_not_meat extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_not_meat);

        Button btn=(Button) findViewById(R.id.button_china);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Select_china.class);
                startActivity(intent);
            }
        });

        Button btn2=(Button) findViewById(R.id.button_western);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Select_western.class);
                startActivity(intent);
            }
        });

        Button btn3=(Button) findViewById(R.id.button_snack);
        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Select_snack.class);
                startActivity(intent);
            }
        });
    }
}
