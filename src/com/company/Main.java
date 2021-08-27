package com.company;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoaZero = new Pessoa();
        Pessoa pessoaUm = new Pessoa("Stella", 3, "Dois", 108.0, 1.98);
        Pessoa pessoaDois = new Pessoa("Fernando", 80, "Três", 80.0, 1.72);


        double imc = pessoaDois.calcularIMC();

        if (imc == -1) {
            System.out.println("Baixo peso");
        } else if (imc == 0) {
            System.out.println("Peso saudável");
        } else {
            System.out.println("Sobrepeso");
        }

        boolean maiorDeIdade = pessoaDois.eMaiorDeIdade();

        if (maiorDeIdade) {
            System.out.println("Maior de 18 anos");
        } else {
            System.out.println("Menor de 18 anos");
        }

        String dataShow = pessoaDois.toString();
        System.out.println(pessoaDois);
    }
}


