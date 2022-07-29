package com.muzammil.tempconv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        // EditText celsius_value = (EditText) findViewById(R.id.celsius_value);
        EditText celsius_value = (EditText) findViewById(R.id.celsius_value);
        String celsius = celsius_value.getText().toString();
        double doubleCelsius = Double.parseDouble(celsius);
        double fahrenheit =(doubleCelsius -32) * .5556 ;
        String toastText = "= " + fahrenheit + " F";

       // Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "the value showed " + toastText, Toast.LENGTH_SHORT).show();
    }

}