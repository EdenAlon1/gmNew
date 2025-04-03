package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvlf {
    private static final cskc d = cskc.g("Bugle", "ConversationXmsLatchUpdater");
    public final ffbr a;
    public final cqoh b;
    public final errl c;
    private final altk e;
    private final cbgf f;
    private final dtuu g;

    public cvlf(ffbr ffbrVar, altk altkVar, cbgf cbgfVar, dtuu dtuuVar, cqoh cqohVar, errl errlVar) {
        this.a = ffbrVar;
        this.e = altkVar;
        this.f = cbgfVar;
        this.g = dtuuVar;
        this.b = cqohVar;
        this.c = errlVar;
    }

    private final boolean d(boolean z, final ConversationIdType conversationIdType) {
        if (conversationIdType.b()) {
            csjb d2 = d.d();
            d2.I("Conversation ID empty, Failed to ");
            d2.I(true == z ? "latch to" : "unlatch from");
            d2.I("xMS.");
            d2.r();
            return false;
        }
        bseh r = ((bczy) this.a.b()).r(conversationIdType);
        if (r == null) {
            csjb e = d.e();
            e.I("Found conversation is null, failed to ");
            e.I(true == z ? "latch to" : "unlatch from");
            e.I("xMS.");
            e.r();
            return false;
        }
        if (r.k() != 0) {
            d.q("xMS latching disabled for group conversations.");
            return false;
        }
        final int i = true != z ? 0 : 2;
        int r2 = r.r();
        if (r2 != 2) {
            if (r2 == 0) {
                r2 = 0;
            }
            return false;
        }
        if (r2 != i && ((Boolean) this.g.c("UpdateConversationXmsLatchAction#executeAction", new emyl() { // from class: cvlb
            @Override // defpackage.emyl
            public final Object get() {
                cvlf cvlfVar = cvlf.this;
                bczy bczyVar = (bczy) cvlfVar.a.b();
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.ap("updateLatch");
                bsoeVar.V(i);
                bsoeVar.Z(cvlfVar.b.f().toEpochMilli());
                return Boolean.valueOf(bczyVar.ak(conversationIdType, bsoeVar));
            }
        })).booleanValue()) {
            csjb c = d.c();
            c.I("Conversation");
            c.I(true != z ? "unlatched from" : "latched to");
            c.I("xMS.");
            c.r();
            this.f.d(conversationIdType);
            return true;
        }
        return false;
    }

    public final elfl a(final ConversationIdType conversationIdType, final eokl eoklVar) {
        return elfo.g(new Callable() { // from class: cvla
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(cvlf.this.b(conversationIdType, eoklVar));
            }
        }, this.c);
    }

    public final boolean b(ConversationIdType conversationIdType, eokl eoklVar) {
        efbd.b();
        csjb d2 = d.d();
        d2.I("Attempting to latch the conversation to XMS.");
        d2.A("conversationId", conversationIdType);
        d2.r();
        boolean d3 = d(true, conversationIdType);
        if (d3) {
            this.e.u(conversationIdType, eoklVar);
        }
        return d3;
    }

    public final boolean c(ConversationIdType conversationIdType, int i) {
        efbd.b();
        csjb d2 = d.d();
        d2.I("Attempting to unlatch the XMS conversation.");
        d2.A("conversationId", conversationIdType);
        d2.r();
        boolean d3 = d(false, conversationIdType);
        if (d3) {
            this.e.ay(conversationIdType, i);
        }
        return d3;
    }
}
