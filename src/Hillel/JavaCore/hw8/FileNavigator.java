package Hillel.JavaCore.hw8;


//Створити клас FileNavigator. Клас призначений для зберігання списку файлів, які розташовані на конкретному шляху.
//
//Наприклад: /path/to/file-> [files.txt, firstApp.java]

import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class FileNavigator {
    private Map<Path, List<FileData>> filesByPath = new HashMap<>();


    public FileNavigator add(Path path, FileData fileData) {
        if (!path.equals(fileData.getFilePath())) {
            System.out.println("Path does not match file path.");
            return this;
        }
        if (filesByPath.containsKey(path)) {
            filesByPath.get(path).add(fileData);
        } else {
            List<FileData> files = new ArrayList<>();
            files.add(fileData);
            filesByPath.put(path, files);
        }
        return this;
    }

//    3. Реалізувати метод find у класі FileNavigator. Метод повертає
//    список файлів, пов'язаних з шляхом переданим як параметр.

    public List<FileData> find(Path path) {
 /*       List<FileData> files = filesByPath.get(path);

        if (files != null) {
            return files;
        } else throw new NoSuchElementException("no files by this path found");
*/
        return Optional.ofNullable(filesByPath.get(path))
                .orElseThrow(() -> new NoSuchElementException("No files found for path: " + path));
    }

    //    4. Реалізувати метод filterBySize у класі FileNavigator. Метод повертає список файлів, розмір (в байтах)
//    яких не перевищує значення, передане як параметр.
    public List<FileData> filterBySize(long size) {
        return filesByPath.values().stream().flatMap(List::stream)
                .filter(file -> file.getFileSize() < size).toList();
    }

    //    5. Реалізувати метод remove у класі FileNavigator. Метод видаляє шлях і пов'язані з ним файли, виходячи з значення
//    шляху, переданого як параметр.
    public void remove(Path path) {
        filesByPath.remove(path);
       /* Iterator<Map.Entry<Path, List<FileData>>> iterator = filesByPath.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Path, List<FileData>> entry = iterator.next();
            if (entry.getKey().equals(path)) {
                iterator.remove();
                break;
            }
        }*/
    }

    //    6. * Реалізувати метод sortBySize у класі FileNavigator. Метод сортує всі наявні файли за розміром (за зростанням),
//    потім повертає список відсортованих файлів.
    public List<FileData> sortBySize() {
       /*return   filesByPath.values().stream()
               .flatMap(List::stream).sorted(Comparator.comparingLong(FileData::getFileSize)).toList();*/
        return filesByPath.values().stream().flatMap(List::stream).sorted(new FileSizeComporator()).toList();
    }


    //  Напиши метод long getTotalSize() який повертає сумарний розмір усіх файлів.

    public long getTotalSize() {
        return filesByPath.values().stream().flatMap(List::stream).mapToLong(FileData::getFileSize).sum();
    }

    //Метод має повернути найбільший файл серед усіх.
    public FileData getLargestFile() {
        return filesByPath.values().stream().flatMap(List::stream)
                .max(Comparator.comparingLong(FileData::getFileSize)).orElseThrow(() -> new NoSuchElementException("No files founded"));
    }

    //  Напиши метод public int countFiles() який повертає загальну кількість файлів.
    public long countFiles() {
        return filesByPath.values().stream().flatMap(List::stream).count();
    }

    //Напиши public List<FileData> findByName(String name) щоб
    // знаходити всі файли з таким ім'ям.

    public List<FileData> findByName(String name) {
        return filesByPath.values().stream().flatMap(List::stream).filter(e -> e.getFileName().equals(name)).toList();
    }

    //Знайти найменший файл.
    public FileData findMinSizeFile() {
        return filesByPath.values().stream().flatMap(List::stream)
                .min(Comparator.comparingLong(FileData::getFileSize)).orElseThrow();
    }

    public Map<Path, Long> getTotalSizeByPath() {
        return filesByPath.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        e -> e.getValue().stream().mapToLong(FileData::getFileSize).sum()));
    }

    public Map<Path, Integer> getFilesCountByPath() {
        return filesByPath.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,
                e -> e.getValue().size()));
    }

    public Map<Path, FileData> getLargestFileByPath() {
        return filesByPath.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().stream().max(Comparator.comparingLong(FileData::getFileSize)).orElseThrow()));
    }

    public List<String> getAllFileNames() {
        return filesByPath.values().stream().flatMap(List::stream).map(FileData::getFileName).distinct().toList();
    }

    public List<Long> getAllFileSizes() {
        return filesByPath.values().stream().flatMap(List::stream).map(FileData::getFileSize).toList();
    }

    public List<FileData> getFilesSortedByName() {
        return filesByPath.values().stream().flatMap(List::stream).sorted(Comparator.comparing(FileData::getFileName)).toList();
    }

    public List<FileData> getFilesSortedByPathThenName() {
        return filesByPath.values().stream().flatMap(List::stream)
                .sorted(Comparator.comparing(FileData::getFilePath).thenComparing(FileData::getFileName)).toList();
    }

    //щоб усередині кожного списку файли були вже відсортовані за розміром.
    public Map<Path, List<FileData>> getFilesSortedBySize() {
        return filesByPath.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        e -> e.getValue().stream().sorted(Comparator.comparingLong(FileData::getFileSize)).toList()));
    }

    public Map<Path, Long> getLargestFileSizeByPath() {
        return filesByPath.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().stream().mapToLong(FileData::getFileSize).max().orElseThrow()));
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "filesByPath=" + filesByPath +
                '}';
    }
}
