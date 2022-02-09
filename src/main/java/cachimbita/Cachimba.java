package cachimbita;

import java.util.ArrayList;
import java.util.Objects;

public class Cachimba {

    private String nombreCachimba;
    private String saborCachimba;
    private int numeroCarbones;
    private int numeroCachimba;

    public Cachimba(String nombreCachimba, String saborCachimba, int numeroCarbones, int numeroCachimba) {
        this.nombreCachimba = nombreCachimba;
        this.saborCachimba = saborCachimba;
        this.numeroCarbones = numeroCarbones;
        this.numeroCachimba = numeroCachimba;
    }
        public Cachimba(){
         String[] nombre = {"Medusa", "Wookah", "Embery","Moze Breeze"};
         int[] numeroCarbones = {3,2};
         String[] saborCachimba = {"Moondream","Blue pych kizz", "Love 66", "Red Iss", "Blue Yellow", "Magic Love 2.0"};

        this.nombreCachimba = nombre [(int) (Math.random() * nombre.length)];
        this.numeroCarbones = numeroCarbones [(int) (Math.random()*2)];
        this.numeroCachimba = (int) (Math.random()*999+1);
        this.saborCachimba = saborCachimba[(int) (Math.random() * saborCachimba.length)];


        }
    public String getNombreCachimba() {
        return nombreCachimba;
    }

    public void setNombreCachimba(String nombreCachimba) {
        this.nombreCachimba = nombreCachimba;
    }

    public String getSaborCachimba() {
        return saborCachimba;
    }

    public void setSaborCachimba(String saborCachimba) {
        this.saborCachimba = saborCachimba;
    }

    public int getNumeroCarbones() {
        return numeroCarbones;
    }

    public void setNumeroCarbones(int numeroCarbones) {
        this.numeroCarbones = numeroCarbones;
    }

    public int getNumeroCachimba() {
        return numeroCachimba;
    }

    public void setNumeroCachimba(int numeroCachimba) {
        this.numeroCachimba = numeroCachimba;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cachimba)) return false;
        Cachimba cachimba = (Cachimba) o;
        return getNumeroCarbones() == cachimba.getNumeroCarbones() && getNumeroCachimba() == cachimba.getNumeroCachimba() && getNombreCachimba().equals(cachimba.getNombreCachimba()) && getSaborCachimba().equals(cachimba.getSaborCachimba());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombreCachimba(), getSaborCachimba(), getNumeroCarbones(), getNumeroCachimba());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cachimba{");
        sb.append("nombreCachimba='").append(nombreCachimba).append('\'');
        sb.append(", saborCachimba='").append(saborCachimba).append('\'');
        sb.append(", numeroCarbones=").append(numeroCarbones);
        sb.append(", numeroCachimba=").append(numeroCachimba);
        sb.append('}');
        return sb.toString();
    }
}
