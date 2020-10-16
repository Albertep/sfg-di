package Tutorial.sfgdi.Controller;

import Tutorial.sfgdi.Services.Greetins;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInyectedController {

    @Autowired
public Greetins greetins;


public String getGreetings(){
    return greetins.greetings();
}
}
