
/**
 *
 * @author Claudia M
 */
public class Cola extends Liquido{
    private boolean cafeina;

    public Cola(Double litros, String color) {
        super(litros, color);
    }

    public boolean isCafeina() {
        return cafeina;
    }

    public void setCafeina(boolean cafeina) {
        this.cafeina = cafeina;
    }
    
    
    public Liquido mezclar(Liquido){
            throws new NoSePuedeMezclarException();
        }
   
}
    
 

