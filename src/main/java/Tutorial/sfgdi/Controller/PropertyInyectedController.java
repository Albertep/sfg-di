package Tutorial.sfgdi.Controller;

import Tutorial.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInyectedController {

    @Qualifier("propertyInyectedService")
    @Autowired
public GreetingService greetingService;


public String getGreetings(){
    return greetingService.greetings();
}
}
