package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img;

    int[] pic ={R.drawable.img,R.drawable.img_1,R.drawable.img_2,R.drawable.img_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=findViewById(R.id.imageView);

    }
    public void chan(View v){
        Random r = new Random();
        int r1=r.nextInt(4);

        img.setImageResource(pic[r1]);

    }
}