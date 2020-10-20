package Tutorial.Services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInyectedService implements GreetingService{
    @Override
    public String greetings() {
        return "Hey, How are you? -----Property";
    }
}
