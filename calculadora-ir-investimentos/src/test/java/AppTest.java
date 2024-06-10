import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.investimentos.CalculadoraImposto;
import com.investimentos.bo.Investimento;
import com.investimentos.strategies.ImpostoFundoInvestimentoStrategy;
import com.investimentos.strategies.ImpostoPoupancaStrategy;
import com.investimentos.strategies.ImpostoRendaFixaStrategy;

public class AppTest {
    @Test
    public void calcular_ImpostoPoupanca_DeveRetornarZero() {
        CalculadoraImposto calculadora = new CalculadoraImposto(new ImpostoPoupancaStrategy());
        Investimento poupanca = new Investimento(10000, 800, 12);
        double imposto = calculadora.calcular(poupanca);
        assertEquals(0.0, imposto, 0.0);
    }

    @Test
    public void calcular_ImpostoRendaFixa_MenosDeSeisMeses_DeveAplicarTaxa22eMeioPorcento() {
        CalculadoraImposto calculadora = new CalculadoraImposto(new ImpostoRendaFixaStrategy());
        Investimento rendaFixa = new Investimento(5000, 300, 3);
        double imposto = calculadora.calcular(rendaFixa);
        assertEquals(67.5, imposto, 67.5);
    }

    @Test
    public void calcular_ImpostoRendaFixa_EntreSeisEDozeMeses_DeveAplicarTaxa20Porcento() {
        CalculadoraImposto calculadora = new CalculadoraImposto(new ImpostoRendaFixaStrategy());
        Investimento rendaFixa = new Investimento(5000, 300, 9);
        double imposto = calculadora.calcular(rendaFixa);
        assertEquals(60, imposto, 60.0);
    }

    @Test
    public void calcular_ImpostoRendaFixa_MaisDeDozeMeses_DeveAplicarTaxa17eMeioPorcento() {
        CalculadoraImposto calculadora = new CalculadoraImposto(new ImpostoRendaFixaStrategy());
        Investimento rendaFixa = new Investimento(5000, 300, 18);
        double imposto = calculadora.calcular(rendaFixa);
        assertEquals(52.5, imposto, 52.5);
    }

    @Test
    public void calcular_ImpostoFundoInvestimento_DeveAplicarTaxa15Porcento() {
        CalculadoraImposto calculadora = new CalculadoraImposto(new ImpostoFundoInvestimentoStrategy());
        Investimento fundo = new Investimento(8000, 500, 24);
        double imposto = calculadora.calcular(fundo);
        assertEquals(75.0, imposto, 75.0);
    }
}
