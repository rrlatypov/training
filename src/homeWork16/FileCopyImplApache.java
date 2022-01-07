package homeWork16;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class FileCopyImplApache implements FileCopy {


    @Override
    public void copy(String from, String to) throws Exception {
        File copied = new File(from);
        File copieds = new File(to);

        FileUtils.copyFile(copied, copieds);

    }
}
