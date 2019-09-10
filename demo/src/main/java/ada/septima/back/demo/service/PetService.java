package ada.septima.back.demo.service;

import ada.septima.back.demo.model.Pet;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    public Pet createPet(String duenio, String nombre, Integer edad, String tipo){
        return new Pet(duenio, nombre, edad, tipo);
    }
}
