package com.grow.plantillatabs.contrib.views;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class TextViewExoBold extends AppCompatTextView {
    public TextViewExoBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextViewExoBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewExoBold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Exo2_Bold.otf"));
        }
    }
}
