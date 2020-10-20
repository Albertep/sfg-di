package Tutorial.sfgdi.Controller;

import Tutorial.sfgdi.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInyectedController {

    private GreetingService greetingService;

    public String getGreetins() {
        return greetingService.greetings();
    }
    @Qualifier("setterInyectedService")
    @Autowired
    public void setGreetins(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
