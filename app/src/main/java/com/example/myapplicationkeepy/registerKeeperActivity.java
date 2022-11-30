package com.example.myapplicationkeepy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registerKeeperActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_keeper);

        findViewById(R.id.continuekeeper).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhomepagekeeper();
            }
        });

    }
    public void openhomepagekeeper(){
        Intent Intent =new Intent(registerKeeperActivity.this,homePageKeeper.class);
        startActivity(Intent);
    }
}
