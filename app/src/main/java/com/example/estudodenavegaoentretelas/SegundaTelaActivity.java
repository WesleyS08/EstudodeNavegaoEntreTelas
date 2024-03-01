package com.example.estudodenavegaoentretelas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaTelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        // Referencia o layout da segunda tela
        View constraintLayout = findViewById(R.id.tela2);

        // Referencias aos botões da segunda tela
        Button btnVermelho = findViewById(R.id.Vermelho);
        Button btnAzul = findViewById(R.id.Azul);
        Button btnVerde = findViewById(R.id.Verde);
        Button btnAleatorio = findViewById(R.id.Aleatorio);

        // Ao clicar no botão "Vermelho"
        btnVermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Muda a cor de fundo para vermelho
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorVermelho));
            }
        });

        // Ao clicar no botão "Azul"
        btnAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Muda a cor de fundo para azul
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorAzul));
            }
        });

        // Ao clicar no botão "Verde"
        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Muda a cor de fundo para verde
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorVerde));
            }
        });

        // Ao clicar no botão "Aleatório"
        btnAleatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gera uma cor aleatória e define como cor de fundo
                int corAleatoria = Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
                constraintLayout.setBackgroundColor(corAleatoria);
            }
        });

        // Configura o botão para ir para a terceira tela
        Button btnIrParaTerceiraTela = findViewById(R.id.btnIrParaTerceiraTela);
        btnIrParaTerceiraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cria um Intent para iniciar a TerceiraTelaActivity
                Intent intent = new Intent(SegundaTelaActivity.this, TerceiraTelaActivity.class);
                // Inicia a terceira tela
                startActivity(intent);
            }
        });

        // Configura o botão para voltar para a primeira tela
        Button btnIrParaPrimeiraTela = findViewById(R.id.btnIrParaPrimeiraTela);
        btnIrParaPrimeiraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cria um Intent para voltar para a MainActivity
                Intent intent = new Intent(SegundaTelaActivity.this, MainActivity.class);
                // Inicia a MainActivity
                startActivity(intent);
            }
        });
    }
}
