package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnoh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnoi b;
    final /* synthetic */ cnob c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnoh(cnoi cnoiVar, cnob cnobVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cnoiVar;
        this.c = cnobVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnoh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cnoi cnoiVar = this.b;
            this.a = 1;
            obj = cnoiVar.c.e(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cnur cnurVar = (cnur) obj;
        ensk h = cnoi.a.h();
        h.Y(ente.a, "BugleSatellite");
        enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl$requestSatelliteConnection$1", "invokeSuspend", 184, "BugleSatelliteManagerWrapperImpl.kt");
        cnuv cnuvVar = cnurVar.c;
        if (cnuvVar == null) {
            cnuvVar = cnuv.a;
        }
        enrrVar.r("Start satellite session response: %d", cnuvVar.c);
        cnuv cnuvVar2 = cnurVar.c;
        if (cnuvVar2 == null) {
            cnuvVar2 = cnuv.a;
        }
        cnuu b = cnuu.b(cnuvVar2.c);
        if (b == null) {
            b = cnuu.UNRECOGNIZED;
        }
        if (b == cnuu.SUCCESS) {
            this.c.a();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnoh(this.b, this.c, ffguVar);
    }
}
