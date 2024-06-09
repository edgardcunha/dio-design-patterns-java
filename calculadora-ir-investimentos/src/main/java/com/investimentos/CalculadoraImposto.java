package com.investimentos;

import com.investimentos.bo.Investimento;
import com.investimentos.strategies.ImpostoStrategy;

public class CalculadoraImposto {
    private ImpostoStrategy strategy;

    public CalculadoraImposto(ImpostoStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ImpostoStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcular(Investimento investimento) {
        return strategy.calcularImposto(investimento);
    }
}
