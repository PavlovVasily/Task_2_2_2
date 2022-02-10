package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

	private final CarService carService;

	@Autowired
	public CarController(CarServiceImp carServiceImp) {
		carService = carServiceImp;
	}

	@GetMapping(value = "/cars")
	public String printCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Ford", "Mondeo", 2011));
		cars.add(new Car("KIA", "K5", 2021));
		cars.add(new Car("Chevrolet", "Cruse", 2014));
		cars.add(new Car("Citroen", "C5", 2007));
		cars.add(new Car("Citroen", "C3", 2009));

		model.addAttribute("cars", carService.getCarList(cars, count));

		return "cars";
	}
	
}