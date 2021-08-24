package com.example.birthdaywishing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputName = findViewById(R.id.inputName);
    }

    public void createCard(View view) {

        String name = inputName.getText().toString().toUpperCase();
        Intent in = new Intent(this, CardActivity.class);
        in.putExtra("name", name);

        if(!name.isEmpty()) {
            startActivity(in);
            Toast.makeText(MainActivity.this, "Card Created", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity.this, "Please enter name !!!!", Toast.LENGTH_LONG).show();
        }
    }
}