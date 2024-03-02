# Projeto de Estudo: Navegação entre Telas no Android

Este projeto foi concebido utilizando o Android Studio como parte de um processo de aprendizado no desenvolvimento mobile. O foco central é explorar conceitos fundamentais, especialmente na navegação entre quatro telas com a flexibilidade de alterar o plano de fundo dinamicamente

## Objetivo do Projeto

O objetivo é proporcionar uma introdução prática e gradual ao desenvolvimento Android, com ênfase na navegação eficiente entre diferentes telas e na manipulação dinâmica do design visual por meio da alteração de cores de fundo.
## Instruções de Uso

1. Instale o Android Studio: Certifique-se de ter o Android Studio instalado em seu ambiente de desenvolvimento.
2. Baixe o Projeto: Clone ou baixe o repositório deste projeto.
3. Teste o Código: Abra o projeto no Android Studio e teste o código em um emulador ou dispositivo Android.

## Implementação de Cores Aleatórias

A funcionalidade de cores aleatórias foi implementada usando o seguinte trecho de código: 

```
// Ao clicar no botão "Aleatório"
        btnAleatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gera uma cor aleatória e define como cor de fundo
                int corAleatoria = Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
                constraintLayout.setBackgroundColor(corAleatoria);
            }
        });
```
Esse código cria uma experiência visual dinâmica, gerando uma cor aleatória em formato RGB sempre que o botão "Aleatório" é acionado. Isso oferece uma ampla gama de possibilidades visuais, tornando a interação mais envolvente.

## Resultado das telas 

![Aparencia do projeto](/IMG/Tela1.png)![Aparencia do projeto](/IMG/tela1-cor.png)
![Aparencia do projeto](/IMG/tela2.png)![Aparencia do projeto](/IMG/tela4.png)

