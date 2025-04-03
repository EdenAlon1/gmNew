package defpackage;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qlq extends qlm implements Choreographer.FrameCallback {
    public qci j;
    public float c = 1.0f;
    private boolean m = false;
    public long d = 0;
    public float e = 0.0f;
    public float f = 0.0f;
    public int g = 0;
    public float h = -2.14748365E9f;
    public float i = 2.14748365E9f;
    public boolean k = false;
    public boolean l = false;

    public final float c() {
        qci qciVar = this.j;
        if (qciVar == null) {
            return 0.0f;
        }
        float f = this.f;
        float f2 = qciVar.j;
        return (f - f2) / (qciVar.k - f2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(m());
        h();
    }

    public final float d() {
        qci qciVar = this.j;
        if (qciVar == null) {
            return 0.0f;
        }
        float f = this.i;
        return f == 2.14748365E9f ? qciVar.k : f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        g();
        qci qciVar = this.j;
        if (qciVar == null || !this.k) {
            return;
        }
        long j2 = this.d;
        long j3 = j2 != 0 ? j - j2 : 0L;
        float abs = (1.0E9f / qciVar.l) / Math.abs(this.c);
        float f = this.e;
        float f2 = j3 / abs;
        if (m()) {
            f2 = -f2;
        }
        float f3 = f + f2;
        float e = e();
        float d = d();
        PointF pointF = qlr.a;
        boolean z = f3 >= e && f3 <= d;
        float f4 = this.e;
        float a = qlr.a(f3, e(), d());
        this.e = a;
        if (this.l) {
            a = (float) Math.floor(a);
        }
        this.f = a;
        this.d = j;
        if (!this.l || this.e != f4) {
            b();
        }
        if (!z) {
            if (getRepeatCount() == -1 || this.g < getRepeatCount()) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.g++;
                if (getRepeatMode() == 2) {
                    this.m = !this.m;
                    j();
                } else {
                    float d2 = m() ? d() : e();
                    this.e = d2;
                    this.f = d2;
                }
                this.d = j;
            } else {
                float e2 = this.c < 0.0f ? e() : d();
                this.e = e2;
                this.f = e2;
                h();
                a(m());
            }
        }
        if (this.j != null) {
            float f5 = this.f;
            float f6 = this.h;
            if (f5 < f6 || f5 > this.i) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f6), Float.valueOf(this.i), Float.valueOf(this.f)));
            }
        }
        qby.a();
    }

    public final float e() {
        qci qciVar = this.j;
        if (qciVar == null) {
            return 0.0f;
        }
        float f = this.h;
        return f == -2.14748365E9f ? qciVar.j : f;
    }

    public final void f() {
        h();
        a(m());
    }

    public final void g() {
        if (this.k) {
            i(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f;
        float e;
        if (this.j == null) {
            return 0.0f;
        }
        if (m()) {
            f = d();
            e = this.f;
        } else {
            f = this.f;
            e = e();
        }
        return (f - e) / (d() - e());
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(c());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        qci qciVar = this.j;
        if (qciVar == null) {
            return 0L;
        }
        return (long) qciVar.a();
    }

    public final void h() {
        i(true);
    }

    protected final void i(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.k = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.k;
    }

    public final void j() {
        this.c = -this.c;
    }

    public final void k(float f) {
        if (this.e == f) {
            return;
        }
        float a = qlr.a(f, e(), d());
        this.e = a;
        if (this.l) {
            a = (float) Math.floor(a);
        }
        this.f = a;
        this.d = 0L;
        b();
    }

    public final void l(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        qci qciVar = this.j;
        float f3 = qciVar == null ? -3.4028235E38f : qciVar.j;
        float f4 = qciVar == null ? Float.MAX_VALUE : qciVar.k;
        float a = qlr.a(f, f3, f4);
        float a2 = qlr.a(f2, f3, f4);
        if (a == this.h && a2 == this.i) {
            return;
        }
        this.h = a;
        this.i = a2;
        k((int) qlr.a(this.f, a, a2));
    }

    public final boolean m() {
        return this.c < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.m) {
            return;
        }
        this.m = false;
        j();
    }
}
