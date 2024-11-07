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
        ImageView cover5 = findViewById(R.id.cover5);
        ImageView cover20 = findViewById(R.id.cover20);

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
    }

    // Fungsi untuk mencari novel
    private void searchNovel(String query) {
        if (TextUtils.isEmpty(query)) {
            Toast.makeText(this, "Kolom pencarian kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        // Logika pencarian sederhana
        if (query.equalsIgnoreCase("Renegede Immortal")) {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Renegede Immortal");
            startActivity(intent);
        } else if (query.equalsIgnoreCase("Overgeared")) {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "Overgeared");
            startActivity(intent);
        } else if (query.equalsIgnoreCase("My Divine Diary")) {
            Intent intent = new Intent(MainActivity.this, CoverActivity.class);
            intent.putExtra("novel", "My Divine Diary");
            startActivity(intent);
        } else {
            Toast.makeText(this, "Novel tidak ditemukan", Toast.LENGTH_SHORT).show();
        }
    }
}
