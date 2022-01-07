package lesson19;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFileTaskImpl extends TaskImpl implements FindFilesTask {
    private String directory;
    private String faleNameSearchDirecnjry;
    private PrintStream printStream;

    public FindFileTaskImpl() {
    }


    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        if (directory == null) {
            throw new NullPointerException(" входящий параметр не может быть null !");
        }

        this.directory = directory;

    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        if (searchString == null) {
            throw new IllegalArgumentException(" входящий параметр не может быть null !");
        }
        this.faleNameSearchDirecnjry = searchString;

    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.printStream = out;

    }

    @Override
    public void execute() throws TaskExecutionFailedException {

        File currentDirectory = new File(directory);
        if (!currentDirectory.isDirectory() || currentDirectory.exists()) {
            throw new TaskExecutionFailedException(" папки не существует, или это не папка");
        }
        try {
            File startDirectory = new File(directory);
            File[] filesArray = startDirectory.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.getName().contains(faleNameSearchDirecnjry)) {
                        return true;
                    }
                    return false;
                }
            });
            for (File file : filesArray) {
                printStream.println(file.getAbsolutePath());
            }
        } catch (Exception e) {
            throw new TaskExecutionFailedException(" задача не может быть выпоолнена");
        }


    }

}
