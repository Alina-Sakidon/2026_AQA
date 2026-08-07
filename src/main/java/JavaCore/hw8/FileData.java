package JavaCore.hw8;


//1. Створити клас FileData. Клас представляє конкретний файл і складається з: ім'я файлу, розміру в байтах, шлях до файлу.

import java.nio.file.Path;
import java.util.Objects;


public class FileData {
    private String fileName;
    private long fileSize;
    private Path filePath;

    public FileData(String name, long size, Path path){
        this.fileName = name;
        this.fileSize = size;
        this.filePath = path;
    }

    public String getFileName() {
        return fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FileData fileData = (FileData) o;
        return fileSize == fileData.fileSize && Objects.equals(fileName, fileData.fileName) && Objects.equals(filePath, fileData.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileSize, filePath);
    }

    @Override
    public String toString() {
        return "FileData{" +
                "fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", filePath=" + filePath +
                '}';
    }
}
