import com.investimentos.CalculadoraImposto;
import com.investimentos.bo.Investimento;
import com.investimentos.strategies.ImpostoFundoInvestimentoStrategy;
import com.investimentos.strategies.ImpostoPoupancaStrategy;
import com.investimentos.strategies.ImpostoRendaFixaStrategy;

public class App {
    public static void main(String[] args) throws Exception {
        Investimento poupanca = new Investimento(10000, 800, 12);
        Investimento rendaFixa = new Investimento(5000, 300, 6);
        Investimento fundoInvestimento = new Investimento(8000, 500, 24);

        CalculadoraImposto calculadora = new CalculadoraImposto(new ImpostoPoupancaStrategy());
        System.out.println("IR Poupança: " + calculadora.calcular(poupanca));

        calculadora.setStrategy(new ImpostoRendaFixaStrategy());
        System.out.println("IR Renda Fixa: " + calculadora.calcular(rendaFixa));

        calculadora.setStrategy(new ImpostoFundoInvestimentoStrategy());
        System.out.println("IR Fundo Investimento: " + calculadora.calcular(fundoInvestimento));
    }
}
