package lesson12;

import java.util.HashMap;
import java.util.Map;

public class MainCountry {
    public static void main(String[] args) {
        Map <Country, String> map = new HashMap<>();
        Country russian = new Country (7, "Russia");
        map.put(new Country(7, "Russia"), "Москва");

        System.out.println(map.get(new Country(7, "Russia")));
    }
}
