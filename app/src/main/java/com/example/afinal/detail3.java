package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class detail3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);
    }
    //mengambil inten baru yaitu class class  detail3
    public static Intent getAct(Activity act3) {
        return new Intent(act3, detail3.class);
    }
}