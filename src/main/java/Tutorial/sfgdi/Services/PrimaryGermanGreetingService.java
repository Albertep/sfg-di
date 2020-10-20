package Tutorial.sfgdi.Services;


public class PrimaryGermanGreetingService implements GreetingService{

    GreetingsRepository greetingsRepository;

    public PrimaryGermanGreetingService(GreetingsRepository greetingsRepository) {
        this.greetingsRepository = greetingsRepository;
    }

    @Override
    public String greetings() {
        return greetingsRepository.getDeutchGreetings();
    }
}
