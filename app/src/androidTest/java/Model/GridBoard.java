package Model;

/**
 * Created by Silver on 15/3/2016.
 */
public class GridBoard {
    private int column;
    private int row;
    private int level;
    private Path correctPath;
    private Path walkedPath;
    private Player player;

    public GridBoard(int column, int row, int level) {
        this.column = column;
        this.row = row;
        this.level = level;
        correctPath = new Path(level);
        walkedPath = new Path(column * row);
        init();
    }

    public final Path getCorrectPath() {
        return correctPath;
    }

    public Path getWalkedPath() {
        return walkedPath;
    }

    public boolean playerMove(Movement movement) {
        switch (movement) {
            case UP:
                if (!outOfBound(0, -1))
                    player.move(Movement.UP);
                break;
            case DOWN:
                if (!outOfBound(0, 1))
                    player.move(Movement.DOWN);
                break;
            case LEFT:
                if (!outOfBound(-1, 0))
                    player.move(Movement.LEFT);
                break;
            case RIGHT:
                if (!outOfBound(1, 0))
                    player.move(Movement.RIGHT);
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

    private void init() {
        generateCorrectPath();
        player = new Player(correctPath.getStartPosition());
    }

    private void generateCorrectPath() {
        //TODO: generate the answer path depends on the column and row
        int requiredStep = GameConFig.STEP_TO_CLEAR[level];
    }
}
