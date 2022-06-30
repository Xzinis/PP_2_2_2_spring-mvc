package web.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;


@Controller
public class Cars {
    private final CarDAO carDAO;

    public Cars(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(defaultValue = "5") Integer count,
                         Model model) {
        model.addAttribute("car", carDAO.table(count));
        return "Cars";
    }
}
