package Tutorial.sfgdi.Controller;

import Tutorial.sfgdi.Services.ConstructorInyectedService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInyectedControllerTest {

PropertyInyectedController propertyInyectedController;

    @BeforeEach
    void setUp() {
        propertyInyectedController=new PropertyInyectedController();
        propertyInyectedController.greetingService =new ConstructorInyectedService();
    }

    @Test
    void getGreetings() {
        System.out.println(propertyInyectedController.getGreetings());
    }
}