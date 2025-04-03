package com.google.android.libraries.onegoogle.common;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import defpackage.ebnu;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CirclePulseDrawable extends Drawable implements Drawable.Callback {
    public final Drawable a;
    public int b;
    private final RectF c;
    private final ebnu d;
    private final ebnu e;
    private final int f;
    private final int g;

    public CirclePulseDrawable(Drawable drawable, int i, int i2) {
        this.a = drawable;
        RectF rectF = new RectF(drawable.getBounds());
        this.c = rectF;
        this.b = (int) rectF.width();
        drawable.setCallback(this);
        this.d = new ebnu(i);
        this.f = Color.alpha(i);
        this.e = new ebnu(i2);
        this.g = Color.alpha(i2);
    }

    private final void b(ebnu ebnuVar, int i) {
        ebnuVar.c = i;
        c(ebnuVar, this.c);
        this.a.invalidateSelf();
    }

    private static void c(ebnu ebnuVar, RectF rectF) {
        float f = ebnuVar.c;
        RectF rectF2 = new RectF(rectF.left - f, rectF.top - f, rectF.right + f, rectF.bottom + f);
        ebnuVar.b.reset();
        ebnuVar.b.addOval(rectF2, Path.Direction.CW);
        ebnuVar.b.addOval(rectF, Path.Direction.CCW);
    }

    public final void a() {
        Rect bounds = getBounds();
        int width = getBounds().width() - this.b;
        int height = getBounds().height() - this.b;
        int i = width / 2;
        int i2 = height / 2;
        this.a.setBounds(bounds.left + i, bounds.top + i2, bounds.right - i, bounds.bottom - i2);
        this.c.set(this.a.getBounds());
        c(this.d, this.c);
        c(this.e, this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
        ebnu ebnuVar = this.d;
        canvas.drawPath(ebnuVar.b, ebnuVar.a);
        ebnu ebnuVar2 = this.e;
        canvas.drawPath(ebnuVar2.b, ebnuVar2.a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.getAlpha();
    }

    public int getFirstPulseSize() {
        return this.d.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public int getSecondPulseSize() {
        return this.e.c;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.d.a.setAlpha((this.f * i) / PrivateKeyType.INVALID);
        this.e.a.setAlpha((this.g * i) / PrivateKeyType.INVALID);
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void setFirstPulseSize(int i) {
        b(this.d, i);
    }

    public void setSecondPulseSize(int i) {
        b(this.e, i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
