package com.example.project1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Ragistration extends AppCompatActivity
{
EditText edd1,edd2,edd3,edd4,edd5,edd6;
Button b1;
DB obj_1;
//String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ragistration);
        edd1=findViewById(R.id.ed1);
        edd2=findViewById(R.id.ed2);
        edd3=findViewById(R.id.ed3);
        edd5=findViewById(R.id.ed5);
        b1=findViewById(R.id.b1);
        obj_1=new DB(this);

    }
    public void ragister(View v)
    {
        String name,Age,email,Address;

        email=edd1.getText().toString();
        name=edd2.getText().toString();
        Age=edd3.getText().toString();
        Address=edd5.getText().toString();

        boolean ans1=obj_1.adduserdata(email,name,Age,Address);//CAll adduserdata function which is present in database




         if(email.isEmpty())
        {
            Toast.makeText(getApplicationContext(),"ENter valid email",Toast.LENGTH_SHORT).show();
        }
        else if(name.isEmpty())
        {
            Toast.makeText(getApplicationContext(),"Enter  valid name",Toast.LENGTH_SHORT).show();
        }
        else if(Age.isEmpty())
        {
            int value1=Integer.parseInt(Age);
            if(value1>18 & value1<95)
            {
                Toast.makeText(getApplicationContext(), "You Can Entered this Age", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"YOU CANT ENTERED THIS AGE",Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(getApplicationContext(),"Enter  valid Age",Toast.LENGTH_SHORT).show();
        }
        else if(Address.isEmpty())
        {
        Toast.makeText(getApplicationContext(),"Enter  valid Address",Toast.LENGTH_SHORT).show();
        }
        else if(ans1)
        {
            Toast.makeText(getApplicationContext(), "Ragistration Successful", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Ragistration Failed", Toast.LENGTH_SHORT).show();
        }

   }
}
