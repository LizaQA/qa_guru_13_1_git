package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    public void firstTest() {
        Assertions.assertFalse(3 < 2, "Неверно");
    }

    @Test
    public void secondTest() {
        Assertions.assertFalse(3 < 1, "Неверно");
    }
}


