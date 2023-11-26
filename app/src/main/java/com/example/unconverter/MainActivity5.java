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

public class MainActivity5 extends AppCompatActivity {
    private Button button;
    private  TextView textView;
    private EditText editTextNumber;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        button = findViewById(R.id.button7);
        textView = findViewById(R.id.textView);
        editTextNumber = findViewById(R.id.editTextNumber3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity5.this, "succesful", Toast.LENGTH_SHORT).show();
                String s = editTextNumber.getText().toString();
                double celcuis= Integer.parseInt(s);
                double fahrenheit= (celcuis*9/5)+32;
                textView.setText("The corresponding value in fahrenheit is" +fahrenheit );
            }
        });
    }
}
