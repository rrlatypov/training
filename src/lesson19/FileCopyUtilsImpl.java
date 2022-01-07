package lesson19;

import java.io.File;
import java.nio.file.Files;

public class FileCopyUtilsImpl implements FileCopyUtils {

    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File fileFrom = new File(source);
        File fileTo = new File(destination);

        if (fileTo.exists()) {
            throw new FileAlreadyExistsException(" целевой файл уже существует");

        }
        if (!fileFrom.exists() || !fileFrom.isFile()){
            throw  new FileCopyFailedException(" копируемый файл не существует или это не файл");

        }

        try {
            Files.copy(fileFrom.toPath(), fileTo.toPath());
        } catch (Exception e) {
            throw new FileCopyFailedException(e.getMessage());
        }
    }
}
