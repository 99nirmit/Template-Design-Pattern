package domain;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("FootBall Game initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game is started. Starting PLaying..");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game is ended,Stop playing");
    }
}
