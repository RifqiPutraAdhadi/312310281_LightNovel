package com.example.cstation;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText searchInput;
    private TextView searchResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menghilangkan ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Menginisialisasi View
        searchInput = findViewById(R.id.searchInput);
        searchResult = findViewById(R.id.searchResult);
        ImageView cover1 = findViewById(R.id.cover1);
        ImageView cover2 = findViewById(R.id.cover2);
        ImageView cover3 = findViewById(R.id.cover3);
        ImageView cover4 = findViewById(R.id.cover4);
        ImageView cover5 = findViewById(R.id.cover5);
        ImageView cover6 = findViewById(R.id.cover6);
        ImageView cover7 = findViewById(R.id.cover7);
        ImageView cover8 = findViewById(R.id.cover8);
        ImageView cover9 = findViewById(R.id.cover9);
        ImageView cover10 = findViewById(R.id.cover10);
        ImageView cover11 = findViewById(R.id.cover11);
        ImageView cover12 = findViewById(R.id.cover12);
        ImageView cover13 = findViewById(R.id.cover13);
        ImageView cover14 = findViewById(R.id.cover14);
        ImageView cover15 = findViewById(R.id.cover15);
        ImageView cover16 = findViewById(R.id.cover16);
        ImageView cover17 = findViewById(R.id.cover17);
        ImageView cover18 = findViewById(R.id.cover18);
        ImageView cover19 = findViewById(R.id.cover19);
        ImageView cover20 = findViewById(R.id.cover20);
        ImageView cover21 = findViewById(R.id.cover21);
        ImageView cover22 = findViewById(R.id.cover22);
        ImageView cover23 = findViewById(R.id.cover23);

        // Menambahkan TextWatcher untuk menampilkan teks yang diketik secara langsung
        searchInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                searchResult.setText(s); // Menampilkan teks sementara di TextView
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        // Listener untuk menangani pencarian saat tombol Enter atau Search ditekan
        searchInput.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_SEARCH || actionId == EditorInfo.IME_ACTION_DONE) {
                String query = searchInput.getText().toString().trim();
                searchNovel(query); // Panggil fungsi pencarian
                return true;
            }
            return false;
        });

        // Menambahkan listener klik pada gambar cover
        cover1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Renegede Immortal");
            startActivity(intent);
        });

        cover5.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Overgeared");
            startActivity(intent);
        });

        cover20.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "My Divine Diary");
            startActivity(intent);
        });

        cover2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Alchemy Emperor Of The Divine Dao");
            startActivity(intent);
        });

        cover3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Martial Peak");
            startActivity(intent);
        });

        cover4.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Nine Star Hegemon Body Art");
            startActivity(intent);
        });

        cover6.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Solo Farming In The Tower");
            startActivity(intent);
        });

        cover7.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Pick Me Up !");
            startActivity(intent);
        });

        cover8.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "The Imperial Hunter");
            startActivity(intent);
        });

        cover9.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "The Return Of The Legendary All-Master");
            startActivity(intent);
        });

        cover10.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Genius Game Broadcaster");
            startActivity(intent);
        });

        cover11.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "The Archmage's Restaurant");
            startActivity(intent);
        });

        cover12.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Spy Kyoutshitsu");
            startActivity(intent);
        });

        cover13.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Unnamed Memory");
            startActivity(intent);
        });

        cover14.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Mushoku Tensei");
            startActivity(intent);
        });

        cover15.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "The Last Adventurer");
            startActivity(intent);
        });

        cover16.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Isekai Nonbiri Nouka");
            startActivity(intent);
        });

        cover17.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Konjiki no Moji Tsukai");
            startActivity(intent);
        });

        cover18.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Star Rank Hunter");
            startActivity(intent);
        });

        cover19.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Outside of Time");
            startActivity(intent);
        });

        cover21.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Mysterious Noble Beasts");
            startActivity(intent);
        });

        cover22.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Mechanical God Emperor");
            startActivity(intent);
        });

        cover23.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Archean Eon Art");
            startActivity(intent);
        });

    }

    // Fungsi untuk mencari novel
    private void searchNovel(String query) {
        if (TextUtils.isEmpty(query)) {
            Toast.makeText(this, "Kolom pencarian kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        // Daftar novel dan logika pencarian
        String[] novelList = {
                "Renegede Immortal",
                "Alchemy Emperor Of The Divine Dao",
                "Martial Peak",
                "Nine Star Hegemon Body Art",
                "Overgeared",
                "Solo Farming In The Tower",
                "Pick Me Up !",
                "The Imperial Hunter",
                "The Return Of The Legendary All-Master",
                "Genius Game Broadcaster",
                "The Archmage's Restaurant",
                "Spy Kyoutshitsu",
                "Unnamed Memory",
                "Mushoku Tensei",
                "The Last Adventurer",
                "Isekai Nonbiri Nouka",
                "Konjiki no Moji Tsukai",
                "Star Rank Hunter",
                "Outside of Time",
                "My Divine Diary",
                "Mysterious Noble Beasts",
                "Mechanical God Emperor",
                "Archean Eon Art"
        };

        for (String novel : novelList) {
            if (query.equalsIgnoreCase(novel)) {
                Intent intent = new Intent(MainActivity.this, CoverActivity.class);
                intent.putExtra("novel", novel);
                startActivity(intent);
                return;
            }
        }

        Toast.makeText(this, "Novel tidak ditemukan", Toast.LENGTH_SHORT).show();
    }

}
