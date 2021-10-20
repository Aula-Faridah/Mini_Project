package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class FruitActivity extends AppCompatActivity {
    private ImageView imgAnggur, imgStoberi, imgKiwi, imgJeruk, imgApel, imgMangga, imgNaga, imgPir, imgPisang, imgPepaya, imgNanas, imgSemangka;
    private ImageButton buttonPrev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        imgAnggur = (ImageView) findViewById(R.id.imgAnggur);
        imgStoberi = (ImageView) findViewById(R.id.imgStoberi);
        imgKiwi = (ImageView) findViewById(R.id.imgKiwi);
        imgJeruk = (ImageView) findViewById(R.id.imgJeruk);
        imgApel = (ImageView) findViewById(R.id.imgApel);
        imgMangga = (ImageView) findViewById(R.id.imgMangga);
        imgNaga = (ImageView) findViewById(R.id.imgNaga);
        imgPir = (ImageView) findViewById(R.id.imgPir);
        imgPisang = (ImageView) findViewById(R.id.imgPisang);
        imgPepaya = (ImageView) findViewById(R.id.imgPepaya);
        imgNanas = (ImageView) findViewById(R.id.imgNanas);
        imgSemangka = (ImageView) findViewById(R.id.imgSemangka);

        buttonPrev = (ImageButton) findViewById(R.id.buttonPrev);

        imgAnggur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubFruitActivity.class);
                intent.putExtra("TITLE_FRUIT", "Anggur");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                FruitActivity.this, imgAnggur, ViewCompat.getTransitionName(imgAnggur));
                startActivity(intent, options.toBundle());
            }
        });

        imgStoberi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubFruitActivity.class);
                intent.putExtra("TITLE_FRUIT", "Stroberi");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                FruitActivity.this, imgStoberi, ViewCompat.getTransitionName(imgStoberi));
                startActivity(intent, options.toBundle());
            }
        });

        imgKiwi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubFruitActivity.class);
                intent.putExtra("TITLE_FRUIT", "Kiwi");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                FruitActivity.this, imgKiwi, ViewCompat.getTransitionName(imgKiwi));
                startActivity(intent, options.toBundle());
            }
        });

        imgJeruk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubFruitActivity.class);
                intent.putExtra("TITLE_FRUIT", "Jeruk");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                FruitActivity.this, imgJeruk, ViewCompat.getTransitionName(imgJeruk));
                startActivity(intent, options.toBundle());
            }
        });

        imgApel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubFruitActivity.class);
                intent.putExtra("TITLE_FRUIT", "Apel");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                FruitActivity.this, imgApel, ViewCompat.getTransitionName(imgApel));
                startActivity(intent, options.toBundle());
            }
        });

        imgMangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubFruitActivity.class);
                intent.putExtra("TITLE_FRUIT", "Mangga");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                FruitActivity.this, imgMangga, ViewCompat.getTransitionName(imgMangga));
                startActivity(intent, options.toBundle());
            }
        });

        imgNaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubFruitActivity.class);
                intent.putExtra("TITLE_FRUIT", "Naga");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                FruitActivity.this, imgNaga, ViewCompat.getTransitionName(imgNaga));
                startActivity(intent, options.toBundle());
            }
        });

        imgPir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubFruitActivity.class);
                intent.putExtra("TITLE_FRUIT", "Pir");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                FruitActivity.this, imgPir, ViewCompat.getTransitionName(imgPir));
                startActivity(intent, options.toBundle());
            }
        });

        imgPisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubFruitActivity.class);
                intent.putExtra("TITLE_FRUIT", "Pisang");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                FruitActivity.this, imgPisang, ViewCompat.getTransitionName(imgPisang));
                startActivity(intent, options.toBundle());
            }
        });

        imgPepaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubFruitActivity.class);
                intent.putExtra("TITLE_FRUIT", "Pepaya");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                FruitActivity.this, imgPepaya, ViewCompat.getTransitionName(imgPepaya));
                startActivity(intent, options.toBundle());
            }
        });

        imgNanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubFruitActivity.class);
                intent.putExtra("TITLE_FRUIT", "Nanas");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                FruitActivity.this, imgNanas, ViewCompat.getTransitionName(imgNanas));
                startActivity(intent, options.toBundle());
            }
        });

        imgSemangka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubFruitActivity.class);
                intent.putExtra("TITLE_FRUIT", "Semangka");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                FruitActivity.this, imgSemangka, ViewCompat.getTransitionName(imgSemangka));
                startActivity(intent, options.toBundle());
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
}