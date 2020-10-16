package Tutorial.sfgdi.Controller;

import Tutorial.sfgdi.Services.GreetinsImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInyectedControllerTest {

PropertyInyectedController propertyInyectedController;

    @BeforeEach
    void setUp() {
        propertyInyectedController=new PropertyInyectedController();
        propertyInyectedController.greetins=new GreetinsImpl();
    }

    @Test
    void getGreetings() {
        System.out.println(propertyInyectedController.getGreetings());
    }
}