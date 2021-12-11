package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String cars(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Auto1", "RED", 30));
        list.add(new Car("Auto2", "YELLOW", 40));
        list.add(new Car("Auto3", "BLACK", 50));
        list.add(new Car("Auto4", "GREEN", 60));
        list.add(new Car("Auto5", "BLUE", 70));
        model.addAttribute("count", CarService.carsCount(list, count));
        return "cars";

    }
}
