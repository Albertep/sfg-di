package Tutorial.sfgdi.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimaryEnglishGreetingService implements GreetingService {

    GreetingsRepository greetingsRepository;

    public PrimaryEnglishGreetingService(GreetingsRepository greetingsRepository) {
        this.greetingsRepository = greetingsRepository;
    }

    @Override
    public String greetings() {
        return greetingsRepository.getEnglishGreetings();
    }
}
