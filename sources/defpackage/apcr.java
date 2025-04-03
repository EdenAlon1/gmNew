package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apcr implements aqge {
    public final BugleConversationId a;
    private final alye b;
    private final errl c;

    public apcr(alye alyeVar, errl errlVar, BugleConversationId bugleConversationId) {
        this.b = alyeVar;
        this.c = errlVar;
        this.a = bugleConversationId;
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        return this.b.k(new apcq(aqgdVar));
    }

    @Override // defpackage.aqge
    public final elfl b() {
        return elfo.g(new Callable() { // from class: apcp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ConversationIdType conversationIdType = apcr.this.a.a;
                dtzj dtzjVar = cbem.a;
                ekzz f = eleg.f("UnreadMessagesCountQuery#getUnreadConversationMessagesCount");
                try {
                    int i = cbem.b(conversationIdType).b().i();
                    f.close();
                    return Integer.valueOf(i);
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.c);
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException("Blocking API is not supported.");
    }
}
