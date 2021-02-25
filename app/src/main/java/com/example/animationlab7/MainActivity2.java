package com.example.animationlab7;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageViewAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageViewAll = findViewById(R.id.imgB2);
    }

    public void All(View view) {
        showImage("All");
    }

    public void doraemon(View view) {
        showImage("Doraemon");
    }

    public void nobita(View view) {
        showImage("Nobita");
    }

    private void showImage(String img){
        // an hinh anh
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageViewAll,"translationX",0f,500f);
        animator.setDuration(2000);
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(imageViewAll,"alpha",1f,0f);
        animator1.setDuration(2000);
        //show imge
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(imageViewAll,"translationX",-500f,0f);
        animator2.setDuration(2000);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(imageViewAll,"alpha",0f,1f);
        animator3.setDuration(2000);
        // Config slideshow process to show next image
        // dinh hinh quan trinh trinh chieu hinh anh theo thu tu
        AnimatorSet antorSet = new AnimatorSet();
        antorSet.play(animator2).with(animator3).after(animator).after(animator1);
        antorSet.start();
        final String imgName = img;
        // set listener for determine when animation finished
        // set listener de xac dinh thoi diem anh hoat dong ket thuc
        animator1.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                // chang source of ImageView
                // thay doi dau vao cua ImageView
                if (imgName == "Nobita") {
                    imageViewAll.setImageResource(R.drawable.nobita);
                    Toast.makeText(MainActivity2.this, "nobita", Toast.LENGTH_SHORT).show();
                }
                if (imgName == "Doraemon") {
                    imageViewAll.setImageResource(R.drawable.doraemon);
                    Toast.makeText(MainActivity2.this, "doraemon", Toast.LENGTH_SHORT).show();
                }
                if (imgName == "All") {
                    imageViewAll.setImageResource(R.drawable.all);
                    Toast.makeText(MainActivity2.this, "all", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onAnimationCancel(Animator animation) {


            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

    }

    public void B3(View view) {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}