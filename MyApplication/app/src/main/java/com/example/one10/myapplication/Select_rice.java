package com.example.one10.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by one10 on 2017-11-01.
 */

public class Select_rice extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_rice);

        Button btn=(Button) findViewById(R.id.button_kor);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Select_kor.class);
                startActivity(intent);
            }
        });

        Button btn2=(Button) findViewById(R.id.button_not_kor);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Select_not_kor.class);
                startActivity(intent);
            }
        });
    }
}
