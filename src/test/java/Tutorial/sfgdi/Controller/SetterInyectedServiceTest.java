package Tutorial.sfgdi.Controller;

import Tutorial.Services.ConstructorInyectedService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInyectedServiceTest {
SetterInyectedController setterInyectedController;
    @BeforeEach
    void setUp() {
        setterInyectedController=new SetterInyectedController();
        setterInyectedController.setGreetins(new ConstructorInyectedService());
    }

    @Test
    void getGreetins() {
        System.out.println(setterInyectedController.getGreetins());
    }
}