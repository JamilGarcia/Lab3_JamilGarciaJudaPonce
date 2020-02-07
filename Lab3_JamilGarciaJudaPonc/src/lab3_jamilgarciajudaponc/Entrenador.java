
package lab3_jamilgarciajudaponc;


public class Entrenador {
    
    private String Jugo; //Si fue jugador?
    private Jugadas jugadaFav; // Jugada FAv

    public Entrenador() {
        super();
    }

    public Entrenador(String Jugo, Jugadas jugada) {
        this.Jugo = Jugo;
        this.jugadaFav = jugada;
    }

    public String getJugo() {
        return Jugo;
    }

    public void setJugo(String Jugo) {
        this.Jugo = Jugo;
    }

    public Jugadas getJugada() {
        return jugadaFav;
    }

    public void setJugada(Jugadas jugada) {
        this.jugadaFav = jugada;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "Jugo=" + Jugo + ", jugada=" + jugadaFav + '}';
    }
    
    
    
}
