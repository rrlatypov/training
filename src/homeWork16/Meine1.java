package homeWork16;

public class Meine1 {
    public static void main(String[] args) {
        FileCopyImplChannel copy1 = new FileCopyImplChannel();
        FileCopyImplStream copy2 = new FileCopyImplStream();
        FileCopyImplFiles copy3 = new FileCopyImplFiles();
        FileCopyImplApache copy4 = new FileCopyImplApache();

        try {
            long start = System.nanoTime();
            copy1.copy("C:\\student\\лето.docx" , "C:\\student_new\\лето1.docx");
            System.out.println("Время копирования файла с помощью java.nio.FileChannel = "+(System.nanoTime()-start));

             start = System.nanoTime();
            copy2.copy("C:\\student\\зима.docx", "C:\\student_new\\зима1.docx" );
            System.out.println("Время копирования файла с помощью потоков = "+(System.nanoTime()-start));

            start = System.nanoTime();
            copy3.copy("C:\\student\\весна.docx", "C:\\student_new\\весна1.docx" );
            System.out.println("Время копирования файла с помощью класса Files Java 7 = "+(System.nanoTime()-start));


            start = System.nanoTime();
            copy4.copy("C:\\student\\осень.docx", "C:\\student_new\\осень1.docx" );
            System.out.println("Время копирования файла с помощью Apache Commons IO Copy = "+(System.nanoTime()-start));
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

}
