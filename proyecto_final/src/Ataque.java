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

    public Ataque(String nombre, int coste, Efecto effect) {
        this.nombre = nombre;
        this.coste = coste;
        this.effect = effect;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoste() {
        return this.coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public Efecto getEffect() {
        return this.effect;
    }

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
