package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Detail1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
    }
    //mengambil inten baru yaitu class class  detail1
    public static Intent getAct(Activity act1){
        return new Intent(act1,Detail1.class);
    }
}