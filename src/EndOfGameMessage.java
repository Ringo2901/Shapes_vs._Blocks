public class EndOfGameMessage extends PlayerMessage{
    int scope;
    EndOfGameMessage(String message, int scope) {
        super(message);
        this.scope=scope;
    }

    @Override
    void showMessage() {

    }
}
