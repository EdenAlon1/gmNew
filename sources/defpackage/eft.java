package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eft implements ejg {
    public final efr a;
    public final elp b;
    private final ehh c;

    public eft(ehh ehhVar, efr efrVar, elp elpVar) {
        this.c = ehhVar;
        this.a = efrVar;
        this.b = elpVar;
    }

    @Override // defpackage.ejg
    public final int a(Object obj) {
        return this.b.a(obj);
    }

    @Override // defpackage.ejg
    public final int b() {
        return this.a.c();
    }

    @Override // defpackage.ejg
    public final Object c(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.ejg
    public final Object d(int i) {
        Object b = this.b.b(i);
        return b == null ? this.a.e(i) : b;
    }

    @Override // defpackage.ejg
    public final void e(int i, Object obj, hfd hfdVar) {
        hfdVar.v(1493551140);
        ekc.a(obj, i, this.c.m, hpx.d(726189336, new efs(this, i), hfdVar), hfdVar, 3072);
        hfdVar.o();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eft) {
            return ffkj.e(this.a, ((eft) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
