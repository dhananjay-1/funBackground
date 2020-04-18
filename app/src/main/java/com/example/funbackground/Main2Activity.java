package com.example.funbackground;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import java.io.IOException;

public class Main2Activity extends AppCompatActivity {

    VideoView video_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        final String person = intent.getStringExtra("person");


        video_view = findViewById(R.id.video_view);

        String video_path = "android.resource://com.example.funbackground/";


        if(person.equalsIgnoreCase("thanos"))
            video_path += R.raw.thanos;

        else if(person.equalsIgnoreCase("IronMan"))
            video_path += R.raw.iron_man;


        Uri uri = Uri.parse(video_path);

        video_view.setVideoURI(uri);

        video_view.start();

        video_view.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                WallpaperManager wm = WallpaperManager.getInstance(getApplicationContext());

                try {
                    if(person.equalsIgnoreCase("thanos"))
                        wm.setResource(+R.drawable.thanos);

                    else if(person.equalsIgnoreCase("IronMan"))
                        wm.setResource(+R.drawable.iron_man);

                }catch (IOException e){
                    e.printStackTrace();
                }

                finish();
            }
        });
    }
}
