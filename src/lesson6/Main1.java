package lesson6;

public class Main1 {
    public static void main(String[] args) {
        String password = " qwerty123";
        boolean containNumber = false;
        String numbers = "0123456789";
        for (int i = 0; i < password.length(); i++) {
            char currentFromPassword = password.charAt(i);
            if (numbers.contains(currentFromPassword + "")) {
                containNumber = true;

            }
        }
        if (containNumber) {
            System.out.println("есть число в пароле");

        } else {
            System.out.println("в пароле нет числа");
        }

    }
}
