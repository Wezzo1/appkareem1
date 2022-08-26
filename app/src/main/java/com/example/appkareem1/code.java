package com.example.appkareem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class code extends AppCompatActivity {

    Button btn_ok;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

    btn_ok = findViewById(R.id.btn_ok);

    btn_ok.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent l = new Intent(code.this,Re_pass.class);
            startActivity(l);
        }
    });


    }
}