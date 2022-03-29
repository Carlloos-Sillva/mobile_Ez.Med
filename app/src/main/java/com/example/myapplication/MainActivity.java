package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText login, senha;
Button logar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.edt_Login);
        senha = findViewById(R.id.edt_Senha);
        logar = findViewById(R.id.btn_Entra);
        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logando();
            }
        });
    }// fim do oncreate

    public void logando()
    {
        if(login.getText().toString().trim().equals("teste")&& senha.getText().toString().equals("123"))
        {
            Intent intent = new Intent(this,segundaTela.class);
            Bundle n = new Bundle();
            n.putString("LOGIN",login.getText().toString());
            n.putString("SENHA",senha.getText().toString());
            intent.putExtras(n);
            startActivity(intent);
        }else{
         login.setText("");
         senha.setText("");
         login.requestFocus();
            Toast.makeText(this, "DADOS INVALIDOS", Toast.LENGTH_LONG).show();
        }

    }



}