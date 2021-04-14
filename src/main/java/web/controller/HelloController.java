package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) int size, ModelMap modelMap) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", 500, 2));
        list.add(new Car("Audi", 327, 1));
        list.add(new Car("Mersedes", 170, 3));
        list.add(new Car("BMW", 470, 1));
        list.add(new Car("Toyota", 620, 9));
        if (size == 0 || size >= 5) {
            modelMap.addAttribute("cars", list);
        } else modelMap.addAttribute("cars", list.stream().limit(size).toArray());
        return "car";
    }


}