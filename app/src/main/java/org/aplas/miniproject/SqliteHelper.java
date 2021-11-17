package org.aplas.miniproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class SqliteHelper extends SQLiteOpenHelper{
    private Context context;
    //Database name and version
    public static final String DATABASE_NAME = "Education.db";
    public static final int DATABASE_VERSION = 1;

    //Nama Tabel
    public static final String TABLE_NAME = "user";

    //Nama Kolom
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAMA = "nama";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_USERNAME = "username";
    public static final String COLUMN_PASSWORD = "password";

    public static final String SQL_TABLE_USER = " CREATE TABLE " + TABLE_NAME
            + " ( "
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NAMA + " TEXT, "
            + COLUMN_EMAIL + " TEXT, "
            + COLUMN_USERNAME + " TEXT, "
            + COLUMN_PASSWORD + " TEXT"
            + " ) ";

    public SqliteHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_TABLE_USER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");

    }
    public Boolean insertData(String nama, String email,String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("nama", nama);
        values.put("email", email);
        values.put("username", username);
        values.put("password", password);

        long result = db.insert("user", null, values);
        if (result == -1) return false;
        else
            return true;

    }

    public Boolean checkUsername(String username) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from user where username=?", new String[] {username});
        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }
    public Boolean checkUsernamePassword(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from user where username=? and password=?", new String[] {username,password});
        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }

}
