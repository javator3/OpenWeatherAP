package pl.sda.openwather.model;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherService {

    private String finalURL;
    private String apiKey;

    public WeatherService(String finalURL, String apiKey) {
        this.finalURL = finalURL;
        this.apiKey = apiKey;
    }

    public void pobierzJson(){
        try {
            URL jsonURL = new URL(finalURL);
            ObjectMapper objectMapper = new ObjectMapper();
            Weather weather = objectMapper.readValue(jsonURL, Weather.class);
            System.out.println(weather);
        }catch (MalformedURLException use){
            use.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCityWeather(String city){
        String finalCity = finalURL + apiKey + city;
        return finalCity;
    }


}
