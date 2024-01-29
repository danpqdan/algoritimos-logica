package com.exec;

import com.exec.vetor.Vetores;

public class Aula9 {
    public static void main(String[] args) {
        Vetores vetor = new Vetores(3);

        vetor.adicionar("b");
        vetor.adicionar("c");
        vetor.adicionar("e");
        vetor.adicionar("f");
        vetor.adicionar("g");

        System.out.println(vetor);

        vetor.remove(1);
        System.out.println(vetor);

        System.out.println("Remover o elemento E");

        int pos = vetor.busca("a");
        if(pos > 0){
            vetor.remove(pos);
        }else{
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);
    }
}
