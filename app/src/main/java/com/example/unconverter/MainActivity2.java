package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.button4);
        textView = findViewById(R.id.textView3);
        editTextNumber = findViewById(R.id.editTextNumber4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "succesful", Toast.LENGTH_SHORT).show();
                String s = editTextNumber.getText().toString();
                double km = Integer.parseInt(s);
                double mile= 0.62137119* km;
                textView.setText("The corresponding value in mile is " + mile);
            }
        });
    }
}