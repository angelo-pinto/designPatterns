
/**
 * Classe principal do sistema
 *
 * @author (Angelo Rafael)
 * @version (1.0)
 */
public abstract class Calculadora
{
    private CalcularAlvo calc;    
    private int a;
    private int b;
    
    Calculadora(){
        CalcularAlvo calc = new CalcularAdapter();
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public void setB(int b){
        this.b = b;
    }
    
    public int getA(){
        return this.a;
    }
    
    public int getB(){
        return this.b;
    }
    
    public abstract void oper(String operacao);
}
