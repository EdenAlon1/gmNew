package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class edr implements ejg {
    public final edp a;
    public final edi b;
    public final elp c;
    private final eey d;

    public edr(eey eeyVar, edp edpVar, edi ediVar, elp elpVar) {
        this.d = eeyVar;
        this.a = edpVar;
        this.b = ediVar;
        this.c = elpVar;
    }

    @Override // defpackage.ejg
    public final int a(Object obj) {
        return this.c.a(obj);
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
        Object b = this.c.b(i);
        return b == null ? this.a.e(i) : b;
    }

    @Override // defpackage.ejg
    public final void e(int i, Object obj, hfd hfdVar) {
        hfdVar.v(-462424778);
        ekc.a(obj, i, this.d.m, hpx.d(-824725566, new edq(this, i), hfdVar), hfdVar, 3072);
        hfdVar.o();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof edr) {
            return ffkj.e(this.a, ((edr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
