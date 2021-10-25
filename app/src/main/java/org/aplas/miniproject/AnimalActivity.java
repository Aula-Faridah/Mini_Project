package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalActivity extends AppCompatActivity {
    private static final String isPlaying = "Suara ";
    MediaPlayer audio;
    private ImageButton buttonPrev,imgKucing, imgAnjing, imgBebek, imgKambing, imgKuda, imgSapi, imgLebah, imgKatak, imgLumba, imgBurung, imgGajah, imgSinga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        imgKucing = (ImageButton) findViewById(R.id.imgKucing);
        imgAnjing = (ImageButton) findViewById(R.id.imgAnjing);
        imgBebek = (ImageButton) findViewById(R.id.imgBebek);
        imgKambing = (ImageButton) findViewById(R.id.imgKambing);
        imgKuda = (ImageButton) findViewById(R.id.imgKuda);
        imgSapi = (ImageButton) findViewById(R.id.imgSapi);
        imgLebah = (ImageButton) findViewById(R.id.imgLebah);
        imgKatak = (ImageButton) findViewById(R.id.imgKatak);
        imgLumba = (ImageButton) findViewById(R.id.imgLumba);
        imgBurung = (ImageButton) findViewById(R.id.imgBurung);
        imgGajah = (ImageButton) findViewById(R.id.imgGajah);
        imgSinga = (ImageButton) findViewById(R.id.imgSinga);
        buttonPrev = (ImageButton) findViewById(R.id.buttonPrev);

        imgKucing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(1);

            }
        });

        imgAnjing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(2);
            }
        });

        imgBebek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(3);
            }
        });

        imgKambing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(4);
            }
        });

        imgKuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(5);
            }
        });

        imgSapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(6);
            }
        });

        imgLebah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(7);
            }
        });

        imgKatak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(8);
            }
        });

        imgLumba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(9);
            }
        });

        imgBurung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(10);
            }
        });

        imgGajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(11);
            }
        });

        imgSinga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(12);
            }
        });
        buttonPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
            }
        });
    }
    private void playSound(int arg) {
        try {
            if (audio.isPlaying()) {
                audio.stop();
                audio.release();
            }

        }catch(Exception e){
//            Toast.makeText(this, " Masuk Exception", Toast.LENGTH_LONG).show();
        }
        if (arg == 1){
            Toast.makeText(this, isPlaying+" kucing", Toast.LENGTH_LONG).show();
            audio = MediaPlayer.create(this, R.raw.kucing);
        }else if (arg==2){
            Toast.makeText(this, isPlaying+" anjing", Toast.LENGTH_LONG).show();
            audio = MediaPlayer.create(this, R.raw.anjing);
        }else if (arg==3){
            Toast.makeText(this, isPlaying+" bebek", Toast.LENGTH_LONG).show();
            audio = MediaPlayer.create(this, R.raw.bebek);
        }else if (arg==4){
            Toast.makeText(this, isPlaying+" kambing", Toast.LENGTH_LONG).show();
            audio = MediaPlayer.create(this, R.raw.kambing);
        }else if (arg==5){
            Toast.makeText(this, isPlaying+" kuda", Toast.LENGTH_LONG).show();
            audio = MediaPlayer.create(this, R.raw.kuda);
        }else if (arg==6){
            Toast.makeText(this, isPlaying+" sapi", Toast.LENGTH_LONG).show();
            audio = MediaPlayer.create(this, R.raw.sapi);
        }else if (arg==7){
            Toast.makeText(this, isPlaying+" Lebah", Toast.LENGTH_LONG).show();
            audio = MediaPlayer.create(this, R.raw.lebah);
        }else if (arg==8){
            Toast.makeText(this, isPlaying+" Katak", Toast.LENGTH_LONG).show();
            audio = MediaPlayer.create(this, R.raw.katak);
        }else if (arg==9){
            Toast.makeText(this, isPlaying+" Lumba-Lumba", Toast.LENGTH_LONG).show();
            audio = MediaPlayer.create(this, R.raw.lumba);
        }else if (arg==10){
            Toast.makeText(this, isPlaying+" Burung Hantu", Toast.LENGTH_LONG).show();
            audio = MediaPlayer.create(this, R.raw.burunghantu);
        }else if (arg==11){
            Toast.makeText(this, isPlaying+" Gajah", Toast.LENGTH_LONG).show();
            audio = MediaPlayer.create(this, R.raw.gajah);
        }else if (arg==12){
            Toast.makeText(this, isPlaying+" Singa", Toast.LENGTH_LONG).show();
            audio = MediaPlayer.create(this, R.raw.singa);
        }
        audio.setLooping(false); // Set looping
        audio.start();

    }
}