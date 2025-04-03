package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpab extends ffhv implements ffjm {
    final /* synthetic */ cpaf a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpab(cpaf cpafVar, String str, long j, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cpafVar;
        this.b = str;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpab) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = cpaf.a.h();
        h.Y(ente.a, "BugleTelephony");
        enrr enrrVar = (enrr) h;
        enrrVar.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logFailureEvent$1", "invokeSuspend", 129, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Logging RCS Telephony persistence failure event to clearcut.");
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.TELEPHONY_PERSISTENCE_EVENT, eoluVar);
        epkt epktVar = (epkt) epku.a.createBuilder();
        epktVar.getClass();
        epnu.b(csud.a(this.b), epktVar);
        long j = this.c;
        epnu.e(csuc.a(j), epktVar);
        long b = cpaf.b();
        epnu.d(csuc.a(b), epktVar);
        erau erauVar = (erau) erav.a.createBuilder();
        erauVar.getClass();
        eraw erawVar = (eraw) eray.a.createBuilder();
        erawVar.getClass();
        erawVar.copyOnWrite();
        eray erayVar = (eray) erawVar.instance;
        erayVar.c = this.d - 1;
        erayVar.b |= 1;
        erawVar.copyOnWrite();
        eray erayVar2 = (eray) erawVar.instance;
        erayVar2.b |= 2;
        erayVar2.d = j < b;
        eyfy build = erawVar.build();
        build.getClass();
        erauVar.copyOnWrite();
        erav eravVar = (erav) erauVar.instance;
        eravVar.c = (eray) build;
        eravVar.b = 2;
        epnu.c(erat.a(erauVar), epktVar);
        eogy.i(epnu.a(epktVar), eoluVar);
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        try {
            this.a.a((eolu) builder);
        } catch (Exception e) {
            ensk j2 = cpaf.a.j();
            j2.Y(ente.a, "BugleTelephony");
            ((enrr) ((enrr) j2).g(e).h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logFailureEvent$1", "invokeSuspend", 144, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Failed to log telephony file persist failure event to clearcut");
        }
        ensk h2 = cpaf.a.h();
        h2.Y(ente.a, "BugleTelephony");
        enrr enrrVar2 = (enrr) h2;
        enrrVar2.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logFailureEvent$1", "invokeSuspend", 150, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Successfully logged RCS Telephony persistence failure event to clearcut.");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpab(this.a, this.b, this.c, this.d, ffguVar);
    }
}
