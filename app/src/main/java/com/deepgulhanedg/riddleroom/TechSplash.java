package com.deepgulhanedg.riddleroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class TechSplash extends AppCompatActivity {

    ImageView techLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_splash);

         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(TechSplash.this , QuizTwo.class);
                startActivity(intent);
                finish();
            }
        },2000);

        ImageView techLogo = findViewById(R.id.techLogo);
        techLogo.animate().alpha(1).scaleXBy(0.3f).scaleYBy(0.3f).setDuration(1990);
    }

}