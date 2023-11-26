package com.example.audio;

import static com.example.audio.R.raw.song1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class page7 extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    ImageView v;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);
        v = findViewById(R.id.play02);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v);

            }
        });
        ImageView k;
        k = findViewById(R.id.nextau02);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(page7.this, page8.class);
                startActivity(i);
            }
        });
        ImageView l;
        l = findViewById(R.id.BA02);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(page7.this, page6.class);
                startActivity(j);
            }
        });
    }
        public void play(View v){
            if(mediaPlayer==null){
                mediaPlayer = MediaPlayer.create(this, R.raw.song2);
            }
            mediaPlayer.start();

        }
}