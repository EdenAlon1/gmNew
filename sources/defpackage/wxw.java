package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wxw {
    public final boolean a;
    public final ffxx b;
    private final ConversationId c;
    private final ffxx d;

    public wxw(ConversationId conversationId, ffbr ffbrVar, aawu aawuVar, ffxx ffxxVar) {
        conversationId.getClass();
        ffbrVar.getClass();
        aawuVar.getClass();
        ffxxVar.getClass();
        this.c = conversationId;
        this.d = ffxxVar;
        this.a = conversationId instanceof PenpalBotConversationId;
        this.b = ((aspy) ffbrVar.b()).a() ? new wxv(aawuVar.a(), this) : new fgch(ffxxVar, aawuVar.a(), new wxs(null));
    }
}
