package com.example.audio;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class page3 extends AppCompatActivity {
    ImageView i;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        i=findViewById(R.id.backpg3);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(page3.this,page2.class);
                startActivity(k);
            }

        });
        EditText editText = findViewById(R.id.editTextInput);
        ImageView submitButton = findViewById(R.id.btnSubmit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();

                // Create an Intent to start the InputDisplayActivity
                Intent intent = new Intent(page3.this, page4.class);
                intent.putExtra("userInput", userInput);
                startActivity(intent);
            }
        });


    }
}