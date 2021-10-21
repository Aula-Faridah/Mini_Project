package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalActivity extends AppCompatActivity {
    private static final String isPlaying = "Media is Playing";
    MediaPlayer audio;
    private RecyclerView rvHeroes;
    private ArrayList<DataItem> list = new ArrayList<>();
    private String title = "Mode List";
    private DataAdapter mAdapter;

    ArrayList<String> personNames = new ArrayList<>(Arrays.asList("Animal 1", "Animal 2", "Animal 3", "Animal 4", "Animal 5", "Animal 6", "Animal 7","Animal 8", "Animal 9", "Animal 10", "Animal 11", "Animal 12"));
    ArrayList<Integer> personImages = new ArrayList<>(Arrays.asList(R.drawable.kucing, R.drawable.anjing, R.drawable.bebek, R.drawable.kambing, R.drawable.kuda, R.drawable.sapi, R.drawable.lebah,R.drawable.katak, R.drawable.lumba, R.drawable.burung, R.drawable.gajah, R.drawable.singa));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        rvHeroes = findViewById(R.id.rv_animal);
        rvHeroes.setHasFixedSize(true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_animal);
        // set a GridLayoutManager with 2 number of columns , horizontal gravity and false value for reverseLayout to show the items from start to end
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        DataAdapter dataAdapter = new DataAdapter(AnimalActivity.this,personImages);
        recyclerView.setAdapter(dataAdapter); // set the Adapter to RecyclerView
//        selectedImage.setImageResource(intent.getIntExtra("image", 0));

    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        return super.onOptionsItemSelected(item);
//    }
//
//
//    private void setActionBarTitle(String title) {
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setTitle(title);
//        }
//    }
//
//    private void showSelectedHero(DataItem hero) {
//        Toast.makeText(this, "Kamu memilih " + hero.getName(), Toast.LENGTH_SHORT).show();
//    }
}