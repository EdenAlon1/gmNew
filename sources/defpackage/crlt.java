package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crlt implements crlo {
    public final ffbr a;
    public final asix b;
    private final ffbr c;
    private final ffbr d;
    private final byzp e;
    private final ffsk f;
    private final ffhd g;
    private final ffbr h;

    public crlt(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, byzp byzpVar, asix asixVar, ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        byzpVar.getClass();
        asixVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.a = ffbrVar3;
        this.e = byzpVar;
        this.b = asixVar;
        this.f = ffskVar;
        this.g = ffhdVar;
        this.h = ffbrVar4;
    }

    @Override // defpackage.crlo
    public final MessageIdType a(ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        return f(conversationIdType, i, messageIdType);
    }

    @Override // defpackage.crlo
    public final elfl b(MessageIdType messageIdType) {
        elfl c;
        c = axol.c(this.f, ffhe.a, ffsm.a, new crlq(this, messageIdType, null));
        return c;
    }

    @Override // defpackage.crlo
    public final void c(MessageIdType messageIdType) {
        axol.k(this.f, null, new crlp(this, messageIdType, null), 3);
    }

    @Override // defpackage.crlo
    public final Object d(ConversationIdType conversationIdType, MessageIdType messageIdType, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.g), new crlr(null, this, conversationIdType, messageIdType), ffguVar);
    }

    @Override // defpackage.crlo
    public final elfl e(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        elfl c;
        conversationIdType.getClass();
        c = axol.c(this.f, ffhe.a, ffsm.a, new crls(this, conversationIdType, messageIdType, null));
        return c;
    }

    public final MessageIdType f(ConversationIdType conversationIdType, int i, MessageIdType messageIdType) {
        MessageCoreData v = !messageIdType.c() ? ((bdmq) this.c.b()).v(messageIdType) : null;
        MessageCoreData q = this.e.q(conversationIdType, i, v != null ? v.o() + 1 : ((cqoh) this.h.b()).f().toEpochMilli());
        if (v != null && !v.cO()) {
            q.bB(false);
        }
        return ((bdjr) this.d.b()).a(q);
    }
}
