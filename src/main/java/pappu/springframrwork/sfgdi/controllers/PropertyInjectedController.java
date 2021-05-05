package pappu.springframrwork.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pappu.springframrwork.sfgdi.services.GreetingService;
@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.SayGreeting();
    }
}
