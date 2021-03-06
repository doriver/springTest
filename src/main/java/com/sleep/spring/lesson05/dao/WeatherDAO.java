package com.sleep.spring.lesson05.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sleep.spring.lesson05.model.Weather;

@Repository
public interface WeatherDAO {
	public List<Weather> selectWeather();
	
	public int insertWeather(
			@Param("weather") String weather
			, @Param("temperatures") double temperatures
			, @Param("precipitation") double precipitation
			, @Param("microDust") String microDust
			, @Param("windSpeed") double windSpeed);
}
