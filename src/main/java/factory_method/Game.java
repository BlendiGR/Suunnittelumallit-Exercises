package factory_method;

public class Game {
    public static void main(String args[]) {
        Map map = createMap("wilderness");
        map.display();
    }

    public static Map createMap(String type) {
        if (type.equalsIgnoreCase("city")) {
            return new CityMap();
        } else if (type.equalsIgnoreCase("wilderness")) {
            return new WildernessMap();
        }
        return null;
    }
}