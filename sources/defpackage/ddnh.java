package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
class ddnh implements ejlr<Recipient, Conversation> {
    final /* synthetic */ ddnj a;

    public ddnh(ddnj ddnjVar) {
        this.a = ddnjVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        boolean D = ((Recipient) obj).D();
        ddnj ddnjVar = this.a;
        ddnjVar.d.f(ddnjVar.b.A(), ((Conversation) obj2).d(), Optional.of(this.a.o), D);
        this.a.g.a();
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        eg G = this.a.b.G();
        G.getClass();
        ehft ehftVar = new ehft(G);
        ehftVar.m(R.string.conversation_creation_failed);
        ehftVar.a();
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
