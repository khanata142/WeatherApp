package com.weather.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Main {
	@JsonProperty("temp")
	private double temp;
	@JsonProperty("feels_like")
	private String feels_like;
	@JsonProperty("temp_min")
	private double temp_min;
	@JsonProperty("temp_max")
	private double temp_max;
	@JsonProperty("pressure")
	private int pressure;
	@JsonProperty("humidity")
	private int humidity;
	@JsonProperty("sea_level")
	private int sea_level;
	@JsonProperty("grnd_level")
	private int grnd_level;

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public String getFeels_like() {
		return feels_like;
	}

	public void setFeels_like(String feels_like) {
		this.feels_like = feels_like;
	}

	public double getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}

	public double getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getSea_level() {
		return sea_level;
	}

	public void setSea_level(int sea_level) {
		this.sea_level = sea_level;
	}

	public int getGrnd_level() {
		return grnd_level;
	}

	public void setGrnd_level(int grnd_level) {
		this.grnd_level = grnd_level;
	}

}
