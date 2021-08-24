package com.example.birthdaywishing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CardActivity extends AppCompatActivity {
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        text2 = findViewById(R.id.text2);
        text2.setText("Happy Birthday, " + getIntent().getStringExtra("name"));
    }
}