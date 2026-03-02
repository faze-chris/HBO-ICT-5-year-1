public class Settings {
    private String difficulty;
    private String theme;
    private int boardWidth;
    private int boardHeight;
    private int boxPercentage;
    private int rockPercentage;
    private int followerSpeed;

    public Settings(String difficulty, String theme, int boardWidth, int boardHeight, int boxPercentage, int rockPercentage, int followerSpeed) {
        this.difficulty = difficulty;
        this.theme = theme;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.boxPercentage = boxPercentage;
        this.rockPercentage = rockPercentage;
        this.followerSpeed = followerSpeed;

    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return this.theme;
    }

    public int getBoardWidth() {
        return this.boardWidth;
    }

    public void setBoardWidth(int boardWidth) {
        this.boardWidth = boardWidth;
    }

    public int getBoardHeight() {
        return this.boardHeight;
    }

    public void setBoardHeight(int boardHeight) {
        this.boardHeight = boardHeight;
    }

    public int getBoxPercentage() {
        return this.boxPercentage;
    }

    public void setBoxPercentage(int boxPercentage) {
        this.boxPercentage = boxPercentage;
    }

    public int getRockPercentage() {
        return this.rockPercentage;
    }

    public void setRockPercentage(int rockPercentage) {
        this.rockPercentage = rockPercentage;
    }

    public int getFollowerSpeed() {
        return this.followerSpeed;
    }

    public void setRockFollowerSpeed(int followerSpeed) {
        this.followerSpeed = followerSpeed;
    }


    public void applySettings() {
        System.out.println("apply settings");
    }
}
