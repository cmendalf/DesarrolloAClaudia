
/**
 *
 * @author Claudia M
 */
public class Ron extends Liquido implements Graduable{
    
    private Double grados; 

    public Ron(Double litros, String color) {
        super(litros, color);
        this.litros = litros; 
        this.color = "Ámbar";
    }
    

    @Override
    public Double getGrados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
