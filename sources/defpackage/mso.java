package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mso implements mve {
    public final engw a;
    private final mve b;

    public mso(mve mveVar, List list) {
        this.b = mveVar;
        this.a = engw.n(list);
    }

    @Override // defpackage.mve
    public final long d() {
        return this.b.d();
    }

    @Override // defpackage.mve
    public final long e() {
        return this.b.e();
    }

    @Override // defpackage.mve
    public final void l(long j) {
        this.b.l(j);
    }

    @Override // defpackage.mve
    public final boolean n(mhc mhcVar) {
        return this.b.n(mhcVar);
    }

    @Override // defpackage.mve
    public final boolean o() {
        return this.b.o();
    }
}
