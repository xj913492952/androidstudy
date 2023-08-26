package example.gesture;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.Scroller;

import com.dmcbig.mediapicker.utils.ScreenUtils;

/**
 * 垂直滑动销毁activity的根容器，用于子view有viewpager的时候，操作体验更好
 * Created by xiajun on 2018/8/1.
 * 注意：如果用在activity销毁时，主题窗口背景设置半透明，去掉activity退出动画
 */

public class VerticalSlideFinishActivityView extends RelativeLayout {

    protected final String TAG = getClass().getSimpleName();
    private int screenHeight;
    private ViewConfiguration viewConfiguration;
    private float xDown;
    private float yDown;
    private float xMove;
    private float yMove;
    private boolean isStartSlide;
    private float yDistance;
    private float yLastMove;
    private ValueAnimator va;
    private OnSlideListener listener;

    public VerticalSlideFinishActivityView(Context context) {
        super(context);
    }

    public VerticalSlideFinishActivityView(Context context, AttributeSet attrs) {
        super(context, attrs);
        viewConfiguration = ViewConfiguration.get(context);
        screenHeight = ScreenUtils.getScreenHeight(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG, "onInterceptTouchEvent   " + ev.getAction());
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                isStartSlide = false;
                xDown = ev.getRawX();
                yDown = ev.getRawY();
                break;
            case MotionEvent.ACTION_MOVE:
                if (!isStartSlide) {
                    xMove = ev.getRawX();
                    yMove = ev.getRawY();
                    float xDistance = Math.abs(xMove - xDown);
                    float yDistance = Math.abs(yMove - yDown);
                    //当横向滑动超过指定值并且横向滑动距离大于竖向滑动距离时，拦截move、up事件，触发ViewGroup横向滑动逻辑
                    if (Math.abs(yMove - yDown) > viewConfiguration.getScaledTouchSlop() && yDistance > xDistance) {
                        isStartSlide = true;
                        Log.e(TAG, "start move");
                        yLastMove = yMove;
                        return true;
                    }
                } else {//处理当前容器滑动逻辑
                    return true;
                }
                break;
            //ACTION_MOVE被当前view或者子view消耗了这里就收不到ACTION_UP事件
            case MotionEvent.ACTION_UP:
                break;

        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.e(TAG, "onTouchEvent   " + ev.getAction());
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                xMove = ev.getRawX();
                yMove = ev.getRawY();

                //xDistance = xMove - xLastMove;
                yDistance = yMove - yLastMove;
                //Log.e(TAG, "xDistance  " + xDistance);
                Log.e(TAG, "yDistance  " + yDistance);
                setTranslationY(yDistance);
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "stop move");
                autoTranslationY();
                break;

        }
        return true;
        //return super.onTouchEvent(ev);
    }

    private void autoTranslationY() {
        float xOffset = getTranslationX();
        if (xOffset >= screenHeight / 2)
            va = ValueAnimator.ofFloat(xOffset, screenHeight);
        if (xOffset > 0 && xOffset < screenHeight / 2)
            va = ValueAnimator.ofFloat(xOffset, 0f);

        va.setDuration(300);
        //插值器，表示值变化的规律，默认均匀变化
        va.setInterpolator(new DecelerateInterpolator());
        va.addUpdateListener(animation -> {
            float v = (float) animation.getAnimatedValue();
            Log.d(TAG, "translationY:" + v);
            setTranslationX(v);
            if (v >= screenHeight)
                onViewSlideToScreen();
        });
        va.start();
    }

    private void onViewSlideToScreen() {
        if (listener != null)
            listener.onShouldFinish();
    }

    public void setOnSlideListener(OnSlideListener listener) {
        this.listener = listener;
    }

    public interface OnSlideListener {
        void onShouldFinish();
    }

}
