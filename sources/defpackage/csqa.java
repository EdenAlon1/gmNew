package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csqa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ csqc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csqa(boolean z, csqc csqcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = csqcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csqa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk h = csqc.a.h();
            h.Y(ente.a, "BugleConnectivity");
            ((enrr) h.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl$notifyEligibilityChange$1", "invokeSuspend", 270, "ManualSatelliteEligibilityTrackerImpl.kt")).t("Notifying listeners of manual satellite eligibility change: %b", Boolean.valueOf(this.b));
            csqc csqcVar = this.c;
            cspu cspuVar = this.b ? cspu.a : cspu.b;
            fgcm fgcmVar = csqcVar.f;
            this.a = 1;
            if (fgcmVar.fQ(cspuVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new csqa(this.b, this.c, ffguVar);
    }
}
