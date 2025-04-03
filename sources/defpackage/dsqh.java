package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqh implements dsqm {
    private final hho a;
    private final dsqs b;

    public dsqh() {
        this(null);
    }

    @Override // defpackage.dsqq
    public final /* synthetic */ int a(long j, iqk iqkVar) {
        iqkVar.getClass();
        return 0;
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
        return (obj instanceof dsqh) && ffkj.e(this.a, ((dsqh) obj).a);
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
        dspk dspkVar = (dspk) obj;
        dspkVar.getClass();
        hfdVar.v(1263573331);
        cru.b(!((Boolean) dspkVar.a.a()).booleanValue(), null, dspkVar.b, dspkVar.c, null, hpx.d(-93943765, new dsqg(dspoVar, dspkVar), hfdVar), hfdVar, 196608, 18);
        hfdVar.o();
    }

    @Override // defpackage.dsqm
    public final /* bridge */ /* synthetic */ Object k(dspo dspoVar, long j, dsqr dsqrVar, hfd hfdVar) {
        hfdVar.v(324561715);
        hfdVar.v(-2097398659);
        boolean D = hfdVar.D(dspoVar) | hfdVar.C(j);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            dsqrVar.a(dsqs.c);
            dsqrVar.a(dsqs.f);
            f = new dspk(j, dsqrVar.b);
            hfdVar.y(f);
        }
        dspk dspkVar = (dspk) f;
        hfdVar.o();
        hfdVar.o();
        return dspkVar;
    }

    public final String toString() {
        return "Footer(coordinates=" + this.a + ")";
    }

    public /* synthetic */ dsqh(byte[] bArr) {
        this.a = new hic(null, hla.a);
        this.b = dsqs.d;
    }
}
