package Produkt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.stream.*;

public class Produkt {
    private double preis;
    private int tage;

    public Produkt(int preis, int tage) {
        this.preis = preis;
        this.tage = tage;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getTage() {
        return tage;
    }

    public void setTage(int tage) {
        this.tage = tage;
    }

    public List<Produkt> Rabatt(List<Produkt> produkte){
        for (Produkt p: produkte){
            if (p.tage>10){
                p.preis=p.preis-p.preis*10/100;
            }
            if(p.tage>20){
                p.preis=p.preis-p.preis*20/100;
            }
        }
        return produkte;
    }

    public List<Produkt> HoherAls100(List<Produkt> produkte){
        List<Produkt> hoherAls100Prod=new ArrayList<>();
        for (Produkt p: produkte){
            if(p.preis>100)
                hoherAls100Prod.add(p);
        }
        return hoherAls100Prod;
    }

    public List<Produkt> Sortieren(List<Produkt> produkte){
        produkte=this.Rabatt(produkte);
        produkte.sort(Comparator.comparing(Produkt::getPreis));
        return produkte;
    }

    public Produkt TeuresteProd(List<Produkt> produkte){
        produkte.sort(Comparator.comparing(Produkt::getPreis));
        return produkte.get(produkte.size()-1);
    }

    public Produkt GunstigsteProd(List<Produkt> produkte){
        produkte.sort(Comparator.comparing(Produkt::getPreis));
        return produkte.get(0);
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "preis=" + preis +
                ", tage=" + tage +
                '}';
    }
}
