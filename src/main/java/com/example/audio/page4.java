package com.example.audio;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class page4 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        ImageView k;
        k = findViewById(R.id.taketest01);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(page4.this,page5.class);
                startActivity(i);
            }
        });
        Intent intent = getIntent();
        if (intent != null) {
            String userInput = intent.getStringExtra("userInput");

            if (userInput != null) {
                TextView textView = findViewById(R.id.textViewInputDisplay);
                textView.setText("WELCOME " + userInput);
            }
        }

    }
}