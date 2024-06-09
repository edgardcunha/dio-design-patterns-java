package com.investimentos.strategies;

import com.investimentos.bo.Investimento;

public interface ImpostoStrategy {
    double calcularImposto(Investimento investimento);
}
