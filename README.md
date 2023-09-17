
# Desafio de Sintaxe

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário:

Criar o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:

* Atributo	Tipo	Exemplo
* Numero | Inteiro | 1021
* Agencia | Texto | 067-8
* Nome Cliente | Texto | MARIO ANDRADE
* Saldo | Decimal | 237.48
Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
Revise sobre regras de declaração de variáveis.
Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
Programa: "Por favor, digite o número da Agência !"
Usuário: 1021 (depois ENTER para o próximo campo)
Revise sobre concatenação e classe String com método concat.
Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.

Instruções de uso:

1. Clone o repositório:
git clone https://github.com/RodrigoSoaresNascimento/terminalBankAgency/tree/main

2. Entre no diretório do projeto:

cd desafio-sintaxe


3. Compilar o programa:

javac ContaTerminal.java


4. Executar o programa:

java ContaTerminal


**Desafios:**

* Adicione validações para garantir que os dados inseridos pelo usuário sejam válidos.
* Permita que o usuário altere as informações da conta.

**Contribuições:**

Contribuições são bem-vindas! Você pode enviar pull requests para o repositório.
Este README inclui as seguintes informações:
