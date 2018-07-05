package com.example.anshu.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void openALlSongs(TextView allSongs) {
        allSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AllSongs.class);
                startActivity(i);
            }
        });
    }

    public void openPlaylist(TextView playList) {
        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Playlist.class);
                startActivity(i);
            }
        });
    }


    public void openNowPlaying(TextView nowPlaying) {
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(i);
            }
        });
    }


    public void openPurchaseMusic(TextView purchaseMusic) {
        purchaseMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Payment.class);
                startActivity(i);
            }
        });
    }


    public void openHelpAndSupport(TextView helpSupport) {
        helpSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HelpAndSupport.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finds the id of different text view
        TextView allSongs = findViewById(R.id.all_songs);
        TextView playList = findViewById(R.id.playlist);
        TextView nowPlaying = findViewById(R.id.now_playing);
        TextView purchaseMusic = findViewById(R.id.purchase_music);
        TextView helpSupport = findViewById(R.id.help_and_support);

        //calling different functions and passing the id
        openALlSongs(allSongs);
        openPlaylist(playList);
        openNowPlaying(nowPlaying);
        openPurchaseMusic(purchaseMusic);

        openHelpAndSupport(helpSupport);
    }
}
