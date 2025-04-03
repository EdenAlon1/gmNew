package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amvx implements aqge {
    public final PenpalBotConversationId a;
    public final BugleConversation b;
    private final ffsk c;

    public amvx(ffsk ffskVar, PenpalBotConversationId penpalBotConversationId, BugleConversation bugleConversation) {
        this.c = ffskVar;
        this.a = penpalBotConversationId;
        this.b = bugleConversation;
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        return this.b.n().a(aqgdVar);
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new amvw(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
