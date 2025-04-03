package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abqh implements ffxy {
    final /* synthetic */ abqp a;
    final /* synthetic */ BugleConversationId b;

    public abqh(abqp abqpVar, BugleConversationId bugleConversationId) {
        this.a = abqpVar;
        this.b = bugleConversationId;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        boolean z;
        ffcl ffclVar = (ffcl) obj;
        alxj alxjVar = (alxj) ffclVar.a;
        engw engwVar = (engw) ffclVar.b;
        alxg alxgVar = (alxg) ffclVar.c;
        ((enrr) abqp.a.h().h("com/google/android/apps/messaging/conversation2/viewmodel/LegacyConversationOpenedMetricMonitorImpl$monitorOpenedWithUnreadMessage$1$6", "emit", 131, "LegacyConversationOpenedMetricMonitorImpl.kt")).q("Logging conversation opened with unread message metric.");
        alyx e = alxgVar.e();
        boolean z2 = e.g;
        alxjVar.getClass();
        amfx amfxVar = (amfx) alxjVar;
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && engwVar.size() == 1) {
            engwVar.getClass();
            if (((ResolvedRecipient) ffdx.K(engwVar)).g().A()) {
                z = true;
                altk altkVar = (altk) this.a.e.b();
                BugleConversationId bugleConversationId = this.b;
                eoko eokoVar = eoko.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
                int size = engwVar.size();
                Boolean valueOf = Boolean.valueOf(abqp.d(amfxVar));
                int v = amfxVar.v();
                abqp abqpVar = this.a;
                engwVar.getClass();
                altkVar.ax(bugleConversationId.a, eokoVar, 0, size, true, valueOf, z2, z, v, abqpVar.b(engwVar), amfxVar.J(), abqp.f(amfxVar, engwVar), e.h, abqp.e(amfxVar));
                abqp.c(this.a);
                return ffcu.a;
            }
        }
        z = false;
        altk altkVar2 = (altk) this.a.e.b();
        BugleConversationId bugleConversationId2 = this.b;
        eoko eokoVar2 = eoko.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
        int size2 = engwVar.size();
        Boolean valueOf2 = Boolean.valueOf(abqp.d(amfxVar));
        int v2 = amfxVar.v();
        abqp abqpVar2 = this.a;
        engwVar.getClass();
        altkVar2.ax(bugleConversationId2.a, eokoVar2, 0, size2, true, valueOf2, z2, z, v2, abqpVar2.b(engwVar), amfxVar.J(), abqp.f(amfxVar, engwVar), e.h, abqp.e(amfxVar));
        abqp.c(this.a);
        return ffcu.a;
    }
}
