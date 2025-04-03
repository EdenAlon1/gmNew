package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqe implements dsqm {
    private final hho a;
    private final dsqs b;

    public dsqe() {
        this(null);
    }

    @Override // defpackage.dsqq
    public final /* synthetic */ int a(long j, iqk iqkVar) {
        iqkVar.getClass();
        return 0;
    }

    @Override // defpackage.dsqq
    public final /* synthetic */ int b(long j, iqk iqkVar) {
        iqkVar.getClass();
        return 0;
    }

    @Override // defpackage.dsqq
    public final hho c() {
        return this.a;
    }

    @Override // defpackage.dsqq
    public final dsqs d() {
        return this.b;
    }

    @Override // defpackage.dsqq
    public final /* synthetic */ List e(irg irgVar, dspo dspoVar, long j, dsqr dsqrVar) {
        return dsqc.a(this, irgVar, dspoVar, j, dsqrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsqe) && ffkj.e(this.a, ((dsqe) obj).a);
    }

    @Override // defpackage.dsqq
    public final /* synthetic */ void f(iqj iqjVar, long j, iqk iqkVar) {
        dsqc.b(this, iqjVar, j, iqkVar);
    }

    @Override // defpackage.dsqq
    public final boolean g() {
        return true;
    }

    @Override // defpackage.dsqq
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dsqq
    public final /* synthetic */ void i(dspo dspoVar, long j, dsqr dsqrVar, hfd hfdVar) {
        dsql.a(this, dspoVar, j, dsqrVar, hfdVar);
    }

    @Override // defpackage.dsqm
    public final /* bridge */ /* synthetic */ void j(Object obj, dspo dspoVar, hfd hfdVar) {
        dsph dsphVar = (dsph) obj;
        dsphVar.getClass();
        hfdVar.v(1029493469);
        dspoVar.b.e.f(dsphVar, hvi.e, dspoVar.a, hfdVar, 48);
        hfdVar.o();
    }

    @Override // defpackage.dsqm
    public final /* bridge */ /* synthetic */ Object k(dspo dspoVar, long j, dsqr dsqrVar, hfd hfdVar) {
        hfdVar.v(-9841081);
        hfdVar.v(-742849841);
        boolean D = hfdVar.D(dspoVar) | hfdVar.C(j);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            hho hhoVar = this.a;
            dsqrVar.a(dsqs.f);
            dsph dsphVar = new dsph(j, hhoVar, dsqrVar.a(dsqs.b), dsqrVar.a(dsqs.d), dsqrVar.b);
            hfdVar.y(dsphVar);
            f = dsphVar;
        }
        dsph dsphVar2 = (dsph) f;
        hfdVar.o();
        hfdVar.o();
        return dsphVar2;
    }

    public final String toString() {
        return "Content(coordinates=" + this.a + ")";
    }

    public /* synthetic */ dsqe(byte[] bArr) {
        this.a = new hic(null, hla.a);
        this.b = dsqs.c;
    }
}
