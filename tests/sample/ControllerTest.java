package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void checkText() {
        assert (Controller.checkText("1"));
        assert (Controller.checkText("6"));
    }
}