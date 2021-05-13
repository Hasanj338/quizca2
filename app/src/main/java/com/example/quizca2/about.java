package com.example.quizca2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class about extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}