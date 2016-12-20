package net.anapsil.components;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import net.anapsil.components.tooltip.R;

public class Tooltip extends CardView {

    public Tooltip(Context context) {
        super(context);
        inflateLayout();
    }

    public Tooltip(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateLayout();
    }

    public Tooltip(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateLayout();
    }

    void inflateLayout() {
        LayoutInflater.from(getContext()).inflate(R.layout.tooltip, this, true);
        setCardElevation(getResources().getDimensionPixelSize(R.dimen.tooltip_elevation));
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        ViewCompat.offsetTopAndBottom(this, 0);
        ViewCompat.offsetLeftAndRight(this, 0);
    }

    @Override
    public void offsetTopAndBottom(int offset) {
        super.offsetTopAndBottom(offset + 120);
    }

//    @Override
//    public void offsetLeftAndRight(int offset) {
//        super.offsetLeftAndRight(offset + 24);
//    }
}
