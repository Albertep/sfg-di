package Tutorial.sfgdi.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterInyectedService implements GreetingService{
    @Override
    public String greetings() {
        return "Hey, How are you? -----Setter";
    }
}
