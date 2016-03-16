package Controller;


import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by Silver on 13/3/2016.
 */
public class DirectionGestureRecognizer extends GestureDetector.SimpleOnGestureListener {
    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_MAX_OFF_PATH = 250;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private GestureListener listener;
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                           float velocityY) {
        if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH) {
            return false;
        }
        // right to left swipe
        if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE
                && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
            listener.onLeftSwipe();
        }
        // left to right swipe
        else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE
                && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
            listener.onRightSwipe();
        }
        // up to down swipe
        else if (e2.getY() - e1.getY() > SWIPE_MIN_DISTANCE
                && Math.abs(velocityY) > SWIPE_THRESHOLD_VELOCITY) {
            listener.onDownSwipe();
        }
        // down to up swipe
        else if (e1.getY() - e2.getY() > SWIPE_MIN_DISTANCE
                && Math.abs(velocityY) > SWIPE_THRESHOLD_VELOCITY) {
            listener.onUpSwipe();
        }
        return false;
    }

    public void setListener(GestureListener listener){
        this.listener = listener;
    }

}

