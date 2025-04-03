package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehls extends ehlw {
    public static final /* synthetic */ int h = 0;
    private static final lej q = new ehlr();
    public final ehlz a;
    public final ehlx b;
    public float c;
    public ValueAnimator d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public TimeInterpolator g;
    private final lem r;
    private final lel s;
    private boolean t;
    private final ValueAnimator u;

    public ehls(Context context, final ehlc ehlcVar, ehlz ehlzVar) {
        super(context, ehlcVar);
        this.t = false;
        this.a = ehlzVar;
        ehlx ehlxVar = new ehlx();
        this.b = ehlxVar;
        ehlxVar.h = true;
        lem lemVar = new lem();
        this.r = lemVar;
        lemVar.c(1.0f);
        lemVar.e(50.0f);
        lel lelVar = new lel(this, q);
        this.s = lelVar;
        lelVar.r = lemVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.u = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ehlq
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ehlc ehlcVar2 = ehlcVar;
                if (!ehlcVar2.b(true) || ehlcVar2.k == 0) {
                    return;
                }
                ehls ehlsVar = ehls.this;
                if (ehlsVar.isVisible()) {
                    ehlsVar.invalidateSelf();
                }
            }
        });
        if (ehlcVar.b(true) && ehlcVar.k != 0) {
            valueAnimator.start();
        }
        i(1.0f);
    }

    public final float a(int i) {
        float f = i;
        return (f < 1000.0f || f > 9000.0f) ? 0.0f : 1.0f;
    }

    public final float b() {
        return this.b.b;
    }

    public final void c(float f) {
        this.b.e = f;
        invalidateSelf();
    }

    public final void d(float f) {
        this.b.b = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.p)) {
            canvas.save();
            this.a.h(canvas, getBounds(), f(), k(), j());
            this.b.f = g();
            this.n.setStyle(Paint.Style.FILL);
            this.n.setAntiAlias(true);
            ehlx ehlxVar = this.b;
            ehlc ehlcVar = this.j;
            ehlxVar.c = ehlcVar.c[0];
            int i = ehlcVar.g;
            if (i > 0) {
                if (!(this.a instanceof ehmc)) {
                    i = (int) ((i * kqp.a(b(), 0.0f, 0.01f)) / 0.01f);
                }
                this.a.f(canvas, this.n, b(), 1.0f, this.j.d, this.o, i);
            } else {
                this.a.f(canvas, this.n, 0.0f, 1.0f, ehlcVar.d, this.o, 0);
            }
            this.a.e(canvas, this.n, this.b, this.o);
            this.a.d(canvas, this.n, this.j.c[0], this.o);
            canvas.restore();
        }
    }

    @Override // defpackage.ehlw
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Context context = this.i;
        boolean e = super.e(z, z2, z3);
        float a = ehkw.a(context.getContentResolver());
        if (a == 0.0f) {
            this.t = true;
            return e;
        }
        this.t = false;
        this.r.e(50.0f / a);
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.ehlw, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.s.f();
        d(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        float f = i;
        if (!this.t) {
            this.s.d(b() * 10000.0f);
            this.s.e(f);
            return true;
        }
        float a = a(i);
        this.s.f();
        d(f / 10000.0f);
        c(a);
        return true;
    }
}
