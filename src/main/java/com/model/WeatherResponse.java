package com.model;

import java.util.List;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WeatherResponse {
	
	private String name;

	private Sys sys;
	private List<Weather> weather;
	private Main main;
	private Wind wind;
	
	@Data
	@FieldDefaults(level = AccessLevel.PRIVATE)
	public static class Sys{
		private String country;
	}
	
	@Data
	@FieldDefaults(level = AccessLevel.PRIVATE)
	public static class Weather{
		
		private int id;
		private String description;
	}
	
	@Data
	@FieldDefaults(level = AccessLevel.PRIVATE)
	public static class Main{
		private double temp;
		private int humidity;
	}
	
	@Data
	@FieldDefaults(level = AccessLevel.PRIVATE)
	public static class Wind{
		private double speed;
	}
}
