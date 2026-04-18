import java.util.HashSet;

public class Ataque implements Efecto {
    private String nombre;
    private int coste;

    private Efecto effect;

    public Ataque() {
        this.nombre = "";
        this.coste = 0;
        this.effect = effect;
    }

    /**
     * Descripcion del constructor o metodo
     * @param nombre del Ataque
     * @param coste del ataque
     * @param effect conjunto de ataques
     */

    public Ataque(String nombre, int coste, Efecto effect) {
        this.nombre = nombre;
        this.coste = coste;
        this.effect = effect;
    }

    /**
     * @return el nombre del ataque
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @return el nombre del ataque cambiado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el coste del ataque
     */
    public int getCoste() {
        return this.coste;
    }

    /**
     * @return el coste del ataque cambiado
     */    
    public void setCoste(int coste) {
        this.coste = coste;
    }

     /**
     * @return el effecto del ataque
     */
    public Efecto getEffect() {
        return this.effect;
    }

    /**
     * @return el effecto del coste cambiado
     */   
    public void setEffect(Efecto effect) {
        this.effect = effect;
    }

    public void rotarEnemigos() {

    };

    public void hacerDano() {

    };

    public void subirteDano() {

    };

    // ejecutar

    public void ejecutar() {

    }
}
