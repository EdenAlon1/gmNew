package com.google.android.libraries.user.profile.photopicker.art.edit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import defpackage.kps;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ColorSwatchView extends View {
    private final Paint a;
    private int b;

    public ColorSwatchView(Context context) {
        this(context, null);
    }

    public final void a(float f, float f2, float f3) {
        this.b = kps.c(new float[]{f, f2, f3});
        this.a.setColorFilter(null);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        this.a.setColor(this.b);
        canvas.drawCircle(width / 2.0f, height / 2.0f, (getWidth() - getPaddingLeft()) / 2.0f, this.a);
    }

    public ColorSwatchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint(1);
        this.b = kps.c(new float[]{0.0f, 1.0f, 0.5f});
    }
}
