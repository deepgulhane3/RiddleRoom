package com.deepgulhanedg.riddleroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MovieFlash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_flash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MovieFlash.this , QuizThree.class);
                startActivity(intent);

                finish();
            }
        },2000);

        ImageView movieLogoFlash = findViewById(R.id.movieFlashLogo);
        movieLogoFlash.animate().alpha(1).scaleXBy(0.7f).scaleYBy(0.7f).setDuration(1990);

    }
}