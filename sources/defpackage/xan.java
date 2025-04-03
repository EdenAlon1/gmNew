package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xan implements wqq {
    public final ffbr a;
    private final ffxx b;
    private final ffxx c;
    private final Set d;

    public xan(Context context, fgcq fgcqVar, xil xilVar, ConversationId conversationId, ffbr ffbrVar, ffxx ffxxVar) {
        ffxx fgchVar;
        context.getClass();
        fgcqVar.getClass();
        xilVar.getClass();
        conversationId.getClass();
        ffbrVar.getClass();
        ffxxVar.getClass();
        this.a = ffbrVar;
        this.b = ffxxVar;
        if (!((aspy) ffbrVar.b()).a()) {
            fgchVar = new fgch(ffyy.a(new ffzh(new wzv(null), new xam(new xaj(fgcqVar)))), ffxxVar, new wzx(this, context, xilVar, null));
        } else if (conversationId instanceof PenpalBotConversationId) {
            fgchVar = fgdm.a(null);
        } else {
            fgchVar = new xag(ffyy.a(new ffzh(new wzt(null), new xad(new xaa(fgcqVar)))), context, xilVar);
        }
        this.c = fgchVar;
        this.d = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.c;
    }
}
