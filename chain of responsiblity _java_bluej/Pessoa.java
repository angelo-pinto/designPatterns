
/**
 * 
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Pessoa implements iMotorista
{
    private String nome;
    private String responsavelPor;
    private Pessoa proximo;    
    
    Pessoa(){
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public abstract void setProximoMotorista(Pessoa pessoa);
    public abstract void darCarona(Pessoa pessoa);
}
