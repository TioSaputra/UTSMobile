package com.utsmobile.tiosaputra.utsmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by LUKMAN on 20/11/2017.
 */

public class DetailAcivity extends AppCompatActivity {
    String jenis;
    TextView nama;
    String  nilaialas, nilaitinggi;
    int nAlas, nTinggi, luas;
    EditText alas, tinggi;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_detail);
        Intent i = getIntent();
        jenis = i.getStringExtra("nama");

//        Setting title
        nama = (TextView)findViewById(R.id.nama);
        nama.setText(jenis);

//        Getting value from form
        alas = (EditText) findViewById(R.id.alas);
        tinggi = (EditText) findViewById(R.id.tinggi);
    }

    public void luas(View view) {
        nAlas = Integer.parseInt(alas.getText().toString());
        nTinggi = Integer.parseInt(tinggi.getText().toString());
        luas = nAlas * nTinggi;
        Intent i = new Intent(DetailAcivity.this,HasilActivity.class);
        i.putExtra("judul", jenis);
        i.putExtra("hasil", luas);
    }
}
