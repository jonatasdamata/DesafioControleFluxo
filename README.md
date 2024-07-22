# Desafio de Controle de Fluxo

Este projeto é um exercício de programação em Java que visa praticar o controle de fluxo e a manipulação de exceções. O objetivo é criar um programa que receba dois parâmetros via terminal e, com base nesses parâmetros, realize a contagem e impressão de números.

## Descrição

O programa solicita ao usuário dois números inteiros. Com base nesses números, ele realiza as seguintes ações:

1. **Validação**: Verifica se o primeiro número é menor que o segundo.
   - Se o primeiro número for menor que o segundo, o programa calcula a diferença entre eles e imprime números sequenciais, de 1 até a diferença.
   - Se o primeiro número não for menor que o segundo, o programa lança uma exceção personalizada `ParametrosInvalidosException` com uma mensagem de erro.

## Estrutura do Projeto

O projeto é composto por duas classes:

### `Contador`

A classe principal do programa que realiza as seguintes funções:

- **Entrada de Dados**: Recebe dois números inteiros do usuário.
- **Validação e Contagem**: Verifica os números fornecidos e imprime uma sequência de números ou lança uma exceção se os parâmetros estiverem incorretos.

### `ParametrosInvalidosException`

Uma exceção personalizada que é lançada quando o primeiro número não é menor que o segundo. A classe fornece uma mensagem de erro padrão para informar ao usuário sobre o problema.


## Como Executar

### 1. Clone o Repositório:

```
  git clone https://github.com/jonatasdamata/DesafioControleFluxo
```

### 2. Compile o Projeto:
Navegue até o diretório do projeto e compile o código usando o comando:
```
  javac Contador.java ParametrosInvalidosException.java
```

### 3. Execute o Programa:
Após a compilação, execute o programa com o comando:
```
  java Contador
```

### 4. Siga as Instruções:
O programa solicitará dois números inteiros. <br>
Digite os números conforme solicitado para ver o resultado.
