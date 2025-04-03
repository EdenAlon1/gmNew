package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ampi implements ampj {
    private final ffbr a;

    public ampi(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.ampj
    public final /* bridge */ /* synthetic */ aqge a(ConversationId conversationId) {
        Set set = (Set) this.a.b();
        set.getClass();
        return new amph(set, conversationId);
    }
}
