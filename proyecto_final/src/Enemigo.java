public class Enemigo extends Personaje{
    private int poderAtaque;
    private int velocidad;


    /**
     * 
     * @param poderAtaque
     * @param velocidad
     */
    public Enemigo(int poderAtaque, int velocidad) {
        this.poderAtaque = poderAtaque;
        this.velocidad = velocidad;
    }

    /**
     * 
     * @return el poder de ataque del enemigo
     */
    public int getPoderAtaque() {
        return this.poderAtaque;
    }

    /**
     * 
     * @param poderAtaque cambiado
     */
    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    /**
     * 
     * @return el valor del atrubuto velocidad
     */
    public int getVelocidad() {
        return this.velocidad;
    }

    /**
     * 
     * @param el valor de velocidad cambiado
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }







    public void atacar(){

    }



    /**
     * @return retorna los valores del enemigo
     */
    @Override
    public String toString() {
        return "{" +
            " poderAtaque='" + getPoderAtaque() + "'" +
            ", velocidad='" + getVelocidad() + "'" +
            "}";
    }



}
