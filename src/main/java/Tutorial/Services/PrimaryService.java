package Tutorial.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryService implements GreetingService{

    @Override
    public String greetings() {
        return "Hey, How are you? -----Primary";
    }
}
