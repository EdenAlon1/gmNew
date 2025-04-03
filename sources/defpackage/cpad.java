package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpad extends ffhv implements ffjm {
    final /* synthetic */ cpaf a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ Duration d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpad(cpaf cpafVar, String str, long j, Duration duration, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cpafVar;
        this.b = str;
        this.c = j;
        this.d = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpad) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = cpaf.a.h();
        h.Y(ente.a, "BugleTelephony");
        enrr enrrVar = (enrr) h;
        enrrVar.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logSuccessEvent$1", "invokeSuspend", 66, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Logging RCS Telephony persistence success event to clearcut.");
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.TELEPHONY_PERSISTENCE_EVENT, eoluVar);
        epkt epktVar = (epkt) epku.a.createBuilder();
        epktVar.getClass();
        epnu.b(csud.a(this.b), epktVar);
        epnu.e(csuc.a(this.c), epktVar);
        epnu.d(csuc.a(cpaf.b()), epktVar);
        erau erauVar = (erau) erav.a.createBuilder();
        erauVar.getClass();
        eraz erazVar = (eraz) erba.a.createBuilder();
        erazVar.getClass();
        eyev a = eykn.a(this.d);
        erazVar.copyOnWrite();
        erba erbaVar = (erba) erazVar.instance;
        erbaVar.c = a;
        erbaVar.b |= 1;
        eyfy build = erazVar.build();
        build.getClass();
        erauVar.copyOnWrite();
        erav eravVar = (erav) erauVar.instance;
        eravVar.c = (erba) build;
        eravVar.b = 1;
        epnu.c(erat.a(erauVar), epktVar);
        eogy.i(epnu.a(epktVar), eoluVar);
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        try {
            this.a.a((eolu) builder);
        } catch (Exception e) {
            ensk j = cpaf.a.j();
            j.Y(ente.a, "BugleTelephony");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logSuccessEvent$1", "invokeSuspend", 81, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Failed to log telephony file persist success event to clearcut");
        }
        ensk h2 = cpaf.a.h();
        h2.Y(ente.a, "BugleTelephony");
        enrr enrrVar2 = (enrr) h2;
        enrrVar2.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logSuccessEvent$1", "invokeSuspend", 87, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Successfully logged RCS Telephony persistence success event to clearcut.");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpad(this.a, this.b, this.c, this.d, ffguVar);
    }
}
