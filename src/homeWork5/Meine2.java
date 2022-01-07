package homeWork5;

public class Meine2 {
    public static void main(String[] args) {
        String password = "1Aqwert";
        String numbers = "0123456789";
        String simvoly = "!@#$%^&*";
        String bolshieBukvy = "QWERTYUIOPASDFGHJKLZXCVBNM";
        boolean poiskNumbers = false;
        boolean poiskSimvol = false;
        boolean poiskBolBukvy = false;

        for (int i = 0; i < password.length(); i++) {
            char currentCharFromPassword = password.charAt(i);
            if (numbers.contains(currentCharFromPassword + "")) {
                poiskNumbers = true;
            }
        }
        if (poiskNumbers) {
//            System.out.println("есть число в пароле");
        } else {
            System.out.println("в пароле нет числа");
        }


        for (int i = 0; i < password.length(); i++) {
            char currentCharFromPassword = password.charAt(i);
            if (simvoly.contains(currentCharFromPassword + "")) {
                poiskSimvol = true;
            }
        }
        if (poiskSimvol) {
//            System.out.println("есть символ в пароле");
        } else {
            System.out.println("в пароле нет символа");
        }

        for (int i = 0; i < password.length(); i++) {
            char currentCharFromPassword = password.charAt(i);
            if (bolshieBukvy.contains(currentCharFromPassword + "")) {
                poiskBolBukvy = true;
            }
        }
        if (poiskBolBukvy) {
//            System.out.println("есть заглавная буква в пароле");
        } else {
            System.out.println("в пароле нет заглавной буквы");

        }
        if (poiskBolBukvy && poiskNumbers && poiskSimvol) {
            System.out.println("пароль нам подходит");


        }else {
            System.out.println("пароль не подходит");
        }
    }
}





