package org.example;

import java.io.*;
public class Code2 {

        public static void main(String[] args) {
            // Define source and destination files
            String sourceFile = "largeFile.txt"; // Replace with the path to your large file
            String destinationFileBuffered = "copiedWithBuffer.txt";
            String destinationFileUnbuffered = "copiedWithoutBuffer.txt";

            try {
                // Copy file using unbuffered streams
                long unbufferedTime = copyUsingUnbufferedStreams(sourceFile, destinationFileUnbuffered);
                System.out.println("Unbuffered Stream Time: " + unbufferedTime + " nanoseconds");

                // Copy file using buffered streams
                long bufferedTime = copyUsingBufferedStreams(sourceFile, destinationFileBuffered);
                System.out.println("Buffered Stream Time: " + bufferedTime + " nanoseconds");

                // Compare the times
                System.out.println("Buffered Streams were " + (unbufferedTime / (double) bufferedTime) + " times faster.");
            } catch (IOException e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }

        // Method to copy file using unbuffered streams
        public static long copyUsingUnbufferedStreams(String sourceFile, String destinationFile) throws IOException {
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;
            long startTime = System.nanoTime();

            try {
                fileInputStream = new FileInputStream(sourceFile);
                fileOutputStream = new FileOutputStream(destinationFile);
                byte[] buffer = new byte[4096]; // 4 KB chunk
                int bytesRead;

                while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, bytesRead);
                }
            } finally {
                if (fileInputStream != null) fileInputStream.close();
                if (fileOutputStream != null) fileOutputStream.close();
            }

            long endTime = System.nanoTime();
            return endTime - startTime;
        }

        // Method to copy file using buffered streams
        public static long copyUsingBufferedStreams(String sourceFile, String destinationFile) throws IOException {
            BufferedInputStream bufferedInputStream = null;
            BufferedOutputStream bufferedOutputStream = null;
            long startTime = System.nanoTime();

            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(sourceFile));
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destinationFile));
                byte[] buffer = new byte[4096]; // 4 KB chunk
                int bytesRead;

                while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                    bufferedOutputStream.write(buffer, 0, bytesRead);
                }
            } finally {
                if (bufferedInputStream != null) bufferedInputStream.close();
                if (bufferedOutputStream != null) bufferedOutputStream.close();
            }

            long endTime = System.nanoTime();
            return endTime - startTime;
        }
    }


