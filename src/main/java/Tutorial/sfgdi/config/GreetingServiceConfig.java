package Tutorial.sfgdi.config;

import Tutorial.sfgdi.Services.GreetingService;
import Tutorial.sfgdi.Services.GreetingServiceFactory;
import Tutorial.sfgdi.Services.GreetingsRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {
GreetingServiceFactory greetingServiceFactory;

    GreetingServiceFactory greetingServiceFactory(GreetingsRepository repository){
        return new GreetingServiceFactory(repository);
    }
    @Bean
    @Primary
    @Profile({"default", "es"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return  greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("en")
    GreetingService primaryEnglishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile( "de")
    GreetingService primaryDeutchGreetingService(GreetingServiceFactory greetingServiceFactory){
        return  greetingServiceFactory.createGreetingService("de");
    }

}
