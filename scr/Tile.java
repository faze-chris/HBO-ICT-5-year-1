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

    public String getNeighbor() {
//        return this.getNeighbor() = getNeighbor();
        return this.background;
    }

    public void setNeighbor() {
//        this.setNeighbor() = setNeighbor();
    }

    public void isEmpty() {
        System.out.println("Empty");
    }
}