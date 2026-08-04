package Hillel.JavaCore.hw8;

import java.io.FileNotFoundException;
import java.nio.file.Path;

public class FileNavigatorUsage {
    public static void main(String[] args) {
        FileData fileData1, fileData2, fileData3;
        Path incorrectPath, correctPath, pathFrom;

        pathFrom = Path.of("/Downloads");
        correctPath =  Path.of("/Downloads");
        incorrectPath = Path.of("/Users/AS/docs");

        fileData1 = new FileData("doc1.txt", 42000, pathFrom);
        fileData2 = new FileData("doc2.txt", 45898, pathFrom);
        fileData3 = new FileData("doc3.txt", 1024, pathFrom);

        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(correctPath,fileData1);
        fileNavigator.add(correctPath, fileData3);
       // fileNavigator.add(incorrectPath, fileData2);
        System.out.println(fileNavigator);

       /* System.out.println(fileNavigator.find(correctPath));
        System.out.println(fileNavigator.filterBySize(40000));*/

        fileNavigator.remove(correctPath);
        System.out.println(fileNavigator);
    }
}

