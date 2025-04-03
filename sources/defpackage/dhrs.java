package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhrs implements dhrr {
    private final Object a = new Object();
    private final int b;
    private final dhrm c;
    private int d;
    private int e;
    private int f;
    private Exception g;
    private boolean h;

    public dhrs(int i, dhrm dhrmVar) {
        this.b = i;
        this.c = dhrmVar;
    }

    private final void b() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g == null) {
                if (this.h) {
                    this.c.x();
                    return;
                } else {
                    this.c.v(null);
                    return;
                }
            }
            this.c.u(new ExecutionException(this.e + " out of " + this.b + " underlying tasks failed", this.g));
        }
    }

    @Override // defpackage.dhqp
    public final void a() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            b();
        }
    }

    @Override // defpackage.dhqv
    public final void d(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            b();
        }
    }

    @Override // defpackage.dhqy
    public final void e(Object obj) {
        synchronized (this.a) {
            this.d++;
            b();
        }
    }
}
