package com.exec.vetor;

import java.util.Arrays;

public class Vetores {
    // POO básico para inserção de Strings no elemento de acordo com o tamanho;
    private String[] elementos;
    private int tamanho;

    /*
     * Contrutores responsavel pela criação e iniciação do tamanho
     * Inserido na capacidade total a quantidade de posições do elemento;
     */
    public Vetores(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*
     * Algoritimos de posição, realiza interação com cada elemento inserido na
     * posição. Sem controle de Treads espaço e armazenamento.
     */

    /*
     * metodo de adicionar elementos por verificação de espaço. Necessario entao
     * toda inserção verificar todos os elementos da chave
     * public void adicionar(String elemento) {
     * for (int i = 0; i < this.elementos.length; i++) {
     * if (this.elementos[i] == null) {
     * this.elementos[i] = elemento;
     * break;
     * }
     * }
     * }
     */

    // Metodo adicionar, apartir de uma verificação rapida no tamanho & elementos;
    public boolean adicionar(String elemento) {

        // Se os elementos forem maiores que o tamanho returna false ou se os elementos
        // foram marioes que o tamanho retorna falso.
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // retorno o elemento tamanho;
    public int tamanho() {
        return this.tamanho;
    }

    /*
     * metodo padrão de contrução de String
     */

    @Override
    public String toString() {

        // SB é responsavel pela concatenação das string de retorno do vetor;
        StringBuilder s = new StringBuilder();
        s.append("[ ");

        // Acesso aos elementos do vetor na posição , I ,
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(" , ");
        }
        // Realiza a exclusão real dos elementos caso o tamanho seja maior que os
        // elementos;
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        // Fechamento do vetor;
        s.append(" ]");

        // Retorno do SB ao inicio;
        return s.toString();
    }

}
