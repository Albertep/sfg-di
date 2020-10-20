package Tutorial.sfgdi.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class GreetingsRepositoryImpl implements GreetingsRepository {
    @Autowired
    @Override
    public String getSpanishGreetings() {
        return "Hey, que tal Zagal?";
    }
    @Autowired
    @Override
    public String getEnglishGreetings() {
        return "Hey mate What's up?";
    }
    @Autowired
    @Override
    public String getDeutchGreetings() {
        return "SKOOOOOOOOOOOOOOOOOOOOLLLLLLLLL!!!!!!!!!!!!!!";
    }
}
