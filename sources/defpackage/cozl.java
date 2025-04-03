package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozl {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/sms/ThreadInfoCache");
    private final cno b = new cno();
    private final cno c = new cno();
    private final HashSet d = new HashSet();
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public cozl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
    }

    public final synchronized cpbd a(cotp cotpVar, long j, String str) {
        cpbd cpbdVar = (cpbd) this.c.d(j);
        if (cpbdVar == null || cpbdVar.b.isEmpty()) {
            cpbdVar = ((coxk) this.f.b()).y(cotpVar, j, str);
            if (!cpbdVar.b.isEmpty()) {
                this.c.h(j, cpbdVar);
            }
        }
        if (!cpbdVar.b.isEmpty()) {
            return cpbdVar;
        }
        ensk j2 = a.j();
        j2.Y(ente.a, "Bugle");
        ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "getThreadData", 204, "ThreadInfoCache.java")).s("Use unknown sender since thread couldn't find any recipients. threadId: %s", j);
        return new cpbd(j, engw.r(((aolr) this.g.b()).n("ʼUNKNOWN_SENDER!ʼ")), false);
    }

    public final synchronized void b() {
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "clear", 59, "ThreadInfoCache.java")).q("Cleared ThreadInfoCache");
        this.b.g();
        this.c.g();
        this.d.clear();
    }

    public final synchronized boolean c(ConversationIdType conversationIdType) {
        return this.d.contains(conversationIdType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final synchronized ConversationIdType d(long j, int i, cqdh cqdhVar, String str, byyt byytVar, boolean z) {
        ConversationIdType a2;
        ?? r1;
        ConversationIdType conversationIdType = bdgq.a;
        cno cnoVar = this.b;
        int b = cpu.b(cnoVar.b, cnoVar.d, j);
        if (b >= 0 && (r1 = cnoVar.c[b]) != cnp.a) {
            conversationIdType = r1;
        }
        ConversationIdType conversationIdType2 = conversationIdType;
        if (!conversationIdType2.b()) {
            ensk e = a.e();
            e.Y(ente.a, "Bugle");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "getOrCreateConversation", 92, "ThreadInfoCache.java")).A("Getting existing conversation (a mapping from the thread id to the conversation id already exists). threadId: %s, conversationId: %s", j, conversationIdType2);
            return conversationIdType2;
        }
        cpbd a3 = a(coto.c, j, str);
        long j2 = a3.a;
        String str2 = a3.e;
        ArrayList K = ((bczy) this.e.b()).K(a3, i);
        if (cqdhVar != null) {
            bczy bczyVar = (bczy) this.e.b();
            bdgc z2 = bdgd.z(cqdhVar);
            z2.z(new cpxu(j2));
            z2.p(K);
            ((bczj) z2).b = Optional.ofNullable(a3.c);
            z2.k(true);
            z2.l(false);
            z2.s(Optional.ofNullable(str2));
            z2.t(Optional.ofNullable(a3.d));
            a2 = bczyVar.k(z2.A(), z).a();
            if (!a2.b() && (cqdhVar.a.d() || a3.g)) {
                this.d.add(a2);
            }
        } else {
            int i2 = z ? 0 : a3.f;
            bczy bczyVar2 = (bczy) this.e.b();
            bdgc y = bdgd.y();
            y.z(new cpxu(j2));
            y.f(byytVar);
            y.p(K);
            y.m(i2);
            ((bczj) y).b = Optional.ofNullable(a3.c);
            y.k(true);
            y.l(false);
            y.s(Optional.ofNullable(str2));
            y.t(Optional.ofNullable(a3.d));
            a2 = bczyVar2.k(y.A(), z).a();
            if (!a2.b() && (byytVar.d() || a3.g)) {
                this.d.add(a2);
            }
        }
        if (a2.b()) {
            ensk e2 = a.e();
            e2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "getOrCreateConversation", 175, "ThreadInfoCache.java")).A("Failed to create conversation. Returning null conversation id. threadId: %s, conversationId: %s", j2, a2);
            return bdgq.a;
        }
        this.b.h(j2, a2);
        ensk e3 = a.e();
        e3.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "getOrCreateConversation", 169, "ThreadInfoCache.java")).A("Conversation created successfully. threadId: %s, conversationId: %s", j2, a2);
        return a2;
    }
}
