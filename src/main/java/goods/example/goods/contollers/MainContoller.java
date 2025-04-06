package goods.example.goods.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainContoller {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "главная страница");
        return "home";
    }
}
