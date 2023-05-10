package guru.springframework.sfgdi.Controller;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

