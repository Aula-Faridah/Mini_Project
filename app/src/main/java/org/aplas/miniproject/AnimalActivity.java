package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimalActivity extends AppCompatActivity {
    private static final String isPlaying = "Media is Playing";
    MediaPlayer audio;
    private ImageButton imgKucing, imgAnjing, imgBebek, imgKambing, imgKuda, imgSapi, imgLebah, imgKatak, imgLumba, imgBurung, imgGajah, imgSinga;
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

//        imgLebah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
//                intent.putExtra("TITLE_ANIMAL", "Insects");
//                ActivityOptionsCompat options =
//                        ActivityOptionsCompat.makeSceneTransitionAnimation(
//                                AnimalActivity.this, imgLebah, ViewCompat.getTransitionName(imgLebah));
//                startActivity(intent, options.toBundle());
//            }
//        });
//
//        imgKatak.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
//                intent.putExtra("TITLE_ANIMAL", "Insects");
//                ActivityOptionsCompat options =
//                        ActivityOptionsCompat.makeSceneTransitionAnimation(
//                                AnimalActivity.this, imgKatak, ViewCompat.getTransitionName(imgKatak));
//                startActivity(intent, options.toBundle());
//            }
//        });
//
//        imgLumba.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
//                intent.putExtra("TITLE_ANIMAL", "Insects");
//                ActivityOptionsCompat options =
//                        ActivityOptionsCompat.makeSceneTransitionAnimation(
//                                AnimalActivity.this, imgLumba, ViewCompat.getTransitionName(imgLumba));
//                startActivity(intent, options.toBundle());
//            }
//        });
//
//        imgBurung.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
//                intent.putExtra("TITLE_ANIMAL", "Insects");
//                ActivityOptionsCompat options =
//                        ActivityOptionsCompat.makeSceneTransitionAnimation(
//                                AnimalActivity.this, imgBurung, ViewCompat.getTransitionName(imgBurung));
//                startActivity(intent, options.toBundle());
//            }
//        });
//
//        imgGajah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
//                intent.putExtra("TITLE_ANIMAL", "Insects");
//                ActivityOptionsCompat options =
//                        ActivityOptionsCompat.makeSceneTransitionAnimation(
//                                AnimalActivity.this, imgGajah, ViewCompat.getTransitionName(imgGajah));
//                startActivity(intent, options.toBundle());
//            }
//        });
//
//        imgSinga.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
//                intent.putExtra("TITLE_ANIMAL", "Insects");
//                ActivityOptionsCompat options =
//                        ActivityOptionsCompat.makeSceneTransitionAnimation(
//                                AnimalActivity.this, imgSinga, ViewCompat.getTransitionName(imgSinga));
//                startActivity(intent, options.toBundle());
//            }
//        });
    }

    private void playSound(int arg) {
        try {
            if (audio.isPlaying()) {
                audio.stop();
                audio.release();
            }

        }catch(Exception e){
            Toast.makeText(this, " Masuk Exception", Toast.LENGTH_LONG).show();
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
        }
        audio.setLooping(false); // Set looping
        audio.start();

        }
}