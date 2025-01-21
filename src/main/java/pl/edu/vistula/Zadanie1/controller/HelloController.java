package pl.edu.vistula.Zadanie1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String helloDalecki() {
        return "Cześć Vistula, w moim pierwszym kontrolerze Spring ";}

    @GetMapping("/greeting")
    public String greetingDalecki(@RequestParam(name="name", required = false, defaultValue ="World") String name, Model model ){
        model.addAttribute("name", name);
        return "greeting";
        }
        //http://localhost:8080/greeting?name=Vistula
    }

