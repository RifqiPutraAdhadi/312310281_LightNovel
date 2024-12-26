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

        switch (novel) {
            case "Renegede Immortal":
                setContentView(R.layout.cover1);
                break;
            case "Alchemy Emperor Of The Divine Dao":
                setContentView(R.layout.cover2);
                break;
            case "Martial Peak":
                setContentView(R.layout.cover3);
                break;
            case "Nine Star Hegemon Body Art":
                setContentView(R.layout.cover4);
                break;
            case "Overgeared":
                setContentView(R.layout.cover5);
                break;
            case "Solo Farming In The Tower":
                setContentView(R.layout.cover6);
                break;
            case "Pick Me Up !":
                setContentView(R.layout.cover7);
                break;
            case "The Imperial Hunter":
                setContentView(R.layout.cover8);
                break;
            case "The Return Of The Legendary All-Master":
                setContentView(R.layout.cover9);
                break;
            case "Genius Game Broadcaster":
                setContentView(R.layout.cover10);
                break;
            case "The Archmage's Restaurant":
                setContentView(R.layout.cover11);
                break;
            case "Spy Kyoutshitsu":
                setContentView(R.layout.cover12);
                break;
            case "Unnamed Memory":
                setContentView(R.layout.cover13);
                break;
            case "Mushoku Tensei":
                setContentView(R.layout.cover14);
                break;
            case "The Last Adventurer":
                setContentView(R.layout.cover15);
                break;
            case "Isekai Nonbiri Nouka":
                setContentView(R.layout.cover16);
                break;
            case "Konjiki no Moji Tsukai":
                setContentView(R.layout.cover17);
                break;
            case "Star Rank Hunter":
                setContentView(R.layout.cover18);
                break;
            case "Outside of Time":
                setContentView(R.layout.cover19);
                break;
            case "My Divine Diary":
                setContentView(R.layout.cover20);
                break;
            case "Mysterious Noble Beasts":
                setContentView(R.layout.cover21);
                break;
            case "Mechanical God Emperor":
                setContentView(R.layout.cover22);
                break;
            case "Archean Eon Art":
                setContentView(R.layout.cover23);
                break;
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
