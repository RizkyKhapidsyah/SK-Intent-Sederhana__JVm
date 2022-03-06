package com.rk.sk_intent_sederhana__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PindahActivityDenganData extends AppCompatActivity {

    public static final String DATA_UMUR = "data_umur";
    public static final String DATA_NAMA = "data_nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_dengan_data);

        TextView tvDataMasukan = findViewById(R.id.TextView_DataMasukan);

        String Nama = getIntent().getStringExtra(DATA_NAMA);
        int Umur = getIntent().getIntExtra(DATA_UMUR, 0);

        String Teks = "Nama : " + Nama + "\nUmur Anda : " + Umur;
        tvDataMasukan.setText(Teks);
    }
}