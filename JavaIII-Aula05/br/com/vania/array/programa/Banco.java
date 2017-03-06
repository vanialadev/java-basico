package br.com.vania.array.programa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.vania.array.modelo.Conta;

public class Banco {

/*    private List<Conta> contas = new ArrayList<>();

    public void adiciona(Conta conta) {
        contas.add(conta);
    }

    public Conta pega(int posicao) {
        return contas.get(posicao);
    }

    public int getQuantidadeDeContas() {
        return contas.size();
    }*/
    
    private List<Conta> contas = new ArrayList<>();
    private Map<String, Conta> indexadoPorNome = new HashMap<>();

    public void adiciona(Conta conta) {
        contas.add(conta);
        indexadoPorNome.put(conta.getTitular(), conta);
    }

    public Conta buscaPorNome(String nome) {
        return indexadoPorNome.get(nome);
    }
    

}