package Tutorial.sfgdi.Controller;

import Tutorial.sfgdi.Services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInyectedController {
    private final GreetingService greetingService;

    public ConstructorInyectedController(@Qualifier("constructorInyectedService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetins() {
        return greetingService.greetings();
    }


}
