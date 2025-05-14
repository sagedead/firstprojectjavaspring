package pl.edu.vistula.firstprojectjavaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hellocontroller {

    @GetMapping(value = "/")
    public String hello() {
        return "Hello vistula in my first spring controller.";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "world") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
