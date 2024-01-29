package com.exec;

import com.exec.vetor.Vetores;

public class Aula4 {
    public static void main(String[] args) {

        //intancia do vetor que esta inserido na classe Vetores;
        Vetores vetor = new Vetores(1);


        //Metodo de adição e deleção de futuros elementos;
        vetor.adicionar("elemento 1");
        vetor.adicionar("elemento 2");
        vetor.adicionar("elemento 3");


        //Retorno do tamanho total dos registros em memoria;
        System.out.println(vetor.tamanho());


        //Retorno em forma de String utilizando appendOn;
        System.out.println(vetor.toString());
    }
}
