package com.rk.sk_intent_sederhana__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_PindahActivity = findViewById(R.id.Button_Pindah_Activity);
        button_PindahActivity.setOnClickListener(this);

        Button button_PindahActivityDenganData = findViewById(R.id.Button_Pindah_Activity_Dengan_Data);
        button_PindahActivityDenganData.setOnClickListener(this);

        Button button_DialNomor = findViewById(R.id.Button_Dial_Nomor);
        button_DialNomor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.Button_Pindah_Activity) {
            Intent pindahIntent = new Intent(MainActivity.this, PindahActivity.class);
            startActivity(pindahIntent);
        } else if (v.getId() == R.id.Button_Pindah_Activity_Dengan_Data) {
            Intent pindahIntentDenganData = new Intent(MainActivity.this, PindahActivityDenganData.class);
            pindahIntentDenganData.putExtra(PindahActivityDenganData.DATA_NAMA, "Manusia");
            pindahIntentDenganData.putExtra(PindahActivityDenganData.DATA_UMUR, 5);
            startActivity(pindahIntentDenganData);
        } else if (v.getId() == R.id.Button_Dial_Nomor) {
            String nomorTelepon = "08123456789";
            Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + nomorTelepon));
            startActivity(dialPhoneIntent);
        }
    }
}