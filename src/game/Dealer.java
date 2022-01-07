package game;

public class Dealer extends Player {

    public boolean needCard (){

        if (this.countTotalValues() <18){
            return true;

        }else {
            return false;

        }
    }

}
