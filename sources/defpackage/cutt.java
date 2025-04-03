package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cutt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cutu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutt(cutu cutuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cutuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cutt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                long j = ffpw.a;
                Object e = cubs.D.e();
                e.getClass();
                long e2 = ffpy.e(((Number) e).longValue(), ffpz.c);
                cuts cutsVar = new cuts(this.b, null);
                this.a = 1;
                if (ffvm.b(e2, cutsVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (ffvj unused) {
            ensk j2 = cutu.a.j();
            j2.Y(ente.a, "BugleSpam");
            ((enrr) j2.h("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsChecker$getAccountIdAndCheckSpatulaSettings$1", "invokeSuspend", 63, "SpatulaSettingsChecker.kt")).q("Timeout when getting spatula settings.");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cutt(this.b, ffguVar);
    }
}
