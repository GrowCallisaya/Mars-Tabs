package com.grow.plantillatabs.contrib.views;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class TextViewExoRegular extends AppCompatTextView {
    public TextViewExoRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextViewExoRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewExoRegular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Exo2_Regular.otf"));
        }
    }
}
