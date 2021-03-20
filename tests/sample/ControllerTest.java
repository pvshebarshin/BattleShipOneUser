package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ControllerTest {
    @Test
    void checkText() {
        for (int i = 0; i < 10; i++) {
            Assertions.assertTrue(Controller.checkText(i + ""));
        }
        Assertions.assertThrows(Throwable.class, () -> Controller.checkText(""));
        Assertions.assertThrows(Throwable.class, () -> Controller.checkText("4567"));
        Assertions.assertThrows(Throwable.class, () -> Controller.checkText("dfgh"));
    }
}