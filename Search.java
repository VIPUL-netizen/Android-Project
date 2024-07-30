package com.example.project1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Search extends AppCompatActivity
{
   EditText edd1,edd2;
   Button b1;
   DB obj_2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searching);
        edd1=findViewById(R.id.ed1);
        //edd2=findViewById(R.id.ed2);
        b1=findViewById(R.id.B1);
        obj_2=new DB(this);

    }
    public void search(View v)
    {
       String email;

       email=edd1.getText().toString();
      // name=edd2.getText().toString();

       boolean ans=obj_2.search(email);//calling search function in Database
       if(ans)

           {
               Toast.makeText(getApplicationContext(), "Search is successful ", Toast.LENGTH_SHORT).show();

           }
           else
           {
               Toast.makeText(getApplicationContext(), "Search is failed", Toast.LENGTH_SHORT).show();
           }


    }
}
