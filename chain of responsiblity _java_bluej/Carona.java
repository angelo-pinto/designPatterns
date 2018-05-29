
/**
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Carona extends Pessoa
{
    private String nome;
    
    Carona(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }    

    @Override
    public void setProximoMotorista(Pessoa pessoa){};
    @Override    
    public void darCarona(Pessoa pessoa){};    
    
}
