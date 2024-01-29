package com.exec.vetor;

public class Aula8 {
    public static void main(String[] args) {
        Vetores vetor = new Vetores(3);

        vetor.adicionar("b");
        vetor.adicionar("c");
        vetor.adicionar("e");
        vetor.adicionar("f");
        vetor.adicionar("g");
        
        System.out.println(vetor);
        vetor.adiciona(0,"a");
        System.out.println(vetor);
        vetor.adiciona(3, "d");
        System.out.println(vetor);
    }
}
