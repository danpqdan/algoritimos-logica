package com.exec;

import com.exec.vetor.Vetores;

public class Aula7 {
    public static void main(String[] args) {
        Vetores vetor = new Vetores(10);

        vetor.adicionar("b");
        vetor.adicionar("c");
        vetor.adicionar("e");
        vetor.adicionar("f");
        vetor.adicionar("g");
        
        System.out.println(vetor);
        vetor.adiciona(0,"a");
        System.out.println(vetor);
        vetor.adiciona(7, "d");
        System.out.println(vetor);
    }
}
