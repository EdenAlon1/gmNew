package com.google.research.ink.libs.buttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import defpackage.ehdr;
import defpackage.facb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class WidthSelectionButton extends Button {
    private final float a;
    private final float b;
    private final int c;
    private final Paint d;
    private final Paint e;

    public WidthSelectionButton(Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.drawCircle(width, height, this.a / 2.0f, this.d);
        if (isActivated()) {
            canvas.drawCircle(width, height, this.b, this.e);
        }
    }

    @Override // android.view.View
    public final void setActivated(boolean z) {
        invalidate();
        super.setActivated(z);
    }

    public WidthSelectionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WidthSelectionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, facb.c, 0, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 1);
        obtainStyledAttributes.recycle();
        int c = ehdr.c(context, R.attr.colorOnSurface, -16777216);
        this.c = c;
        paint.setColor(c);
        paint.setStyle(Paint.Style.FILL);
        paint2.setColor(c);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDimension(R.dimen.ink_select_stroke));
        this.b = getResources().getDimension(R.dimen.ink_select_radius);
    }
}
