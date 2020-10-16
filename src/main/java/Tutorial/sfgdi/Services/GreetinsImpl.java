package Tutorial.sfgdi.Services;


import org.springframework.stereotype.Service;

@Service
public class GreetinsImpl implements Greetins {
    @Override
    public String greetings() {
        return "Hey, How are you?";
    }
}
