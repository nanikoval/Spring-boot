package ada.septima.back.demo.controller;

import ada.septima.back.demo.model.Greeting;
import ada.septima.back.demo.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {
    private GreetingService greetingService;
    public GreetingController(GreetingService greetingService){
        this.greetingService=greetingService;
    }
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Mundo")String name){
        return  greetingService.createGreeting(name);
    }
}