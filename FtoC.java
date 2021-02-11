package com.example.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FtoC extends AppCompatActivity {

    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fto_c);
        et1 = findViewById(R.id.editTextNumberDecimal);
        et2 = findViewById(R.id.editTextNumberDecimal2);
        et2.setEnabled(false);
    }

    public void onClick(View view){
        if(et1 != null) {
            double fahrenheit = Double.parseDouble(et1.getText().toString());
            double celsius = (fahrenheit - 32)*5/9;
            et2.setText(String.valueOf(celsius) + "C");
        }else{
            Toast.makeText(getApplicationContext(),"Enter the temperature...", Toast.LENGTH_SHORT);
        }
    }
}