package com.example.estudodenavegaoentretelas;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.estudodenavegaoentretelas.R;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.principal); // Identifica a tela para mudar o fundo

        // Linka as cores de res>values>colors.xml
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

        // Configura o botão para ir para a segunda tela
        Button btnIrParaSegundaTela = findViewById(R.id.btnIrParaSegundaTela);
        btnIrParaSegundaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cria um Intent para iniciar a SegundaTelaActivity
                Intent intent = new Intent(MainActivity.this, SegundaTelaActivity.class);
                // Inicia a segunda tela
                startActivity(intent);
            }
        });
    }
}
