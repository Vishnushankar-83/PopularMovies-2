package com.vanajainfotech.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.vanajainfotech.data.PopularMovieContract.*;


public class PopularMovieDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "favorite.db";

    private static final int DATABASE_VERSION = 1;

    public PopularMovieDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION );
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        final String SQL_CREATE_WEATHER_TABLE = "CREATE TABLE " + PopularMovieEntry.TABLE_NAME
                + "(" + PopularMovieEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PopularMovieEntry.COLUMN_MOVIE_ID + " INTEGER NOT NULL," +
                PopularMovieEntry.COLUMN_MOVIE_URL + " TEXT"+ ") ";

        db.execSQL(SQL_CREATE_WEATHER_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("ALTER TABLE IF EXISTS " + PopularMovieEntry.TABLE_NAME);
        onCreate(db);
    }
}
