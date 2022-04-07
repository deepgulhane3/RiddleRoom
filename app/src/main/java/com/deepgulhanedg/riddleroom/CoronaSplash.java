package com.deepgulhanedg.riddleroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class CoronaSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_splash);

        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(CoronaSplash.this , QuizOne.class );
                startActivity(intent);

                finish();
            }
        },2000);

        ImageView coronaImg = findViewById(R.id.coronaImg);
        coronaImg.animate().alpha(1).scaleXBy(0.3f).scaleYBy(0.3f).setDuration(1990);
    }
}