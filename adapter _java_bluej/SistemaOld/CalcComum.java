
/**
 * Write a description of class CalcCientifica here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcComum extends Calculadora
{
    @Override
    public void oper(String operacao)
    {
        Calcular calc = new Calcular();        
        switch (operacao){
            case "+":
                System.out.println("Somar: "    + getA() + " + " + getB() + " = " + calc.somar(2, 3));
                break;            
            case "-":
                System.out.println("Subtrair: " + getA() + " - " + getB() + " = " + calc.subtrair(2, 3));
                break;
        }
    }
}
