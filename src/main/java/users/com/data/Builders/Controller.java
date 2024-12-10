package users.com.data.Builders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/build")
    public String buildOne (){
        return "build";
    }
}
