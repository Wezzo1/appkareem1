package com.example.appkareem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    EditText et_email;
    EditText et_pass;
    Button btn_login;
    TextView tv_fp;
    TextView tv_su;
    TextView tv_sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        et_email = findViewById(R.id.et_email);
        et_pass = findViewById(R.id.et_pass);
        btn_login = findViewById(R.id.btn_login);
        tv_fp = findViewById(R.id.tv_fp);
        tv_su = findViewById(R.id.tv_su);
        tv_sp = findViewById(R.id.tv_sp);

        tv_sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(SignUpActivity.this,Support.class);
                startActivity(h);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUpActivity.this,page1.class);
                startActivity(i);
            }
        });
        tv_su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(SignUpActivity.this,MainActivity.class);
                startActivity(y);
            }
        });
tv_fp.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent m = new Intent(SignUpActivity.this,forget_password.class);
        startActivity(m);
    }
});
    }
}