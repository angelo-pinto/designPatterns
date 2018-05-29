
/**
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Motorista extends Pessoa
{
    private String nome;
    private String responsavelPor;    
    private Pessoa proximo;
    
    Motorista(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setResponsavelPor(String nome){
        this.responsavelPor = nome;
    }
    
    public String getResponsavelPor(){
        return this.responsavelPor;
    }    
    
    @Override
    public void setProximoMotorista(Pessoa pessoa){
        this.proximo = pessoa;
    };

    @Override
    public void darCarona(Pessoa carona){
        if (carona.getNome() == this.getResponsavelPor()){
            System.out.println("Eu me chamo: "+ this.nome +". Vou levar você: " + carona.getNome());
        } else {
            if (this.proximo != null) {
                this.proximo.darCarona(carona);
            }
        }
    };

}
