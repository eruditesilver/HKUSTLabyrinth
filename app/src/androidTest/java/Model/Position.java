package Model;

/**
 * Created by Silver on 15/3/2016.
 */
public class Position {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incrementX(int value) {
        x += value;
    }

    public void incrementY(int value) {
        y += value;
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isNeighbor(Position position) {
        if ((Math.abs(x - position.getX()) == 1) && (y == position.getY()) || (Math.abs(y - position.getY()) == 1) && (x == position.getX())) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;

        Position position = (Position) o;

        if (x != position.x) return false;
        if (y != position.y) return false;

        return true;
    }
}
