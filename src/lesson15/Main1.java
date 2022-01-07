package lesson15;

import java.io.File;
import java.io.FileFilter;

public class Main1 {
    public static void main(String[] args) {
        File startDir = new File("C:\\CCleaner");

        if (!startDir.exists()) {
            startDir.mkdir();
        }
        if (startDir.isDirectory()){
            File [] allFilesAndDir = startDir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File patname) {
                    if (patname.isDirectory()){
                        return true;
                    }
                    if (patname.getName().endsWith(".png")||patname.getName().endsWith (".jpeg")|| patname.getName().endsWith(".swg")||patname.getName().endsWith(".jpg")) {
                        return true;
                    }return false;
                }

            });
            for (File f: allFilesAndDir){
                System.out.println(f.getAbsolutePath());
            }
        }

    }
}
