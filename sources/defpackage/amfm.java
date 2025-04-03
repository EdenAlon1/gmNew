package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amfm implements amlb {
    public final ffbr a;
    public final ffbr b;
    private final ffsk c;
    private final cqor d;

    public amfm(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.c = ffskVar;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.d = new cqoq("ActiveUserMetricsOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.amlb
    public final ekzz a() {
        return this.d.a();
    }

    @Override // defpackage.amlb
    public final elfl b(BugleConversation bugleConversation, alxk alxkVar) {
        elfl c;
        alxkVar.getClass();
        if (alxkVar == alxk.FOR_DISPLAY) {
            c = axol.c(this.c, ffhe.a, ffsm.a, new amfl(bugleConversation, this, null));
            return c;
        }
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }
}
