package defpackage;

import android.util.LruCache;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.time.Instant;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djgk {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    private final LruCache c = new LruCache(((Integer) dizg.o().a.k.a()).intValue());
    private final dlpw d;

    public djgk(dlpw dlpwVar) {
        this.d = dlpwVar;
    }

    public final boolean a(TraceId traceId, Conversation conversation, Message message) {
        synchronized (this.a) {
            if (!emxe.c(message.h()) && this.c.get(message.h()) != null) {
                dkty.k("Messages queue: deduplicate message, messageId:{%s}, conversationId:{%s}.", message.h(), conversation.b());
                return false;
            }
            this.c.put(message.h(), true);
            eigu e = MessageNotification.e();
            e.b(conversation);
            e.d(message);
            e.e(traceId);
            if (dizg.v()) {
                e.c(Instant.ofEpochMilli(this.d.a()));
            }
            this.b.add(e.a());
            dkty.c("Messages queue: push operation, messageId:{%s}, conversationId:{%s}, queueSize:{%s}.", message.h(), conversation.b(), Integer.valueOf(this.b.size()));
            return true;
        }
    }
}
