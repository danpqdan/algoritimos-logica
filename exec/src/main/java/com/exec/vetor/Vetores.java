package com.exec.vetor;

import java.util.Arrays;

public class Vetores {
    // POO básico para inserção de Strings no elemento de acordo com o tamanho.
    private String[] elementos;
    private int tamanho;

    /*
     * Contrutores responsavel pela criação e iniciação do tamanho
     * Inserido na capacidade total a quantidade de posições do elemento.
     */
    public Vetores(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // Método de aumentar a capacidade do vetor.
    public void aumentaCapacidade() {
        // Verifica se os elementos tem o mesmo tamanho do vetor.
        if (this.tamanho == this.elementos.length) {
            // Chama um novo vetor com o valor anterior x 2
            String[] elementosNovos = new String[this.elementos.length * 2];
            // Reintera os antigos elementos ao novo vetor.
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            // Adiciona os elementos aos novos elementos(espaço em vetor)
            this.elementos = elementosNovos;
        }
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
        this.aumentaCapacidade();

        // Se os elementos forem maiores que o tamanho returna false ou se os elementos
        // foram marioes que o tamanho retorna falso.
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // Método de adicinar elemento em posições especificas sem sobreescrita.
    public boolean adiciona(int posicao, String elemento) {
        // Algoritimo de dupla confirmação, gerando uma exceção caso a posição seja
        // invalida.
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();

        // Mover os elementos do I para posição I+1, apos receber um I valido.
        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        // Confirmado e incrementado novas posições é possivel inserir agora o elemento
        // do método sem perder os dados incrementando um novo tamanho;
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;
    }

    public void remove(int posicao) {
        // Algoritimo de dupla confirmação, gerando uma exceção caso a posição seja invalida.
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        //Verifica o Indice e logo remove o tamanho apos encontrar o I.
        for(int i=posicao; i<this.tamanho-1; i++){
            //Torna o indice no valor final
            this.elementos[i] = this.elementos[i+1];
        }

        //Mantem o tamanho do vetor de forma decremental.
        this.tamanho--;
    }

    // Método de busca de elemento apartir de posição do elemento.
    public String busca(int posicao) {
        // Algoritimo de dupla confirmação, gerando uma exceção caso a posição seja
        // invalida.
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        // retorna o elemento caso não caia no bloco anterior.
        return this.elementos[posicao];
    }

    // Método de busca atraves de texto, retornando a posição do elemento caso
    // exista.
    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            // Caso o elemento exista irá dar retorno a posição I
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        // Ou retorna uma posição de vetor inexistente;
        return -1;
    }

    // retorno o elemento tamanho.
    public int tamanho() {
        return this.tamanho;
    }

    /*
     * metodo padrão de contrução de String.
     */

    @Override
    public String toString() {

        // SB é responsavel pela concatenação das string de retorno do vetor.
        StringBuilder s = new StringBuilder();
        s.append("[ ");

        // Acesso aos elementos do vetor na posição , I ,
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(" , ");
        }
        // Realiza a exclusão real dos elementos caso o tamanho seja maior que os
        // elementos.
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        // Fechamento do vetor.
        s.append(" ]");

        // Retorno do SB ao inicio.
        return s.toString();
    }

}
