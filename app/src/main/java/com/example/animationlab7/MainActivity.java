package com.example.animationlab7;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    int dest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image);

    }
    public void rotation(View view) {
        dest = 360;
        if (imageView.getRotation()==360){
        System.out.println(imageView.getAlpha());
        dest=0;
        }
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView,"rotation",dest);
        animator.setDuration(2000);
        animator.start();
    }

    public void moving(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide_out);
        imageView.startAnimation(animation);
    }

    public void zoom(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.zoom);
        imageView.startAnimation(animation);
    }

    public void B2(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}