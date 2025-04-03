package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amlc implements amlb {
    private static final entd a = entd.c("BugleConversation");
    private static final cqor b = new cqoq("SendingContext::onConversationOpened");
    private final ffbr c;

    public amlc(ffbr ffbrVar) {
        this.c = ffbrVar;
    }

    @Override // defpackage.amlb
    public final ekzz a() {
        return b.a();
    }

    @Override // defpackage.amlb
    public final elfl b(BugleConversation bugleConversation, alxk alxkVar) {
        ekzz f = eleg.f("SendingContextOpenConversationListener::onConversationOpened::convoV2");
        try {
            ((ensz) ((ensz) a.e()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/SendingContextOpenConversationListener", "onConversationOpened", 52, "SendingContextOpenConversationListener.java")).q("executing SendingContextOpenConversationListener for convo v2.");
            elfl a2 = ((azzz) this.c.b()).a(((DefaultConversation) bugleConversation).a.a);
            f.b(a2);
            f.close();
            return a2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
