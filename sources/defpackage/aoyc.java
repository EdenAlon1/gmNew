package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoyc implements alyd {
    private final ConversationId a;
    private final alyd b;

    public aoyc(ConversationId conversationId, alyd alydVar) {
        this.a = conversationId;
        this.b = alydVar;
    }

    @Override // defpackage.ctbf
    public final /* bridge */ /* synthetic */ elfl a(Object obj) {
        alyc alycVar = (alyc) obj;
        return !alycVar.c().equals(this.a) ? elfo.e(null) : this.b.a(alycVar);
    }

    @Override // defpackage.alyd
    public final elfl b() {
        return this.b.b();
    }
}
