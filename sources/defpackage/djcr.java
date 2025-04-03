package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djcr {
    private final ffbr a;
    private final ffbr b;

    public djcr(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    final djeo a(Conversation conversation, Message message, MessageClass messageClass, dkkj dkkjVar) {
        return new djeo((Context) ((fbbb) this.a).a, (djfw) this.b.b(), conversation, message, messageClass, dkkjVar);
    }
}
