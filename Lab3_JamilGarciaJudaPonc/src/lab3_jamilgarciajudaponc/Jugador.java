package lab3_jamilgarciajudaponc;

public class Jugador extends Persona {

    private int camisaNum;
    private int tirosDe3;
    private int defensa;
    private int tiroMedia;
    private int rebote;
    private int bandeja;
    private int pases;
    private int posteo;
;

    public Jugador() {
        super();
    }

    public Jugador(int camisaNum, int tirosDe3, int defensa, int tiroMedia, int rebote, int bandeja, int pases, int posteo, String nombre, String apellido, int anios, double salario) {
        super(nombre, apellido, anios, salario);
        this.camisaNum = camisaNum;
        this.tirosDe3 = tirosDe3;
        this.defensa = defensa;
        this.tiroMedia = tiroMedia;
        this.rebote = rebote;
        this.bandeja = bandeja;
        this.pases = pases;
        this.posteo = posteo;

    }

    public int getCamisaNum() {
        return camisaNum;
    }

    public int getTirosDe3() {
        return tirosDe3;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getTiroMedia() {
        return tiroMedia;
    }

    public int getRebote() {
        return rebote;
    }

    public int getBandeja() {
        return bandeja;
    }

    public int getPases() {
        return pases;
    }

    public int getPosteo() {
        return posteo;
    }

   

    public void setCamisaNum(int camisaNum) {
        this.camisaNum = camisaNum;
    }

    public void setTirosDe3(int tirosDe3) {
        this.tirosDe3 = tirosDe3;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setTiroMedia(int tiroMedia) {
        this.tiroMedia = tiroMedia;
    }

    public void setRebote(int rebote) {
        this.rebote = rebote;
    }

    public void setBandeja(int bandeja) {
        this.bandeja = bandeja;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public void setPosteo(int posteo) {
        this.posteo = posteo;
    }

  

    @Override
    public String toString() {
        return  super.toString() + "Jugador " + "camisaNum=" + camisaNum + ", tirosDe3=" + tirosDe3 + ", defensa=" + defensa + ", tiroMedia=" + tiroMedia + ", rebote=" + rebote + ", bandeja=" + bandeja + ", pases=" + pases + ", posteo=" + posteo;
    }

}
