package br.edu.ifpb.eda.questoes.questao01;

public class Soma {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while(k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        // RESPOSTA: 91
        System.out.println(soma);
    }
}
