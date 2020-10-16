package Tutorial.sfgdi.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String Hello(){

        System.out.println("Hey Hey my my");
        return "Hello m8";
    }
}
