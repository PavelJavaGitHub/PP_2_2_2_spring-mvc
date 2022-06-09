package ru.pavel_java_dev.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pavel_java_dev.web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping()
    public String viewCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", count == null || count >= 5
                ? service.listCars() : service.listCars(count));
        return "cars";
    }

//    @GetMapping("/{count}")
//    public String viewCars(@PathVariable("count") int count, Model model) {
//        model.addAttribute("cars", service.listCars(count));
//        return "cars";
//    }
//
//    @GetMapping()
//    public String viewAllCars(Model model) {
//        model.addAttribute("cars", service.listCars());
//        return "cars";
//    }
}
