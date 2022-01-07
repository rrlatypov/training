package lesson4;

public class Main1 {
    public static void main(String[] args) {
        String password = "qwerthhhhh";
        int dlinaPassword = password.length();
        if (dlinaPassword < 8) {
            System.out.println("пароль не подходит");
            return;
        }


        String numbers = "0123456789";
        for (int i = 0; i < dlinaPassword; i++) {
            char currentChar = password.charAt(i);
          if (  numbers.contains(currentChar+"")){
              System.out.println("пароль содержит число. он нам подходит");
              return;
        }
    }
        System.out.println("в пароле цифры нет");
}
}
