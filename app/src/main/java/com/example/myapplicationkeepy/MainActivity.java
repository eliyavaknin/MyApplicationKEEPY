package com.example.myapplicationkeepy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Button button= findViewById(R.id.registerActivityButton);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            openRegisterActivity2();
          }
      });

    }
    public void openRegisterActivity2(){
        Intent Intent =new Intent(MainActivity.this,RegisterActivity2.class);
        startActivity(Intent);
    }
}