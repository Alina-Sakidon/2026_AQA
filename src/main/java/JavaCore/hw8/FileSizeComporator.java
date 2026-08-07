package JavaCore.hw8;

import java.util.Comparator;

public class FileSizeComporator implements Comparator<FileData> {

    @Override
    public int compare(FileData file1, FileData file2) {
        return Long.compare(file1.getFileSize(), file2.getFileSize());
    }
}
