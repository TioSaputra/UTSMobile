package com.utsmobile.tiosaputra.utsmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by LUKMAN on 20/11/2017.
 */

public class DetailAcivity extends AppCompatActivity {
    String jenis;
    TextView nama;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_detail);
        Intent i = getIntent();
        jenis = i.getStringExtra("nama");
        
        nama = (TextView)findViewById(R.id.nama);

    }

    public void luas(View view) {
    }
}
