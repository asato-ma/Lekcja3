package com.example.s_mario.lekcja3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getString(R.string.Monday);

        getResources().getStringArray(R.array.dni_tygodnia);
    }
}
