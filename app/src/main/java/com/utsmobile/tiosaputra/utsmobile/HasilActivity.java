package com.utsmobile.tiosaputra.utsmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView title;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        title = (TextView) findViewById(R.id.hasil_title);
        hasil = (TextView) findViewById(R.id.hasil_text);

    }
}
