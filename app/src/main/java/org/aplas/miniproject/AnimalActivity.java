package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AnimalActivity extends AppCompatActivity {
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
                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimalActivity.this, imgKucing, ViewCompat.getTransitionName(imgKucing));
                startActivity(intent, options.toBundle());
            }
        });

        imgAnjing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimalActivity.this, imgAnjing, ViewCompat.getTransitionName(imgAnjing));
                startActivity(intent, options.toBundle());
            }
        });

        imgBebek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimalActivity.this, imgBebek, ViewCompat.getTransitionName(imgBebek));
                startActivity(intent, options.toBundle());
            }
        });

        imgKambing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimalActivity.this, imgKambing, ViewCompat.getTransitionName(imgKambing));
                startActivity(intent, options.toBundle());
            }
        });

        imgKuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimalActivity.this, imgKuda, ViewCompat.getTransitionName(imgKuda));
                startActivity(intent, options.toBundle());
            }
        });

        imgSapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimalActivity.this, imgSapi, ViewCompat.getTransitionName(imgSapi));
                startActivity(intent, options.toBundle());
            }
        });

        imgLebah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimalActivity.this, imgLebah, ViewCompat.getTransitionName(imgLebah));
                startActivity(intent, options.toBundle());
            }
        });

        imgKatak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimalActivity.this, imgKatak, ViewCompat.getTransitionName(imgKatak));
                startActivity(intent, options.toBundle());
            }
        });

        imgLumba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimalActivity.this, imgLumba, ViewCompat.getTransitionName(imgLumba));
                startActivity(intent, options.toBundle());
            }
        });

        imgBurung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimalActivity.this, imgBurung, ViewCompat.getTransitionName(imgBurung));
                startActivity(intent, options.toBundle());
            }
        });

        imgGajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimalActivity.this, imgGajah, ViewCompat.getTransitionName(imgGajah));
                startActivity(intent, options.toBundle());
            }
        });

        imgSinga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SoundBase.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                AnimalActivity.this, imgSinga, ViewCompat.getTransitionName(imgSinga));
                startActivity(intent, options.toBundle());
            }
        });
    }
}