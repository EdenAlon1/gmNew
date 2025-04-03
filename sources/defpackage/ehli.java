package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehli extends ehma {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final Property l = new ehlg(Float.class);
    private static final Property m = new ehlh(Float.class);
    public final ljm d;
    public final ehlc e;
    public int f;
    public float g;
    public float h;
    pbt i;
    private ObjectAnimator n;
    private ObjectAnimator o;

    public ehli(ehlo ehloVar) {
        super(1);
        this.f = 0;
        this.i = null;
        this.e = ehloVar;
        this.d = new ljm();
    }

    @Override // defpackage.ehma
    public final void a() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.ehma
    public final void b(pbt pbtVar) {
        this.i = pbtVar;
    }

    @Override // defpackage.ehma
    public final void c() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.j.isVisible()) {
            this.o.start();
        } else {
            a();
        }
    }

    @Override // defpackage.ehma
    public final void d() {
        if (this.n == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<ehli, Float>) l, 0.0f, 1.0f);
            this.n = ofFloat;
            ofFloat.setDuration((long) (this.e.l * 5400.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new ehle(this));
        }
        if (this.o == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<ehli, Float>) m, 0.0f, 1.0f);
            this.o = ofFloat2;
            ofFloat2.setDuration((long) (this.e.l * 333.0f));
            this.o.setInterpolator(this.d);
            this.o.addListener(new ehlf(this));
        }
        this.f = 0;
        ((ehlx) this.k.get(0)).c = this.e.c[0];
        this.h = 0.0f;
        this.n.start();
    }

    @Override // defpackage.ehma
    public final void e() {
        this.i = null;
    }
}
