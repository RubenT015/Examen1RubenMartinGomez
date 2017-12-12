package com.example.alumnom.examen1rubenmartingomez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends AppCompatActivity {

    private static final long SPLASH_SCREEN_DELAY = 3000;
    ImageView ivSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);
        ivSplash = (ImageView) findViewById(R.id.ivSplash);

        //Glide.with(this).load(R.drawable.portada).into(ivSplash);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Intent mainIntent = new Intent().setClass(
                        SplashScreenActivity.this, MainActivity.class);
                startActivity(mainIntent);

                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, SPLASH_SCREEN_DELAY);
    }
}
