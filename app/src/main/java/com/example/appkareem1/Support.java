package com.example.appkareem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Support extends AppCompatActivity {

    Button btn_send;
    Button btn_back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
    btn_send = findViewById(R.id.btn_send);
    btn_back = findViewById(R.id.btn_back);

    btn_back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent j = new Intent(Support.this,SignUpActivity.class);
            startActivity(j);
        }
    });

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Support.this, "تم الارسال", Toast.LENGTH_SHORT).show();
            }
            });
    }
}