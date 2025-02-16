package org.example;
import java.io.*;

public class Code7 {

        public static void main(String[] args) {
            String filePath = "students.dat"; // Binary file to store the data

            // Write student details to the file
            writeStudentDetails(filePath);

            // Read and display student details from the file
            readStudentDetails(filePath);
        }

        private static void writeStudentDetails(String filePath) {
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
                // Example student data
                dos.writeInt(1); // Roll number
                dos.writeUTF("Alice"); // Name
                dos.writeDouble(3.8); // GPA

                dos.writeInt(2);
                dos.writeUTF("Bob");
                dos.writeDouble(3.5);

                dos.writeInt(3);
                dos.writeUTF("Charlie");
                dos.writeDouble(3.9);

                System.out.println("Student details written successfully.");
            } catch (IOException e) {
                System.err.println("An error occurred while writing to the file: " + e.getMessage());
            }
        }

        private static void readStudentDetails(String filePath) {
            try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
                System.out.println("\nStudent Details:");

                // Read data until the end of the file
                while (dis.available() > 0) {
                    int rollNumber = dis.readInt();
                    String name = dis.readUTF();
                    double gpa = dis.readDouble();

                    System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
                }
            } catch (IOException e) {
                System.err.println("An error occurred while reading from the file: " + e.getMessage());
            }
        }
    }


