package lesson16;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class FindDirUtilsImpl {
    public static File [] printAllByWord (String pathToDir, String word) {
        ArrayList<File> result = new ArrayList<>();
        addFilesToResultList(pathToDir, word, result);

        File [] array = new File [result.size()];
        for (int i=0 ; i<array.length; i++){
            array[i] = result.get(i);
        }
                return array;
    }
    private static void addFilesToResultList (String pathToDir, String word, List<File> result){
        File startDir = new File (pathToDir);

        File [] allFilesAndDirWithWord = startDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().toLowerCase().contains(word.toLowerCase())){
                    return true;
                }
                return false;
            }
        });
        for (File f: allFilesAndDirWithWord) {
            result.add(f);
        }
        File [] allDir = startDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }
                return false;
            }
        });
        for (File f:allDir){
            addFilesToResultList(f.getPath(), word, result);

        }

    }
}
