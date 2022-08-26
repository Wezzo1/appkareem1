package com.example.appkareem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Re_pass extends AppCompatActivity {

    Button btn_ok2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_pass);
    btn_ok2 = findViewById(R.id.btn_ok2);
    btn_ok2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent s = new Intent(Re_pass.this,SignUpActivity.class);
            startActivity(s);
        }
    });


    }
}