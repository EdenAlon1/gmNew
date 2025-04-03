package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ens implements ejg {
    public final eik a;
    public final eoc b = eoc.a;
    private final eot c;
    private final elp d;

    public ens(eot eotVar, eik eikVar, elp elpVar) {
        this.c = eotVar;
        this.a = eikVar;
        this.d = elpVar;
    }

    @Override // defpackage.ejg
    public final int a(Object obj) {
        return this.d.a(obj);
    }

    @Override // defpackage.ejg
    public final int b() {
        return this.a.c();
    }

    @Override // defpackage.ejg
    public final /* synthetic */ Object c(int i) {
        return null;
    }

    @Override // defpackage.ejg
    public final Object d(int i) {
        Object b = this.d.b(i);
        return b == null ? this.a.e(i) : b;
    }

    @Override // defpackage.ejg
    public final void e(int i, Object obj, hfd hfdVar) {
        hfdVar.v(-1201380429);
        ekc.a(obj, i, this.c.v, hpx.d(1142237095, new enr(this, i), hfdVar), hfdVar, 3072);
        hfdVar.o();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ens) {
            return ffkj.e(this.a, ((ens) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
