package ada.septima.back.demo.controller;

import ada.septima.back.demo.model.Birthday;
import ada.septima.back.demo.service.BirthdayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class BirthdayController {
    private BirthdayService birthdayService;
    public BirthdayController(BirthdayService birthdayService){
        this.birthdayService=birthdayService;
    }

    @GetMapping("/birthday")
    public Birthday birthday(){
        return birthdayService.createBirthday("Natalia", "Marzo", 19);
    }
}