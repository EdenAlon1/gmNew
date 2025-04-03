package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nff implements ncr {
    public final long a;
    private final ncr b;

    public nff(long j, ncr ncrVar) {
        this.a = j;
        this.b = ncrVar;
    }

    @Override // defpackage.ncr
    public final ndu p(int i, int i2) {
        return this.b.p(i, i2);
    }

    @Override // defpackage.ncr
    public final void r() {
        this.b.r();
    }

    @Override // defpackage.ncr
    public final void w(ndn ndnVar) {
        this.b.w(new nfe(this, ndnVar, ndnVar));
    }
}
