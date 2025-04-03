package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axvn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axvq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axvn(axvq axvqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axvqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axvn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                axvq axvqVar = this.b;
                this.a = 1;
                if (axvqVar.a(this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (Throwable th) {
            ensk i = axvq.a.i();
            i.Y(ente.a, "BugleContacts");
            ((enrr) ((enrr) i).g(th).h("com/google/android/apps/messaging/shared/contacts/sync/analytics/ContactsSyncRecurringMetricsLoggerImpl$log$1", "invokeSuspend", 57, "ContactsSyncRecurringMetricsLoggerImpl.kt")).q("Error while logging contacts sync recurring metrics");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axvn(this.b, ffguVar);
    }
}
