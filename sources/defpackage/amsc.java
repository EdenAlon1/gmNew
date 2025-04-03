package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amsc implements aqge {
    public final ConversationId a;
    public final aqge b;
    private final ffsk c;

    public amsc(ffsk ffskVar, ConversationId conversationId, aqge aqgeVar) {
        this.c = ffskVar;
        this.a = conversationId;
        this.b = aqgeVar;
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        return this.b.a(aqgdVar);
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new amsb(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
