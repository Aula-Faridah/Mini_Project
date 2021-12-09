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


    public SqliteHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table user(id INTEGER primary key, nama TEXT, email TEXT, username TEXT, password TEXT)");
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id_soal INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, pil_d TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);

        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("soal", "Apa nama hewan tersebut?");
        values.put("pil_a", "Sapi ");
        values.put("pil_b","Kambing");
        values.put("pil_c", "Kucing");
        values.put("pil_d", "Bebek");
        values.put("jwban","0");
        values.put("img", R.drawable.sapi);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Warna apa ini?");
        values.put("pil_a", "Merah");
        values.put("pil_b","Kuning");
        values.put("pil_c", "Hijau");
        values.put("pil_d", "Biru");
        values.put("jwban","3");
        values.put("img", R.drawable.blue);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berapakah ini?");
        values.put("pil_a", "Sembilan ");
        values.put("pil_b","Satu");
        values.put("pil_c", "Lima");
        values.put("pil_d", "Empat");
        values.put("jwban","1");
        values.put("img", R.drawable.satu);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Huruf apakah ini?");
        values.put("pil_a", "B ");
        values.put("pil_b","D");
        values.put("pil_c", "G");
        values.put("pil_d", "F");
        values.put("jwban","0");
        values.put("img", R.drawable.b);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Ini buah apa?");
        values.put("pil_a", "Semangka");
        values.put("pil_b","Pisang");
        values.put("pil_c", "Apel");
        values.put("pil_d", "Jeruk");
        values.put("jwban","2");
        values.put("img", R.drawable.apel);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Ini buah apa?");
        values.put("pil_a", "Nanas");
        values.put("pil_b","Jeruk");
        values.put("pil_c", "Pisang");
        values.put("pil_d", "Semangka");
        values.put("jwban","3");
        values.put("img", R.drawable.semangka);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Ini buah apa?");
        values.put("pil_a", "Pisang ");
        values.put("pil_b","Pir");
        values.put("pil_c", "Melon");
        values.put("pil_d", "Jambu");
        values.put("jwban","0");
        values.put("img", R.drawable.pisang);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Ini buah apa?");
        values.put("pil_a", "Nanas");
        values.put("pil_b","Kelengkeng");
        values.put("pil_c", "Kiwi");
        values.put("pil_d", "Apel");
        values.put("jwban","0");
        values.put("img", R.drawable.nanas);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Ini buah apa?");
        values.put("pil_a", "Belimbing");
        values.put("pil_b","Anggur");
        values.put("pil_c", "Jeruk");
        values.put("pil_d", "Melon");
        values.put("jwban","1");
        values.put("img", R.drawable.anggur);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Ini buah apa?");
        values.put("pil_a", "Anggur ");
        values.put("pil_b","Kiwi");
        values.put("pil_c", "Apel");
        values.put("pil_d", "Semangka");
        values.put("jwban","1");
        values.put("img", R.drawable.kiwi);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berakah ini?");
        values.put("pil_a", "Satu");
        values.put("pil_b","Sembilan");
        values.put("pil_c", "Lima");
        values.put("pil_d", "Delapan");
        values.put("jwban","1");
        values.put("img", R.drawable.sembilan);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berakah ini?");
        values.put("pil_a", "Satu ");
        values.put("pil_b","Sembilan");
        values.put("pil_c", "Lima");
        values.put("pil_d", "Delapan");
        values.put("jwban","3");
        values.put("img", R.drawable.delapan);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berakah ini?");
        values.put("pil_a", "Lima");
        values.put("pil_b","Empat");
        values.put("pil_c", "Enam");
        values.put("pil_d", "Dua");
        values.put("jwban","2");
        values.put("img", R.drawable.enam);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berakah ini?");
        values.put("pil_a", "Satu");
        values.put("pil_b","Tujuh");
        values.put("pil_c", "Dua");
        values.put("pil_d", "Delapan");
        values.put("jwban","2");
        values.put("img", R.drawable.dua);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berakah ini?");
        values.put("pil_a", "Tujuh ");
        values.put("pil_b","Satu");
        values.put("pil_c", "Lima");
        values.put("pil_d", "Empat");
        values.put("jwban","0");
        values.put("img", R.drawable.tujuh);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Huruf apakah ini?");
        values.put("pil_a", "M");
        values.put("pil_b","Z");
        values.put("pil_c", "L");
        values.put("pil_d", "X");
        values.put("jwban","1");
        values.put("img", R.drawable.z);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Huruf apakah ini?");
        values.put("pil_a", "A");
        values.put("pil_b","Z");
        values.put("pil_c", "L");
        values.put("pil_d", "K");
        values.put("jwban","3");
        values.put("img", R.drawable.k);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Huruf apakah ini?");
        values.put("pil_a", "M");
        values.put("pil_b","Z");
        values.put("pil_c", "O");
        values.put("pil_d", "X");
        values.put("jwban","2");
        values.put("img", R.drawable.o);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Huruf apakah ini?");
        values.put("pil_a", "N");
        values.put("pil_b","O");
        values.put("pil_c", "A");
        values.put("pil_d", "W");
        values.put("jwban","2");
        values.put("img", R.drawable.a);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Huruf apakah ini?");
        values.put("pil_a", "L");
        values.put("pil_b","C");
        values.put("pil_c", "G");
        values.put("pil_d", "B");
        values.put("jwban","1");
        values.put("img", R.drawable.c);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Huruf apakah ini?");
        values.put("pil_a", "X");
        values.put("pil_b","V");
        values.put("pil_c", "U");
        values.put("pil_d", "P");
        values.put("jwban","0");
        values.put("img", R.drawable.x);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Huruf apakah ini?");
        values.put("pil_a", "K");
        values.put("pil_b","E");
        values.put("pil_c", "P");
        values.put("pil_d", "Q");
        values.put("jwban","2");
        values.put("img", R.drawable.p);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Huruf apakah ini?");
        values.put("pil_a", "Q");
        values.put("pil_b","V");
        values.put("pil_c", "N");
        values.put("pil_d", "X");
        values.put("jwban","0");
        values.put("img", R.drawable.q);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Warna apa ini?");
        values.put("pil_a", "Cokelat");
        values.put("pil_b","Biru");
        values.put("pil_c", "Hijau");
        values.put("pil_d", "Hitam");
        values.put("jwban","0");
        values.put("img", R.drawable.cokelat);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Warna apa ini?");
        values.put("pil_a", "Cokelat");
        values.put("pil_b","Biru");
        values.put("pil_c", "Ungu");
        values.put("pil_d", "Hitam");
        values.put("jwban","2");
        values.put("img", R.drawable.ungu);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Warna apa ini?");
        values.put("pil_a", "Hijau");
        values.put("pil_b","Putih");
        values.put("pil_c", "Kuning");
        values.put("pil_d", "Hitam");
        values.put("jwban","2");
        values.put("img", R.drawable.kuning);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Warna apa ini?");
        values.put("pil_a", "Hitam");
        values.put("pil_b","Merah");
        values.put("pil_c", "Kuning");
        values.put("pil_d", "Putih");
        values.put("jwban","1");
        values.put("img", R.drawable.red);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Hewan apakah ini?");
        values.put("pil_a", "Anjing");
        values.put("pil_b","Kuda");
        values.put("pil_c", "Bebek");
        values.put("pil_d", "Burung Hantu");
        values.put("jwban","0");
        values.put("img", R.drawable.anjing);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Hewan apakah ini?");
        values.put("pil_a", "Gajah");
        values.put("pil_b","Lebah");
        values.put("pil_c", "Lumba-Lumba");
        values.put("pil_d", "Bebek");
        values.put("jwban","1");
        values.put("img", R.drawable.bebek);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Hewan apakah ini?");
        values.put("pil_a", "Singa");
        values.put("pil_b","Sapi");
        values.put("pil_c", "Kucing");
        values.put("pil_d", "Lumba-Lumba");
        values.put("jwban","0");
        values.put("img", R.drawable.singa);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Hewan apakah ini?");
        values.put("pil_a", "Burung Hantu");
        values.put("pil_b","Singa");
        values.put("pil_c", "Katak");
        values.put("pil_d", "Lebah");
        values.put("jwban","2");
        values.put("img", R.drawable.katak);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Hewan apakah ini?");
        values.put("pil_a", "Bebek");
        values.put("pil_b","Kucing");
        values.put("pil_c", "Gajah");
        values.put("pil_d", "Sapi");
        values.put("jwban","1");
        values.put("img", R.drawable.kucing);
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
        String query = "select * from tbl_soal order by random() limit 10";

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
