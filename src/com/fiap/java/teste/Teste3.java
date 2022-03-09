package com.fiap.java.teste;

public class Teste3 {

    public static void main(String[] args) {

        String thallys = "Thallys";
        char letra = thallys.charAt(1);

        for (int i = 0; i < thallys.length(); i++) {
            System.out.println(thallys.charAt(i) + " - ");
        }

        // -1 quando não encontra
        String facu = "FIAP - A Melhor Faculdade de Tecnologia";
        int posicao = facu.indexOf('a');
        System.out.println("O índice do caracter 'x' na string é " + posicao);

        String facuk = "FIAP - A Melhor Faculdade de Tecnologia";
        String nova = facuk.substring(facuk.indexOf('M'), 25);
        System.out.println("A nova string é: " + nova);

        String facul = "FIAP - A Melhor Faculdade de Tecnologia";
        String[] palavras = facul.split(" ");
        for (String p : palavras) {
            System.out.println(p);
        }

        String disciplinas = "LTP;Web;Algoritmos;Banco de Dados";
        String[] dis = disciplinas.split(";");
        for (String d : dis) {
            System.out.println(d);
        }
    }
}
