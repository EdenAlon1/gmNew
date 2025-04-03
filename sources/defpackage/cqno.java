package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqno extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqnv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqno(cqnv cqnvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cqnvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqno) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cqnv cqnvVar = this.b;
            bbhj bbhjVar = bbhj.a;
            cqnn cqnnVar = new cqnn(cqnvVar, null);
            this.a = 1;
            obj = bbhjVar.a("TelephonyDatabaseUpdater#updateThreadIdForMmsMessagesInThreadZero", cqnnVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        long j = ((ffpw) obj).c;
        ensk e = cqnv.a.e();
        e.Y(ente.a, "BugleTelephony");
        ((enrr) e.h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater$updateThreadIdForMmsMessagesInThreadZero$1", "invokeSuspend", 126, "TelephonyDatabaseUpdater.kt")).s("TelephonyDatabaseUpdater#updateThreadIdForMmsMessagesInThreadZero time: [%s]ms", ffpw.g(j));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqno(this.b, ffguVar);
    }
}
