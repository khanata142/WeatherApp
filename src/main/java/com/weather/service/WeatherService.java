package com.weather.service;

import org.springframework.web.servlet.ModelAndView;

public interface WeatherService {
	public ModelAndView fetchWeatherData(String city);

}
