package org.example;



import java.io.*;
public class Code1 {

        public static void main(String[] args) {
            // Source and destination file paths
            String sourceFile = "source.txt";
            String destinationFile = "destination.txt";

            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;

            try {
                // Attempt to open the source file
                File inputFile = new File(sourceFile);
                if (!inputFile.exists()) {
                    System.out.println("Source file does not exist: " + sourceFile);
                    return;
                }

                // Initialize FileInputStream and FileOutputStream
                fileInputStream = new FileInputStream(inputFile);
                fileOutputStream = new FileOutputStream(destinationFile);

                // Read from source file and write to destination file
                int byteData;
                while ((byteData = fileInputStream.read()) != -1) {
                    fileOutputStream.write(byteData);
                }

                System.out.println("File contents copied successfully from " + sourceFile + " to " + destinationFile);

            } catch (IOException e) {
                System.err.println("An error occurred while handling the file: " + e.getMessage());
            } finally {
                try {
                    // Close the streams to release resources
                    if (fileInputStream != null) fileInputStream.close();
                    if (fileOutputStream != null) fileOutputStream.close();
                } catch (IOException e) {
                    System.err.println("An error occurred while closing the streams: " + e.getMessage());
                }
            }
        }
    }


