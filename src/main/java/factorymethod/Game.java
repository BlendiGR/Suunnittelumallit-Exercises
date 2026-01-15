package factorymethod;

public class Game {
    public static void main(String args[]) {
        Map map = createMap("city");
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