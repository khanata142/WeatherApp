package com.weather.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.weather.service.WeatherServiceImpl;

@Controller
public class weatherController {

	@Autowired
	WeatherServiceImpl weatherService;

	@ModelAttribute
	public void listOfCities(Model model) {
		List<String> listOfCities = Arrays.asList("Srinagar", "Jammu", "Chandigarh", "Hyderabad", "Chennai", "Agra",
				"Ahmedabad", "Jaipur", "bengaluru", "Kolkata", "Surat", "Lucknow", "Aurangabad", "Jodhpur",
				"Bhubaneshwar", "Jaipur", "Patna", "Indore", "Nagpur", "Rajkot", "Coimbatore", "Bhopal", "New Delhi",
				"Amritsar", "Prayagraj", "Nashik");
		model.addAttribute("listOfCities", listOfCities);
	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/getdata", method = RequestMethod.POST)
	public ModelAndView fetchWeatherData(@RequestParam("city") String city) {
		return weatherService.fetchWeatherData(city);
	}

	@ExceptionHandler(Exception.class)
	public ModelAndView errorHandler(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", e.getMessage());
		mv.setViewName("exceptionPage");
		return mv;
	}

}
