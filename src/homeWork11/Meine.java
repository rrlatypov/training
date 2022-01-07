package homeWork11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Meine {
    public static void main(String[] args) {
        Kettle kettle1 = new Kettle(1, 1000, 950, "Tefal");
        Kettle kettle2 = new Kettle(2, 1100, 955, "Tefal");
        Kettle kettle3 = new Kettle(3, 1200, 960, "Vitek");
        Kettle kettle4 = new Kettle(4, 1300, 965, "Vitek");
        Kettle kettle5 = new Kettle(5, 1400, 970, "Zabava");
        Kettle kettle6 = new Kettle(6, 1500, 975, "Zabava");

        List<Kettle> ketles = new ArrayList<>();
        ketles.add(kettle1);
        ketles.add(kettle2);
        ketles.add(kettle3);
        ketles.add(kettle4);
        ketles.add(kettle5);
        ketles.add(kettle6);

        ketles.sort(new NameSort());

        for (Kettle kettle: ketles){
            System.out.println(kettle);
        }
    }
}
