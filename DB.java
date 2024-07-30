package com.example.project1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DB extends SQLiteOpenHelper {
    public DB(Context context) {

        super(context,"OnlineVoter.pdf",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
       // db.execSQL("create table login_details(Search  text primary key,ragistration text)");

        db.execSQL("create table user_ragister(email Text primary key,name text,Age text,Address text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }
    public boolean search(String email)//search function defination
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor c=DB.rawQuery("SELECT * FROM user_ragister WHERE email=? ", new String[]{email});
        if(c.getCount()>0)
            return true;
        return false;
    }


    public boolean adduserdata(String email,String name,String Age,String Address ) {
        SQLiteDatabase DB = this.getWritableDatabase(); // Create and/or  open a database that will be used for reading and writing.
        //DB.execSQL("create table if not exists user_details(fname text  primary key,lname text)");
        DB.execSQL("create table if not exists user_ragister(email Text primary key,name text,Age text,Address text)");
        ContentValues cv = new ContentValues();
       // cv.put("n", n); // key should match to column name  cv.put("n",n);
        cv.put("email", email); // key should match to column name  cv.put("name",name);
        cv.put("name", name); // key should match to column name  cv.put("Age",Age);
        cv.put("Age", Age); // key should match to column name  cv.put("email",email);
        cv.put("Address", Address);// key should match to column name  cv.put("Address",Address);
        //cv.put("poll", poll);//key should match to column name  cv.put("Poll",poll);
        // key should match to column name  cv.put("Age",Age);

        long res = DB.insert("user_ragister", null, cv);
        if (res == -1)
            return false;
        else
            return true;
    }




}
