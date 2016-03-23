package Model;

import java.util.ArrayList;

/**
 * Created by Silver on 15/3/2016.
 */
public class Path {
    private ArrayList<Position> pointList;
    private int size;

    public Path(int level) {
        this.size = levelToStep(level);
        pointList = new ArrayList<>();
        generatePath();
    }

    private void generatePath() {
        //TODO: generate a path with bonus position
    }

    public int getTotalStep() {
        return pointList.size();
    }

    public int getRemainStep(Position position) {
        int indexOfPosition = pointList.indexOf(position);
        if (indexOfPosition == -1) {
            return -1;
        }
        return pointList.size() - indexOfPosition - 1;
    }

    public Position getNextPosition(Position position){
        if (pointList.contains(position) && !position.equals(getEndPosition())) {
            return pointList.get(pointList.indexOf(position) + 1);
        }
        return null;
    }

    public int getCurrentStep(Position position) {
        return pointList.indexOf(position);
    }

    private boolean addStep(Position position) {
        if (pointList.size() == size) {
            return false;
        } else if (pointList.contains(position)) {
            return false;
        } else if (!pointList.get(pointList.size() - 1).isNeighbor(position)) {
            return false;
        } else {
            pointList.add(position);
        }
        return true;
    }

    public Position getStartPosition() {
        return pointList.get(0);
    }

    public Position getEndPosition() {
        return pointList.get(size - 1);
    }

    private int levelToStep(int level) {
        return GameConFig.STEP_TO_CLEAR[level];
    }


}
