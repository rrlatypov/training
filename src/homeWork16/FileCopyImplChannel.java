package homeWork16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class FileCopyImplChannel implements FileCopy {
    @Override
    public void copy(String from, String to) throws Exception {
        FileChannel fromChannel = null;
        FileChannel toChannel = null;
        try {
            fromChannel = new FileInputStream(from).getChannel();
            toChannel = new FileOutputStream(to).getChannel();
            toChannel.transferFrom(fromChannel, 0, fromChannel.size());
        }finally{
            fromChannel.close();
            toChannel.close();
        }

    }
}
