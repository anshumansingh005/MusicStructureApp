package com.example.anshu.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    public void setSongName(TextView songName) {
        int f = getIntent().getIntExtra("flag", 0);
        if (f == 1) {
            String s = getIntent().getStringExtra("song_name");
            songName.setText(s);
        } else {
            songName.setText(getString(R.string.playing_nothing));
        }
    }

    public void openAllSongs(TextView allSongs) {
        allSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NowPlaying.this, AllSongs.class);
                startActivity(i);
            }
        });
    }

    public void openPayment(TextView purchaseMusic) {
        purchaseMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NowPlaying.this, Payment.class);
                startActivity(i);
            }
        });
    }

    public void openPlaylist(TextView playList) {
        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NowPlaying.this, Playlist.class);
                startActivity(i);
            }
        });
    }

    public void openHome(Button home) {
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void showSongInformation(ImageView info) {
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, getString(R.string.song_info, "ARTIST NAME", "WRITER NAME", "COMPOSER NAME"), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);


        //Finding the id of different text views
        //This functionality catches and displays the name of current playing song
        TextView songName = findViewById(R.id.song_name_field);
        Button allSongs = findViewById(R.id.allSong);
        Button purchaseMusic = findViewById(R.id.purchaseMusic);
        Button playList = findViewById(R.id.playList);
        Button home = findViewById(R.id.home);
        ImageView info = findViewById(R.id.info);

        //calling different functions and passing the id
        setSongName(songName);
        openAllSongs(allSongs);
        openPayment(purchaseMusic);
        openPlaylist(playList);
        openHome(home);
        showSongInformation(info);
    }
}
