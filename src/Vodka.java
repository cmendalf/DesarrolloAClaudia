

/**
 *
 * @author Claudia M
 */
public class Vodka extends Liquido implements Graduable{
    private Double grados; 

    public Vodka(Double litros, String color) {
        super(litros, color);
        this.litros = litros; 
        this.color = "Incoloro";
    }
    
 

    @Override
    public Double getGrados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

/*
   public Liquido mezclar(Liquido){
        if (Liquido.Equals(Ron || Vodka ))
    }
*/
