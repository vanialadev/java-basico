package br.com.vania.array.programa;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {
        System.out.println("Iniciando...");
//        Collection<Integer> teste = new ArrayList<>();
       Collection<Integer> teste = new HashSet<>();
        
        long inicio = System.currentTimeMillis();
        System.out.println(inicio);

        int total = 30000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        long add = System.currentTimeMillis();
        
        long tempoAdd = add - inicio;
        System.out.println("add "+tempoAdd);

        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        long contain = System.currentTimeMillis();
        
       
        long tempoContain = contain - add;
        System.out.println("lendo "+tempoContain);

        long fim = System.currentTimeMillis();
        System.out.println(fim);
        

        
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    }
}