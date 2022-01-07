package lesson6;

public class Main2 {
    public static void main(String[] args) {
       boolean contNum1 = StringUtil.containsDigital("djksf");
        System.out.println(contNum1);
        boolean contNum2 = StringUtil.containsDigital("sfgbs2");
        System.out.println(contNum2);
        boolean contNum3 = StringUtil.containsDigital("561856");
        System.out.println(contNum3);

        int count = StringUtil.countCharFromText("hello my friend", 'e');
        System.out.println(count);

        boolean bolBukva = StringUtil.isStartFromUperCase("AdlfgjbAlfkj");
        System.out.println(bolBukva);

        StringUtil.printReverseByWords("i am happy");

    }

    }
