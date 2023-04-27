

/**
 *
 * @author Claudia M
 */
public class Agua extends Liquido{
    private Double pureza;
    
    
    public Agua(Double litros){
        super(litros, color); 
        this.litros = litros; 
        this.color = "incoloro";
        pureza = 1.00; 
    }

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        this.pureza = pureza;
    }
    
    
    
}
