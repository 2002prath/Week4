package org.example;

    import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
public class Code5Test {

    Code5 databaseConnection = new Code5();



        @BeforeEach
        public void setUp() {
            // Initialize the DatabaseConnection and connect before each test

            databaseConnection.connect();
        }

        @AfterEach
        public void tearDown() {
            // Disconnect the database after each test
            databaseConnection.disconnect();
        }

        @Test
        public void testConnectionIsEstablished() {
            // Verify that the connection is established
            assertTrue(databaseConnection.isConnected(), "Database should be connected.");
        }

        @Test
        public void testConnectionIsClosed() {
            // Disconnect manually and verify
            databaseConnection.disconnect();
            assertFalse(databaseConnection.isConnected(), "Database should be disconnected.");
        }
    }


