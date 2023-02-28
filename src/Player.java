public class Player{
    PlayerStatistic playerStatistic;
    String name;
    PlatformCollection platformCollection;
    BallCollection ballCollection;

    public BallCollection getBallCollection() {
        return ballCollection;
    }

    public void setBallCollection(BallCollection ballCollection) {
        this.ballCollection = ballCollection;
    }

    public PlatformCollection getPlatformCollection() {
        return platformCollection;
    }

    public void setPlatformCollection(PlatformCollection platformCollection) {
        this.platformCollection = platformCollection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerStatistic getPlayerStatistic() {
        return playerStatistic;
    }

    public void setPlayerStatistic(PlayerStatistic playerStatistic) {
        this.playerStatistic = playerStatistic;
    }

}
