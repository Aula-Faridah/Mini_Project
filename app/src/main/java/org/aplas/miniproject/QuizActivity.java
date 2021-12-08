package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.DialogInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuizActivity extends AppCompatActivity {
    SqliteHelper DB;
    private ImageView img;
    private TextView txtno, txtsoal;
    private RadioGroup rg;
    private RadioButton jawaban1, jawaban2, jawaban3, jawaban4;
    private List<Soal> listSoal;
    private ImageButton btnPrev, btnNext, btnSelesai;
    int jawabanYgDiPilih[] = null;
    int jawabanYgBenar[] = null;
    boolean cekPertanyaan = false;
    int urutanPertanyaan = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        DB = new SqliteHelper(this);
        txtno = (TextView) findViewById(R.id.tvNoUrut);
        txtsoal = (TextView) findViewById(R.id.textViewSoal);
        rg = (RadioGroup) findViewById(R.id.radioGroup1);
        jawaban1 = (RadioButton) findViewById(R.id.rbjawaban1);
        jawaban2 = (RadioButton) findViewById(R.id.rbjawaban2);
        jawaban3 = (RadioButton) findViewById(R.id.rbjawaban3);
        jawaban4 = (RadioButton) findViewById(R.id.rbjawaban4);
        img = (ImageView) findViewById(R.id.imageViewSoal);
        btnPrev = (ImageButton) findViewById(R.id.imageBack);
        btnNext = (ImageButton) findViewById(R.id.imageNext);
        btnSelesai = (ImageButton) findViewById(R.id.imageCheck);
        listSoal = new ArrayList<Soal>();
        listSoal = DB.getSoal();
        Collections.shuffle(listSoal);
        jawabanYgDiPilih = new int[listSoal.size()];
        java.util.Arrays.fill(jawabanYgDiPilih, -1);
        jawabanYgBenar = new int[listSoal.size()];
        java.util.Arrays.fill(jawabanYgBenar, -1);
        mulaiKuis();

        btnSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aturJawaban_nya();
                // hitung berapa yg benar
                int jumlahJawabanYgBenar = 0;
                for (int i = 0; i < jawabanYgBenar.length; i++) {
                    if ((jawabanYgBenar[i] != -1) && (jawabanYgBenar[i] == jawabanYgDiPilih[i]))
                        jumlahJawabanYgBenar++;
                }
                AlertDialog tampilKotakAlert;
                tampilKotakAlert = new AlertDialog.Builder(QuizActivity.this).create();
                tampilKotakAlert.setTitle("Nilai");
                tampilKotakAlert.setMessage("Benar " +jumlahJawabanYgBenar + " dari "
                        + (listSoal.size() +" soal"));

                tampilKotakAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "Lagi",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {
                                cekPertanyaan = false;
                                urutanPertanyaan = 0;

                                QuizActivity.this.tunjukanPertanyaan(0,
                                        cekPertanyaan);
                            }
                        });

                tampilKotakAlert.setButton(AlertDialog.BUTTON_NEGATIVE, "Keluar",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {
                                cekPertanyaan = false;
                                finish();
                            }
                        });

                tampilKotakAlert.show();

            }

        });
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aturJawaban_nya();
                urutanPertanyaan--;
                if (urutanPertanyaan < 0)
                    urutanPertanyaan = 0;

                tunjukanPertanyaan(urutanPertanyaan, cekPertanyaan);
            }

        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aturJawaban_nya();
                urutanPertanyaan++;
                if (urutanPertanyaan >= listSoal.size())
                    urutanPertanyaan = listSoal.size() - 1;

                tunjukanPertanyaan(urutanPertanyaan, cekPertanyaan);
            }

        });

    }
    protected void mulaiKuis() {
        setUpSoal();

    }
    private void setUpSoal() {
        this.tunjukanPertanyaan(0, cekPertanyaan);
    }


    private void tunjukanPertanyaan(int urutan_soal_soal, boolean review) {
        try {
            rg.clearCheck();
            Soal soal = new Soal();
            soal = listSoal.get(urutan_soal_soal);
            String pertanyaan = soal.getSoal();
            if (jawabanYgBenar[urutan_soal_soal] == -1) {
                jawabanYgBenar[urutan_soal_soal] = soal.getJwban();
            }

            int gambar = soal.getGambar();
            txtsoal.setText(pertanyaan.toCharArray(), 0, pertanyaan.length());
            img.setImageResource(gambar);
            rg.check(-1);
            String jwb_a = soal.getPil_a();
            jawaban1.setText(jwb_a.toCharArray(), 0,
                    jwb_a.length());
            String jwb_b = soal.getPil_b();
            jawaban2.setText(jwb_b.toCharArray(), 0,
                    jwb_b.length());
            String jwb_c = soal.getPil_c();
            jawaban3.setText(jwb_c.toCharArray(), 0,
                    jwb_c.length());
            String jwb_d = soal.getPil_d();
            jawaban4.setText(jwb_d.toCharArray(), 0,
                    jwb_d.length());

            Log.d("", jawabanYgDiPilih[urutan_soal_soal] + "");
            if (jawabanYgDiPilih[urutan_soal_soal] == 0)
                rg.check(R.id.rbjawaban1);
            if (jawabanYgDiPilih[urutan_soal_soal] == 1)
                rg.check(R.id.rbjawaban2);
            if (jawabanYgDiPilih[urutan_soal_soal] == 2)
                rg.check(R.id.rbjawaban3);
            if (jawabanYgDiPilih[urutan_soal_soal] == 3)
                rg.check(R.id.rbjawaban4);

            pasangLabelDanNomorUrut();

            if (urutan_soal_soal == (listSoal.size() - 1))
                btnNext.setEnabled(false);

            if (urutan_soal_soal == 0)
                btnPrev.setEnabled(false);

            if (urutan_soal_soal > 0)
                btnPrev.setEnabled(true);

            if (urutan_soal_soal < (listSoal.size() - 1))
                btnNext.setEnabled(true);

        } catch (Exception e) {
            Log.e(this.getClass().toString(), e.getMessage(), e.getCause());
        }
    }
    private void aturJawaban_nya() {
        if (jawaban1.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 0;
        if (jawaban2.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 1;
        if (jawaban3.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 2;
        if (jawaban4.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 3;

        Log.d("", Arrays.toString(jawabanYgDiPilih));
        Log.d("", Arrays.toString(jawabanYgBenar));

    }
    private void pasangLabelDanNomorUrut() {
        txtno.setText("Soal ke-" + (urutanPertanyaan + 1) + " dari "
                + listSoal.size());
    }
}