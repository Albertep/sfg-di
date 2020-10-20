package Tutorial.Services;


import org.springframework.stereotype.Service;

@Service
public class ConstructorInyectedService implements GreetingService {
    @Override
    public String greetings() {
        return "Hey, How are you? ----Constructor";
    }
}
