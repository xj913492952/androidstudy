package com.style.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.aigestudio.wheelpicker.WheelPicker;
import com.style.base.BaseDialog;
import com.style.framework.R;

import java.util.List;

/**
 * 单条列表选择对话框
 *
 * @author ywl
 */
public abstract class BaseSingleWheelDialog extends BaseDialog {
    private TextView btnSure;
    private WheelPicker wheelCenter;
    private List<String> dataList;
    private OnSureClickListener listener;
    private String currentItem;

    public BaseSingleWheelDialog(Context context, List<String> list) {
        super(context, R.style.Dialog_General);
        dataList = list;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_single_wheel_dialog);
        Window window = getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setLayout(getScreenWidth(), ViewGroup.LayoutParams.WRAP_CONTENT);
        window.setWindowAnimations(R.style.Animations_SlideInFromBottom_OutToBottom);
        window.setGravity(Gravity.BOTTOM);
        initView();
    }

    protected void initView() {
        wheelCenter = findViewById(R.id.main_wheel_center);
        wheelCenter.setItemTextColor(0xffcccccc);
        wheelCenter.setSelectedItemTextColor(0xff666666);
        wheelCenter.setIndicator(true);
        wheelCenter.setIndicatorSize((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1, getContext().getResources().getDisplayMetrics()));
        wheelCenter.setIndicatorColor(0xFFe3e3e3);
        wheelCenter.setItemTextSize((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 21, getContext().getResources().getDisplayMetrics()));
        wheelCenter.setCurved(false);
        wheelCenter.setCyclic(false);
        wheelCenter.setVisibleItemCount(5);
        wheelCenter.setAtmospheric(true);

        wheelCenter.setData(dataList);
        wheelCenter.setOnWheelChangeListener(new WheelPicker.OnWheelChangeListener() {
            @Override
            public void onWheelScrolled(int offset) {

            }

            @Override
            public void onWheelSelected(int position) {
                currentItem = (String) wheelCenter.getData().get(position);
            }

            @Override
            public void onWheelScrollStateChanged(int state) {

            }
        });

        btnSure = (TextView) findViewById(R.id.btn_ok);
        btnSure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(currentItem);
                }
                dismiss();
            }
        });
    }

    public void setCurrentItem(String str) {
        int currentIndex = 0;
        if (!TextUtils.isEmpty(str) && dataList.indexOf(str) != -1)
            currentIndex = dataList.indexOf(str);
        //该方法不会触发onWheelSelected，所以需要手动设置当前选择数据
        wheelCenter.setSelectedItemPosition(currentIndex);
        currentItem = dataList.get(currentIndex);
    }

    public void setOnSureClickListener(OnSureClickListener listener) {
        this.listener = listener;
    }

    public interface OnSureClickListener {
        void onClick(String value);
    }

    public void setList(List<String> list) {
        this.dataList = list;
    }
}