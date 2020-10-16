package Tutorial.sfgdi.Controller;

import Tutorial.sfgdi.Services.GreetinsImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInyectedControllerTest {

    ConstructorInyectedController controller;
    @BeforeEach
    void setUp() {
        controller= new ConstructorInyectedController(new GreetinsImpl());
    }

    @Test
    void getGreetins() {
        System.out.println(controller.getGreetins());
    }
}