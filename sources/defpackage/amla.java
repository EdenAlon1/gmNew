package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amla implements amlb {
    private static final entd a = entd.c("BugleEtouffee");
    private final cqor b;
    private final bbab c;

    public amla(bbab bbabVar) {
        bbabVar.getClass();
        this.c = bbabVar;
        this.b = new cqoq("EtouffeeOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.amlb
    public final ekzz a() {
        return this.b.a();
    }

    @Override // defpackage.amlb
    public final elfl b(BugleConversation bugleConversation, alxk alxkVar) {
        alxkVar.getClass();
        DefaultConversation defaultConversation = (DefaultConversation) bugleConversation;
        a.n().t("Refresh encryption status for conversation %s.", defaultConversation.a.b());
        this.c.a(defaultConversation.a.a).t();
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }
}
