package com.weather.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Clouds {
	@JsonProperty("all")
	private String all;

}
