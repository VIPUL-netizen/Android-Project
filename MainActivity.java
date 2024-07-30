package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn1,btn2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.b1);
        btn2=findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(MainActivity.this,Ragistration.class);//Explicite intent
                //Intent i1=new Intent(MainActivity.this,Search.class);
                startActivity(i);
               // startActivity(i1);

            }


        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i1=new Intent(MainActivity.this,Search.class);//explicate intent14   eD
                startActivity(i1);
            }
        });

    }
}