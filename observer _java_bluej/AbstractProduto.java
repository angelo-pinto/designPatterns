
/**
 * Classe abstrata AbstractSubject - escreva a descrição da classe aqui
 * 
 * @author (Angelo R. Pinto)
 * @version (2018-05-14)
 */

public abstract class AbstractProduto
{
    private String nome;
    private int valor;
    
    public void setNome(String nome){
        this.nome = nome;
    }    
    
    public String getNome(){
        return this.nome;
    }
    
    public void setValor(int valor){
        this.valor = valor;
        this.notificar();
    }
    
    public int getValor(){
        return this.valor;
    }
    
    abstract void adicionar(AbstractCliente cliente);
    abstract void remover(AbstractCliente cliente);
    abstract void notificar();
}
