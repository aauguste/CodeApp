package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/something")
    public String index() {
        return "Greetings from spring boot web! \n";
    }
}

