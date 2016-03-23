package Model;

/**
 * Created by Silver on 15/3/2016.
 */
public class Player {
    private Position currentPosition;

    public void moveTo(Position position){
        currentPosition = position;
    }

    public void move(int x, int y){
        currentPosition.incrementX(x);
        currentPosition.incrementY(y);
    }

    public Player(Position initPosition){
        currentPosition = initPosition;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
