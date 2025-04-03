package defpackage;

import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aehx {
    public static SelectedConversation a(aely aelyVar) {
        aeki k = aelyVar.k();
        ConversationIdType w = k.w();
        ConversationId conversationId = (ConversationId) k.A().get();
        MessageIdType x = k.x();
        long o = k.o();
        long p = k.p();
        byyt y = k.y();
        int a = k.a();
        boolean aa = k.aa();
        int b = aelyVar.b();
        return new SelectedConversation(w, conversationId, x, o, p, y, a, aa, b == 8, k.I(), k.P(), k.N(), k.O(), aelyVar.S(), k.ae(), k.h(), k.j(), k.J(), aeja.c(k), k.b(), k.t(), k.Y());
    }
}
