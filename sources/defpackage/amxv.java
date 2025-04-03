package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amxv implements aqge {
    public final ffbr a;
    public final ConversationId b;
    public final aqge c;
    public final aqge d;
    private final ffsk e;

    public amxv(ffsk ffskVar, ffbr ffbrVar, ConversationId conversationId, aqge aqgeVar, aqge aqgeVar2) {
        this.e = ffskVar;
        this.a = ffbrVar;
        this.b = conversationId;
        this.c = aqgeVar;
        this.d = aqgeVar2;
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        return this.c.a(aqgdVar);
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new amxu(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException("RbmConversationLocalIdentitiesSupplier.getBlocking is not supported.");
    }
}
