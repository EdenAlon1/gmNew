package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.os.Build;
import android.util.AndroidRuntimeException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lel extends lei {
    public lem r;
    private float s;
    private boolean t;

    public lel(lek lekVar) {
        super(lekVar);
        this.r = null;
        this.s = Float.MAX_VALUE;
        this.t = false;
    }

    @Override // defpackage.lei
    public final boolean c(long j) {
        float f;
        if (this.t) {
            float f2 = this.s;
            if (f2 != Float.MAX_VALUE) {
                this.r.d(f2);
                this.s = Float.MAX_VALUE;
            }
            this.h = this.r.a();
            this.g = 0.0f;
            this.t = false;
            return true;
        }
        if (this.s != Float.MAX_VALUE) {
            long j2 = j / 2;
            leg b = this.r.b(this.h, this.g, j2);
            this.r.d(this.s);
            this.s = Float.MAX_VALUE;
            leg b2 = this.r.b(b.a, b.b, j2);
            f = b2.a;
            this.h = f;
            this.g = b2.b;
        } else {
            leg b3 = this.r.b(this.h, this.g, j);
            f = b3.a;
            this.h = f;
            this.g = b3.b;
        }
        float max = Math.max(f, this.n);
        this.h = max;
        this.h = Math.min(max, this.m);
        float f3 = this.g;
        lem lemVar = this.r;
        if (Math.abs(f3) >= lemVar.d || Math.abs(r1 - lemVar.a()) >= lemVar.c) {
            return false;
        }
        this.h = this.r.a();
        this.g = 0.0f;
        return true;
    }

    public final void e(float f) {
        float durationScale;
        if (this.l) {
            this.s = f;
            return;
        }
        if (this.r == null) {
            this.r = new lem(f);
        }
        this.r.d(f);
        lem lemVar = this.r;
        if (lemVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double a = lemVar.a();
        if (a > this.m) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (a < this.n) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.o * 0.75f);
        lemVar.c = abs;
        lemVar.d = abs * 62.5d;
        if (!ldy.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.l) {
            return;
        }
        this.l = true;
        if (!this.i) {
            this.h = this.k.a(this.j);
        }
        float f2 = this.h;
        if (f2 > this.m || f2 < this.n) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ldy a2 = ldy.a();
        if (a2.b.size() == 0) {
            a2.h.a(a2.d);
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                a2.g = durationScale;
                if (a2.i == null) {
                    a2.i = new ldv(a2);
                }
                final ldv ldvVar = a2.i;
                if (ldvVar.a == null) {
                    ldvVar.a = new ValueAnimator$DurationScaleChangeListener() { // from class: ldu
                        public final void onChanged(float f3) {
                            ldv.this.b.g = f3;
                        }
                    };
                    ValueAnimator.registerDurationScaleChangeListener(ldvVar.a);
                }
            }
        }
        if (a2.b.contains(this)) {
            return;
        }
        a2.b.add(this);
    }

    public final void f() {
        if (this.r.b <= eobe.a) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!ldy.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.l) {
            this.t = true;
        }
    }

    public lel(Object obj, lej lejVar) {
        super(obj, lejVar);
        this.r = null;
        this.s = Float.MAX_VALUE;
        this.t = false;
    }
}
