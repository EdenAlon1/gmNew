package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cojj extends ffhv implements ffjm {
    final /* synthetic */ cojl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cojj(cojl cojlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cojlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cojj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = cojl.a.h();
        h.Y(ente.a, "BugleNotifications");
        ((enrr) h.h("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionHelper$refreshNotifications$1$1", "invokeSuspend", 88, "ScreenDetectionHelper.kt")).q("Refreshing notification for ScreenDetectionHelper");
        cojl cojlVar = this.a;
        ekzz f = eleg.f("ScreenDetectionHelper.refreshNotifications.notificationDirector");
        try {
            ((cjbc) cojlVar.c.b()).c();
            ffig.a(f, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cojj(this.a, ffguVar);
    }
}
