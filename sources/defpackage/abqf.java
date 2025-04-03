package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abqf implements ffxy {
    final /* synthetic */ abqp a;

    public abqf(abqp abqpVar) {
        this.a = abqpVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        ffcl ffclVar = (ffcl) obj;
        alxj alxjVar = (alxj) ffclVar.a;
        engw engwVar = (engw) ffclVar.b;
        alxg alxgVar = (alxg) ffclVar.c;
        ((enrr) abqp.a.h().h("com/google/android/apps/messaging/conversation2/viewmodel/LegacyConversationOpenedMetricMonitorImpl$monitorOpenedWithUnreadMessage$1$3", "emit", 85, "LegacyConversationOpenedMetricMonitorImpl.kt")).q("Logging conversation opened with unread message metric.");
        alyx e = alxgVar.e();
        boolean z = e.g;
        alxjVar.getClass();
        amfx amfxVar = (amfx) alxjVar;
        abqp abqpVar = this.a;
        boolean z2 = abqpVar.b.d() instanceof PenpalBotConversationId;
        altk altkVar = (altk) abqpVar.e.b();
        ConversationIdType a = amic.a(this.a.b.d());
        eoko eokoVar = eoko.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
        int size = engwVar.size();
        Boolean valueOf = Boolean.valueOf(abqp.d(amfxVar));
        int v = amfxVar.v();
        engwVar.getClass();
        altkVar.ax(a, eokoVar, 0, size, true, valueOf, z, z2, v, this.a.b(engwVar), amfxVar.J(), abqp.f(amfxVar, engwVar), e.h, abqp.e(amfxVar));
        abqp.c(this.a);
        return ffcu.a;
    }
}
