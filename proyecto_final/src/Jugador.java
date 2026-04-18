import java.util.ArrayList;
import java.util.List;

public class Jugador extends Personaje {
    private int perlasBailys;
    private List<Ataque> ataques;

    private int danoMultiplicador;

    private int segundosVisibles;



    public Jugador(){
        this.perlasBailys = 0;
        this.ataques = new ArrayList<>();
        this.danoMultiplicador = 0;
        this.segundosVisibles = 0;
    }

    /**
     * 
     * @param perlasBailys
     * @param ataques
     * @param danoMultiplicador
     * @param segundosVisibles
     */
    public Jugador(int perlasBailys, int danoMultiplicador, int segundosVisibles) {
        this.perlasBailys = perlasBailys;
        this.ataques = new ArrayList<>();
        this.danoMultiplicador = danoMultiplicador;
        this.segundosVisibles = segundosVisibles;
    }

    /**
     * 
     * @param recibe perla 
     */
    public void obtenerPerla(int perla) {

    }

    /**
     * 
     * @param recibe perla
     */
    public void gastarPerlas(int perla) {

    }

    /**
     * 
     * @param recibe numero
     * @return un boleano para ver si puede comprar o no
     */
    public boolean puedeComprar(int numero) {
        return true;
    }



    /**
     * 
     * @return las perlas
     */
    public int getPerlasBailys() {
        return this.perlasBailys;
    }

    /**
     * 
     * @param cambia perlasBailys
     */
    public void setPerlasBailys(int perlasBailys) {
        this.perlasBailys = perlasBailys;
    }

    /**
     * 
     * @return la lista de ataques
     */
    public List<Ataque> getAtaques() {
        return this.ataques;
    }

    /**
     * 
     * @return la lista de ataques cambiada
     */
    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
    }

    /**
     * 
     * @return el valor del dano multiplicado
     */
    public int getDanoMultiplicador() {
        return this.danoMultiplicador;
    }

     /**
     * 
     * @return el valor del dano multiplicado cambiado
     */
    public void setDanoMultiplicador(int danoMultiplicador) {
        this.danoMultiplicador = danoMultiplicador;
    }

    /**
     * 
     * @return los segundos visibles durante el juego
     */
    public int getSegundosVisibles() {
        return this.segundosVisibles;
    }

     /**
     * 
     * @return los segundos del juego modificados
     */
    public void setSegundosVisibles(int segundosVisibles) {
        this.segundosVisibles = segundosVisibles;
    }



    /**
     * @return datos del jugador
     */
    @Override
    public String toString() {
        return "{" +
            " perlasBailys='" + getPerlasBailys() + "'" +
            ", ataques='" + getAtaques() + "'" +
            ", danoMultiplicador='" + getDanoMultiplicador() + "'" +
            ", segundosVisibles='" + getSegundosVisibles() + "'" +
            "}";
    }

}
