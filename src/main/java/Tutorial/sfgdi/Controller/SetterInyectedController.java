package Tutorial.sfgdi.Controller;

import Tutorial.sfgdi.Services.Greetins;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInyectedController {

    private Greetins greetins;

    public String getGreetins() {
        return greetins.greetings();
    }

    @Autowired
    public void setGreetins(Greetins greetins) {
        this.greetins = greetins;
    }
}
