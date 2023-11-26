package com.example.audio;

import static com.example.audio.R.raw.song1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class page6 extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    ImageView v;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        v = findViewById(R.id.btnPlayAudio);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            play(v);

            }
        });


        /*ImageView playButton = findViewById(R.id.btnPlayAudio);
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setDataSource(page6.this, R.raw.song1);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start playing the music.
                mediaPlayer.start();
            }
        });*/
        ImageView k;
        k=findViewById(R.id.nextau01);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(page6.this,page7.class);
                startActivity(i);
            }
        });
        ImageView l;
        l=findViewById(R.id.BA01);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(page6.this,page5.class);
                startActivity(j);
            }
        });
    }

    public void play(View v){
        if(mediaPlayer==null){
            mediaPlayer = MediaPlayer.create(this, song1);
        }
        mediaPlayer.start();

    }


}
