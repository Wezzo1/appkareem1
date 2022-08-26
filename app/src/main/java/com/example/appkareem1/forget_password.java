package com.example.appkareem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class forget_password extends AppCompatActivity {
Button btn_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

    btn_check = findViewById(R.id.btn_check);
    btn_check.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent n = new Intent(forget_password.this,code.class);
            startActivity(n);
        }
    });


    }
}