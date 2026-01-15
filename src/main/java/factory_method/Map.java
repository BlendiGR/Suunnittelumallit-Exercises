package factory_method;

public abstract class Map {

    public void display() {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 10; x++) {
                Tile tile = createTile();
                String tileChar = tile.getCharacter();
                System.out.print(tileChar + " ");
            }
            System.out.println();
        }
    }
    public abstract Tile createTile();
}