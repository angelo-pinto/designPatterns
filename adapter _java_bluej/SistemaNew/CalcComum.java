
/**
 * Classe da Calculadora Comum
 *
 * @author (Angelo R. Pinto)
 * @version (1.0.0)
 */
public class CalcComum extends Calculadora
{
    @Override
    public void oper(String operacao)
    {
        CalcularAlvo calc = new CalcularAdapter();
        switch (operacao){
            case "+":
                System.out.println("Somar: "    + getA() + " + " + getB() + " = " + calc.somar(getA(), getB()));
                break;            
            case "-":
                System.out.println("Subtrair: " + getA() + " - " + getB() + " = " + calc.subtrair(getA(), getB()));
                break;
        }
    }
}
