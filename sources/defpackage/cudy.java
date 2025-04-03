package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cudy implements amlb {
    public final ffbr a;
    public final ffbr b;
    private final ffsk c;
    private final cqor d;

    public cudy(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffbrVar.getClass();
        this.c = ffskVar;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.d = new cqoq("ChatbotSubscriptionOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.amlb
    public final ekzz a() {
        return this.d.a();
    }

    @Override // defpackage.amlb
    public final elfl b(BugleConversation bugleConversation, alxk alxkVar) {
        alxkVar.getClass();
        if (((Boolean) ((cfup) cudz.a.get()).e()).booleanValue()) {
            return axol.a(ekxl.c(this.c, new cudx(bugleConversation, this, null)));
        }
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }
}
