package com.example.anshu.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeoutException;

public class HelpAndSupport extends AppCompatActivity {

    public void openMail(TextView purchase, TextView feedback) {
        purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL, "support@kmplayer.com");
                i.putExtra(Intent.EXTRA_SUBJECT, "Regarding Purchase");
                startActivity(i);
            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL, "support@kmplayer.com");
                i.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
                startActivity(i);
            }
        });
    }

    public void openHome(Button home) {
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HelpAndSupport.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_and_support);
        Button home = findViewById(R.id.home);
        openHome(home);
    }
}
