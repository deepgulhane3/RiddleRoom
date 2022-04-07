package com.deepgulhanedg.riddleroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class FalshActivityStart extends AppCompatActivity {

    ImageView flashImgBtn;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falsh_start);

        flashImgBtn = findViewById(R.id.flashImgBtn);


        flashImgBtn.animate().rotation(2160).alpha(1).setDuration(2100).scaleX(1);




        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(FalshActivityStart.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        },2500);

    }
}