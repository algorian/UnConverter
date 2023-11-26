package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editTextNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button = findViewById(R.id.button6);
        textView = findViewById(R.id.textView2);
        editTextNumber = findViewById(R.id.editTextNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity4.this, "succesful", Toast.LENGTH_SHORT).show();
                String s = editTextNumber.getText().toString();
                double kg= Integer.parseInt(s);
                double pound= 2.206* kg;
                textView.setText("The corresponding value in pound is" + pound);
            }
        });
    }
}


