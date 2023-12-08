package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity4 : AppCompatActivity() {

    imageButton imageButton;
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
 val imageButton = findViewById<>(R.id.imageButton);
        imageButton.setOnClickLister(View.OnClickListener(){
            @SuppressLint

        }








        }
    }