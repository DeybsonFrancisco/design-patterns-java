package com.design.patterns.strategy.investimentos;

import com.design.patterns.state.conta.Conta;

public class Conservador implements Investimento {

	@Override
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
