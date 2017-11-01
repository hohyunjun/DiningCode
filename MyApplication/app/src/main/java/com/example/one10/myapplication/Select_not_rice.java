package com.example.one10.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by one10 on 2017-11-01.
 */

public class Select_not_rice extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_not_rice);

        Button btn=(Button) findViewById(R.id.button_meat);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Select_meat.class);
                startActivity(intent);
            }
        });

        Button btn2=(Button) findViewById(R.id.button_not_meat);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Select_not_meat.class);
                startActivity(intent);
            }
        });
    }
}
