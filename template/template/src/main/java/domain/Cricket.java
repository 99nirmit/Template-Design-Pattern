package domain;

public class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialzed: Lets Play");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Ended. Finished!!");
    }
}
