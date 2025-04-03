package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdh {
    private final cjdg a;
    private final ciwj b;

    public cjdh(ciwj ciwjVar, cjdg cjdgVar) {
        ciwjVar.getClass();
        this.b = ciwjVar;
        this.a = cjdgVar;
    }

    public final void a(BugleConversationId bugleConversationId) {
        cjcz cjczVar = (cjcz) cjda.a.createBuilder();
        eyee x = eyee.x(bugleConversationId.c());
        cjczVar.copyOnWrite();
        cjda cjdaVar = (cjda) cjczVar.instance;
        cjdaVar.b |= 1;
        cjdaVar.c = x;
        this.b.c(this.a, cjczVar.build(), false);
    }
}
