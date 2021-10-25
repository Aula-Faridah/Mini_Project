package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SubFruitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_fruit);

        ImageView img = findViewById(R.id.mainPic);
        TextView name = findViewById(R.id.mainName);
        TextView detail = findViewById(R.id.mainDetail);
        LinearLayout subLayout = findViewById(R.id.subLayout); // init a ImageView
        Intent intent = getIntent(); // get Intent which we set from Previous Activity
        img.setImageResource(intent.getIntExtra("image", 0));
        detail.setText(intent.getIntExtra("detail", 0));

        subLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAfterTransition();
            }
        });
    }
}