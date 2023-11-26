package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        }


    public void openActivity (View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openActivity2 (View view){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void openActivity3 (View view){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }


}