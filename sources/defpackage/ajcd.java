package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajcd implements amlb {
    public final ffbr a;
    private final ffsk b;
    private final cqor c;

    public ajcd(ffsk ffskVar, ffbr ffbrVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        this.b = ffskVar;
        this.a = ffbrVar;
        this.c = new cqoq("PenpalOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.amlb
    public final ekzz a() {
        return this.c.a();
    }

    @Override // defpackage.amlb
    public final elfl b(BugleConversation bugleConversation, alxk alxkVar) {
        alxkVar.getClass();
        if (!((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            elfl e = elfo.e(null);
            e.getClass();
            return e;
        }
        ffsk ffskVar = this.b;
        ffhe ffheVar = ffhe.a;
        return axol.a(ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new ajcc(null, bugleConversation, this)));
    }
}
