package Model;

/**
 * Created by Silver on 15/3/2016.
 */
public class GridBoard {
    private int column;
    private int row;
    private int level;
    private Path correctPath;
    private Player player;

    public final int getColumn() {
        return column;
    }

    public final int getRow() {
        return row;
    }

    public final Player getPlayer() {
        return player;

    }

    public GridBoard(int level) {
        this.column = GameConFig.COLUMN[level - 1];
        this.row = GameConFig.ROW[level - 1];
        this.level = level;
        correctPath = new Path(level);
        player = new Player(correctPath.getStartPosition());

    }

    public final Path getCorrectPath() {
        return correctPath;
    }

    public boolean playerMove(Movement movement) {
        switch (movement) {
            case UP:
                if (!outOfBound(0, -1))
                    player.move(0,-1);
                break;
            case DOWN:
                if (!outOfBound(0, 1))
                    player.move(0, 1);
                break;
            case LEFT:
                if (!outOfBound(-1, 0))
                    player.move(-1, 0);
                break;
            case RIGHT:
                if (!outOfBound(1, 0))
                    player.move(1, 0);
                break;
        }
        return false;
    }

    public boolean goal(){
        if (player.getCurrentPosition().equals(correctPath.getEndPosition())){
            return true;
        }
        return false;
    }

    private boolean outOfBound(int moveX, int moveY) {
        //TODO: check movement may lead to out of bound
        return false;
    }
}
