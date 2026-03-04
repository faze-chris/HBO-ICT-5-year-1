public class Game {
    private boolean isWon;
    private boolean isLost;

    private Settings settings;

    public Game(boolean isWon, boolean isLost) {
        this.isWon = isWon;
        this.isLost = isLost;
    }

    public boolean startGame() {
        isWon = false;
        isLost = false;
        return true;
    }

    public int generateBoard() {
        return 0;
    }

    public boolean checkGameState() {
        return false;
    }

    public void setWon(boolean isWon) {
        this.isWon = isWon;
    }

    public boolean isWon() {
        return this.isWon;
    }

    public void setLost(boolean isLost) {
        this.isLost = isLost;
    }

    public boolean getIsLost() {
        return this.isLost;
    }
}
