package com.google.android.apps.messaging.ui.ditto;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.cuxh;
import defpackage.dbrr;
import defpackage.dbta;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class QrScannerOverlayView extends dbrr {
    public cuxh a;
    private final RectF b;
    private final Paint c;
    private int d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final int h;

    public QrScannerOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new RectF();
        Paint paint = new Paint();
        this.c = paint;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbta.a);
        this.d = obtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelOffset(R.dimen.qr_code_scanning_area_size));
        this.e = obtainStyledAttributes.getDimensionPixelSize(3, resources.getDimensionPixelOffset(R.dimen.qr_code_scanning_area_corner_radius));
        this.f = obtainStyledAttributes.getBoolean(0, false);
        this.g = obtainStyledAttributes.getBoolean(1, false);
        this.h = obtainStyledAttributes.getInt(4, 1);
        obtainStyledAttributes.recycle();
        paint.setColor(context.getColor(android.R.color.transparent));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private final boolean c() {
        return this.h == 4;
    }

    private final boolean d() {
        if (this.h == 3) {
            return true;
        }
        if (this.a.d() || this.h != 6) {
            return this.a.d() && this.h == 5;
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + this.d;
        int paddingStart = getPaddingStart() + getPaddingEnd() + this.d;
        if (paddingStart != width || paddingBottom != height) {
            if (paddingBottom > height) {
                this.d = Math.max(0, (height - getPaddingBottom()) - getPaddingTop());
            }
            if (paddingStart > width) {
                this.d = Math.max(0, (width - getPaddingStart()) - getPaddingEnd());
            }
        }
        int paddingLeft = true != this.f ? 0 : (((width - getPaddingLeft()) - getPaddingRight()) - this.d) / 2;
        int paddingTop = true == this.g ? (((height - getPaddingTop()) - getPaddingBottom()) - this.d) / 2 : 0;
        this.b.set(d() ? (width - getPaddingLeft()) - this.d : getPaddingLeft() + paddingLeft, c() ? (height - getPaddingBottom()) - this.d : getPaddingTop() + paddingTop, d() ? width - getPaddingRight() : getPaddingLeft() + paddingLeft + this.d, c() ? height - getPaddingBottom() : getPaddingTop() + paddingTop + this.d);
        RectF rectF = this.b;
        float f = this.e;
        canvas.drawRoundRect(rectF, f, f, this.c);
    }
}
