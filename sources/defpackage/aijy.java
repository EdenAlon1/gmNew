package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijy implements aigt {
    private static final enru a = enru.c("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler");
    private final Context b;
    private final ffbr c;
    private final ffbr d;

    public aijy(Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = context;
        this.c = ffbrVar;
        this.d = ffbrVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        aijn aijnVar = (aijn) aihsVar;
        boolean z = aijnVar.a.g;
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "Bugle");
        ((enrr) h.h("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler", "navigate", 53, "Conversation.kt")).t("Navigating w/activity, RBM: %s", Boolean.valueOf(z));
        Activity a2 = ddxb.a(this.b);
        if (a2 == 0) {
            throw new IllegalArgumentException("ConversationNavigationHandler must be created with an activity context.");
        }
        aijp aijpVar = aijnVar.a;
        Object H = a2 instanceof ekhu ? ((ekhu) a2).H() : null;
        if ((H instanceof ahpk) && ((Boolean) cvqt.a.e()).booleanValue() && !z) {
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "Bugle");
            ((enrr) h2.h("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler", "navigate", 61, "Conversation.kt")).t("Navigating w/main activity fragment host, RBM: %s", false);
            ((ahpk) H).j(aijpVar);
        } else {
            ensk h3 = enruVar.h();
            h3.Y(ente.a, "Bugle");
            ((enrr) h3.h("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler", "navigate", 64, "Conversation.kt")).t("Navigating w/activity, RBM: %s", Boolean.valueOf(z));
            if (((atdn) this.d.b()).a()) {
                if (aijpVar.g) {
                    if (aijpVar.e != null) {
                        ensk i = enruVar.i();
                        i.Y(ente.a, "Bugle");
                        ((enrr) i.h("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler", "launchAsActivity", 81, "Conversation.kt")).q("Conversation.launchAsActivity with RBM recipient and deprecatedDraft");
                    }
                    ((ayfg) this.c.b()).F(this.b, aijpVar.a, new bdix(null), aijt.a(aijpVar), Optional.empty(), true);
                } else {
                    ((ayfg) this.c.b()).F(this.b, aijpVar.a, new bdix(aijpVar.d), aijt.a(aijpVar), Optional.empty(), false);
                }
            } else if (aijpVar.f != null) {
                ayfg ayfgVar = (ayfg) this.c.b();
                Context context = this.b;
                ConversationId conversationId = aijpVar.a;
                IncomingDraft incomingDraft = aijpVar.f;
                if (incomingDraft == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ayfgVar.G(context, conversationId, incomingDraft, aijt.a(aijpVar), aijpVar.g);
            } else {
                ((ayfg) this.c.b()).F(this.b, aijpVar.a, new bdja(aijpVar.e), aijt.a(aijpVar), Optional.empty(), aijpVar.g);
            }
        }
        if (aijpVar.h) {
            a2.finish();
        }
        return ffcu.a;
    }
}
