package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class detail5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail5);
    }
    //mengambil inten baru yaitu class class  detail5
    public static Intent getAct(Activity act5) {
        return new Intent(act5, detail5.class);
    }
}