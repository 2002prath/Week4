package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Code6Test {

    Code6 checker = new Code6();

    @Test
    public void check()
    {
      assertTrue(checker.isEven(46));
    }


}
