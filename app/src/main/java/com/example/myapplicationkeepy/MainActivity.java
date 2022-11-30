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

      Button button= findViewById(R.id.loginActivityButton);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            openhomepage();
          }

      });
      findViewById(R.id.registercostumer).setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {opencostumerRegisterActivity();}
      }); ;
      findViewById(R.id.registerkeeper).setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View view) {openkeeperRegisterActivity();}
      });
    }
    public void openhomepage(){
        Intent Intent =new Intent(MainActivity.this,homePageCustomer.class);
        startActivity(Intent);
    }
    public void openkeeperRegisterActivity(){
        Intent Intent =new Intent(MainActivity.this,registerKeeperActivity.class);
        startActivity(Intent);
    }
    public void opencostumerRegisterActivity(){
        Intent Intent =new Intent(MainActivity.this,RegisterActivity2.class);
        startActivity(Intent);
    }
}