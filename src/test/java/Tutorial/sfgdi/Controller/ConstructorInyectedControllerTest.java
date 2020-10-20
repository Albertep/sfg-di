package Tutorial.sfgdi.Controller;

import Tutorial.Services.ConstructorInyectedService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInyectedControllerTest {

    ConstructorInyectedController controller;
    @BeforeEach
    void setUp() {
        controller= new ConstructorInyectedController(new ConstructorInyectedService());
    }

    @Test
    void getGreetins() {
        System.out.println(controller.getGreetins());
    }
}