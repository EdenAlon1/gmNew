package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpj implements amlb {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/DunestarOpenConversationListener");
    private final atti b;
    private final ffsk c;
    private final cqor d;

    public cnpj(atti attiVar, ffsk ffskVar, aqeu aqeuVar) {
        attiVar.getClass();
        ffskVar.getClass();
        aqeuVar.getClass();
        this.b = attiVar;
        this.c = ffskVar;
        this.d = new cqoq("DunestarOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.amlb
    public final ekzz a() {
        return this.d.a();
    }

    @Override // defpackage.amlb
    public final elfl b(BugleConversation bugleConversation, alxk alxkVar) {
        elfl c;
        alxkVar.getClass();
        if (this.b.a() && alxkVar == alxk.FOR_DISPLAY) {
            c = axol.c(this.c, ffhe.a, ffsm.a, new cnpi(bugleConversation, this, null));
            return c;
        }
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }
}
