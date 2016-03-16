package Model;

/**
 * Created by Silver on 15/3/2016.
 */
public class Player {
    private Position currentPosition;

    public void moveTo(Position position){
        currentPosition = position;
    }

    public void move(Movement movement){
        switch (movement){
            case UP:
                currentPosition.incrementY(-1);
                break;
            case DOWN:
                currentPosition.incrementY(1);
                break;
            case LEFT:
                currentPosition.incrementX(-1);
                break;
            case RIGHT:
                currentPosition.incrementX(1);
                break;
        }
    }

    public Player(Position initPosition){
        currentPosition = initPosition;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
