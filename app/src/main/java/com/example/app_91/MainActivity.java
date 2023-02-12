package com.example.app_91;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    static Button but1, but2, but3;
    static ImageView iv;
    static int itemSelected;
    static boolean isSelected;
    static MediaPlayer mp;
    static double startTime;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = findViewById(R.id.startbut);
        but2 = findViewById(R.id.pausebut);
        but3 = findViewById(R.id.stopbut);
        iv = findViewById(R.id.imageView);



        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);



        Fragment1 fr1 = (Fragment1)getFragmentManager().findFragmentById(R.id.list);
        fr1.cities.add("Denmark");
        fr1.cities.add("France");
        fr1.cities.add("Poland");
        fr1.adapter.notifyDataSetChanged();



    }
    public void onClick(View v) {
        if(itemSelected == 0){
            if (v.equals(but1)) {
                if (mp == null) {
                    mp = MediaPlayer.create(this, R.raw.denmark);
                }
                if (!mp.isPlaying()) {
                    mp.seekTo((int) startTime);
                    mp.start();
                }
            } else if (v.equals(but2)) {
                if (mp != null && mp.isPlaying()) {
                    startTime = mp.getCurrentPosition();
                    mp.pause();
                }
            } else {
                if (mp != null && mp.isPlaying()) {
                    startTime = 0;
                    mp.stop();
                    mp = null;
                }
            }
        }
        else if(itemSelected == 1){
            if (v.equals(but1)) {
                if (mp == null) {
                    mp = MediaPlayer.create(this, R.raw.france);
                }
                if (!mp.isPlaying()) {
                    mp.seekTo((int) startTime);
                    mp.start();
                }
            } else if (v.equals(but2)) {
                if (mp != null && mp.isPlaying()) {
                    startTime = mp.getCurrentPosition();
                    mp.pause();
                }
            } else {
                if (mp != null && mp.isPlaying()) {
                    startTime = 0;
                    mp.stop();
                    mp = null;
                }
            }
        }
        else if(itemSelected == 2){
            if (v.equals(but1)) {
                if (mp == null) {
                    mp = MediaPlayer.create(this, R.raw.poland);
                }
                if (!mp.isPlaying()) {
                    mp.seekTo((int) startTime);
                    mp.start();
                }
            } else if (v.equals(but2)) {
                if (mp != null && mp.isPlaying()) {
                    startTime = mp.getCurrentPosition();
                    mp.pause();
                }
            } else {
                if (mp != null && mp.isPlaying()) {
                    startTime = 0;
                    mp.stop();
                    mp = null;
                }
            }
        }
        else{
            if (v.equals(but1)) {
                if (mp == null) {
                    mp = MediaPlayer.create(this, R.raw.denmark);
                }
                if (!mp.isPlaying()) {
                    mp.seekTo((int) startTime);
                    mp.start();
                }
            } else if (v.equals(but2)) {
                if (mp != null && mp.isPlaying()) {
                    startTime = mp.getCurrentPosition();
                    mp.pause();
                }
            } else {
                if (mp != null && mp.isPlaying()) {
                    startTime = 0;
                    mp.stop();
                    mp = null;
                }
            }
        }
    }
}