package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqf implements dsqm {
    private final hho a;
    private final dsqs b;

    public dsqf() {
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
        return (obj instanceof dsqf) && ffkj.e(this.a, ((dsqf) obj).a);
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
        dspd dspdVar = (dspd) obj;
        dspdVar.getClass();
        hfdVar.v(305794259);
        dspoVar.b.f.f(dspdVar, hvi.e, dspoVar.a, hfdVar, 48);
        hfdVar.o();
    }

    @Override // defpackage.dsqm
    public final /* bridge */ /* synthetic */ Object k(dspo dspoVar, long j, dsqr dsqrVar, hfd hfdVar) {
        hfdVar.v(-997794261);
        hfdVar.v(650162150);
        boolean D = hfdVar.D(dspoVar) | hfdVar.C(j);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            dsqrVar.a(dsqs.c);
            dsqrVar.a(dsqs.b);
            f = new dspd(j, dsqrVar.a(dsqs.d));
            hfdVar.y(f);
        }
        dspd dspdVar = (dspd) f;
        hfdVar.o();
        hfdVar.o();
        return dspdVar;
    }

    public final String toString() {
        return "ContentOverlay(coordinates=" + this.a + ")";
    }

    public /* synthetic */ dsqf(byte[] bArr) {
        this.a = new hic(null, hla.a);
        this.b = dsqs.e;
    }
}
