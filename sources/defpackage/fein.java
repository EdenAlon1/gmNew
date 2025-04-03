package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fein implements feiq, feqs {
    private boolean D;
    private final int E;
    public fekl o;
    public final Object p = new Object();
    public final fevw q;
    public final feqv r;
    public int s;
    public boolean t;

    protected fein(int i, fevo fevoVar, fevw fevwVar) {
        this.q = fevwVar;
        feqv feqvVar = new feqv(this, fdxw.a, i, fevoVar, fevwVar);
        this.r = feqvVar;
        this.o = feqvVar;
        this.E = 32768;
    }

    private final void c() {
        boolean n;
        synchronized (this.p) {
            n = n();
            if (!n && feio.t.isLoggable(Level.FINEST)) {
                feio.t.logp(Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.D), Integer.valueOf(this.s), Integer.valueOf(this.E), Boolean.valueOf(this.t)});
            }
        }
        if (n) {
            g().e();
        }
    }

    protected void d() {
        emxf.l(g() != null);
        synchronized (this.p) {
            emxf.m(!this.D, "Already allocated");
            this.D = true;
        }
        c();
    }

    protected abstract fevr g();

    @Override // defpackage.feqs
    public final void l(fevq fevqVar) {
        g().d(fevqVar);
    }

    public final void m(int i) {
        boolean z;
        synchronized (this.p) {
            emxf.m(this.D, "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.s;
            int i3 = this.E;
            int i4 = i2 - i;
            this.s = i4;
            z = false;
            if (i2 >= i3 && i4 < i3) {
                z = true;
            }
        }
        if (z) {
            c();
        }
    }

    public final boolean n() {
        boolean z;
        synchronized (this.p) {
            z = false;
            if (this.D && this.s < this.E && !this.t) {
                z = true;
            }
        }
        return z;
    }
}
