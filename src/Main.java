import Produkt.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produkt> list=new ArrayList<>();
        Produkt prod1= new Produkt(100,15);
        Produkt prod2=new Produkt(200,25);
        Produkt prod3=new Produkt(10,5);
        list.add(prod1);
        list.add(prod2);
        list.add(prod3);
        System.out.println(prod1.HoherAls100(list));
        System.out.println(prod1.Sortieren(list));
        System.out.println(prod1.TeuresteProd(list));
        System.out.println(prod1.GunstigsteProd(list));
        List<Produkt> list2=new ArrayList<>();;
        Produkt prod4= new Produkt(100,15);
        Produkt prod5=new Produkt(200,25);
        Produkt prod6=new Produkt(10,5);
        list2.add(prod4);
        list2.add(prod5);
        list2.add(prod6);
        System.out.println(prod1.Rabatt(list2));
    }
}