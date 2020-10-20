package Tutorial.sfgdi.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class PrimaryService implements GreetingService{

    private GreetingsRepository greetingsRepository;

    public PrimaryService(GreetingsRepository greetingsRepository) {
        this.greetingsRepository = greetingsRepository;
    }

    @Override
    public String greetings() {
        return greetingsRepository.getEnglishGreetings();
    }
}
