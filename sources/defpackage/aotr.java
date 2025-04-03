package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aotr implements apvd {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds");
    public final ffji b;
    private final aotj c;
    private final errl d;
    private final boolean e;

    public aotr(aotk aotkVar, errl errlVar, final aotl aotlVar, boolean z) {
        this.c = aotkVar.a(z);
        this.d = errlVar;
        this.b = new ffji() { // from class: aoto
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                alxr alxrVar = (alxr) obj;
                return aotl.this.aa(alxrVar.b(), alxrVar.n());
            }
        };
        this.e = z;
    }

    static final void e(boolean z, String str) {
        if (z) {
            return;
        }
        ensk j = a.j();
        j.Y(ente.a, "BugleMapi");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "checkConsistency", 329, "BuglePagingClipToBounds.java")).t("PagingClipToBounds check consistency failed: %s", str);
    }

    public static final engw f(engw engwVar, int i, int i2) {
        int min = Math.min(i2, engwVar.size());
        if (i < 0) {
            ensk h = a.h();
            h.Y(ente.a, "BugleMapi");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "subList", 303, "BuglePagingClipToBounds.java")).q("Correcting clip to bounds newStart, previously was out of bounds");
            i = 0;
        }
        ensk h2 = a.h();
        h2.Y(ente.a, "BugleMapi");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "subList", 307, "BuglePagingClipToBounds.java")).J("clipping message list, newStart: %d, newEnd (exclusive) %d, list's size: %d", Integer.valueOf(i), Integer.valueOf(min), Integer.valueOf(engwVar.size()));
        return engwVar.subList(i, min);
    }

    public final boolean a(engw engwVar) {
        if (!this.e || engwVar.size() < 2) {
            return false;
        }
        return (((alxr) engwVar.get(0)).b() instanceof CoreBuglePartialMessageId) || (((alxr) enjk.j(engwVar)).b() instanceof CoreBuglePartialMessageId);
    }

    public final void b(apvf apvfVar, int i) {
        e(apvfVar.b >= 0, "PagingResults itemsBefore cannot be negative");
        e(apvfVar.c >= 0, "PagingResults itemsAfter cannot be negative");
        e(apvfVar.a.size() >= i || apvfVar.c == 0 || apvfVar.b == 0, "PagingResults cannot have remaining items before and after if the returned list's size is less than the limit requested.");
    }

    public final elfl c(final engw engwVar, final int i, boolean z) {
        if (!a(engwVar)) {
            ensk e = a.e();
            e.Y(ente.a, "BugleMapi");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "clip", 61, "BuglePagingClipToBounds.java")).J("returning message list without clipping, offset: %d, limit %d, list's size: %d", 0, Integer.valueOf(i), Integer.valueOf(engwVar.size()));
            return elfo.e(engwVar);
        }
        alxr alxrVar = (alxr) engwVar.get(0);
        if (!(alxrVar.b() instanceof CoreBuglePartialMessageId)) {
            return elfo.e(f(engwVar, 0, i));
        }
        CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) alxrVar.b();
        return this.c.e((BugleConversationId) alxrVar.f(), coreBuglePartialMessageId.a, coreBuglePartialMessageId.b, alxrVar.n().toEpochMilli(), z).h(new emwl() { // from class: aotq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Integer num = (Integer) obj;
                aotr.e(num.intValue() <= 0, "underlying data changed between queries");
                int i2 = -num.intValue();
                return aotr.f(engw.this, i2, i + i2);
            }
        }, this.d);
    }

    @Override // defpackage.apvd
    public final elfl d(final apvf apvfVar, final int i, final int i2) {
        if (!a(apvfVar.a)) {
            b(apvfVar, i2);
            return elfo.e(apvfVar);
        }
        final engw engwVar = apvfVar.a;
        alxr alxrVar = (alxr) engwVar.get(0);
        if (!(alxrVar.b() instanceof CoreBuglePartialMessageId)) {
            apvf apvfVar2 = new apvf(f(engwVar, 0, i2), apvfVar.b, apvfVar.c + Math.max(0, apvfVar.a.size() - i2), this.b);
            b(apvfVar2, i2);
            return elfo.e(apvfVar2);
        }
        CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) alxrVar.b();
        return this.c.e((BugleConversationId) alxrVar.f(), coreBuglePartialMessageId.a, coreBuglePartialMessageId.b, alxrVar.n().toEpochMilli(), false).h(new emwl() { // from class: aotp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                int i3 = i;
                aotr.e(i3 >= intValue, "underlying data changed between queries");
                int intValue2 = i3 - num.intValue();
                engw engwVar2 = engwVar;
                int i4 = i2;
                engw f = aotr.f(engwVar2, intValue2, i4 + intValue2);
                int size = engwVar2.size() - f.size();
                apvf apvfVar3 = apvfVar;
                long j = apvfVar3.c + size;
                aotr aotrVar = aotr.this;
                apvf apvfVar4 = new apvf(f, apvfVar3.b, j, aotrVar.b);
                aotrVar.b(apvfVar4, i4);
                return apvfVar4;
            }
        }, this.d);
    }
}
