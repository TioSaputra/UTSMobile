package com.utsmobile.tiosaputra.utsmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView title;
    TextView hasil;
    String judul;
    int hasilnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        title = (TextView) findViewById(R.id.hasil_title);
        hasil = (TextView) findViewById(R.id.hasil_text);

        Intent i = getIntent();
        judul = i.getStringExtra("judul");
        hasilnya = i.getIntExtra("hasil", 0);

        title.setText(judul);
        hasil.setText(""+hasilnya);
    }
}
