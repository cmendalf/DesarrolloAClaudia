
/**
 *
 * @author Claudia M
 */
public class Copa extends Liquido implements Graduable {

    private Graduable alcohol;
    private Liquido mezcla;

    public Copa(Graduable alcohol, Liquido mezcla) {
        super();
        this.alcohol = alcohol;
        this.mezcla = mezcla;

    }

    @Override
    public Double getGrados() {
        Double litrosAlcohol = this.litros;
        Double litrosTotales = alcohol.litros + mezcla.litros;
        //castear graduable.litros para acceder al double 
        
        Double grados = ((litrosAlcohol / litrosTotales) * alcohol.getGrados());

        return grados;

    }

    public Liquido mezclar(Liquido) {
        throws new NoSePuedeMezclarException("No es posible realizar la mezcla");

    }

}
