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

    String[] nama_karoke = {
            "Karoke 1",
            "Karoke 2",
            "Karoke 3",
            "Karoke 4",
            "Karoke 5",
            "Karoke 6",
            "Karoke 7",
            "Karoke 8",
            "Karoke 9",
            "Karoke 10"
    };


    int[] image ={
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed
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
        switch (position){
            case 0:
//                i = new Intent(this, DetailActivity.class);
//                startActivity(i);
                break;

            case 1:
//                i = new Intent(this, DetailActivity.class);
//                startActivity(i);
                break;

            case 2:
//                i = new Intent(this, DetailActivity.class);
//                startActivity(i);
                break;

            case 3:
//                i = new Intent(this, DetailActivity.class);
//                startActivity(i);
                break;

            case 4:
//                i = new Intent(this,DetailActivity.class);
//                startActivity(i);
                break;

            case 5:
//                i = new Intent(this,DetailActivity.class);
//                startActivity(i);
                break;

            case 6:
//                i = new Intent(this,DetailActivity.class);
//                startActivity(i);
                break;

            case 7:
//                i = new Intent(this,DetailActivity.class);
//                startActivity(i);
                break;

            case 8:
//                i = new Intent(this,DetailActivity.class);
//                startActivity(i);
                break;

            case 9:
//                i = new Intent(this,DetailActivity.class);
//                startActivity(i);
                break;
        }

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
