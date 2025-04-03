package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqo implements dsqq {
    private final hho a;
    private final god b;
    private final dsqs c = dsqs.g;

    public dsqo(hho hhoVar, god godVar) {
        this.a = hhoVar;
        this.b = godVar;
    }

    @Override // defpackage.dsqq
    public final int a(long j, iqk iqkVar) {
        iqkVar.getClass();
        return (jzk.b(j) - iqkVar.a) / 2;
    }

    @Override // defpackage.dsqq
    public final int b(long j, iqk iqkVar) {
        iqkVar.getClass();
        return jzk.a(j) - iqkVar.b;
    }

    @Override // defpackage.dsqq
    public final hho c() {
        return this.a;
    }

    @Override // defpackage.dsqq
    public final dsqs d() {
        return this.c;
    }

    @Override // defpackage.dsqq
    public final /* synthetic */ List e(irg irgVar, dspo dspoVar, long j, dsqr dsqrVar) {
        return dsqc.a(this, irgVar, dspoVar, j, dsqrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsqo)) {
            return false;
        }
        dsqo dsqoVar = (dsqo) obj;
        return ffkj.e(this.a, dsqoVar.a) && ffkj.e(this.b, dsqoVar.b);
    }

    @Override // defpackage.dsqq
    public final /* synthetic */ void f(iqj iqjVar, long j, iqk iqkVar) {
        dsqc.b(this, iqjVar, j, iqkVar);
    }

    @Override // defpackage.dsqq
    public final boolean g() {
        return false;
    }

    @Override // defpackage.dsqq
    public final /* synthetic */ boolean h() {
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.dsqq
    public final void i(dspo dspoVar, long j, dsqr dsqrVar, hfd hfdVar) {
        hfdVar.v(-372377022);
        dspoVar.b.h.a(ecm.b(hvi.e, ecv.f(hfdVar)), this.b, hfdVar, 0);
        hfdVar.o();
    }

    public final String toString() {
        return "Snackbar(coordinates=" + this.a + ", snackbarHostState=" + this.b + ")";
    }
}
