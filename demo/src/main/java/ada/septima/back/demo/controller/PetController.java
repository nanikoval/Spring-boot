package ada.septima.back.demo.controller;

import ada.septima.back.demo.model.Pet;
import ada.septima.back.demo.service.PetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
    private PetService petService;
    public PetController(PetService petService){
        this.petService=petService;
    }

    @GetMapping("/pet")
    public Pet pet(){
        return petService.createPet("Natalia", "Coco", 2, "perro");
    }
}
