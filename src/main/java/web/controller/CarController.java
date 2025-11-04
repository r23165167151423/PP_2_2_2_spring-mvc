package web.controller;

import javaApp.model.Car;
import javaApp.service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {

    private final CarServiceImpl carServiceImpl = new CarServiceImpl();

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count,
                           ModelMap model) {

        List<Car> cars = carServiceImpl.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
