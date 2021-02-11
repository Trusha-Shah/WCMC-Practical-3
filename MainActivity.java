package com.example.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCTF(View view){
        Intent CtoF = new Intent(getApplicationContext(), CtoF.class);
        startActivity(CtoF);
    }

    public void onClickFTC(View view){
        Intent FtoC = new Intent(getApplicationContext(), FtoC.class);
        startActivity(FtoC);
    }
}