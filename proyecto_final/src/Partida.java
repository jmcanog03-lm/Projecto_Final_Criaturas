import java.util.ArrayList;
import java.util.List;

public class Partida {
    public Personaje personajeElegido;
    private List<Enemigo> enemigos;
    private Enemigo enemigoActual;


    public Partida(){
        this.personajeElegido = personajeElegido;
        this.enemigos = new ArrayList<>();
        this.enemigoActual = enemigoActual;
    }

    /**
     * 
     * @param personajeElegido
     * @param enemigoActual
     */
    public Partida(Personaje personajeElegido, Enemigo enemigoActual) {
        this.personajeElegido = personajeElegido;
        this.enemigos = new ArrayList<>();
        this.enemigoActual = enemigoActual;
    }


    /**
     * 
     * @return personaje elegido
     */
    public Personaje getPersonajeElegido() {
        return this.personajeElegido;
    }

    /**
     * 
     * @param personajeElegido
     */
    public void setPersonajeElegido(Personaje personajeElegido) {
        this.personajeElegido = personajeElegido;
    }

    /**
     * 
     * @return lista de enemigos
     */
    public List<Enemigo> getEnemigos() {
        return this.enemigos;
    }

    /**
     * 
     * @param enemigos
     */
    public void setEnemigos(List<Enemigo> enemigos) {
        this.enemigos = enemigos;
    }

    /**
     * 
     * @return el enemigo actual
     */
    public Enemigo getEnemigoActual() {
        return this.enemigoActual;
    }

    /**
     * 
     * @param enemigoActual
     */
    public void setEnemigoActual(Enemigo enemigoActual) {
        this.enemigoActual = enemigoActual;
    }

    

    /**
     * @return personaje eleigo su lista de enemigos y cual es el enemigo actual
     */
    @Override
    public String toString() {
        return "{" +
            " personajeElegido='" + getPersonajeElegido() + "'" +
            ", enemigos='" + getEnemigos() + "'" +
            ", enemigoActual='" + getEnemigoActual() + "'" +
            "}";
    }

}
