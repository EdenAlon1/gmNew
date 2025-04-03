package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvet extends ffhv implements ffjm {
    final /* synthetic */ aswk a;
    final /* synthetic */ ffbr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvet(aswk aswkVar, ffbr ffbrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aswkVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvet) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a.a()) {
            cves cvesVar = (cves) this.b.b();
            if (cvesVar.f.c()) {
                axol.k(cvesVar.c, null, new cver(cvesVar, null), 3);
            } else {
                ensk h = cves.a.h();
                h.Y(ente.a, "Bugle");
                ((enrr) h.h("com/google/android/apps/messaging/shared/video/MissedVideoCallObserver", "register", 40, "MissedVideoCallObserver.kt")).q("No CALL_LOG permission, not registering observer");
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvet(this.a, this.b, ffguVar);
    }
}
