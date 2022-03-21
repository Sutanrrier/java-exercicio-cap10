package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.main.SistemaBancario;

public class TestaContas {

	public static void main(String[] args) {
		SistemaBancario.mostraTela(false);
		
		//Testando se um metodo abstrato pode ser chamado dentro de outro metodo da propria classe abstrata
		Conta conta = new ContaPoupanca();
		conta.recuperaDadosParaImpressao();
	}

}
