package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apap implements alyc {
    final /* synthetic */ alxd a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ ConversationId c;
    final /* synthetic */ Instant d;

    public apap(alxd alxdVar, MessageId messageId, ConversationId conversationId, Instant instant) {
        this.a = alxdVar;
        this.b = messageId;
        this.c = conversationId;
        this.d = instant;
    }

    @Override // defpackage.alyc
    public final alxd a() {
        return this.a;
    }

    @Override // defpackage.alyc
    public final MessageId b() {
        return this.b;
    }

    @Override // defpackage.alyc
    public final ConversationId c() {
        return this.c;
    }

    @Override // defpackage.alyc
    public final Instant d() {
        return this.d;
    }
}
