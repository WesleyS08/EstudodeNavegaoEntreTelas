package com.example.estudodenavegaoentretelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuartaTelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta_tela);

        View constraintLayout = findViewById(R.id.tela4);

        Button btnVermelho = findViewById(R.id.Vermelho);
        Button btnAzul = findViewById(R.id.Azul);
        Button btnVerde = findViewById(R.id.Verde);
        Button btnAleatorio = findViewById(R.id.Aleatorio);

        btnVermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mudar a cor de fundo para vermelho
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorVermelho));
            }
        });

        btnAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mudar a cor de fundo para azul
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorAzul));
            }
        });

        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mudar a cor de fundo para verde
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorVerde));
            }
        });

        btnAleatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gere uma cor aleatória e defina como cor de fundo
                int corAleatoria = Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
                constraintLayout.setBackgroundColor(corAleatoria);
            }
        });

        // Configurar o botão para voltar para a primeira tela
        Button btnIrParaTerceiraTela = findViewById(R.id.btnIrParaTerceiraTela);
        btnIrParaTerceiraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criar um Intent para voltar para a MainActivity
                Intent intent = new Intent(QuartaTelaActivity.this, TerceiraTelaActivity.class);
                // Iniciar a MainActivity
                startActivity(intent);
            }
        });
    }
}
