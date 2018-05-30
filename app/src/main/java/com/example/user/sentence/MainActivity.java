package com.example.user.sentence;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.String;


public class MainActivity extends AppCompatActivity {
    private Spinner mSpn; // mSpn is object of Spinner
    private TextView textView;
    //public SQLdata DH=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpn = (Spinner) findViewById(R.id.spn_mode);
        //mSpn.setOnItemSelectedListener(spnOnItemSelected);

        //DH=new SQLdata(this);
        //add("123");//add data


        setContentView(R.layout.Activity_intent);

        textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // 設定從這個活動跳至 PageB 的活動
                Intent intent = new Intent(IntentActivity.this, PageB.class);
                // 開始跳頁
                startActivity(intent);
            }
        }

    }


    /*
    private void add(String s) {
        SQLiteDatabase db=DH.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("_title",s.toString());//load data 123
        db.insert("TB2018",null,values); //write 123



    }*/
}
