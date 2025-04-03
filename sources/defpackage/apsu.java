package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apsu implements apuj {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/internal/BugleMessageMutationsStore");
    private final ennd b = new enqm(new enct());
    private apao c;

    @Override // defpackage.apuj
    public final List a(MessageId messageId) {
        return ffdx.ak(this.b.c(messageId));
    }

    @Override // defpackage.apuj
    public final void b() {
        this.c = null;
    }

    @Override // defpackage.apuj
    public final void c(apao apaoVar) {
        this.c = apaoVar;
    }

    @Override // defpackage.apuj
    public final void d(ConversationId conversationId, MessageId messageId, final String str) {
        synchronized (this.b) {
            Collection c = this.b.c(messageId);
            final ffji ffjiVar = new ffji() { // from class: apsq
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ffkj.e(((apss) obj).a.a, str));
                }
            };
            Collection.EL.removeIf(c, new Predicate() { // from class: apsr
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) ffji.this.invoke(obj)).booleanValue();
                }
            });
            if (c.isEmpty()) {
                this.b.d(messageId);
            }
            apao apaoVar = this.c;
            if (apaoVar != null) {
                alxd alxdVar = alxd.UPDATE;
                Instant now = Instant.now();
                now.getClass();
                apaoVar.a(alxdVar, messageId, conversationId, now);
            }
        }
    }

    @Override // defpackage.apuj
    public final apui e(ConversationId conversationId, MessageId messageId, apst apstVar) {
        apstVar.getClass();
        apss apssVar = new apss(apstVar);
        this.b.t(messageId, apssVar);
        ((enrr) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/internal/BugleMessageMutationsStore", "add", 57, "BugleMessageMutationsStore.kt")).D("OMv2: Added %s mutation for message %s to MutationsStore.", apstVar, messageId.a());
        apao apaoVar = this.c;
        if (apaoVar != null) {
            alxd alxdVar = alxd.UPDATE;
            Instant now = Instant.now();
            now.getClass();
            apaoVar.a(alxdVar, messageId, conversationId, now);
        }
        return apssVar.a;
    }
}
