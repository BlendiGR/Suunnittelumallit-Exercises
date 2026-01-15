package factory.method;

public class CityMap extends Map {
    @Override
    public Tile createTile() {
        int randomNum = (int)(Math.random() * 3);
        return switch (randomNum) {
            case 0 -> new BuildingTile();
            case 1 -> new RoadTile();
            default -> new ForestTile();
        };
    }

}
