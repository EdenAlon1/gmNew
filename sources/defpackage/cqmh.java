package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqmh extends ffhv implements ffjm {
    final /* synthetic */ cqmi a;
    final /* synthetic */ ezgm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqmh(cqmi cqmiVar, ezgm ezgmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cqmiVar;
        this.b = ezgmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqmh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = cqmi.a.h();
        h.Y(ente.a, "BugleTelephony");
        ((enrr) h.h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdateScheduler$scheduleTelephonyPartsCharsetUpdate$1", "invokeSuspend", 41, "TelephonyDatabaseUpdateScheduler.kt")).q("Scheduling telephony database update work for charset update.");
        eyfy build = this.b.build();
        build.getClass();
        cqmi cqmiVar = this.a;
        axol.k(cqmiVar.c, null, new cqmg(cqmiVar, (ezgn) build, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqmh(this.a, this.b, ffguVar);
    }
}
