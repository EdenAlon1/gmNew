package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsph implements dspe {
    public final hho a;
    private final long b;
    private final hho c;
    private final hkx d;
    private final hkx e;

    public dsph(long j, hho hhoVar, hkx hkxVar, hkx hkxVar2, hho hhoVar2) {
        this.b = j;
        this.a = hhoVar;
        this.c = hhoVar2;
        this.d = hkxVar;
        this.e = hkxVar2;
    }

    @Override // defpackage.dspc
    public final long a() {
        return this.b;
    }

    @Override // defpackage.dspj
    public final dspn b() {
        return (dspn) this.e.a();
    }

    @Override // defpackage.dspl
    public final /* synthetic */ hvi c(hvi hviVar, hfd hfdVar) {
        hviVar.getClass();
        hfdVar.v(681801301);
        jzn jznVar = (jzn) hfdVar.e(jdr.e);
        dspn dspnVar = (dspn) this.d.a();
        hvi j = eba.j(hviVar, 0.0f, jznVar.ek(dspnVar != null ? (int) (dspnVar.a & 4294967295L) : 0), 0.0f, 0.0f, 13);
        ((hfm) hfdVar).Z();
        return j;
    }

    @Override // defpackage.dspj
    public final /* synthetic */ hvi d(hvi hviVar, hfd hfdVar) {
        return dspi.a(this, hviVar, hfdVar);
    }

    @Override // defpackage.dspe
    public final hvi e(hvi hviVar, boolean z) {
        hviVar.getClass();
        hvi a = ipx.a(hviVar, new ffji() { // from class: dspg
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ioc iocVar = (ioc) obj;
                iocVar.getClass();
                long g = iocVar.g();
                long a2 = iod.a(iocVar);
                dsph.this.a.b(new dspn(g, (Math.round(Float.intBitsToFloat((int) (a2 >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (a2 & 4294967295L))))));
                return ffcu.a;
            }
        });
        if (!z) {
            return a;
        }
        hve hveVar = hvi.e;
        hveVar.getClass();
        return a.a(dfb.d(hveVar, false, null, new ffix() { // from class: dspf
            @Override // defpackage.ffix
            public final Object invoke() {
                dsph.this.g();
                return ffcu.a;
            }
        }, 7));
    }

    @Override // defpackage.dspe
    public final void f() {
        this.c.b(true);
    }

    @Override // defpackage.dspe
    public final void g() {
        this.c.b(Boolean.valueOf(!h()));
    }

    @Override // defpackage.dspe
    public final boolean h() {
        return ((Boolean) this.c.a()).booleanValue();
    }
}
