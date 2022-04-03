package com.example.ezmed;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class telaCadastro extends AppCompatActivity {
    private EditText nome,cpf,email;
    private Button gravar,recuperar;
    private TextView tNome,tCpf,tEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        nome = findViewById(R.id.edtNomeF);
        cpf  =findViewById(R.id.edtCpfF);
        email = findViewById(R.id.edtEmailF);
        gravar = findViewById(R.id.btnSalvarF);
        recuperar = findViewById(R.id.btnRecuperaF);
        tNome = findViewById(R.id.txtNomeF);
        tCpf = findViewById(R.id.txtCpfF);
        tEmail = findViewById(R.id.txtEmailF);
        gravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gravar();
            }
        });
        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recuperar();
            }
        });
    }


    public void gravar()
    {
        String txtNome = nome.getText().toString();
        String txtCpf = cpf.getText().toString();
        String txtEmail = email.getText().toString();
        SharedPreferences obj = getSharedPreferences("Dados", Context.MODE_PRIVATE);
        SharedPreferences.Editor  edicao = obj.edit();
        edicao.putString("NOME",txtNome);
        edicao.putString("CPF",txtCpf);
        edicao.putString("EMAIL",txtEmail);
        edicao.apply();
        Toast.makeText(getBaseContext(),"DADOS INSERIDOS COM SUCESSO",Toast.LENGTH_LONG).show();
    } // FIM DO GRAVAR
    public void recuperar()
    {
        SharedPreferences objRecupera = getSharedPreferences("Dados",Context.MODE_PRIVATE);
        tNome.setText(objRecupera.getString("NOME","nulo"));
        tCpf.setText(objRecupera.getString("CPF","nulo"));
        tEmail.setText(objRecupera.getString("EMAIL","nulo"));


    }

}
