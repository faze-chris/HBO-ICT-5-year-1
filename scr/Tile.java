public class Tile {
    private String background;

    public Tile(String background) {
        this.background = background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBackground() {
        return this.background;
    }

    public void getNeighbor(String direction) {

    }

    public void setNeighbor(String direction) {
    }

    public boolean isEmpty() {
        System.out.println("Empty");
        return false;
    }
}