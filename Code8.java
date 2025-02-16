package org.example;
import java.io.*;

public class Code8 {

        public static void main(String[] args) {
            // Create piped input and output streams
            try (PipedOutputStream outputStream = new PipedOutputStream();
                 PipedInputStream inputStream = new PipedInputStream(outputStream)) {

                // Writer Thread
                Thread writerThread = new Thread(() -> {
                    try {
                        String[] messages = {
                                "Hello, this is message 1",
                                "Here's message 2",
                                "Final message 3"
                        };

                        for (String message : messages) {
                            outputStream.write(message.getBytes());
                            System.out.println("[Writer] Wrote: " + message);
                            Thread.sleep(500); // Simulate delay
                        }
                    } catch (IOException | InterruptedException e) {
                        System.err.println("[Writer] Error: " + e.getMessage());
                    }
                });

                // Reader Thread
                Thread readerThread = new Thread(() -> {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println("[Reader] Read: " + line);
                        }
                    } catch (IOException e) {
                        System.err.println("[Reader] Error: " + e.getMessage());
                    }
                });

                // Start both threads
                writerThread.start();
                readerThread.start();

                // Wait for threads to complete
                writerThread.join();
                readerThread.join();

            } catch (IOException | InterruptedException e) {
                System.err.println("[Main] Error: " + e.getMessage());
            }
        }
    }


