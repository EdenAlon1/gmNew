package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zge implements ffjp {
    final /* synthetic */ dspe a;
    final /* synthetic */ boolean b;
    final /* synthetic */ zgv c;

    public zge(dspe dspeVar, boolean z, zgv zgvVar) {
        this.a = dspeVar;
        this.b = z;
        this.c = zgvVar;
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        kgc kgcVar = (kgc) obj;
        kfr kfrVar = (kfr) obj2;
        int intValue = ((Number) obj3).intValue();
        hfd hfdVar = (hfd) obj4;
        int intValue2 = ((Number) obj5).intValue();
        kgcVar.getClass();
        kfrVar.getClass();
        if ((intValue2 & 6) == 0) {
            i = (true != ((intValue2 & 8) == 0 ? hfdVar.D(kgcVar) : hfdVar.F(kgcVar)) ? 2 : 4) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= true != hfdVar.D(kfrVar) ? 16 : 32;
        }
        if ((intValue2 & 384) == 0) {
            i |= true != hfdVar.B(intValue) ? 128 : 256;
        }
        if ((i & 1171) == 1170 && hfdVar.I()) {
            hfdVar.s();
        } else if (!this.a.h() && !this.b) {
            zfj zfjVar = (zfj) Map.EL.getOrDefault(this.c.a, Integer.valueOf(intValue), null);
            if (zfjVar != null) {
                zka.a(kgcVar, kfrVar, zfjVar, hfdVar, (i & 14) | 8 | (i & 112));
            }
        }
        return ffcu.a;
    }
}
