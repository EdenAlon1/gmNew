package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqk implements dsqm {
    private final hho a;
    private final dsqs b;

    public dsqk() {
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
        return (obj instanceof dsqk) && ffkj.e(this.a, ((dsqk) obj).a);
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
        return this.a.hashCode();
    }

    @Override // defpackage.dsqq
    public final /* synthetic */ void i(dspo dspoVar, long j, dsqr dsqrVar, hfd hfdVar) {
        dsql.a(this, dspoVar, j, dsqrVar, hfdVar);
    }

    @Override // defpackage.dsqm
    public final /* bridge */ /* synthetic */ void j(Object obj, dspo dspoVar, hfd hfdVar) {
        dspm dspmVar = (dspm) obj;
        dspmVar.getClass();
        hfdVar.v(-928677613);
        cru.b(!((Boolean) dspmVar.b.a()).booleanValue(), null, dspmVar.c, dspmVar.d, null, hpx.d(2008772587, new dsqi(dspoVar, dspmVar), hfdVar), hfdVar, 196608, 18);
        hfdVar.o();
    }

    @Override // defpackage.dsqm
    public final /* bridge */ /* synthetic */ Object k(dspo dspoVar, long j, dsqr dsqrVar, hfd hfdVar) {
        hfdVar.v(1145151895);
        hfdVar.v(999734991);
        boolean D = hfdVar.D(dspoVar) | hfdVar.C(j);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            dsqrVar.a(dsqs.c);
            dsqrVar.a(dsqs.f);
            f = new dspm(j, dsqrVar.b, new dsqj(dspoVar.c));
            hfdVar.y(f);
        }
        dspm dspmVar = (dspm) f;
        hfdVar.o();
        hfdVar.o();
        return dspmVar;
    }

    public final String toString() {
        return "Header(coordinates=" + this.a + ")";
    }

    public /* synthetic */ dsqk(byte[] bArr) {
        this.a = new hic(null, hla.a);
        this.b = dsqs.b;
    }
}
