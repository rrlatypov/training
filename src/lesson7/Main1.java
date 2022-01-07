package lesson7;

import javax.xml.crypto.Data;
import java.util.Date;

public class Main1 {
    public static void main(String[] args) {
        int a = 9;
//        1- тип переменной
//        2- название переменной
//        3- = new - момент создания нового объекта
//        4- вызов особого метода, который возвращает новый объект
        Date data = new Date ();

        Bludo olivie = new Bludo();
        Bludo vivgret = new Bludo();

//        olivie.kallorii = 300;
        olivie.setKallorii(300);
//        vivgret.kallorii = 150;
        vivgret.setKallorii(150);

        System.out.println(olivie.getKallorii());
        System.out.println(vivgret.getKallorii());

        olivie.setPrice(1000);
        vivgret.setPrice(1500);
        System.out.println(olivie.getPrice());
        System.out.println(vivgret.getPrice());

        olivie.addInridient ("картошка");
        olivie.addInridient ("яйцо");
        olivie.addInridient ("лук");
        olivie.addInridient ("мясо");




    }
    int a = 9;

}
