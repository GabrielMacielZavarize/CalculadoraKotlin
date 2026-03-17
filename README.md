# Calculadora Android

Aplicativo de calculadora desenvolvido para Android utilizando Kotlin e Jetpack Compose. O projeto foi criado com foco em aprendizado das ferramentas modernas de desenvolvimento Android, especialmente o paradigma declarativo de UI com Compose.

## Sobre o projeto

A calculadora oferece as quatro operações aritméticas básicas: adição, subtração, multiplicação e divisão. A interface segue um tema escuro com cores distintas para cada categoria de botão, facilitando a identificação visual das funções disponíveis.

O layout é composto por um display na parte superior que exibe o valor atual e uma grade de 4x4 botões na parte inferior. A lógica de cálculo ainda está em desenvolvimento — os botões estão estruturados e prontos para receber a implementação das operações.

## Tecnologias utilizadas

- **Kotlin** — linguagem principal do projeto
- **Jetpack Compose** — toolkit moderno para construção de interfaces Android de forma declarativa
- **Material 3** — sistema de design utilizado nos componentes visuais
- **Android SDK** — versão mínima 24 (Android 7.0 Nougat), versão alvo 36

## Estrutura do projeto

```
app/
└── src/
    └── main/
        └── java/com/example/calculadora/
            ├── MainActivity.kt         # Tela principal e componentes da calculadora
            └── ui/theme/
                ├── Color.kt            # Definição das cores do tema
                ├── Theme.kt            # Configuração do tema da aplicação
                └── Type.kt             # Tipografia
```

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/GabrielMacielZavarize/CalculadoraKotlin.git
   ```

2. Abra o projeto no **Android Studio**.

3. Aguarde a sincronização do Gradle finalizar.

4. Execute o projeto em um emulador ou dispositivo físico com Android 7.0 ou superior.

## Paleta de cores

| Elemento         | Cor            |
|------------------|----------------|
| Fundo            | `#1C1C1E`      |
| Botões numéricos | `#3A4A6B`      |
| Operadores       | `#FF9800`      |
| Limpar (C)       | `#8B0000`      |
| Igual (=)        | `#2C6E49`      |
| Texto            | `#FFFFFF`      |

## Próximos passos

- Implementar a lógica de cálculo ao pressionar os botões
- Adicionar suporte a números decimais
- Tratar entradas inválidas e divisão por zero
- Adicionar histórico de operações

## Autor

Desenvolvido por **Gabriel Maciel Zavarize**.
