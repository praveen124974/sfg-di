package pappu.springframrwork.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

    @Override
    public String SayGreeting() {
        return "Hello World- Setter";
    }
}
