package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoyl implements alym {
    public final ConversationId a;
    private final cqoh b;
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private final ctbl d;

    public aoyl(cqoh cqohVar, ctbk ctbkVar, ConversationId conversationId) {
        this.b = cqohVar;
        this.a = conversationId;
        this.d = ctbkVar.a(new aoyk());
    }

    @Override // defpackage.alym
    public final alyl a(MessageId messageId) {
        alyl alylVar = (alyl) this.c.get(messageId);
        return alylVar == null ? alyh.a : alylVar;
    }

    @Override // defpackage.alym
    public final ctbx b(final alyd alydVar) {
        return this.d.a(new ctbf() { // from class: aoyi
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return alyd.this.a((alyc) obj);
            }
        }, "DefaultOptimisticReactionsCache::register", "DefaultOptimisticReactionsCache::callback", "DefaultOptimisticReactionsCache::unregister");
    }

    @Override // defpackage.alym
    public final void c(final MessageId messageId, apyv apyvVar, aqux aquxVar, fjay fjayVar) {
        alyj alykVar;
        fjayVar.getClass();
        final Instant f = this.b.f();
        if (apyvVar != null) {
            f.getClass();
            alykVar = new alyi(aquxVar, f, fjayVar, apyvVar);
        } else {
            f.getClass();
            alykVar = new alyk(aquxVar, f, fjayVar);
        }
        this.c.put(messageId, alykVar);
        this.d.c(new Supplier() { // from class: aoyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new apsl(alxd.UPDATE, MessageId.this, this.a, f, 0);
            }
        }, "DefaultOptimisticReactionsCache::notify");
    }
}
