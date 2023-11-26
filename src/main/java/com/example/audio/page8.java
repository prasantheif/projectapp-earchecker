package com.example.audio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class page8 extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    ImageView v;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);
        ImageView k;
        v = findViewById(R.id.play03);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v);

            }
        });
        k=findViewById(R.id.nextau03);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(page8.this,page9.class);
                startActivity(i);
            }
        });
        ImageView l;
        l=findViewById(R.id.BA03);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(page8.this,page7.class);
                startActivity(j);
            }
        });
    }
    public void play(View v){
        if(mediaPlayer==null){
            mediaPlayer = MediaPlayer.create(this, R.raw.song3);
        }
        mediaPlayer.start();

    }
}