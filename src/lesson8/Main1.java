package lesson8;

public class Main1 {
    public static void main(String[] args) {
        People people = new People();
        Student student = new Student();

        people.setName("vasja");
        student.setName("Student petja");
        System.out.println(people.getName());
        System.out.println(student.getName());

        People people1 = new People();
        people1.setName("vasja");

        System.out.println(people.equals(people1));

    }

}
