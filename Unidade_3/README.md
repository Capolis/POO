# ADS-JAVA2
10 atividades referente ao módulo 2 do curso de ADS, na Unyleya, de PROGRAMAÇÃO ORIENTADA A OBJETOS

---------------------------------------
## EXERCÍCIOS
---------------------------------------


### Exercícios de Lançamento de Exceção

#### 1. Divisão e Validação de Entradas

Imagine que você está desenvolvendo uma calculadora básica e precisa evitar operações inválidas. Escreva um método que receba dois números como parâmetros e lance uma exceção se o segundo número for zero, impedindo divisões por zero no programa.

#### 2. Conversão de Temperatura e Limites Físicos

Em um sistema meteorológico, crie uma classe ConversorTemperatura com um método converterCelsiusParaFahrenheit(double temperaturaCelsius). Esse método deve lançar uma IllegalArgumentException caso a temperatura informada seja menor que -273.15 (o zero absoluto). Depois, implemente um programa que utilize essa classe e capture a exceção, informando uma mensagem de erro apropriada ao usuário.

#### 3. Validação de Idade

Desenvolva uma classe Idade com um método verificarIdade(int idade) que lança uma exceção caso a idade fornecida seja menor que 0 ou maior que 150. Este exercício ajudará a controlar a entrada de dados inválidos no sistema.

 

### Exercícios de Captura de Exceção

#### 4. Divisão por Zero com Feedback ao Usuário

Escreva um programa que solicite ao usuário um número e tente dividi-lo por zero. Use um bloco try-catch para capturar a ArithmeticException, exibindo uma mensagem amigável para orientar o usuário sobre o erro.

#### 5. Leitura de Arquivo

Implemente um método que tente ler um arquivo. Use um bloco try-catch para capturar a exceção FileNotFoundException e exibir uma mensagem informativa caso o arquivo não seja encontrado.

#### 6. Conversão de String para Número Inteiro

Escreva um programa que converta uma string em um número inteiro. Utilize try-catch para capturar a exceção NumberFormatException, exibindo uma mensagem para o usuário caso o valor inserido não seja um número válido.

 

### Exercícios de Exceções Personalizadas

#### 7. Exceção de Saldo Insuficiente

Desenvolva uma exceção personalizada chamada SaldoInsuficienteException que seja lançada quando uma tentativa de sacar uma quantia superior ao saldo disponível for feita em uma conta bancária.

#### 8. Validação de Senha

Crie uma classe ValidadorSenha com um método validarSenha(String senha) que lança uma exceção personalizada SenhaInvalidaException caso a senha não atenda aos critérios de segurança, como comprimento mínimo, entre outros.

#### 9. Validação de Transferências Bancárias

Em um sistema bancário, desenvolva uma classe ContaBancaria com um método transferir. Esse método deve lançar uma exceção personalizada TransferenciaInvalidaException se a quantia transferida for menor ou igual a zero, garantindo a validade das transações.

#### 10. Divisão Inteira com Controle de Exatidão

Implemente uma classe DivisaoInteira que realiza uma divisão inteira entre dois números e lança uma exceção personalizada DivisaoInteiraInvalidaException se a divisão não for exata, mantendo precisão nos cálculos.

---------------------------------------
## Instruções de Entrega:
---------------------------------------
- Realize todos os 10 exercícios da lista, completando-os em Java e aplicando os conceitos solicitados em cada questão.