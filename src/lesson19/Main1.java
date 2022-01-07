package lesson19;

import java.io.FileNotFoundException;

public class Main1 {
    public static void main(String[] args) {
        CopyFileTaskImpl firstCopyTask = new CopyFileTaskImpl();
        firstCopyTask.setCopyFromPath(" C:\\training java\\out\\WhatsAppSetup.exe");
        firstCopyTask.setCopyToPath("C:\\training java\\in\\WA.exe");
        firstCopyTask.setFileCopyUtils(new FileCopyUtilsImpl());

        CopyFileTaskImpl secondCopyTask = new CopyFileTaskImpl();
        secondCopyTask.setCopyFromPath(" C:\\training java\\out\\biker.jpg");
        secondCopyTask.setCopyToPath("C:\\training java\\in\\\\moto.jpg");
        secondCopyTask.setFileCopyUtils(new FileCopyUtilsImpl());

        CopyFileTaskImpl thirdCopyTask = new CopyFileTaskImpl();
        thirdCopyTask.setCopyFromPath("C:\\training java\\out\\commons-io-2.8.0-bin.zip");
        thirdCopyTask.setCopyToPath("C:\\training java\\in\\arch.exe");
        thirdCopyTask.setFileCopyUtils(new FileCopyUtilsImpl());


        FindFileTaskImpl firstFindTask = new FindFileTaskImpl();
        try {
            firstFindTask.setDirectory("C:\\training java\\out");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        firstFindTask.setFileNameSearchString("in");
        firstFindTask.setPrintStream(System.out);

        FindFileTaskImpl secondFindTask = new FindFileTaskImpl();
        try {
            secondFindTask.setDirectory("C:\\training java\\out");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        secondFindTask.setFileNameSearchString("in");
        secondFindTask.setPrintStream(System.out);

        FindFileTaskImpl thirdFindTask = new FindFileTaskImpl();
        try {
            thirdFindTask.setDirectory("C:\\training java\\out");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        thirdFindTask.setFileNameSearchString("in");
        thirdFindTask.setPrintStream(System.out);

        TaskStorageImpl taskStorage = new TaskStorageImpl();
        taskStorage.add(firstCopyTask);
        taskStorage.add(secondCopyTask);
        taskStorage.add(thirdCopyTask);
        taskStorage.add(firstFindTask);
        taskStorage.add(secondFindTask);
        taskStorage.add(thirdFindTask);

        TaskExucutorImpl firstExecutor = new TaskExucutorImpl();
        firstExecutor.setStorage(taskStorage);
        TaskExucutorImpl secondExecutor = new TaskExucutorImpl();
        secondExecutor.setStorage(taskStorage);
        TaskExucutorImpl thirdExecutor = new TaskExucutorImpl();
        thirdExecutor.setStorage(taskStorage);

        firstExecutor.start();
        secondExecutor.start();
        thirdExecutor.start();


    }
}
