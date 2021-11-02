package com.tuychiev.javatpoint;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/22/21
 */
public class Files {
    final static String FILE_NAME = "filename.txt";

    public static void main(String[] args) {
        createAFile();
        writeToAFile();
        readAFile();
        getFileInformation();
        deleteFile();
    }

    private static void deleteFile() {
        File file = new File(FILE_NAME);
        if (file.delete()) {
            System.out.printf("\"%s\" was deleted successfully.", file.getAbsolutePath());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    private static void getFileInformation() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            System.out.printf(
                    "File name: %s\nAbsolute path: %s.\nWriteable: %s.\nReadable: %s.\nFile size (in bytes): %s.\n",
                    file.getName(),
                    file.getAbsolutePath(),
                    file.canWrite(),
                    file.canRead(),
                    file.length()
            );
        } else {
            System.out.println("The file does not exist.");
        }
    }

    private static void readAFile() {
        try {
            File file = new File(FILE_NAME);
            Scanner scanner = new Scanner(file);
            System.out.println("Had started reading the file: ");
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    private static void writeToAFile() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME);
            fileWriter.write("Files in Java might be tricky, but it is fun enough!\n");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    private static void createAFile() {
        try {
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.printf("File created by %s name.\n", file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
