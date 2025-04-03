package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjxn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjxq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxn(ffgu ffguVar, cjxq cjxqVar) {
        super(2, ffguVar);
        this.b = cjxqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        aqvh aqvhVar;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                aqvhVar = (aqvh) this.c;
                ffci.b(obj);
            } else {
                ffci.b(obj);
                cjxq cjxqVar = this.b;
                aqvh aqvhVar2 = cjxqVar.c;
                this.c = aqvhVar2;
                this.a = 1;
                obj = cjxqVar.c(this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
                aqvhVar = aqvhVar2;
            }
            elfl g = aqvhVar.g(((Boolean) obj).booleanValue() ? Optional.of(this.b.e) : Optional.empty());
            ensk h = cjxq.a.h();
            h.Y(ente.a, "BugleProfiles");
            ((enrr) h.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefresherImpl$selfProfilesRefresh$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 132, "ProfilesRefresherImpl.kt")).t("selfProfilesRefresh completed, result: %s", g);
        } catch (Exception e) {
            ensk j = cjxq.a.j();
            j.Y(ente.a, "BugleProfiles");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefresherImpl$selfProfilesRefresh$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 137, "ProfilesRefresherImpl.kt")).q("An unexpected exception occurred while refreshing shel profiles");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjxn cjxnVar = new cjxn(ffguVar, this.b);
        cjxnVar.c = obj;
        return cjxnVar;
    }
}
