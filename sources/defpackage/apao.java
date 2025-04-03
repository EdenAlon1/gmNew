package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apao {
    final /* synthetic */ apaq a;

    public apao(apaq apaqVar) {
        this.a = apaqVar;
    }

    public final void a(alxd alxdVar, MessageId messageId, ConversationId conversationId, Instant instant) {
        alxdVar.getClass();
        apaq apaqVar = this.a;
        synchronized (apaqVar.c) {
            Iterator it = apaqVar.b.iterator();
            while (it.hasNext()) {
                ((alyd) it.next()).a(new apap(alxdVar, messageId, conversationId, instant));
            }
        }
    }
}
