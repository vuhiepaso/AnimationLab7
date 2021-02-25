package com.example.animationlab7;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    ImageView hour,minute,second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        hour= findViewById(R.id.imgHour);
        minute= findViewById(R.id.imgMinute);
        second= findViewById(R.id.imgSecond);
    }

    public void Run(View view) {
        ObjectAnimator animatorSecond = ObjectAnimator.ofFloat(second,"rotation",0f,360f);
        animatorSecond.setDuration(36000);
        animatorSecond.setRepeatCount(36000);
        animatorSecond.start();

        ObjectAnimator animatorMinute = ObjectAnimator.ofFloat(minute,"rotation",0f,360f);
        animatorMinute.setDuration(360000);
        animatorMinute.setRepeatCount(360000);
        animatorMinute.start();

        ObjectAnimator animatorHour = ObjectAnimator.ofFloat(hour,"rotation",0f,360f);
        animatorHour.setDuration(3600000);
        animatorHour.setRepeatCount(3600000);
        animatorHour.start();
    }
}