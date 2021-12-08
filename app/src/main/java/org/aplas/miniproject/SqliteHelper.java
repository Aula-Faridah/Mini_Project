package org.aplas.miniproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

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
    //Nama Tabel
//    public static final String TABLE_NAME2 = "tb_soal";
    //Nama Kolom
//    public static final String COLUMN_IDSOAL = "id_soal";
//    public static final String COLUMN_SOAL  = "soal";
//    public static final String COLUMN_PIL_A = "pil_a";
//    public static final String COLUMN_PIL_B = "pil_b";
//    public static final String COLUMN_PIL_C = "pil_c";
//    public static final String COLUMN_PIL_D = "pil_d";
//    public static final String COLUMN_JAWABAN = "jawaban";
//    public static final String COLUMN_IMG = "img";

    public SqliteHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table user(id INTEGER primary key, nama TEXT, email TEXT, username TEXT, password TEXT)");
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id_soal INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, pil_d TEXT, jawaban INTEGER, img BLOB)";
        db.execSQL(sql);

        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("soal", "Apa nama hewan tersebut");
        values.put("pil_a", "Sapi ");
        values.put("pil_b","Kambing");
        values.put("pil_c", "Kucing");
        values.put("pil_d", "Bebek");
        values.put("jawaban","0");
        values.put("img", R.drawable.sapi);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Warna apa ini");
        values.put("pil_a", "Merah");
        values.put("pil_b","Kuning");
        values.put("pil_c", "Hijau");
        values.put("pil_d", "Biru");
        values.put("jawaban","3");
        values.put("img", R.drawable.blue);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berakah ini");
        values.put("pil_a", "Sembilan ");
        values.put("pil_b","Satu");
        values.put("pil_c", "Lima");
        values.put("pil_d", "Empat");
        values.put("jawaban","1");
        values.put("img", R.drawable.satu);
        db.insert("tbl_soal", "soal", values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        onCreate(db);

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

    public List<Soal> getSoal(){
        List<Soal> listSoal = new ArrayList<Soal>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Soal s = new Soal();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setPil_d(cursor.getString(5));
                s.setJwban(cursor.getInt(6));
                s.setGambar(cursor.getInt(7));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
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
