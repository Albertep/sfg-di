package Tutorial.sfgdi.Services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimarySpanishGreetingService implements GreetingService{

    GreetingsRepository greetingsRepository;

    public PrimarySpanishGreetingService(GreetingsRepository greetingsRepository) {
        this.greetingsRepository = greetingsRepository;
    }

    @Override
    public String greetings() {
        return greetingsRepository.getSpanishGreetings();
    }
}
