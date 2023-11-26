package com.example.audio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class page9 extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    ImageView v;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page9);
        v = findViewById(R.id.play04);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v);

            }
        });
        ImageView k;
        k=findViewById(R.id.nextau04);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(page9.this,page10.class);
                startActivity(i);
            }
        });
        ImageView l;
        l=findViewById(R.id.BA04);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(page9.this,page8.class);
                startActivity(j);
            }
        });
    }
    public void play(View v){
        if(mediaPlayer==null){
            mediaPlayer = MediaPlayer.create(this, R.raw.song4);
        }
        mediaPlayer.start();

    }
}