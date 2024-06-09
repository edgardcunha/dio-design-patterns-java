package com.investimentos.bo;

public class Investimento {
    private double valorInvestido;
    private double rendimento;
    private int tempoInvestidoEmMeses;

    public Investimento(double valorInvestido, double rendimento, int tempoInvestidoEmMeses) {
        this.valorInvestido = valorInvestido;
        this.rendimento = rendimento;
        this.tempoInvestidoEmMeses = tempoInvestidoEmMeses;
    }

    // Getters
    public double getValorInvestido() {
        return valorInvestido;
    }

    public double getRendimento() {
        return rendimento;
    }

    public int getTempoInvestidoEmMeses() {
        return tempoInvestidoEmMeses;
    }

    @Override
    public String toString() {
        return "Investimento{" +
                "\n valorInvestido = " + this.valorInvestido +
                ",\n rendimento = " + this.rendimento +
                ",\n tempoInvestidoEmMeses = " + this.tempoInvestidoEmMeses +
                "\n}";
    }
}
