package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgl implements ffjp {
    final /* synthetic */ zgm a;

    public zgl(zgm zgmVar) {
        this.a = zgmVar;
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dspd dspdVar = (dspd) obj;
        hvi hviVar = (hvi) obj2;
        zgv zgvVar = (zgv) obj3;
        hfd hfdVar = (hfd) obj4;
        int intValue = ((Number) obj5).intValue();
        dspdVar.getClass();
        hviVar.getClass();
        zgvVar.getClass();
        fgcm fgcmVar = this.a.a;
        if (fgcmVar == null) {
            ffkj.c("currentPage");
            fgcmVar = null;
        }
        zfj zfjVar = (zfj) Map.EL.getOrDefault(zgvVar.a, fgcmVar.c(), null);
        if (zfjVar != null) {
            zfm.a(dspdVar, hviVar, zfjVar, hfdVar, intValue & 126);
        }
        return ffcu.a;
    }
}
