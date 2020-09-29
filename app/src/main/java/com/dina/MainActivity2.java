package com.dina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView nim,ttl,nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nama = (TextView) findViewById(R.id.textView2);
        nim = (TextView) findViewById(R.id.textView4);
        ttl = (TextView) findViewById(R.id.textView6);

        nama.setText(getIntent().getStringExtra("NAME"));
        nim.setText(getIntent().getStringExtra("NIM"));
        ttl.setText(getIntent().getStringExtra("TTL"));

    }
}