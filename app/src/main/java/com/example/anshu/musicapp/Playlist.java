package com.example.anshu.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Playlist extends AppCompatActivity {

    public void openAllSongs(Button allSongs) {
        allSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Playlist.this, AllSongs.class);
                startActivity(i);
            }
        });
    }

    public void openHome(Button home) {
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Playlist.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void openNowPlaying(Button nowPlaying) {
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Playlist.this, NowPlaying.class);
                startActivity(i);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        Button allSongs = findViewById(R.id.allSong);
        Button nowPlaying = findViewById(R.id.nowPlaying);
        Button home = findViewById(R.id.home);

        //calls different functions and passes id

        openHome(home);
        openAllSongs(allSongs);
        openNowPlaying(nowPlaying);
    }
}
