package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amqw implements amrr, amev, alxl {
    public final Context a;
    public final amrd b;
    public final amhs c;
    private final ffsk d;
    private final ffsk e;
    private final amrw f;

    public amqw(ffsk ffskVar, ffsk ffskVar2, Context context, amrd amrdVar, amhs amhsVar, amrw amrwVar) {
        ffskVar.getClass();
        ffskVar2.getClass();
        context.getClass();
        amhsVar.getClass();
        amrwVar.getClass();
        this.d = ffskVar;
        this.e = ffskVar2;
        this.a = context;
        this.b = amrdVar;
        this.c = amhsVar;
        this.f = amrwVar;
    }

    @Override // defpackage.alxl
    public final elfl A(ConversationId conversationId, Uri uri) {
        return this.c.A(conversationId, uri);
    }

    @Override // defpackage.alxl
    public final elfl B(ConversationId conversationId) {
        conversationId.getClass();
        elfl d = elfo.d(new UnsupportedOperationException("upgradeConversation not supported for emergency conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl C(ConversationId conversationId, eoko eokoVar) {
        conversationId.getClass();
        eokoVar.getClass();
        ekzz f = eleg.f("EmergencyConversationRepository#deleteConversation");
        try {
            if (!(conversationId instanceof EmergencyConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            elfl C = this.c.C(((EmergencyConversationId) conversationId).d(), eokoVar);
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
        return this.c.D(i);
    }

    @Override // defpackage.alxl
    public final elfl E(engw engwVar, int i) {
        engwVar.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            ConversationId conversationId = (ConversationId) it.next();
            if (!(conversationId instanceof EmergencyConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            arrayList.add(((EmergencyConversationId) conversationId).d());
        }
        elfl E = this.c.E(engq.a(arrayList), i);
        E.getClass();
        return E;
    }

    @Override // defpackage.alxl
    public final elfl F(engw engwVar, int i) {
        engwVar.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            ConversationId conversationId = (ConversationId) it.next();
            if (!(conversationId instanceof EmergencyConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            arrayList.add(((EmergencyConversationId) conversationId).d());
        }
        return this.c.F(engq.a(arrayList), i);
    }

    @Override // defpackage.amev
    public final ConversationId G(amwl amwlVar) {
        amwlVar.getClass();
        amwk b = amwk.b(amwlVar.b);
        if (b == null) {
            b = amwk.UNRECOGNIZED;
        }
        if (b != amwk.EMERGENCY) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String str = amwlVar.c;
        str.getClass();
        return amrg.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.amqu
            if (r0 == 0) goto L13
            r0 = r6
            amqu r0 = (defpackage.amqu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amqu r0 = new amqu
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation r5 = r0.e
            amqw r0 = r0.d
            defpackage.ffci.b(r6)
            goto L4e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            aqge r6 = r5.m()
            elfl r6 = r6.b()
            r6.getClass()
            r0.d = r4
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto L75
            r0 = r4
        L4e:
            alxj r6 = (defpackage.alxj) r6
            android.net.Uri r6 = r6.a()
            if (r6 == 0) goto L62
            java.lang.String r6 = defpackage.crjm.s(r6)
            java.lang.String r1 = "d"
            boolean r6 = defpackage.ffkj.e(r6, r1)
            if (r6 == 0) goto L72
        L62:
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId r5 = r5.i
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r5.a
            ffsk r6 = r0.e
            amqv r1 = new amqv
            r2 = 0
            r1.<init>(r0, r5, r2)
            r5 = 3
            defpackage.axol.k(r6, r2, r1, r5)
        L72:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amqw.H(com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation, ffgu):java.lang.Object");
    }

    @Override // defpackage.amrr
    public final void I() {
        final amrw amrwVar = this.f;
        amrwVar.a.c(new Supplier() { // from class: amru
            @Override // java.util.function.Supplier
            public final Object get() {
                return Boolean.valueOf(amrw.this.a());
            }
        }, "LocationPermissionManagerImpl::Notify");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation] */
    @Override // defpackage.alxl
    public final Conversation a(ConversationId conversationId, alxk alxkVar) {
        conversationId.getClass();
        alxkVar.getClass();
        if (!(conversationId instanceof EmergencyConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        EmergencyConversation a = this.b.a(this.c.a(((EmergencyConversationId) conversationId).d(), alxkVar));
        axol.k(this.d, null, new amqt(this, a, null), 3);
        return a;
    }

    @Override // defpackage.alxl
    public final ConversationId b(amwl amwlVar) {
        return this.c.b(amwlVar);
    }

    @Override // defpackage.alxl
    public final ConversationId c(byte[] bArr) {
        return this.c.c(bArr);
    }

    @Override // defpackage.alxl
    public final aqge d(ConversationId conversationId) {
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.alxl
    public final elfl e(ConversationId conversationId, eoko eokoVar) {
        eokoVar.getClass();
        if (!(conversationId instanceof EmergencyConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        elfl e = this.c.e(((EmergencyConversationId) conversationId).d(), eokoVar);
        e.getClass();
        return e;
    }

    @Override // defpackage.alxl
    public final elfl f(ConversationId conversationId) {
        conversationId.getClass();
        if (!(conversationId instanceof EmergencyConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        elfl f = this.c.f(((EmergencyConversationId) conversationId).d());
        f.getClass();
        return f;
    }

    @Override // defpackage.alxl
    public final elfl g(anvc anvcVar) {
        elfl c;
        engw engwVar = anvcVar.a;
        if (engwVar.size() == 1 && ((Recipient) engwVar.get(0)).g().w()) {
            c = axol.c(this.d, ffhe.a, ffsm.a, new amqr(this, anvcVar, null));
            return c;
        }
        elfl e = elfo.e(enou.a);
        e.getClass();
        return e;
    }

    @Override // defpackage.alxl
    public final elfl h(azcr azcrVar) {
        return this.c.h(azcrVar);
    }

    @Override // defpackage.alxl
    @ffbs
    public final elfl i(engw engwVar) {
        elfl c;
        engwVar.getClass();
        if (((enou) engwVar).c == 1 && ((Recipient) engwVar.get(0)).g().w()) {
            c = axol.c(this.d, ffhe.a, ffsm.a, new amqq(this, engwVar, null));
            return c;
        }
        elfl e = elfo.e(Optional.empty());
        e.getClass();
        return e;
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
        return this.c.l(azcrVar, aquxVar, amerVar);
    }

    @Override // defpackage.alxl
    public final elfl m(Optional optional, engw engwVar, String str) {
        elfl c;
        optional.getClass();
        engwVar.getClass();
        if (engwVar.size() == 1 && ((Recipient) engwVar.get(0)).g().w()) {
            c = axol.c(this.d, ffhe.a, ffsm.a, new amqs(this, optional, engwVar, str, null));
            return c;
        }
        elfl d = elfo.d(new IllegalArgumentException("Recipients don't contain exactly one emergency recipient"));
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
        elfl d = elfo.d(new UnsupportedOperationException("Leave not supported for emergency conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl p(engw engwVar) {
        engwVar.getClass();
        elfl d = elfo.d(new UnsupportedOperationException("Leave not supported for emergency conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl q(ConversationId conversationId, ampp amppVar) {
        if (!(conversationId instanceof EmergencyConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        elfl q = this.c.q(((EmergencyConversationId) conversationId).d(), amppVar);
        q.getClass();
        return q;
    }

    @Override // defpackage.alxl
    public final elfl r(Recipient recipient) {
        return this.c.r(recipient);
    }

    @Override // defpackage.alxl
    public final elfl s(ConversationId conversationId, String str) {
        str.getClass();
        elfl d = elfo.d(new UnsupportedOperationException("Rename not supported for emergency conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl t(ConversationId conversationId, aqux aquxVar) {
        conversationId.getClass();
        aquxVar.getClass();
        ekzz f = eleg.f("EmergencyConversationRepository#setActiveSelfIdentity");
        try {
            if (!(conversationId instanceof EmergencyConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            elfl t = this.c.t(((EmergencyConversationId) conversationId).d(), aquxVar);
            t.getClass();
            ffig.a(f, null);
            return t;
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
    public final elfl u(ConversationId conversationId, String str, String str2, apmq apmqVar) {
        conversationId.getClass();
        if (conversationId instanceof EmergencyConversationId) {
            return this.c.u(((EmergencyConversationId) conversationId).d(), str, str2, apmqVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.alxl
    public final elfl v(ConversationId conversationId, String str, Uri uri) {
        conversationId.getClass();
        elfl d = elfo.d(new UnsupportedOperationException("setNameAndIcon not supported for emergency conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl w(ConversationId conversationId, amny amnyVar) {
        amnyVar.getClass();
        elfl d = elfo.d(new UnsupportedOperationException("setParentalApprovalStatusLocally not supported for emergency conversation"));
        d.getClass();
        return d;
    }

    @Override // defpackage.alxl
    public final elfl x(ConversationId conversationId, cuea cueaVar) {
        return this.c.x(conversationId, cueaVar);
    }

    @Override // defpackage.alxl
    public final elfl y(ConversationId conversationId, eoko eokoVar) {
        eokoVar.getClass();
        if (!(conversationId instanceof EmergencyConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        elfl y = this.c.y(((EmergencyConversationId) conversationId).d(), eokoVar);
        y.getClass();
        return y;
    }

    @Override // defpackage.alxl
    public final elfl z(ConversationId conversationId, cuex cuexVar, String str, boolean z, cuea cueaVar) {
        return this.c.z(conversationId, cuexVar, str, z, cueaVar);
    }
}
