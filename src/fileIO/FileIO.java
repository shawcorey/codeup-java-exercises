package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    public static void main(String[] args) {
//        System.out.println(getFilePath("fileIO","test.txt").toAbsolutePath());
        System.out.println("Does the path exist?");
        System.out.println(getFilePath("src","fileIO","test.txt"));


    }

    public static Path getFilePath(String filename){
        return Paths.get(filename);
    }

    public static Path getFilePath(String parentDirectory, String filename){
        return Paths.get(parentDirectory, filename);
    }

    public static Path getFilePath(String parentDirectory, String childDirectory, String filename){
        return Paths.get(parentDirectory, childDirectory, filename);
    }

    public static boolean doesPathExist(Path path){
        return Files.exists(path);
    }

    public static void tryCreateDirectory(Path pathToCreate){

        if (!doesPathExist(pathToCreate)){
            try {
                Files.createDirectory(pathToCreate);
            }catch (IOException e){}
            System.out.println("Could not create the directory at: ");
            System.out.println(pathToCreate.toAbsolutePath());

        }

    }
}
