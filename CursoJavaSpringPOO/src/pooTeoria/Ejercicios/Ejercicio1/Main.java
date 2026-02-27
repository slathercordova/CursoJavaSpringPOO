package pooTeoria.Ejercicios.Ejercicio1;

import java.util.UUID;

public class Main {
    static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 7;
        dog.breed = "Shitzu";
        dog.color = "Caramelo";

        System.out.println(dog);
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.version());
    }
}
