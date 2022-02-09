package cachimbita;

import java.util.ArrayList;
import java.util.Locale;

public class Cachimbas {
    private ArrayList<Cachimba> cachimbas = new ArrayList<>(10);

    public Cachimbas() {
        while (cachimbas.size() < 10) {
            Cachimba cachimba = new Cachimba();
            cachimbas.add(cachimba);

        }

    }

    public int getCachimba(String nombre) {

        for (int i = 0; i < cachimbas.size(); i++) {
            if (cachimbas.get(i).getNombreCachimba().equals(nombre)) return i;
        }
        return -1;
    }


    public void setCachimbas(Cachimba cachimba, int numero) {
        this.cachimbas.set(numero, cachimba);
    }

    public int getNumCachimbas() {

        return cachimbas.size();
    }

    public void setEliminar(int numero) {
        cachimbas.remove(numero);
    }

    public String getListaCachimba(int numero) {
        if (numero > cachimbas.size())return "No se ha encontrado";
        return cachimbas.get(numero).toString();
    }

}
