package com.investimentos.strategies;

import com.investimentos.bo.Investimento;

public class ImpostoPoupancaStrategy implements ImpostoStrategy{
    @Override
    public double calcularImposto(Investimento investimento) {
        return 0.0;
    }
}
