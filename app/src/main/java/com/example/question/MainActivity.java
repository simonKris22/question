package com.example.question;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonStart = findViewById(R.id.butonStart);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               starQuizz();
            }
        });
    }
    private void  starQuizz(){
        Intent intent = new Intent(MainActivity.this,QuizzActivity2.class);
        startActivity(intent);

    }
}