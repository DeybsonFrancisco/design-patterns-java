package com.design.patterns.templateMethods;

import com.design.patterns.state.orcamento.Orcamento;
import com.design.patterns.strategy.impostos.Imposto;

public abstract class TemplateDeImpostoCondicional extends Imposto {
	
	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateDeImpostoCondicional() {
		super();
	}

	@Override
	public final double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento))
			return maximaTaxacao(orcamento);
		else return minimaTaxacao(orcamento);
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);
	protected abstract double maximaTaxacao(Orcamento orcamento);
	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
