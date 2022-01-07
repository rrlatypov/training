package lesson14;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(-10);
            System.out.println(" возраст успешно установлен");
        } catch (IllegalArgumentException e) {
            System.out.println(" повтори ввод, неверно указан возраст");
        }
        System.out.println(" повторите ввод");
    }
}
