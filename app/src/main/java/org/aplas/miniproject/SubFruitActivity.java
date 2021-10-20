package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;

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
        LinearLayout subLayout = findViewById(R.id.subLayout);
        String title = getIntent().getStringExtra("TITLE_FRUIT");
        if (title != null){
            if (title.equals("Anggur")) {
                img.setImageResource(R.drawable.anggur);
                name.setText(title);
                detail.setText(R.string.anggur_content);
            } else if (title.equals("Stroberi")) {
                img.setImageResource(R.drawable.stoberi);
                name.setText(title);
                detail.setText(R.string.stoberi_content);
            } else if (title.equals("Kiwi")) {
                img.setImageResource(R.drawable.kiwi);
                name.setText(title);
                detail.setText(R.string.kiwi_content);
            } else if (title.equals("Jeruk")) {
                img.setImageResource(R.drawable.jeruk);
                name.setText(title);
                detail.setText(R.string.jeruk_content);
            } else if (title.equals("Apel")) {
                img.setImageResource(R.drawable.apel);
                name.setText(title);
                detail.setText(R.string.apel_content);
            } else if (title.equals("Mangga")) {
                img.setImageResource(R.drawable.mangga);
                name.setText(title);
                detail.setText(R.string.mangga_content);
            } else if (title.equals("Naga")) {
                img.setImageResource(R.drawable.buahnaga);
                name.setText(title);
                detail.setText(R.string.buahnaga_content);
            } else if (title.equals("Pir")) {
                img.setImageResource(R.drawable.pir);
                name.setText(title);
                detail.setText(R.string.pir_content);
            } else if (title.equals("Pisang")) {
                img.setImageResource(R.drawable.pisang);
                name.setText(title);
                detail.setText(R.string.pisang_content);
            } else if (title.equals("Pepaya")) {
                img.setImageResource(R.drawable.pepaya);
                name.setText(title);
                detail.setText(R.string.pepaya_content);
            } else if (title.equals("Nanas")) {
                img.setImageResource(R.drawable.nanas);
                name.setText(title);
                detail.setText(R.string.nanas_content);
            } else if (title.equals("Semangka")) {
                img.setImageResource(R.drawable.semangka);
                name.setText(title);
                detail.setText(R.string.semangka_content);
            }
        }
        subLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAfterTransition();
            }
        });
    }
}