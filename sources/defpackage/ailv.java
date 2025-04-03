package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ailv implements aigt {
    public static final enru a = enru.c("com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler");
    public final ffhd b;
    public final ffbr c;
    private final Context d;
    private final ffsk e;
    private final ffbr f;

    public ailv(Context context, ffhd ffhdVar, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffhdVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.d = context;
        this.b = ffhdVar;
        this.e = ffskVar;
        this.f = ffbrVar;
        this.c = ffbrVar3;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        ails ailsVar = (ails) aihsVar;
        ConversationId conversationId = ailsVar.a;
        String str = ailsVar.b;
        Recipient recipient = ailsVar.c;
        byyt byytVar = ailsVar.d;
        ConversationIdType b = bdgq.b(conversationId.b());
        String f = ((csll) this.c.b()).f(b);
        if (ctid.d) {
            boolean g = byytVar.g();
            Boolean valueOf = Boolean.valueOf(g);
            ffbr ffbrVar = this.c;
            valueOf.getClass();
            if (!((csll) ffbrVar.b()).k(f) && !g) {
                axol.k(this.e, null, new ailu(this, f, str, b, conversationId, recipient, null), 3);
                return ffcu.a;
            }
        }
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) h.h("com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler", "handleNotificationNavigation", 131, "NotificationSettings.kt")).q("Shortcut already exists. Will launch notification settings now.");
        b(str, b, f);
        return ffcu.a;
    }

    public final void b(String str, ConversationIdType conversationIdType, String str2) {
        Intent b = ((cjam) this.f.b()).b(str, str2, conversationIdType);
        if (b != null) {
            this.d.startActivity(b);
            return;
        }
        ensk j = a.j();
        j.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.p, conversationIdType);
        enrrVar.Y(cird.t, str2);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler", "createAndOpenNotificationChannel", 157, "NotificationSettings.kt")).q("intent is null, unable to open notification channel settings");
    }
}
