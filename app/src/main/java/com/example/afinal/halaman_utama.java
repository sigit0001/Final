package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class halaman_utama extends AppCompatActivity {
    //Deklarasi untuk menampilkan image view//
    ImageView btnrumah1,btnrumah2,btnrumah3,btnrumah4,btnrumah5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        btnrumah1 = (ImageView)findViewById(R.id.rumah1);
        btnrumah2 = (ImageView)findViewById(R.id.rumah2);
        btnrumah3 = (ImageView)findViewById(R.id.rumah3);
        btnrumah4 = (ImageView)findViewById(R.id.rumah4);
        btnrumah5 = (ImageView)findViewById(R.id.rumah5);

        //on click pada main actifiti agar masuk ke xml//
        //btn rumah1
        btnrumah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Detail1.getAct(halaman_utama.this));
            }
        });
        //on click pada main actifiti agar masuk ke xml//
        //btn rumah2
        btnrumah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(detail2.getAct( halaman_utama.this));
            }
        });
        //on click pada main actifiti agar masuk ke xml//
        //btn rumah3
        btnrumah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(detail3.getAct( halaman_utama.this));
            }
        });
        //on click pada main actifiti agar masuk ke xml//
        //btn rumah4
        btnrumah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(detail4.getAct( halaman_utama.this));
            }
        });
        //on click pada main actifiti agar masuk ke xml//
        //btn rumah5
        btnrumah5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(detail5.getAct( halaman_utama.this));
            }
        });
    }
}