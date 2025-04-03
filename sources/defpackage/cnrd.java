package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import io.grpc.StatusException;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnrd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnrn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnrd(ffgu ffguVar, cnrn cnrnVar) {
        super(2, ffguVar);
        this.b = cnrnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnrd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        ?? r1 = this.a;
        try {
            try {
                if (r1 != 0) {
                    Closeable closeable = (Closeable) this.c;
                    ffci.b(obj);
                    r1 = closeable;
                } else {
                    ffci.b(obj);
                    ensk h = cnrn.a.h();
                    h.Y(ente.a, "BugleSatellite");
                    ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callRetrieveEmergencyQuestionnaire-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 188, "OutgoingSatelliteApiImpl.kt")).q("Calling QuestionnaireService.retrieveEmergencyQuestionnaire");
                    ekzz f = eleg.f("QuestionnaireService.GetQuestionnaire");
                    deri deriVar = this.b.c;
                    deqf deqfVar = (deqf) deqg.a.createBuilder();
                    deqfVar.getClass();
                    eyfy build = deqfVar.build();
                    build.getClass();
                    this.c = f;
                    this.a = 1;
                    obj = deriVar.b((deqg) build, new febo(), this);
                    r1 = f;
                    if (obj == ffhhVar) {
                        return ffhhVar;
                    }
                }
                deqi deqiVar = (deqi) obj;
                ffig.a(r1, null);
                ensk h2 = cnrn.a.h();
                h2.Y(ente.a, "BugleSatellite");
                enrr enrrVar = (enrr) h2.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callRetrieveEmergencyQuestionnaire-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "OutgoingSatelliteApiImpl.kt");
                eygr eygrVar = deqiVar.b;
                eygrVar.getClass();
                enrrVar.t("Call QuestionnaireService.retrieveEmergencyQuestionnaire succeeded, datagramIds:[%s]", ffdx.aA(eygrVar, null, null, null, cnrc.a, 31));
                obj2 = deqiVar;
            } catch (StatusException e) {
                ensk j = cnrn.a.j();
                j.Y(ente.a, "BugleSatellite");
                ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callRetrieveEmergencyQuestionnaire-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 197, "OutgoingSatelliteApiImpl.kt")).q("Call QuestionnaireService.retrieveEmergencyQuestionnaire failed");
                Object a = ffci.a(e);
                ffig.a(r1, null);
                obj2 = a;
            }
            return new ffch(obj2);
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnrd cnrdVar = new cnrd(ffguVar, this.b);
        cnrdVar.c = obj;
        return cnrdVar;
    }
}
