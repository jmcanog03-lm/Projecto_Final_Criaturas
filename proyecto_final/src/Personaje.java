public abstract class Personaje extends Partida{
    protected String nombrePersonaje;
    protected float vida;


    public Personaje() {
        this.nombrePersonaje = "";
        this.vida = 120;
    }


    /**
     * 
     * @param nombrePersonaje
     * @param vida
     */
    public Personaje(String nombrePersonaje, float vida) {
        this.nombrePersonaje = nombrePersonaje;
        this.vida = vida;
    }


    /**
     * 
     * @return nombre del personaje
     */
    public String getNombrePersonaje() {
        return this.nombrePersonaje;
    }

    /**
     * 
     * @param nombrePersonaje
     */
    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }


    /**
     * 
     * @return la cantidad de vida del personaje
     */
    public float getVida() {
        return this.vida;
    }

    /**
     * 
     * @param vida 
     */
    public void setVida(float vida) {
        this.vida = vida;
    }

    /**
     * 
     * @param vida
     */

    public void recibirDano(float vida){

    }

    /**
     * 
     * @return un boleano para saber si el personaje esta vivo no
     */
    public boolean estaVivo(){
        boolean ayuda = true;
        return ayuda;
    }


    /**
     * @return cual es la vida  que tiene el personaje y su vida
     */
    @Override
    public String toString() {
        return "{" +
            " nombrePersonaje='" + getNombrePersonaje() + "'" +
            ", vida='" + getVida() + "'" +
            "}";
    }


}
