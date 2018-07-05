package com.example.anshu.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AllSongs extends AppCompatActivity {

    //opens the now playing activity
    public void openNowPlaying(TextView song1, TextView song2, TextView song3, TextView song4) {
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AllSongs.this, NowPlaying.class).putExtra("song_name", "Song 1")
                        .putExtra("flag", 1);
                startActivity(i);
            }
        });

        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AllSongs.this, NowPlaying.class).putExtra("song_name", "Song 2")
                        .putExtra("flag", 1);
                ;
                ;
                startActivity(i);
            }
        });

        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AllSongs.this, NowPlaying.class).putExtra("song_name", "Song 3")
                        .putExtra("flag", 1);
                ;
                ;
                startActivity(i);
            }
        });

        song4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AllSongs.this, NowPlaying.class).putExtra("song_name", "Song 4")
                        .putExtra("flag", 1);
                ;
                ;
                startActivity(i);
            }
        });

    }


    public void openPlaylist(Button playList) {
        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AllSongs.this, Playlist.class);
                startActivity(i);
            }
        });
    }

    public void openNowplaying(Button nowPlaying) {
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AllSongs.this, NowPlaying.class);
                startActivity(i);
            }
        });
    }

    public void openHome(Button home) {
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AllSongs.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);

        //finds the id of different text views
        TextView song1 = findViewById(R.id.song1);
        TextView song2 = findViewById(R.id.song2);
        TextView song3 = findViewById(R.id.song3);
        TextView song4 = findViewById(R.id.song4);
        Button playList = findViewById(R.id.playListButtonInAllSong);
        Button nowPlaying = findViewById(R.id.nowPlaying);
        Button home = findViewById(R.id.home);

        //calls different functions and pass the id
        openNowPlaying(song1, song2, song3, song4);
        openPlaylist(playList);
        openNowplaying(nowPlaying);
        openHome(home);
    }
}
