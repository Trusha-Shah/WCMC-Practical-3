package com.example.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CtoF extends AppCompatActivity {

    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cto_f);
        et1 = findViewById(R.id.editTextNumberDecimal);
        et2 = findViewById(R.id.editTextNumberDecimal2);
        et2.setEnabled(false);
    }


    public void onClick(View view){
        if(et1 != null) {
            double celsius = Double.parseDouble(et1.getText().toString());
            double fahrenheit = (celsius*9/5) + 32;
            et2.setText(String.valueOf(fahrenheit) + "F");
        }else{
            Toast.makeText(getApplicationContext(),"Enter the temperature...", Toast.LENGTH_SHORT);
        }
    }
}