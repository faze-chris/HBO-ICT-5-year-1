import java.util.HashMap;

public class Tile {
    private String background;

    private GameElement element;

    private HashMap<String, Tile> neighbors;

    public Tile(String background) {
        this.background = background;
        this.neighbors = new HashMap<>();
    }

    public Tile getNeighbor(String direction) {
        return this.neighbors.get(direction);
    }

    public void setNeighbor(String direction, Tile neighbor) {
        this.neighbors.put(direction, neighbor);
    }

    public boolean isEmpty() {
        return this.element == null;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBackground() {
        return this.background;
    }

    public void setElement(GameElement element) {
        this.element = element;
    }

    public GameElement getElement() {
        return this.element;
    }
}