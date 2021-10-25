package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitActivity extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<DataItem> list = new ArrayList<>();
    private String title = "Mode List";
    private DataAdapter mAdapter;
    ArrayList<String> personNames = new ArrayList<>(Arrays.asList("Anggur", "Stroberi", "Kiwi", "Jeruk", "Apel", "Mangga", "Naga","Pir", "Pisang", "Pepaya", "Nanas", "Semangka"));
    ArrayList<Integer> personImages = new ArrayList<>(Arrays.asList(R.drawable.anggur, R.drawable.stoberi, R.drawable.kiwi, R.drawable.jeruk, R.drawable.apel, R.drawable.mangga, R.drawable.buahnaga,R.drawable.pir, R.drawable.pisang, R.drawable.pepaya, R.drawable.nanas, R.drawable.semangka));
    ArrayList<Integer> Detail = new ArrayList<>(Arrays.asList(R.string.anggur_content,R.string.stoberi_content,  R.string.kiwi_content, R.string.jeruk_content, R.string.apel_content, R.string.mangga_content, R.string.buahnaga_content, R.string.pir_content, R.string.pisang_content, R.string.pepaya_content, R.string.nanas_content, R.string.semangka_content));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_buah);
        ImageButton buttonPrev = (ImageButton) findViewById(R.id.buttonPrev);
        rvHeroes = findViewById(R.id.rv_buah);
        rvHeroes.setHasFixedSize(true);
        // set a GridLayoutManager with 2 number of columns , horizontal gravity and false value for reverseLayout to show the items from start to end
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        //DataAdapter dataAdapter = new DataAdapter(AnimalActivity.this,personImages);
        DataAdapter adapter = new DataAdapter(FruitActivity.this, personNames,personImages, Detail);
        recyclerView.setAdapter(adapter); // set the Adapter to RecyclerView

        buttonPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
            }
        });

    }
}