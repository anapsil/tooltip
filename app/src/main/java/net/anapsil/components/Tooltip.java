package net.anapsil.components;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import net.anapsil.components.tooltip.R;

public class Tooltip extends CardView {

    private TextView mTextTooltip;

    public Tooltip(Context context) {
        super(context);
        inflateLayout();
    }

    public Tooltip(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateLayout();
        hide();
    }

    public Tooltip(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateLayout();
        hide();
    }

    void inflateLayout() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.tooltip, this, true);
        mTextTooltip = (TextView) inflate.findViewById(R.id.text_content);
        setCardElevation(getResources().getDimensionPixelSize(R.dimen.tooltip_elevation));
    }

    public void setText(String text) {
        mTextTooltip.setText(text);
    }

    public void hide() {
        setVisibility(GONE);
    }

    public void show() {
        setVisibility(VISIBLE);
        setFocusableInTouchMode(true);
        requestFocus();
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        ViewCompat.offsetTopAndBottom(this, 0);
        ViewCompat.offsetLeftAndRight(this, 0);
    }

    @Override
    public void offsetTopAndBottom(int offset) {
        super.offsetTopAndBottom(offset + 70);
    }

//    @Override
//    public void offsetLeftAndRight(int offset) {
//        super.offsetLeftAndRight(offset + 24);
//    }
}
