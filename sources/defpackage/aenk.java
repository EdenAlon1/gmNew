package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aenk extends ffhv implements ffjm {
    /* synthetic */ boolean a;

    public aenk(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((aenk) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a) {
            ensk h = aenq.a.h();
            h.Y(ente.a, "BugleSatellite");
            ((enrr) h.h("com/google/android/apps/messaging/home/satellite/SatelliteManualConnectionBanner$isEligibleFlow$2", "invokeSuspend", 63, "SatelliteManualConnectionBanner.kt")).q("SatelliteManualConnectionBanner is eligible");
        } else {
            ensk e = aenq.a.e();
            e.Y(ente.a, "BugleSatellite");
            ((enrr) e.h("com/google/android/apps/messaging/home/satellite/SatelliteManualConnectionBanner$isEligibleFlow$2", "invokeSuspend", 65, "SatelliteManualConnectionBanner.kt")).q("SatelliteManualConnectionBanner is ineligible");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aenk aenkVar = new aenk(ffguVar);
        aenkVar.a = ((Boolean) obj).booleanValue();
        return aenkVar;
    }
}
