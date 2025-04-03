package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwr implements wqq {
    public final ConversationId a;
    public final ffbr b;
    public final atbw c;
    private final ffxx d;
    private final Set e;

    public wwr(Context context, aigz aigzVar, ConversationId conversationId, ffxx ffxxVar, ffbr ffbrVar, atbw atbwVar) {
        context.getClass();
        aigzVar.getClass();
        conversationId.getClass();
        ffxxVar.getClass();
        ffbrVar.getClass();
        atbwVar.getClass();
        this.a = conversationId;
        this.b = ffbrVar;
        this.c = atbwVar;
        this.d = !(conversationId instanceof RbmConversationId) ? new ffyg(null) : new wwq(ffxxVar, this, context, aigzVar);
        this.e = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.d;
    }
}
