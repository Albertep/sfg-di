package Tutorial.sfgdi.Controller;

import Tutorial.sfgdi.Services.GreetinsImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInyectedControllerTest {
SetterInyectedController setterInyectedController;
    @BeforeEach
    void setUp() {
        setterInyectedController=new SetterInyectedController();
        setterInyectedController.setGreetins(new GreetinsImpl());
    }

    @Test
    void getGreetins() {
        System.out.println(setterInyectedController.getGreetins());
    }
}