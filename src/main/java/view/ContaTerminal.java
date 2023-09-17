package view;

import entities.Costumer;
import entities.CurrentAccount;
import exceptions.BusinessRuleExpection;

import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {

    static Scanner scanner = new Scanner(System.in);

    static CurrentAccount currentAccount;

    static Costumer costumer;


    public static void main(String[] args) {

        menu();

    }

    public static void menu (){
        System.out.println("Olá bem vindo a agencia java!");
        System.out.println("Escolha uma das opções abaixo");
        System.out.println(" 1 - para criar uma nova conta");
        System.out.println(" 2 - para realizar deposito");
        System.out.println(" 3 - para realizar saque");
        System.out.println(" 4 - para sair");
        int option = scanner.nextInt();
        switch (option){
            case 1 -> createNewAccount();
            case 2 -> addAccountBalance();
            case 3 -> withdrawAccountBalance();
            case 4 -> {
                break;
            }
            default -> System.out.println("digite uma opção valida");
        }
    }

    private static void addAccountBalance() {

        System.out.println("Digite um valor a ser depositado");
        Double balance = scanner.nextDouble();
        try {
            currentAccount.addBalance(balance);
            System.out.println("Seu nome saldo é de "+currentAccount.getBalance());
        }catch (BusinessRuleExpection expection){
            System.out.println(expection.getMessage());
        }finally {
            menu();
        }


    }

    private static void withdrawAccountBalance() {

        System.out.println("Digite um valor a ser sacado!");
        Double balance = scanner.nextDouble();
        try {
            currentAccount.withdrawBalance(balance);
            System.out.println("Seu nome saldo é de "+currentAccount.getBalance());
        }catch (BusinessRuleExpection expection){
            System.out.println(expection.getMessage());
        }finally {
            menu();
        }

    }

    private static void createNewAccount() {
        System.out.println("Por favor, digite o número da Agência !");
        int agency = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o seu nome");
        String name = scanner.nextLine();
        System.out.println("Por favor, digite o seu cpf");
        String cpf = scanner.nextLine();
        if (cpf.matches("^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$")) {
            System.out.println("Por favor, digite o seu email");
            String email = scanner.nextLine();
            if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")){
                System.out.println("Por favor, digite a sua idade");
                int age = scanner.nextInt();
                costumer = new Costumer(cpf, name, age, email);
            }else {
                System.out.println("Formato do email invalido");
            }

        } else {
            System.out.println("O CPF não é válido");
        }
        String accountNumber = gerarNumeroContaBancariaAleatorio();
        currentAccount = new CurrentAccount(accountNumber,agency);
        System.out.println("Olá "+name+", obrigado por criar uma conta em nosso banco, sua agência é "+agency+", conta "+accountNumber+" e seu saldo "+currentAccount.getBalance()+" já está disponível para saque");
        menu();

    }

    public static String gerarNumeroContaBancariaAleatorio() {

        // Gera um número aleatório de 10 dígitos
        int numeroAleatorio = new Random().nextInt(1000000000);

        // Calcula o dígito verificador usando apenas a classe Random

        int digitoVerificador = 11 - (numeroAleatorio % 11);
        if (digitoVerificador == 11) {
            digitoVerificador = 0;
        }

        // Adiciona o dígito verificador ao número aleatório
        numeroAleatorio += digitoVerificador;

        // Converte o número para uma string
        String numeroContaBancaria = String.valueOf(numeroAleatorio);

        return numeroContaBancaria;

    }

}
