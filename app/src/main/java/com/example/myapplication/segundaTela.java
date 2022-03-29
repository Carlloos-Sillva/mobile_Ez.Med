package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class segundaTela extends AppCompatActivity {
TextView l,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
        l = findViewById(R.id.textView3);
        s = findViewById(R.id.textView4);
        Intent objetoIntent = getIntent();
        Bundle bundleObjeto = objetoIntent.getExtras();
        l.setText(bundleObjeto.getString ("LOGIN"));
        s.setText(bundleObjeto.getString ("SENHA"));
    }
}