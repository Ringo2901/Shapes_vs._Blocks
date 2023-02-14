public abstract class PlayerMessage {
    private String message;
    PlayerMessage (String message)
    {
        this.message=message;
    }
    abstract void showMessage();
}
