import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openwather.model.Weather;
import pl.sda.openwather.model.WeatherService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

//        try {
//            URL jsonURI = new URL("http://api.apixu.com/v1/current.json?key=a497df960ef548f3b4590439191002&q=Paris");
//            ObjectMapper objectMapper = new ObjectMapper();
//            Weather weather = objectMapper.readValue(jsonURI, Weather.class);
//            System.out.println(weather);
//        }catch (MalformedURLException use){
//            use.printStackTrace();
//        } catch (JsonParseException e) {
//            e.printStackTrace();
//        } catch (JsonMappingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json", "?key=a497df960ef548f3b4590439191002&q=");
        String weather = weatherService.getCityWeather("Rypin");
        System.out.println(weather);

    }

}
