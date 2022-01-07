package lesson7;

public class Bludo {
    //    1- переменные (поля класса) - св-ва объекта (состояние объекта)
//    2- особые методы, которые вызываются в момент создание объекта
//    3- методы, функционал который будет у этого типа данных
   private int price;
    private int kallorii;
    private String[] ingridients = new String[100];
    private int weight;


    public void setKallorii (int kallorii){
        this.kallorii = kallorii;

    }
    public  int getKallorii(){
        return  this.kallorii;

    }
    public void setPrice (int price){
        this.price = price;

    }
    public int getPrice (){
        return this.price;

    }
    public void setWeight (int weight){
        this.weight = weight;

    }
    public int getWeight (){
        return this.weight;

    }



     {
    }

    public void addInridient(String ingridient) {
    }
}
