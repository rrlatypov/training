package lesson6;

public class StringUtil {
//   1. модификатор доступа :
//    public (95% случаев. виден всем в проекте),
//    protected (только в этом классе и его наследникам),
//    _______(пусто)(внутри текущей папки),
//     private (5%) (внутри данного класса).
//    2.static (есть или нет).
//    3.возвращаемый тип из метода (если он есть), если нет, то void
//    4.название метода с маленькой буквы
//    5.входящие параметры в круглых скобках
//    6.тело метода

    public static boolean containsDigital(String text) {

        boolean containNumber = false;
        String numbers = "0123456789";
        for (int i = 0; i < text.length(); i++) {
            char currentFromPassword = text.charAt(i);
            if (numbers.contains(currentFromPassword + "")) {
                containNumber = true;

            }
        }
        if (containNumber) {
            return true;

        } else {
            return false;
        }
    }

    public static int countCharFromText(String text, char simbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == simbol) {
                count++;
            }
        }
        return count;
    }

    public static boolean isStartFromUperCase (String text){

        return Character.isUpperCase(text.charAt(0));
    }


    public static void printReverseByWords (String text){
        String [] words = text.split (" ");
        for (int i = words.length - 1; i>=0; i--){
            System.out.println(words[i]);
        }
    }
}



