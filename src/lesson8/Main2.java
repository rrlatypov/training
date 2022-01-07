package lesson8;

public class Main2 {
    public static void main(String[] args) {
        Tigr tigr1 = new Tigr();
        Tigr tigr2 = new Tigr();
        Tigr tigr3 = new Tigr();

        Slon slon1 = new Slon();
        Slon slon2 = new Slon();
        Slon slon3 = new Slon();

        Animal [] zoo = new Animal [6];
        zoo [0] = tigr1;
        zoo [1] = tigr2;
        zoo [2] = tigr3;
        zoo [3] = slon1;
        zoo [4] = slon2;
        zoo [5] = slon3;

//        полиморфизм
        for (Animal enimal:zoo){
            enimal.voice();
        }
    }
}

