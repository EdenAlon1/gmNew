package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqjv implements arak {
    final /* synthetic */ ConversationId a;
    final /* synthetic */ aqjw b;

    public aqjv(aqjw aqjwVar, ConversationId conversationId) {
        this.a = conversationId;
        this.b = aqjwVar;
    }

    @Override // defpackage.arak
    public final elfl c() {
        ekzz f = eleg.f("getActiveRecipientsForConversation");
        ConversationId conversationId = this.a;
        aqjw aqjwVar = this.b;
        try {
            elfl h = aqjw.i(conversationId).w().h(new aqia(aqjwVar), aqjwVar.c);
            f.b(h);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.arak
    public final /* bridge */ /* synthetic */ Object d() {
        return this.b.w(aqjw.i(this.a).y());
    }
}
