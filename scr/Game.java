public class Game {
    private boolean isWon;
    private boolean isLost;

    public void startGame() {
        isWon = false;
        isLost = false;
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

    public boolean generateBoard() {
        return false;
    }

    public boolean checkGameStats() {
        return false;
    }
}
