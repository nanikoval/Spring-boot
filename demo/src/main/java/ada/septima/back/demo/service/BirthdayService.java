package ada.septima.back.demo.service;

import ada.septima.back.demo.model.Birthday;
import org.springframework.stereotype.Service;

@Service
public class BirthdayService {
    public Birthday createBirthday(String nombre, String mes, Integer dia){
        return new Birthday(nombre, mes, dia);
    }
}