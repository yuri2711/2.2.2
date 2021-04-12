package web.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ControllerCar {
    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {

        List<Car> messages = new ArrayList<>();
        messages.add(new Car("BMW", 500, 8));
        messages.add(new Car("Mersedes", 350, 3));
        messages.add(new Car("Audi", 150, 2));
        messages.add(new Car("Bentlay", 300, 5));

        return "car";
    }
}
