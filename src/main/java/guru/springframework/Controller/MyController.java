package guru.springframework.Controller;

import guru.springframework.sfgdi.SfgDiApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World");
        return "Hi Folks";
    }
}

