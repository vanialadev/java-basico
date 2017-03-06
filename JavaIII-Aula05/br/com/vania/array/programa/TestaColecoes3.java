package br.com.vania.array.programa;

import java.util.HashMap;
import java.util.Map;

import br.com.vania.array.modelo.Conta;

public class TestaColecoes3 {

	public static void main(String[] args) {
		
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Conta c1 =  new Conta(200);
		Conta c2 =  new Conta(500);
		
		contas.put("diretor", c1);
		contas.put("gerente", c2);
		
		System.out.println(contas.get("diretor").getSaldo());
		System.out.println(contas.get("gerente").getSaldo());
		System.out.println(contas.size());
		
	}
}
