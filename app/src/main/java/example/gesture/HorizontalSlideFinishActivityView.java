package example.gesture;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.Scroller;

import com.dmcbig.mediapicker.utils.ScreenUtils;

import javax.xml.xpath.XPath;

/**
 * 右滑销毁activity的根容器，用于子view有scrollView的时候，操作体验更便捷
 * Created by xiajun on 2018/8/1.
 * 注意：如果用在activity销毁时，主题窗口背景设置半透明，去掉activity退出动画
 */

public class HorizontalSlideFinishActivityView extends RelativeLayout {
    //静止状态
    private static final int SLIDE_STATE_IDLE = 0;
    //第一个move事件为左滑
    private static final int SLIDE_STATE_LEFT_FIRST = 1;
    //第一个move事件为右滑
    private static final int SLIDE_STATE_RIGHT_FIRST = 2;
    //跟随触摸移动
    private static final int SLIDE_STATE_MOVE_WITH_TOUCH = 3;
    //自动向左完成移动
    private static final int SLIDE_STATE_AUTO_TO_LEFT = 4;
    //自动向右完成移动
    private static final int SLIDE_STATE_AUTO_TO_TIGHT = 5;
    private int currentSlideState = SLIDE_STATE_IDLE;

    protected final String TAG = getClass().getSimpleName();
    private Scroller scroller;
    //最大偏移，正值代表向右，负值代表向左
    private int xMaxOffset;
    private ViewConfiguration viewConfiguration;
    private float xDown;
    private float yDown;
    private float xDistance;
    private float yDistance;
    private float xLastMove;
    private ValueAnimator va;
    private OnSlideListener listener;

    public HorizontalSlideFinishActivityView(Context context) {
        super(context);
    }

    public HorizontalSlideFinishActivityView(Context context, AttributeSet attrs) {
        super(context, attrs);
        viewConfiguration = ViewConfiguration.get(context);
        xMaxOffset = ScreenUtils.getScreenWidth(context);
        scroller = new Scroller(context);
    }

    /**
     * 如果子view没有拦截down事件(比如设置了点击事件这里也能收到move事件)，这里便收不到move事件，
     *
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG, "onInterceptTouchEvent   " + ev.getAction());
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                currentSlideState = SLIDE_STATE_IDLE;
                xDown = ev.getRawX();
                yDown = ev.getRawY();
                break;
            case MotionEvent.ACTION_MOVE:
                if (currentSlideState == SLIDE_STATE_MOVE_WITH_TOUCH) {
                    return true;
                }
                float xMove = ev.getRawX();
                float yMove = ev.getRawY();
                float xDistance = Math.abs(xMove - xDown);
                float yDistance = Math.abs(yMove - yDown);
                //一旦向左滑便认为不触发滑动行为。
                if (currentSlideState == SLIDE_STATE_IDLE) {
                    if (xMove < xDown) {
                        currentSlideState = SLIDE_STATE_LEFT_FIRST;
                    }
                    if (xMove > xDown) {
                        currentSlideState = SLIDE_STATE_RIGHT_FIRST;
                    }
                }
                if (currentSlideState == SLIDE_STATE_RIGHT_FIRST) {
                    //当横向滑动超过指定值并且横向滑动距离大于竖向滑动距离时，拦截move、up事件，触发ViewGroup横向滑动逻辑
                    if (xMove - xDown > viewConfiguration.getScaledTouchSlop() && xDistance > yDistance) {
                        currentSlideState = SLIDE_STATE_MOVE_WITH_TOUCH;
                        Log.e(TAG, "start move");
                        xLastMove = xMove;
                        return true;
                    }
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
                if (currentSlideState == SLIDE_STATE_MOVE_WITH_TOUCH) {
                    float xMove = ev.getRawX();
                    float translationX = xMove - xLastMove;
                    //yDistance = Math.abs(yMove - yDown);
                    Log.e(TAG, "translationX  " + translationX);
                    //Log.e(TAG, "yDistance  " + yDistance);
                    //move的x不能小于开始移动的x；不然就会向左滑出屏幕
                    if (xMove >= xLastMove) {
                        setTranslationX(translationX);
                        //xLastMove = xMove;
                    }
                }
                break;
            case MotionEvent.ACTION_UP:
                if (currentSlideState == SLIDE_STATE_MOVE_WITH_TOUCH) {
                    Log.e(TAG, "stop move");
                    autoTranslationX();
                    return true;
                }
                break;
        }
        return super.onTouchEvent(ev);
    }

    private void autoTranslationX() {
        float xOffset = getTranslationX();
        if (xOffset >= xMaxOffset / 2)
            va = ValueAnimator.ofFloat(xOffset, xMaxOffset);
        if (xOffset > 0 && xOffset < xMaxOffset / 2)
            va = ValueAnimator.ofFloat(xOffset, 0f);

        va.setDuration(300);
        //插值器，表示值变化的规律，默认均匀变化
        va.setInterpolator(new DecelerateInterpolator());
        va.addUpdateListener(animation -> {
            float v = (float) animation.getAnimatedValue();
            Log.d(TAG, "translationY:" + v);
            setTranslationX(v);
            if (v >= xMaxOffset)
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


    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
    }
/*
    @Override
    public void computeScroll() {
        Log.e(TAG, "computeScroll getCurrX  " + scroller.getCurrX());
        //super.computeScroll();
        //为true代表滚动数值还在变化
        if (currentSlideState == SLIDE_STATE_AUTO_TO_LEFT) {
            if (scroller.computeScrollOffset())
                scrollTo(scroller.getCurrX(), 0);
            //postInvalidate();//重绘
            //invalidate();
        }
        if (currentSlideState == SLIDE_STATE_AUTO_TO_TIGHT) {
            if (scroller.computeScrollOffset())
                scrollTo(scroller.getCurrX(), 0);
            ///invalidate();
        }
    }


    private void autoScroll() {
        Log.e(TAG, "autoScroll getScrollX " + getScrollX() + " xMove " + xMove);

        //自动向右滚动,
        if (getScrollX() <= -screenWidth / 2) {
            currentSlideState = SLIDE_STATE_AUTO_TO_TIGHT;

            scroller.startScroll(getScrollX(), 0, -screenWidth - getScrollX(), 0, 1000);
            invalidate();
        } else if (getScrollX() <= 0 && getScrollX() > -screenWidth / 2) {
            //自动向左滚动
            currentSlideState = SLIDE_STATE_AUTO_TO_LEFT;
            //startX 表示起点在水平方向到原点的距离，正值向左滑，负值向右滑。
            //scroller.getCurrX() = mStartX + Math.round(x * dx);  x等于从0逐渐增大到1.
            scroller.startScroll(getScrollX(), 0, -getScrollX(), 0, 1000);
            invalidate();
        }
    }

    private void moveLayout(float xDistance) {
        if (xDistance > 0)
            scrollTo((int) -xDistance, 0);
    }
    */
}
