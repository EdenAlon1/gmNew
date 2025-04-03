package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajlt implements amlb {
    private static final entd a = entd.c("BugleProfiles");
    private final Optional b;
    private final cqor c = new cqoq("ProfileOpenConversationListener::onConversationOpened");

    public ajlt(Optional optional) {
        this.b = optional;
    }

    @Override // defpackage.amlb
    public final ekzz a() {
        return this.c.a();
    }

    @Override // defpackage.amlb
    public final elfl b(BugleConversation bugleConversation, alxk alxkVar) {
        alxkVar.getClass();
        if (this.b.isEmpty()) {
            ensz enszVar = (ensz) a.h();
            enszVar.Y(csux.p, ((DefaultConversation) bugleConversation).a.a);
            enszVar.q("Unable to refresh profiles for conversation, missing refresher");
            elfl e = elfo.e(null);
            e.getClass();
            return e;
        }
        if (alxkVar != alxk.FOR_DISPLAY) {
            ensz enszVar2 = (ensz) a.h();
            enszVar2.Y(csux.p, ((DefaultConversation) bugleConversation).a.a);
            enszVar2.q("Conversation not opened for display, not refreshing profile");
            elfl e2 = elfo.e(null);
            e2.getClass();
            return e2;
        }
        ensz enszVar3 = (ensz) a.h();
        DefaultConversation defaultConversation = (DefaultConversation) bugleConversation;
        enszVar3.Y(csux.p, defaultConversation.a.a);
        enszVar3.q("Refresh profiles for conversation");
        ((cjxc) this.b.get()).a(defaultConversation.a.a);
        elfl e3 = elfo.e(null);
        e3.getClass();
        return e3;
    }
}
