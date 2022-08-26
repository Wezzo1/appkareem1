package com.example.appkareem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_signup;
    TextView tv_iha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_signup = findViewById(R.id.btn_signup);
        tv_iha = findViewById(R.id.tv_iha);

        btn_signup.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this,page1.class);
                startActivity(k);


            }
        });
        tv_iha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(a);

            }
        });
    }
}