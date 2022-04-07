package com.deepgulhanedg.riddleroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView movieBtn,coronaBtn,techBtn,startBtn;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieBtn =  findViewById(R.id.movieBtn);
        coronaBtn = findViewById(R.id.coronaBtn);
        techBtn = findViewById(R.id.techBtn);

        startBtn = findViewById(R.id.startBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rOne = new Random();
                n = rOne.nextInt(4);
               switch (n){
                   case 1 :
                               Intent intent = new Intent(MainActivity.this, MovieFlash.class);
                               startActivity(intent);
                                break;
                   case 2 :
                               Intent intentC = new Intent(MainActivity.this , CoronaSplash.class);
                               startActivity(intentC);
                               break;
                   case 3:

                               Intent nextScreen = new Intent(MainActivity.this , TechSplash.class);
                               startActivity(nextScreen);
                               break;
               }
            }
        });


        movieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieFlash.class);
                startActivity(intent);
            }
        });


        coronaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , CoronaSplash.class);
                startActivity(intent);
            }
        });


        techBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(MainActivity.this , TechSplash.class);
                startActivity(nextScreen);
            }
        });

    }
}