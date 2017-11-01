package com.example.one10.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by one10 on 2017-10-30.
 */

public class Select_main extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_main);

        Button btn=(Button) findViewById(R.id.button_rice);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Select_rice.class);
                startActivity(intent);
            }
        });

        Button btn2=(Button) findViewById(R.id.button_not_rice);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Select_not_rice.class);
                startActivity(intent);
            }
        });
    }

}
