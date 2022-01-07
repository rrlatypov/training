package lesson19;

public class CopyFileTaskImpl extends TaskImpl implements CopyFileTask {
    private String copyFromPath;
    private String copyToPath;
    private FileCopyUtils copyUtils;

    public CopyFileTaskImpl() {
    }

    public CopyFileTaskImpl(String copyFromPath, String copyToPath, FileCopyUtils copyUtils) {
        this.copyFromPath = copyFromPath;
        this.copyToPath = copyToPath;
        this.copyUtils = copyUtils;
    }

    public String getCopyFromPath() {
        return copyFromPath;
    }

    public void setCopyFromPath(String copyFromPath) {
        this.copyFromPath = copyFromPath;
    }

    public String getCopyToPath() {
        return copyToPath;
    }

    public void setCopyToPath(String copyToPath) {
        this.copyToPath = copyToPath;
    }

    public FileCopyUtils getCopyUtils() {
        return copyUtils;
    }

    public void setCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;

    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copyFile(copyFromPath, copyToPath);

        }catch ( Exception e){
            throw new TaskExecutionFailedException(e.getMessage());

        }


    }

    @Override
    public String toString() {
        return "CopyFileTaskImpl{" +
                "copyFromPath='" + copyFromPath + '\'' +
                ", copyToPath='" + copyToPath + '\'' +
                ", copyUtils=" + copyUtils +
                '}';
    }
}
