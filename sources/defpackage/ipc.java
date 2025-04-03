package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipc implements ioc {
    private final iuw a;

    public ipc(iuw iuwVar) {
        this.a = iuwVar;
    }

    private final long b() {
        iuw a = ipd.a(this.a);
        return iak.e(u(a.n, 0L), a().u(a.g, 0L));
    }

    public final iwi a() {
        return this.a.g;
    }

    @Override // defpackage.ioc
    public final void ej(float[] fArr) {
        a().ej(fArr);
    }

    @Override // defpackage.ioc
    public final long g() {
        iuw iuwVar = this.a;
        return (iuwVar.a << 32) | (iuwVar.b & 4294967295L);
    }

    @Override // defpackage.ioc
    public final long h(ioc iocVar, long j) {
        return u(iocVar, j);
    }

    @Override // defpackage.ioc
    public final long i(long j) {
        return a().i(iak.f(j, b()));
    }

    @Override // defpackage.ioc
    public final long j(long j) {
        return a().j(iak.f(0L, b()));
    }

    @Override // defpackage.ioc
    public final long k(long j) {
        return a().k(iak.f(j, b()));
    }

    @Override // defpackage.ioc
    public final long l(long j) {
        return iak.f(a().l(j), b());
    }

    @Override // defpackage.ioc
    public final long m(long j) {
        return iak.f(a().m(j), b());
    }

    @Override // defpackage.ioc
    public final iam n(ioc iocVar, boolean z) {
        return a().n(iocVar, z);
    }

    @Override // defpackage.ioc
    public final ioc o() {
        iuw C;
        if (!t()) {
            imn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        iwi iwiVar = a().v;
        if (iwiVar == null || (C = iwiVar.C()) == null) {
            return null;
        }
        return C.n;
    }

    @Override // defpackage.ioc
    public final ioc p() {
        iuw C;
        if (!t()) {
            imn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        iwi iwiVar = a().r.z().v;
        if (iwiVar == null || (C = iwiVar.C()) == null) {
            return null;
        }
        return C.n;
    }

    @Override // defpackage.ioc
    public final void r(ioc iocVar, float[] fArr) {
        a().r(iocVar, fArr);
    }

    @Override // defpackage.ioc
    public final boolean t() {
        return a().t();
    }

    @Override // defpackage.ioc
    public final long u(ioc iocVar, long j) {
        if (!(iocVar instanceof ipc)) {
            iuw a = ipd.a(this.a);
            long u = u(a.n, j);
            long j2 = a.h;
            int a2 = kaa.a(j2);
            int b = kaa.b(j2);
            long e = iak.e(u, (4294967295L & Float.floatToRawIntBits(b)) | (Float.floatToRawIntBits(a2) << 32));
            ioc o = a.g.o();
            if (o == null) {
                o = a.g;
            }
            return iak.f(e, o.u(iocVar, 0L));
        }
        iuw iuwVar = ((ipc) iocVar).a;
        iuwVar.g.aj();
        iuw C = a().ab(iuwVar.g).C();
        if (C != null) {
            long c = kaa.c(kaa.d(iuwVar.D(C), kab.c(j)), this.a.D(C));
            return (Float.floatToRawIntBits(kaa.b(c)) & 4294967295L) | (Float.floatToRawIntBits(kaa.a(c)) << 32);
        }
        iuw a3 = ipd.a(iuwVar);
        long d = kaa.d(kaa.d(iuwVar.D(a3), a3.h), kab.c(j));
        iuw iuwVar2 = this.a;
        iuw a4 = ipd.a(iuwVar2);
        long c2 = kaa.c(d, kaa.d(iuwVar2.D(a4), a4.h));
        long floatToRawIntBits = Float.floatToRawIntBits(kaa.a(c2));
        long floatToRawIntBits2 = Float.floatToRawIntBits(kaa.b(c2)) & 4294967295L;
        iwi iwiVar = a4.g.v;
        iwiVar.getClass();
        iwi iwiVar2 = a3.g.v;
        iwiVar2.getClass();
        return iwiVar.u(iwiVar2, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }
}
