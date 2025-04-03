package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alrs extends ffhv implements ffjm {
    final /* synthetic */ alrt a;
    final /* synthetic */ alxr b;
    final /* synthetic */ akzo c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alrs(alrt alrtVar, alxr alxrVar, int i, akzo akzoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = alrtVar;
        this.b = alxrVar;
        this.d = i;
        this.c = akzoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alrs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        eolv a;
        eolu eoluVar;
        ffci.b(obj);
        alrt alrtVar = this.a;
        int i = this.d;
        alxr alxrVar = this.b;
        if (alxrVar.p() == null) {
            ((enrr) alrt.a.j().h("com/google/android/apps/messaging/shared/analytics/statistics/MessageStatusMapiEventLogger", "createBugleMessageEvent", 94, "MessageStatusMapiEventLogger.kt")).t("No analytics message ID found, skipping logging of %s event.", eook.a(i));
            a = null;
        } else {
            eolu eoluVar2 = (eolu) eolv.a.createBuilder();
            eoluVar2.getClass();
            eogy.g(eolt.BUGLE_MESSAGE, eoluVar2);
            eoop eoopVar = (eoop) eopq.a.createBuilder();
            eoopVar.getClass();
            Long p = alxrVar.p();
            p.getClass();
            eohm.c(p.longValue(), eoopVar);
            eohm.g(i, eoopVar);
            String r = alxrVar.r();
            entd entdVar = MessageData.a;
            eohm.h(MessageData.dp("SMS".equalsIgnoreCase(r) ? 0 : "MMS".equalsIgnoreCase(r) ? 1 : "RCS".equalsIgnoreCase(r) ? 3 : "SATELLITE".equalsIgnoreCase(r) ? 7 : -1), eoopVar);
            eohm.b(((akvz) alrtVar.b.b()).c(alxrVar.f().b()), eoopVar);
            eogy.d(eohm.a(eoopVar), eoluVar2);
            a = eogy.a(eoluVar2);
        }
        if (a != null && (eoluVar = (eolu) a.toBuilder()) != null) {
            akzo akzoVar = this.c;
            akxn a2 = ((akyb) alrtVar.c.b()).a();
            a2.f(akzoVar);
            a2.d(epyw.BUGLE_MESSAGE);
            a2.j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
            eopq eopqVar = ((eolv) eoluVar.instance).l;
            if (eopqVar == null) {
                eopqVar = eopq.a;
            }
            long j = eopqVar.n;
            eopq eopqVar2 = ((eolv) eoluVar.instance).l;
            if (eopqVar2 == null) {
                eopqVar2 = eopq.a;
            }
            int b = eook.b(eopqVar2.h);
            ((enrr) alrt.a.e().h("com/google/android/apps/messaging/shared/analytics/statistics/MessageStatusMapiEventLogger$Companion", "debugLogMessageStatusTimestamp", 128, "MessageStatusMapiEventLogger.kt")).J("BugleMessage[eventTimeMs=%d, messageId=%d, messageStatus=%s]", Long.valueOf(akzoVar.a), Long.valueOf(j), eook.a(b != 0 ? b : 1));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alrs(this.a, this.b, this.d, this.c, ffguVar);
    }
}
