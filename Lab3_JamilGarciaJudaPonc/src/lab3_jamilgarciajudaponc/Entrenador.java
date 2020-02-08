
package lab3_jamilgarciajudaponc;


public class Entrenador extends Persona{
    
    private String Jugo; //Si fue jugador?
    private String jugadaFav; // Jugada FAv

    public Entrenador() {
        super();
    }

    public Entrenador(String Jugo, String jugadaFav, String nombre, String apellido, int anios, int salario) {
        super(nombre, apellido, anios, salario);
        this.Jugo = Jugo;
        this.jugadaFav = jugadaFav;
    }

   

    public String getJugo() {
        return Jugo;
    }

    public void setJugo(String Jugo) {
        this.Jugo = Jugo;
    }

    public String getJugada() {
        return jugadaFav;
    }

    public void setJugada(String jugada) {
        this.jugadaFav = jugada;
    }

    @Override
    public String toString() {
        return  super.toString() + "Entrenador{" + "Jugo=" + Jugo + ", jugada=" + jugadaFav + '}';
    }
    
    
    
}
