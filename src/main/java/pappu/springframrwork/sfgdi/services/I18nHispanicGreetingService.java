package pappu.springframrwork.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("HS")
@Service("i18nService")
public class I18nHispanicGreetingService implements GreetingService{
    @Override
    public String SayGreeting() {
        return "Hola Mundo- HS";
    }
}
