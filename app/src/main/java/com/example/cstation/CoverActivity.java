package com.example.cstation;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class CoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Ambil data dari Intent
        String novel = getIntent().getStringExtra("novel");

        // Tentukan layout berdasarkan novel yang diklik
        if ("Renegede Immortal".equals(novel)) {
            setContentView(R.layout.cover1);
        } else if ("Overgeared".equals(novel)) {
            setContentView(R.layout.cover5);
        } else if ("My Divine Diary".equals(novel)){
            setContentView(R.layout.cover20);
        }

        // Mengaktifkan tombol back di toolbar
        ImageView backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Kembali ke halaman sebelumnya
                finish();
            }
        });
    }
}
