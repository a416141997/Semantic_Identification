package com.example.user.sentence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 2018/5/22.
 */

public class SQLdata extends SQLiteOpenHelper {
    private  final static String DB="sentence.db";
    private final static  String TB="sentence";
    private  final static int DB_VS=2;

    public static String sentence_name = "name";        //sentence
    public static String type = "type";                 //S or N or O
    public static String islife = "life";                //life or not life
    public static String islocation = "location";        //loctaion or not
    public static String isfood = "food";               //food or not
    public static String ishuman = "human";            //human or not
    public static String isactive = "active";            //active or not
    public static String feel = "feel";                 //0: eyes  1: ear  2: nose  3: mouth  4: skin  5: other



    public SQLdata(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        //super(context, name, factory, version);
        super(context, DB, null, DB_VS);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String SQL = "CREATE TABLE IF NOR EXISTS TB( _id INTEGER PRIMARY KEY AUTOINCREMENT ,  sentence_name text, type text, islife text, islocation text, isfood text, ishuman text, isactive text, feel text) ";
        sqLiteDatabase.execSQL(SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String SQL = "DROP TABLE"+TB;
        sqLiteDatabase.execSQL(SQL);
    }
}
