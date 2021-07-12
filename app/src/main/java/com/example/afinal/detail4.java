package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class detail4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail4);
    }
    //mengambil inten baru yaitu class class  detail4
    public static Intent getAct(Activity act4) {
        return new Intent(act4, detail4.class);
    }
}