package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridLayout mainGrid;
    private ImageButton imageCard1, imageCard2, imageCard3, imageCard4, imageCard5, imageCard6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        imageCard1 = (ImageButton) findViewById(R.id.imgCard1);
        imageCard2 = (ImageButton) findViewById(R.id.imgCard2);
        imageCard3 = (ImageButton) findViewById(R.id.imgCard3);
        imageCard4 = (ImageButton) findViewById(R.id.imgCard4);
        imageCard5 = (ImageButton) findViewById(R.id.imgCard5);
        imageCard6 = (ImageButton) findViewById(R.id.imgCard6);

        imageCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AnimalActivity.class);
                startActivity(intent);
            }
        });
        imageCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FruitActivity.class);
                startActivity(intent);
            }
        });
        imageCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AngkaActivity.class);
                startActivity(intent);
            }
        });
        imageCard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HurufActivity.class);
                startActivity(intent);
            }
        });
        imageCard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WarnaActivity.class);
                startActivity(intent);
            }
        });
        imageCard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(intent);
            }
        });

    }




}