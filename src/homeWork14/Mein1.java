package homeWork14;



public class Mein1   {
    public static void main(String[] args) {
        StringUtilsImplHome stringUtilsImplHome = new StringUtilsImplHome();


        try {
            stringUtilsImplHome.findWord("rrrr pppp ssss hhhh llll pppp","pppp" );
        } catch (NullPointerException e){
            e.printStackTrace();
        }

    }
}
