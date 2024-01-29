package com.exec;

import com.exec.vetor.Vetores;

public class Aula5 {
    public static void main(String[] args) {

        Vetores vetor = new Vetores(10);

        vetor.adicionar("elemento 1");
        vetor.adicionar("elemento 2");
        vetor.adicionar("elemento 3");

        System.out.println(vetor.busca(2));

    }
}
