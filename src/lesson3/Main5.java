package lesson3;

public class Main5 {
    public static void main(String[] args) {
        int []massive1 = {1,2,3,4};
        int [] massive2 = {5,6,7,8};
        int [] summaMassivov = new int[massive1.length+massive2.length];

//        summaMassivov[0] = massive1[0];
//        summaMassivov[1] = massive1[1];
//        summaMassivov[2] = massive1[2];
//        summaMassivov[3] = massive1[3];
//
//        summaMassivov[4] = massive2[0];
//        summaMassivov[5] = massive2[1];
//        summaMassivov[6] = massive2[2];
//        summaMassivov[7] = massive2[3];


        for (int i =0; i< summaMassivov.length; i++) {
            if (i<massive1.length){
                summaMassivov[i] = massive1[i];
            }else {
                summaMassivov[i] = massive2 [i- massive2.length];
            }
            System.out.println(summaMassivov[i]);
        }
    }
}
