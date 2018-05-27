
/**
 * Escreva a descrição da classe Subject aqui.
 * 
 * @author (Angelo R. Pinto)
 * @version (2018-05-14)
 */
import java.util.*;
public class Produto extends AbstractProduto 
{
    private ArrayList lista = new ArrayList<Cliente>();
   
    public Produto(String nome, int valor){
        ArrayList lista = new ArrayList<>();
        this.setNome(nome);
        this.setValor(valor);
    }
            
    public void adicionar(AbstractCliente cliente){
        lista.add(cliente);
    };
    
    public void remover(AbstractCliente cliente){
        lista.remove(cliente);
    };
    
    public void notificar(){
        for(int i = 0; i < this.lista.size(); i++) {
            Cliente cliente = (Cliente) lista.get(i);
            cliente.atualizar();
        }
    };
}