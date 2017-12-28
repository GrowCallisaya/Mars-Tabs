package com.grow.plantillatabs.contrib.views;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class TextViewExoThin extends AppCompatTextView {
    public TextViewExoThin(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextViewExoThin(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewExoThin(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Exo2_Thin.otf"));
        }
    }
}
