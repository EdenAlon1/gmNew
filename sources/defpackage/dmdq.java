package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmdq implements ffjo {
    final /* synthetic */ dmck a;

    public dmdq(dmck dmckVar) {
        this.a = dmckVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        dmdt dmdtVar = (dmdt) obj2;
        hfd hfdVar = (hfd) obj3;
        ((Number) obj4).intValue();
        ((cqq) obj).getClass();
        dmdtVar.getClass();
        int ordinal = dmdtVar.ordinal();
        if (ordinal == 0) {
            hfdVar.v(1695829187);
            dmds.m(this.a, hfdVar, 0);
            hfdVar.o();
        } else {
            if (ordinal != 1) {
                hfdVar.v(1695827617);
                hfdVar.o();
                throw new ffcd();
            }
            hfdVar.v(1695831608);
            dmds.d(this.a, hfdVar, 0);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
