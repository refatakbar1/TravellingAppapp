package com.rifat.travellingapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by refat on 10/8/2016.
 */
public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE="travel_db";
    private static final String TABLE="sign_up";
    private static final String NAME="name";
    private static final String EMAIL="email";
    private static final String PHONE="phone";
    public DBHelper(Context context) {
        super(context, DATABASE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE+" (id integer primary key, "+NAME+" text, "+EMAIL+" text, "+PHONE+" text)");;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public  boolean insertContact(SignUp signUp){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues =new ContentValues();
        try {
            contentValues.put(NAME,signUp.getName());
            contentValues.put(EMAIL,signUp.getEmail());
            contentValues.put(PHONE,signUp.getPhone());
            db.insert(TABLE,null,contentValues);
            return true;

        }catch (Exception e){
            return false;
        }

    }
    public ArrayList<SignUp> getAllSignUps(){

        SQLiteDatabase db= this.getReadableDatabase();
        ArrayList<SignUp>signups=new ArrayList<SignUp>();
        try {
            Cursor cur = db.rawQuery("select * from" + TABLE, null);
            cur.moveToFirst();
            while (cur.isAfterLast() == false) {
                SignUp c = new SignUp();
                c.setId(cur.getInt(cur.getColumnIndex("id")));
                c.setName(cur.getString(cur.getColumnIndex(NAME)));
                c.setEmail(cur.getString(cur.getColumnIndex(EMAIL)));
                c.setPhone(cur.getString(cur.getColumnIndex(PHONE)));
                signups.add(c);
                cur.moveToNext();
            }
            return signups;
        }catch (Exception e) {

            return null;
        }
    }
}
