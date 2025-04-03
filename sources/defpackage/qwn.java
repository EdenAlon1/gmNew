package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwn implements qwv {
    public final boolean a;
    private final qwv b;
    private final qwm c;
    private final qtp d;
    private int e;
    private boolean f;

    public qwn(qwv qwvVar, boolean z, qtp qtpVar, qwm qwmVar) {
        rkf.f(qwvVar);
        this.b = qwvVar;
        this.a = z;
        this.d = qtpVar;
        rkf.f(qwmVar);
        this.c = qwmVar;
    }

    @Override // defpackage.qwv
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.qwv
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.qwv
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.e++;
    }

    @Override // defpackage.qwv
    public final synchronized void e() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f = true;
        this.b.e();
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.e;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.e = i;
        }
        if (i == 0) {
            qwm qwmVar = this.c;
            qtp qtpVar = this.d;
            qwe qweVar = (qwe) qwmVar;
            qweVar.h.d(qtpVar);
            if (this.a) {
                qweVar.c.d(qtpVar, this);
            } else {
                qweVar.e.a(this, false);
            }
        }
    }

    public final synchronized String toString() {
        qwv qwvVar;
        qtp qtpVar;
        qwvVar = this.b;
        qtpVar = this.d;
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.c.toString() + ", key=" + String.valueOf(qtpVar) + ", acquired=" + this.e + ", isRecycled=" + this.f + ", resource=" + qwvVar.toString() + "}";
    }
}
