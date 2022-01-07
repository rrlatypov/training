package homeWork;

public class lesson1 {
    public static void main(String[] args) {
        int pizzaStoit = 230;
        int zhvachkaStoit = 26;
        double konfetaStoit = 2.5;
        int rubli = 1000;
        int skolkoPokupaemPizz = rubli / pizzaStoit;
        int sdachaSPizz = rubli - (skolkoPokupaemPizz * pizzaStoit);
        int skolkoPokupaemZhvachki = sdachaSPizz / zhvachkaStoit;
        int sdachaSZhvachek = sdachaSPizz - (zhvachkaStoit * skolkoPokupaemZhvachki);
        int skolkoPokupaemKonfet = (int) (sdachaSZhvachek / konfetaStoit);
        double sdachaSKonfet = sdachaSZhvachek - (skolkoPokupaemKonfet * konfetaStoit);
        System.out.println("На эти деньги мы можем купить");
        System.out.println(skolkoPokupaemPizz + "-пицц");
        System.out.println(skolkoPokupaemZhvachki + "-жвачек");
        System.out.println(skolkoPokupaemKonfet + "-конфет");
        System.out.println(sdachaSKonfet + "-сдача");


    }
}
