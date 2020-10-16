package Tutorial.sfgdi.Controller;

import Tutorial.sfgdi.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String Hello(){
        return greetingService.greetings();
    }
}
