package com.example.zmusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = MediaPlayer.create(this,R.raw.sound1);
    }
//    public void onPrepared(MediaPlayer music) {
//        music.start();
//    }

    public void musicpause(View view) {
        music.pause();
    }

    public void musicplay(View view) {
        music.start();
    }

    public void musicstop(View view) {
        music.stop();
        music = MediaPlayer.create(this,R.raw.sound1);
    }
}