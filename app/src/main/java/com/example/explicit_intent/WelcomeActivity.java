package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent=getIntent();
        tv1=(TextView) findViewById(R.id.tv1);
        String string=intent.getStringExtra("STRING");
        tv1.setText("Welcome  "+string);
    }

}