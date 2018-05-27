
/**
 * Escreva a descrição da classe Observer aqui.
 * 
 * @author (Angelo R. Pinto)
 * @version (2018-05-14)
 */
public class Cliente extends AbstractCliente
{
    private String nome;
    
    public Cliente (String nome){
        this.nome = nome;
    }
        
    public void observar(AbstractProduto produto) {
        this.produto = produto;
        this.produto.adicionar(this);
    }

    public void atualizar() {
        System.out.println("Cliente: " + this.nome + " | Produto: " + this.produto.getNome() + " | Preço atual: " + produto.getValor());
    }    
}
