package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amxk implements amyk, amev {
    public final amxs a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffsk e;
    private final ffsk f;

    public amxk(ffsk ffskVar, ffsk ffskVar2, amxs amxsVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.e = ffskVar;
        this.f = ffskVar2;
        this.a = amxsVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    @Override // defpackage.alxl
    public final elfl A(ConversationId conversationId, Uri uri) {
        elfl d = elfo.d(new UnsupportedOperationException("Icon update not supported for rbm conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl B(ConversationId conversationId) {
        conversationId.getClass();
        elfl d = elfo.d(new UnsupportedOperationException("upgradeConversation not supported for rbm conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl C(ConversationId conversationId, eoko eokoVar) {
        conversationId.getClass();
        eokoVar.getClass();
        ekzz f = eleg.f("RbmConversationRepository#deleteConversation");
        try {
            if (!(conversationId instanceof RbmConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            elfl C = ((amhs) this.b.b()).C(((RbmConversationId) conversationId).b, eokoVar);
            C.getClass();
            ffig.a(f, null);
            return C;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.alxl
    public final aqge D(int i) {
        return ((amhs) this.b.b()).D(i);
    }

    @Override // defpackage.alxl
    public final elfl E(engw engwVar, int i) {
        engwVar.getClass();
        amhs amhsVar = (amhs) this.b.b();
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            ConversationId conversationId = (ConversationId) it.next();
            if (!(conversationId instanceof RbmConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            arrayList.add(((RbmConversationId) conversationId).b);
        }
        elfl E = amhsVar.E(engq.a(arrayList), i);
        E.getClass();
        return E;
    }

    @Override // defpackage.alxl
    public final elfl F(engw engwVar, int i) {
        engwVar.getClass();
        amhs amhsVar = (amhs) this.b.b();
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            ConversationId conversationId = (ConversationId) it.next();
            if (!(conversationId instanceof RbmConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            arrayList.add(((RbmConversationId) conversationId).b);
        }
        return amhsVar.F(engq.a(arrayList), i);
    }

    @Override // defpackage.amev
    public final ConversationId G(amwl amwlVar) {
        amwlVar.getClass();
        amwk b = amwk.b(amwlVar.b);
        if (b == null) {
            b = amwk.UNRECOGNIZED;
        }
        if (b == amwk.RBM) {
            return RbmConversationId.d(amwlVar.c);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.amyk
    public final elfl H(ConversationId conversationId, avji avjiVar) {
        elfl c;
        avjiVar.getClass();
        c = axol.c(this.e, ffhe.a, ffsm.a, new amxi(this, conversationId, avjiVar, null));
        return c;
    }

    @Override // defpackage.alxl
    public final Conversation a(ConversationId conversationId, alxk alxkVar) {
        conversationId.getClass();
        alxkVar.getClass();
        ekzz f = eleg.f("RbmConversationRepository#openConversation");
        try {
            if (!(conversationId instanceof RbmConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            RbmConversation a = this.a.a(((amhs) this.b.b()).M(((RbmConversationId) conversationId).b, alxkVar, new aorw() { // from class: amxa
                @Override // defpackage.aorw
                public final void a(engw engwVar) {
                    engwVar.getClass();
                }
            }));
            ffig.a(f, null);
            return a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.alxl
    public final /* synthetic */ ConversationId b(amwl amwlVar) {
        return ameu.a();
    }

    @Override // defpackage.alxl
    public final /* synthetic */ ConversationId c(byte[] bArr) {
        return ameu.b();
    }

    @Override // defpackage.alxl
    public final aqge d(ConversationId conversationId) {
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.alxl
    public final elfl e(ConversationId conversationId, eoko eokoVar) {
        eokoVar.getClass();
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        elfl e = ((amhs) this.b.b()).e(((RbmConversationId) conversationId).b, eokoVar);
        e.getClass();
        return e;
    }

    @Override // defpackage.alxl
    public final elfl f(ConversationId conversationId) {
        conversationId.getClass();
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        elfl f = ((amhs) this.b.b()).f(((RbmConversationId) conversationId).b);
        f.getClass();
        return f;
    }

    @Override // defpackage.alxl
    public final elfl g(anvc anvcVar) {
        elfl c;
        engw engwVar = anvcVar.a;
        if (engwVar.size() == 1 && ((Recipient) engwVar.get(0)).g().B()) {
            c = axol.c(this.f, ffhe.a, ffsm.a, new amxe(this, anvcVar, null));
            return c;
        }
        elfl d = elfo.d(new IllegalArgumentException("Recipients don't contain exactly rbm bot"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl h(azcr azcrVar) {
        elfl c;
        azcrVar.getClass();
        c = axol.c(this.f, ffhe.a, ffsm.a, new amxf(this, azcrVar, null));
        return c;
    }

    @Override // defpackage.alxl
    @ffbs
    public final elfl i(engw engwVar) {
        elfl c;
        engwVar.getClass();
        if (((enou) engwVar).c == 1 && ((Recipient) engwVar.get(0)).g().B()) {
            c = axol.c(this.f, ffhe.a, ffsm.a, new amxd(this, engwVar, null));
            return c;
        }
        elfl d = elfo.d(new IllegalArgumentException("Recipients don't contain exactly rbm bot"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl j() {
        int i = engw.d;
        elfl e = elfo.e(enou.a);
        e.getClass();
        return e;
    }

    @Override // defpackage.alxl
    public final elfl k(engw engwVar, String str) {
        engwVar.getClass();
        return m(Optional.empty(), engwVar, str);
    }

    @Override // defpackage.alxl
    public final elfl l(azcr azcrVar, aqux aquxVar, amer amerVar) {
        elfl c;
        azcrVar.getClass();
        amerVar.getClass();
        c = axol.c(this.f, ffhe.a, ffsm.a, new amxh(this, azcrVar, aquxVar, amerVar, null));
        return c;
    }

    @Override // defpackage.alxl
    public final elfl m(Optional optional, engw engwVar, String str) {
        elfl c;
        optional.getClass();
        engwVar.getClass();
        if (engwVar.size() == 1 && ((Recipient) engwVar.get(0)).g().B()) {
            c = axol.c(this.f, ffhe.a, ffsm.a, new amxg(this, optional, engwVar, str, null));
            return c;
        }
        elfl d = elfo.d(new IllegalArgumentException("Recipients don't contain exactly rbm bot"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl n(ConversationId conversationId, ampp amppVar, Recipient recipient) {
        recipient.getClass();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.alxl
    public final elfl o(ConversationId conversationId) {
        elfl d = elfo.d(new UnsupportedOperationException("Leave not supported for rbm conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl p(engw engwVar) {
        engwVar.getClass();
        elfl d = elfo.d(new UnsupportedOperationException("Leave not supported for rbm conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl q(ConversationId conversationId, ampp amppVar) {
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        elfl q = ((amhs) this.b.b()).q(((RbmConversationId) conversationId).b, amppVar);
        q.getClass();
        return q;
    }

    @Override // defpackage.alxl
    public final elfl r(Recipient recipient) {
        elfl d = elfo.d(new UnsupportedOperationException("refreshAllConversationIconsForRecipient not supported for rbm conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl s(ConversationId conversationId, String str) {
        str.getClass();
        elfl d = elfo.d(new UnsupportedOperationException("Rename not supported for rbm conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl t(ConversationId conversationId, aqux aquxVar) {
        elfl c;
        conversationId.getClass();
        aquxVar.getClass();
        c = axol.c(this.f, ffhe.a, ffsm.a, new amxj(conversationId, this, aquxVar, null));
        return c;
    }

    @Override // defpackage.alxl
    public final elfl u(ConversationId conversationId, String str, String str2, apmq apmqVar) {
        conversationId.getClass();
        if (conversationId instanceof RbmConversationId) {
            return ((amhs) this.b.b()).u(((RbmConversationId) conversationId).b, str, str2, apmqVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.alxl
    public final elfl v(ConversationId conversationId, String str, Uri uri) {
        conversationId.getClass();
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        elfl v = ((amhs) this.b.b()).v(((RbmConversationId) conversationId).b, str, uri);
        v.getClass();
        return v;
    }

    @Override // defpackage.alxl
    public final elfl w(ConversationId conversationId, amny amnyVar) {
        amnyVar.getClass();
        elfl d = elfo.d(new UnsupportedOperationException("setParentalApprovalStatusLocally not supported for rbm conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl x(ConversationId conversationId, cuea cueaVar) {
        cueaVar.getClass();
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        elfl x = ((amhs) this.b.b()).x(((RbmConversationId) conversationId).b, cueaVar);
        x.getClass();
        return x;
    }

    @Override // defpackage.alxl
    public final elfl y(ConversationId conversationId, eoko eokoVar) {
        eokoVar.getClass();
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        elfl y = ((amhs) this.b.b()).y(((RbmConversationId) conversationId).b, eokoVar);
        y.getClass();
        return y;
    }

    @Override // defpackage.alxl
    public final elfl z(ConversationId conversationId, cuex cuexVar, String str, boolean z, cuea cueaVar) {
        cuexVar.getClass();
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        elfl z2 = ((amhs) this.b.b()).z(((RbmConversationId) conversationId).b, cuexVar, str, false, cueaVar);
        z2.getClass();
        return z2;
    }
}
