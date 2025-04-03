package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqp implements ljv {
    final /* synthetic */ ahqt a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ ea c;
    final /* synthetic */ bcyl d;
    final /* synthetic */ MessageCoreData e;

    public ahqp(ahqt ahqtVar, ConversationId conversationId, ea eaVar, bcyl bcylVar, MessageCoreData messageCoreData) {
        this.a = ahqtVar;
        this.b = conversationId;
        this.c = eaVar;
        this.d = bcylVar;
        this.e = messageCoreData;
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        this.a.s().a(new ahpg());
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        ahqt ahqtVar = this.a;
        ConversationIdType w = ahqtVar.w(this.b);
        w.getClass();
        ahqtVar.A(w, vvn.z(this.c), this.d, this.e);
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        ConversationId conversationId = this.b;
        ahpi s = this.a.s();
        String b = conversationId.b();
        b.getClass();
        s.a(new ahpf(b));
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }
}
