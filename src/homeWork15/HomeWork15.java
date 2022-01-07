package homeWork15;

import java.io.File;
import java.io.FileFilter;

public class HomeWork15 {

        public static void printAllImages (String pathToDir) {
             File startDir = new File(pathToDir);
            if (startDir.isDirectory()) {
                File[] allFilesAndDir = startDir.listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File patname) {
                        if (patname.isDirectory()) {
                            return true;
                        }
                        if (patname.getName().endsWith(".png") || patname.getName().endsWith(".jpeg") || patname.getName().endsWith(".swg") || patname.getName().endsWith(".jpg")) {
                            return true;
                        }
                        return false;
                    }

                });
                if (allFilesAndDir != null && allFilesAndDir.length>0){
                    for (File f:allFilesAndDir ) {
                        if (f.isDirectory()){
                            printAllImages(f.getPath());
                        } else {
                            System.out.println(f.getName());
                        }
                    }
                }
            }

        }


}
