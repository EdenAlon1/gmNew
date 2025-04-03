package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class feij extends fein {
    private boolean a;
    private boolean b;
    private Runnable c;
    private boolean d;
    public final fevo j;
    public feju k;
    public fdyv l;
    public volatile boolean m;
    public boolean n;

    protected feij(int i, fevo fevoVar, fevw fevwVar) {
        super(i, fevoVar, fevwVar);
        this.l = fdyv.b;
        this.b = false;
        this.j = fevoVar;
    }

    @Override // defpackage.fein
    protected final /* synthetic */ fevr g() {
        return this.k;
    }

    public final void h(Status status, fejt fejtVar, febo feboVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.j.m();
        fevw fevwVar = this.q;
        if (status.f()) {
            fevwVar.d++;
        } else {
            fevwVar.e++;
        }
        this.k.a(status, fejtVar, feboVar);
    }

    @Override // defpackage.feqs
    public void i(boolean z) {
        emxf.m(this.n, "status should have been reported on deframer closed");
        this.b = true;
        if (this.d && z) {
            j(Status.o.withDescription("Encountered end-of-stream mid-frame"), true, new febo());
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
            this.c = null;
        }
    }

    public final void j(Status status, boolean z, febo feboVar) {
        k(status, fejt.PROCESSED, z, feboVar);
    }

    public final void k(Status status, fejt fejtVar, boolean z, febo feboVar) {
        status.getClass();
        feboVar.getClass();
        if (this.n) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.n = true;
        this.d = status.f();
        synchronized (this.p) {
            this.t = true;
        }
        if (this.b) {
            this.c = null;
            h(status, fejtVar, feboVar);
            return;
        }
        this.c = new feii(this, status, fejtVar, feboVar);
        if (z) {
            this.o.close();
            return;
        }
        feqv feqvVar = (feqv) this.o;
        if (feqvVar.b()) {
            return;
        }
        if (feqvVar.c()) {
            feqvVar.close();
        } else {
            feqvVar.f = true;
        }
    }
}
