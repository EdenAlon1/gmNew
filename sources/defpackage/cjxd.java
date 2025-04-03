package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjxd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjxe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxd(cjxe cjxeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjxeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (!((Boolean) this.b.c.b()).booleanValue()) {
                ensk h = cjxe.a.h();
                h.Y(ente.a, "BugleProfiles");
                ((enrr) h.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefreshWorker$startWork$1", "invokeSuspend", 39, "ProfilesRefreshWorker.kt")).q("Profiles full refresh disabled, not refreshing profiles");
                return new ppn();
            }
            if (((aulo) this.b.d.b()).a()) {
                ensk h2 = cjxe.a.h();
                h2.Y(ente.a, "BugleProfiles");
                ((enrr) h2.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefreshWorker$startWork$1", "invokeSuspend", 44, "ProfilesRefreshWorker.kt")).q("Profiles startup task disabled, using synclet instead");
                return new ppn();
            }
            ensk h3 = cjxe.a.h();
            h3.Y(ente.a, "BugleProfiles");
            ((enrr) h3.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefreshWorker$startWork$1", "invokeSuspend", 48, "ProfilesRefreshWorker.kt")).q("Profiles daily full refresh worker started");
            cjxe cjxeVar = this.b;
            this.a = 1;
            if (cjxeVar.b.b(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        ensk h4 = cjxe.a.h();
        h4.Y(ente.a, "BugleProfiles");
        ((enrr) h4.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefreshWorker$startWork$1", "invokeSuspend", 50, "ProfilesRefreshWorker.kt")).q("Profiles daily full refresh worker finished");
        return new ppp();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjxd(this.b, ffguVar);
    }
}
