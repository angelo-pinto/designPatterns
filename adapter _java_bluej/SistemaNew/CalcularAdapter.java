
/**
 * Classe que faz a adaptação para a nova classe
 * 
 * @author (Angelo R. Pinto)
 * @version (1.0.0)
 */
public class CalcularAdapter extends CalcularNew implements CalcularAlvo
{
    @Override
    public int somar(int a, int b)
    {
        int[] elementos = new int[]{a, b};
        return super.somar(elementos);
    }
    
    @Override
    public int subtrair(int a, int b)
    {
        int[] elementos = new int[]{a, b};
        return super.subtrair(elementos);
    }    
}
