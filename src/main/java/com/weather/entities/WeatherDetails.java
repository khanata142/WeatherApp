package com.weather.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
{
    "coord": {
        "lon": 74.8167,
        "lat": 34.0833
    },
    "weather": [
        {
            "id": 800,
            "main": "Clear",
            "description": "clear sky",
            "icon": "01d"
        }
    ],
    "base": "stations",
    "main": {
        "temp": 297.52,
        "feels_like": 296.95,
        "temp_min": 297.52,
        "temp_max": 297.52,
        "pressure": 1010,
        "humidity": 36,
        "sea_level": 1010,
        "grnd_level": 845
    },
    "visibility": 10000,
    "wind": {
        "speed": 0.9,
        "deg": 246,
        "gust": 1.48
    },
    "clouds": {
        "all": 0
    },
    "dt": 1684572206,
    "sys": {
        "country": "IN",
        "sunrise": 1684540580,
        "sunset": 1684591103
    },
    "timezone": 19800,
    "id": 1255634,
    "name": "Srinagar",
    "cod": 200
}
*/
@Setter
@Getter
@Data
public class WeatherDetails {
	@JsonProperty("coord")
	private Coord coord;
	@JsonProperty("weather")
	private Weather[] weather;
	@JsonProperty("base")
	private String base;
	@JsonProperty("main")
	private Main main;
	@JsonProperty("visibility")
	private long visibility;
	@JsonProperty("wind")
	private Wind wind;
	@JsonProperty("clouds")
	private Clouds clouds;
	@JsonProperty("dt")
	private long dt;
	@JsonProperty("sys")
	private Sys sys;
	@JsonProperty("timezone")
	private long timezone;
	@JsonProperty("id")
	private long id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("cod")
	private int cod;

	// =======================================
	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public long getVisibility() {
		return visibility;
	}

	public void setVisibility(long visibility) {
		this.visibility = visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public long getDt() {
		return dt;
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public long getTimezone() {
		return timezone;
	}

	public void setTimezone(long timezone) {
		this.timezone = timezone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public Coord getCoord() {
		return coord;
	}

}
