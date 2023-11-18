package com.example.interface_market;

import android.os.SystemClock;
import android.view.View;

public class DoubleClickHandler implements View.OnClickListener {

    private static final long DOUBLE_CLICK_TIME_DELTA = 300; //milliseconds

    long lastClickTime = 0;
    private DoubleClickCallback callback;

    public interface DoubleClickCallback {
        void onDoubleClick();
    }

    public DoubleClickHandler(DoubleClickCallback callback) {
        this.callback = callback;
    }

    @Override
    public void onClick(View v) {
        long clickTime = SystemClock.elapsedRealtime();
        if (clickTime - lastClickTime < DOUBLE_CLICK_TIME_DELTA){
            callback.onDoubleClick();
        }
        lastClickTime = clickTime;
    }
}