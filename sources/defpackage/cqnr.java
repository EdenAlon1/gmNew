package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqnr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqnv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqnr(cqnv cqnvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cqnvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqnr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                bbhj bbhjVar = bbhj.a;
                cqnq cqnqVar = new cqnq(this.b, null);
                this.a = 1;
                obj = bbhjVar.a("TelephonyDatabaseUpdater#updateThreadIdForSmsMessagesInThreadZero", cqnqVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            long j = ((ffpw) obj).c;
            ensk e = cqnv.a.e();
            e.Y(ente.a, "BugleTelephony");
            ((enrr) e.h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater$updateThreadIdForSmsMessagesInThreadZero$1", "invokeSuspend", 104, "TelephonyDatabaseUpdater.kt")).s("TelephonyDatabaseUpdater#updateThreadIdForSmsMessagesInThreadZero time: [%s]ms", ffpw.g(j));
        } catch (Exception e2) {
            ensk j2 = cqnv.a.j();
            j2.Y(ente.a, "BugleTelephony");
            ((enrr) ((enrr) j2).g(e2).h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater$updateThreadIdForSmsMessagesInThreadZero$1", "invokeSuspend", 110, "TelephonyDatabaseUpdater.kt")).q("Error thrown during SMS Thread ID update!");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqnr(this.b, ffguVar);
    }
}
