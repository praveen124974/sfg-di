package pappu.springframrwork.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Hello World- Property";
    }
}
