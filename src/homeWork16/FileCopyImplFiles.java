package homeWork16;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopyImplFiles implements FileCopy {
    @Override
    public void copy(String from, String to) throws Exception {
        Files.copy(Paths.get(from), Paths.get(to));
    }
}
