package c.ardv.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import static android.content.ContentValues.TAG;

public class customView extends View {

    public customView(Context context) {
        super(context);
    }

    public customView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public customView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public customView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        canvas.drawCircle(100, 200, 140, paint);

        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        canvas.drawCircle(100, 200, 60, paint);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            // только нажали
            event.getX(100);
            event.getY(100);
            return true;
        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            // подвинули
            return true;
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            // убрали
            event.getX(100);
            event.getY(100);
            return true;
        } else return super.onTouchEvent(event);

    }


}
