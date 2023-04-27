
/**
 *
 * @author Claudia M
 */
public abstract class Liquido {
    protected Double litros; 
    protected String color; 
    
    public Liquido(Double litros, String color){
        this.litros = litros; 
        this.color = color; 
    }
    
     
    
    public void Liquido (Double cantidad, String nombre){
                
    }
    
    
    public void incrementar(Double cantidad){
        
    }

    public Liquido mezclar(Liquido){      
        return Liquido; 
    }
    
    
    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
