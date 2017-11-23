package com.utsmobile.tiosaputra.utsmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Intent i;
    String nama;
    String[] nama_karoke = {
            "Persegi",
            "Lingkaran",
            "Segitiga",
            "Persegi Panjang",
            "Jajargenjang"
    };


    int[] image ={
            R.drawable.persegi,
            R.drawable.lingkaran,
            R.drawable.segitiga,
            R.drawable.persegi,
            R.drawable.trape
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview=(ListView)findViewById(R.id.list_menu);
        Customadapter customadapter=new Customadapter();
        listview.setAdapter(customadapter);
        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        i = new Intent(this, DetailAcivity.class);
        i.putExtra("nama", nama_karoke[position]);
        startActivity(i);
    }

    class Customadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {
            view =getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imgv);
            TextView names=(TextView)view.findViewById(R.id.tv1);

            imageView.setImageResource(image[i]);
            names.setText(nama_karoke[i]);

            return view;
        }
    }
}
