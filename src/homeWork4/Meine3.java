package homeWork4;

public class Meine3 {
    public static void main(String[] args) {
        String text = "i am learning java";
        char []simvolIzTexta = text.toCharArray();
        String alfavit = "abcdefghijklmnopqrstuvwxyz";
        char [] simvolIzAlfavita = alfavit.toCharArray();
        for (int i=0; i< simvolIzTexta.length; i++){
            for (int j=0; j< simvolIzAlfavita.length - 1; i++){
                if (simvolIzTexta [i] == simvolIzAlfavita [j]){
                    simvolIzTexta[i] = simvolIzAlfavita [j+1];


                }
            }
        }System.out.println(simvolIzTexta);

    }
}
