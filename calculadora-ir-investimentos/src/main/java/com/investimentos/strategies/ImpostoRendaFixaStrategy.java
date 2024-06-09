package com.investimentos.strategies;

import com.investimentos.bo.Investimento;

public class ImpostoRendaFixaStrategy implements ImpostoStrategy {
    @Override
    public double calcularImposto(Investimento investimento) {
        double rendimento = investimento.getRendimento();
        if (investimento.getTempoInvestidoEmMeses() < 6) {
            return rendimento * 0.225; // 22.5%
        } else if (investimento.getTempoInvestidoEmMeses() < 12) {
            return rendimento * 0.20; // 20%
        } else {
            return rendimento * 0.175; // 17.5%
        }
    }
}
