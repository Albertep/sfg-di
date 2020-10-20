package Tutorial.sfgdi.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingServiceFactory {

    GreetingsRepository greetingsRepository;

    public GreetingServiceFactory(GreetingsRepository greetingsRepository) {
        this.greetingsRepository = greetingsRepository;
    }

    public GreetingService createGreetingService(String lang){

        switch (lang){
            case "en":
                return new PrimaryEnglishGreetingService(greetingsRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingsRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingsRepository);
            default:
                return  new PrimaryService(greetingsRepository);
        }
    }
}
