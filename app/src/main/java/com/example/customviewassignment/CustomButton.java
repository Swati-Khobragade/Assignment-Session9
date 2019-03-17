package com.example.customviewassignment;
/**
 * @author Swati.Khobragade
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;

public class CustomButton extends android.support.v7.widget.AppCompatButton {
    private Paint paint;

    /**
     * @param context
     */
    public CustomButton(Context context) {
        super(context);
        initViews();
    }

    /**
     * @param context
     * @param attrs
     */
    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initViews();
    }

    /**
     * Initialize the Views
     */
    private void initViews() {
        paint=new Paint();
        StringBuilder stringBuilder = new StringBuilder(this.getText());
        StringBuilder reverseText = stringBuilder.reverse();
        Log.d("reverseText**", "" + reverseText);
        setText(reverseText);
        setTextColor(Color.WHITE);
    }

}
