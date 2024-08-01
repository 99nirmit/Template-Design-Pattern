package domain;

public class NotifierDecorator implements Notifier{

    protected Notifier decoratorNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.decoratorNotifier = notifier;
    }

    @Override
    public void send(String message) {
        decoratorNotifier.send(message);
    }
}
