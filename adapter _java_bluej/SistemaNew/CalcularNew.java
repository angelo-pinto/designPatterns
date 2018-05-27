
/**
 * Nova classe de implementação do elementos
 *
 * @author (Angelo R. Pinto)
 * @version (1.0.0)
 */
public class CalcularNew
{
    private int resultado;
    /** 
     * Construtor da Classe
     */
    public CalcularNew() {
    }
     
    /**
     * Método que percorre o array somando os elementos FOR EACH
     * @param   int[] elementos - array de inteiros com os elementos que devem ser somados
     * @return  retorna um inteiro com a soma dos elementos
     */ 
    public int somar(int[] elementos)
    {
        this.resultado = 0;
        for (int el: elementos) {
            this.resultado += el;
        }
        return this.resultado;
    }

    /**
     * Método que percorre o array subtraindo os elementos do array
     * @param   int[] elementos - array de inteiros com os elementos que devem ser subtraidos
     * @return  retorna um inteiro com a subtração dos elementos
     */ 
    public int subtrair(int[] elementos)
    {
        this.resultado = elementos[0];
        for (int i = 1; i < elementos.length; i++) {
            this.resultado -= elementos[i];
        }
        return this.resultado;

    }

}
