package Tutorial.sfgdi.Controller;

import Tutorial.sfgdi.Services.Greetins;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInyectedController {
    private final Greetins greetins;

    public ConstructorInyectedController(Greetins greetins) {
        this.greetins = greetins;
    }

    public String getGreetins() {
        return greetins.greetings();
    }


}
