
package lab3_jamilgarciajudaponc;

import java.util.ArrayList;

public class Equipo {
    
    private String nombre;
    private int aniofun;
    private int Ncampeonatos;
    private ArrayList <Persona> lisper = new ArrayList();
    private ArrayList <Jugadas> juga = new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, int aniofun, int Ncampeonatos) {
        this.nombre = nombre;
        this.aniofun = aniofun;
        this.Ncampeonatos = Ncampeonatos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAniofun() {
        return aniofun;
    }

    public void setAniofun(int aniofun) {
        this.aniofun = aniofun;
    }

    public int getNcampeonatos() {
        return Ncampeonatos;
    }

    public void setNcampeonatos(int Ncampeonatos) {
        this.Ncampeonatos = Ncampeonatos;
    }

    public ArrayList<Persona> getLisper() {
        return lisper;
    }

    public void setLisper(ArrayList<Persona> lisper) {
        this.lisper = lisper;
    }

    public ArrayList<Jugadas> getJuga() {
        return juga;
    }

    public void setJuga(ArrayList<Jugadas> juga) {
        this.juga = juga;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", aniofun=" + aniofun + ", Ncampeonatos=" + Ncampeonatos + ", lisper=" + lisper + ", juga=" + juga + '}';
    }
    
    
    
    
    
    
    
    
}
