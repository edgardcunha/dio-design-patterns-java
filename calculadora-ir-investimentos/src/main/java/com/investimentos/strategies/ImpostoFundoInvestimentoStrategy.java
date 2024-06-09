package com.investimentos.strategies;

import com.investimentos.bo.Investimento;

public class ImpostoFundoInvestimentoStrategy implements ImpostoStrategy {
    @Override
    public double calcularImposto(Investimento investimento) {
        return investimento.getRendimento() * 0.15; // 15%
    }
}
