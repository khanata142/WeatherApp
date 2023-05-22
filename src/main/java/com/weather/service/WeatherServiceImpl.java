package com.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import com.weather.entities.Coord;
import com.weather.entities.Main;
import com.weather.entities.Sys;
import com.weather.entities.Weather;
import com.weather.entities.WeatherDetails;
import com.weather.entities.Wind;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	RestTemplate restTemplate;

	public ModelAndView fetchWeatherData(String city) {
		String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city
				+ "&appid=6a4ba552a2b08fc4b3e239caff13a6c9";
		ResponseEntity<WeatherDetails> re = restTemplate.getForEntity(url, WeatherDetails.class);

		WeatherDetails wd = re.getBody();
		Weather[] weatherArray = wd.getWeather();
		Weather weather = weatherArray[0];
		Coord coordinates = wd.getCoord();
		Main main = wd.getMain();
		Wind wind = wd.getWind();
		Sys sys = wd.getSys();
		String[] reportArray = new String[11]; // contains whole weather report
		reportArray[0] = sys.getCountry(); // country name
		reportArray[1] = wd.getName(); // city name
		reportArray[2] = "lon " + coordinates.getLon() + " lat " + coordinates.getLat();// coordinates
		reportArray[3] = weather.getDescription(); // description
		reportArray[4] = Double.toString(main.getTemp()); // temperature
		reportArray[5] = Integer.toString(main.getPressure()); // pressure
		reportArray[6] = Integer.toString(main.getHumidity()); // humidity
		reportArray[7] = Integer.toString(main.getSea_level()); // sea level
		reportArray[8] = Integer.toString(main.getGrnd_level()); // ground level
		reportArray[9] = Long.toString(wd.getVisibility()); // visibility
		reportArray[10] = Double.toString(wind.getSpeed()); // wind speed
		ModelAndView mv = new ModelAndView();
		mv.addObject("reportArray", reportArray);
		mv.setViewName("weatherReport");

		return mv;
	}

}
