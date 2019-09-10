package ada.septima.back.demo.model;

import java.io.Serializable;

public class Pet implements Serializable {
    private String duenio;
    private String nombre;
    private Integer edad;
    private String tipo;

    public Pet(){}

    public Pet(String duenio, String nombre, Integer edad, String tipo){
        this.setDuenio(duenio);
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setTipo(tipo);

    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
