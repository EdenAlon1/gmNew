package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnj implements dcr {
    final /* synthetic */ dbv a;
    final /* synthetic */ dcr b;
    final /* synthetic */ dcr c;
    final /* synthetic */ dcr d;

    public dnj(dbv dbvVar, dcr dcrVar, dcr dcrVar2, dcr dcrVar3) {
        this.a = dbvVar;
        this.b = dcrVar;
        this.c = dcrVar2;
        this.d = dcrVar3;
    }

    private final cyb f(cxx cxxVar, cxy cxyVar, cxx cxxVar2) {
        ffji b = this.a.b();
        float f = cxxVar.a;
        float f2 = cxyVar.a;
        float f3 = cxyVar.b;
        return (cyb) b.invoke(new dmb(f, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), cxxVar2.a));
    }

    private static final cxx g(dmb dmbVar) {
        return (cxx) ((dbw) dcp.a).a.invoke(Float.valueOf(dmbVar.c));
    }

    private static final cxy h(dmb dmbVar) {
        ffji ffjiVar = ((dbw) dcp.f).a;
        long j = dmbVar.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (cxy) ffjiVar.invoke(new iak((Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2))));
    }

    private static final cxx i(dmb dmbVar) {
        return (cxx) ((dbw) dcp.a).a.invoke(Float.valueOf(dmbVar.a));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [dcr, dcw] */
    @Override // defpackage.dcr
    public final long a(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        dmb dmbVar = (dmb) this.a.a().invoke(cybVar);
        dmb dmbVar2 = (dmb) this.a.a().invoke(cybVar2);
        dmb dmbVar3 = (dmb) this.a.a().invoke(cybVar3);
        i(dmbVar);
        i(dmbVar2);
        i(dmbVar3);
        return Math.max(dcv.a(this.b), Math.max(this.c.a(h(dmbVar), h(dmbVar2), h(dmbVar3)), this.d.a(g(dmbVar), g(dmbVar2), g(dmbVar3))));
    }

    @Override // defpackage.dcr
    public final /* synthetic */ cyb b(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return dcq.a(this, cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final cyb c(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        dmb dmbVar = (dmb) this.a.a().invoke(cybVar);
        dmb dmbVar2 = (dmb) this.a.a().invoke(cybVar2);
        dmb dmbVar3 = (dmb) this.a.a().invoke(cybVar3);
        return f((cxx) this.b.c(j, i(dmbVar), i(dmbVar2), i(dmbVar3)), (cxy) this.c.c(j, h(dmbVar), h(dmbVar2), h(dmbVar3)), (cxx) this.d.c(j, g(dmbVar), g(dmbVar2), g(dmbVar3)));
    }

    @Override // defpackage.dcr
    public final cyb d(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        dmb dmbVar = (dmb) this.a.a().invoke(cybVar);
        dmb dmbVar2 = (dmb) this.a.a().invoke(cybVar2);
        dmb dmbVar3 = (dmb) this.a.a().invoke(cybVar3);
        return f((cxx) this.b.d(j, i(dmbVar), i(dmbVar2), i(dmbVar3)), (cxy) this.c.d(j, h(dmbVar), h(dmbVar2), h(dmbVar3)), (cxx) this.d.d(j, g(dmbVar), g(dmbVar2), g(dmbVar3)));
    }

    @Override // defpackage.dcr
    public final /* synthetic */ boolean e() {
        return false;
    }
}
