package com.example.myapplicationkeepy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        Button button= findViewById(R.id.singupbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegisterActivity2();
            }
        });

    }
    public void openRegisterActivity2(){
        Intent Intent =new Intent(RegisterActivity2.this,MainActivity.class);
        startActivity(Intent);
    }
}