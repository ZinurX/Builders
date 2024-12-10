package users.com.data.Builders;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/build")
    public String buildOne (ModelMap model){
        model.addAttribute("message","hi mvc");
        return "build <h1>First</h1>";

    }
}
