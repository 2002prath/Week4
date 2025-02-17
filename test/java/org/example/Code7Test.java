package org.example;

    import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;
public class Code7Test {



        Code7 performanceTester = new Code7();

        @Test
        @Timeout(value = 2, unit = TimeUnit.SECONDS)
        public void testLongRunningTaskTimeout() {
            // This test will fail because the method takes more than 2 seconds
            assertThrows(InterruptedException.class, () -> {
                performanceTester.longRunningTask();
            });
        }
    }


