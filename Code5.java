package org.example;
import java.io.*;

public class Code5 {




        public static void main(String[] args) {
            // Input and Output file paths
            String inputFilePath = "original_image.jpg";  // Replace with your image file path
            String outputFilePath = "copied_image.jpg";

            try {
                // Convert image to byte array
                byte[] imageBytes = convertImageToByteArray(inputFilePath);

                // Write byte array back to a new image file
                writeByteArrayToImage(imageBytes, outputFilePath);

                System.out.println("Image successfully copied to " + outputFilePath);
            } catch (IOException e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }

        // Method to convert an image file to a byte array
        private static byte[] convertImageToByteArray(String filePath) throws IOException {
            try (FileInputStream fis = new FileInputStream(filePath);
                 ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

                byte[] buffer = new byte[4096]; // Read in chunks of 4KB
                int bytesRead;

                while ((bytesRead = fis.read(buffer)) != -1) {
                    baos.write(buffer, 0, bytesRead);
                }

                return baos.toByteArray();
            }
        }

        // Method to write a byte array back to an image file
        private static void writeByteArrayToImage(byte[] data, String filePath) throws IOException {
            try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
                 FileOutputStream fos = new FileOutputStream(filePath)) {

                byte[] buffer = new byte[4096]; // Write in chunks of 4KB
                int bytesRead;

                while ((bytesRead = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }
        }
    }



