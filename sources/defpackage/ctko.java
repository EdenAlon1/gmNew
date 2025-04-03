package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctko implements ctjh {
    public final ffbr a;
    public final ffbr b;
    public final ffhd c;
    public final ffsk d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    private final ffhd h;
    private final ffsk i;

    public ctko(ffbr ffbrVar, ffbr ffbrVar2, ffhd ffhdVar, ffhd ffhdVar2, ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffhdVar;
        this.h = ffhdVar2;
        this.d = ffskVar;
        this.i = ffskVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
    }

    @Override // defpackage.ctjh
    public final elfl a(String str) {
        elfl c;
        c = axol.c(this.i, ffhe.a, ffsm.a, new ctjq(this, str, null));
        return c;
    }

    @Override // defpackage.ctjh
    public final elfl b(MessageIdType messageIdType, ConversationIdType conversationIdType, fbwv fbwvVar, eopx eopxVar) {
        elfl c;
        messageIdType.getClass();
        conversationIdType.getClass();
        fbwvVar.getClass();
        eopxVar.getClass();
        c = axol.c(this.i, ffhe.a, ffsm.a, new ctjt(this, messageIdType, conversationIdType, fbwvVar, eopxVar, null));
        return c;
    }

    @Override // defpackage.ctjh
    public final elfl c(boolean z, MessageCoreData messageCoreData, eooi eooiVar) {
        elfl c;
        eooiVar.getClass();
        c = axol.c(this.i, ffhe.a, ffsm.a, new ctjv(this, z, messageCoreData, eooiVar, null));
        return c;
    }

    @Override // defpackage.ctjh
    public final elfl d(MessageCoreData messageCoreData, eooi eooiVar) {
        elfl c;
        eooiVar.getClass();
        c = axol.c(this.i, ffhe.a, ffsm.a, new ctkb(this, messageCoreData, eooiVar, null));
        return c;
    }

    @Override // defpackage.ctjh
    public final elfl e(ConversationIdType conversationIdType, long j, eooi eooiVar) {
        elfl c;
        conversationIdType.getClass();
        eooiVar.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new ctka(this, conversationIdType, j, eooiVar, null));
        return c;
    }

    @Override // defpackage.ctjh
    public final elfl f(SuggestionData suggestionData, eoqz eoqzVar, fbqp fbqpVar, boolean z, float f, Boolean bool, Boolean bool2) {
        elfl c;
        suggestionData.getClass();
        eoqzVar.getClass();
        fbqpVar.getClass();
        c = axol.c(this.i, ffhe.a, ffsm.a, new ctkf(this, suggestionData, eoqzVar, fbqpVar, z, f, bool, bool2, null));
        return c;
    }

    @Override // defpackage.ctjh
    public final elfl g(ConversationIdType conversationIdType, MessageCoreData messageCoreData, long j) {
        elfl c;
        c = axol.c(this.i, ffhe.a, ffsm.a, new ctkn(this, conversationIdType, j, messageCoreData, null));
        return c;
    }

    @Override // defpackage.ctjh
    public final Object h(String str, ffgu ffguVar) {
        Object a = ffra.a(ekxi.a(this.h), new ctjo(null, this, str), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.ctjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r19, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r20, defpackage.fbwv r21, defpackage.eopx r22, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctko.i(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fbwv, eopx, ffgu):java.lang.Object");
    }

    @Override // defpackage.ctjh
    public final Object j(SuggestionData suggestionData, eoqz eoqzVar, fbqp fbqpVar, boolean z, float f, Boolean bool, Boolean bool2, ffgu ffguVar) {
        Object a = ffra.a(ekxi.a(this.h), new ctkc(null, suggestionData, this, fbqpVar, eoqzVar, z, f, bool, bool2), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.ctjh
    public final Object k(final anzd anzdVar, ffgu ffguVar) {
        Object q = q(bdgq.b(anzdVar.c), new ffji() { // from class: ctji
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Uri uri = (Uri) obj;
                uri.getClass();
                eygr eygrVar = anzd.this.d;
                eygrVar.getClass();
                boolean z = false;
                if (!eygrVar.isEmpty()) {
                    Iterator<E> it = eygrVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (ffkj.e((String) it.next(), uri.toString())) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }, (long) anzdVar.f, ffguVar);
        return q == ffhh.a ? q : ffcu.a;
    }

    @Override // defpackage.ctjh
    public final void l(MessageIdType messageIdType, ConversationIdType conversationIdType, fbwv fbwvVar, eopx eopxVar) {
        eopxVar.getClass();
        axol.k(this.i, null, new ctjn(this, messageIdType, conversationIdType, fbwvVar, null), 3);
    }

    @Override // defpackage.ctjh
    public final Object m(Long l, boolean z, ConversationIdType conversationIdType, fbrc fbrcVar, eopx eopxVar) {
        l.longValue();
        ((ctkr) this.g.b()).a(z ? epjp.REPLY : epjp.CONTINUATION, fbqp.CONVERSATION_VIEW, ctjg.b(l.longValue()), conversationIdType, fbrcVar, eopxVar);
        return ffcu.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.ctjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctko.n(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    @Override // defpackage.ctjh
    public final /* synthetic */ elfl o(SuggestionData suggestionData, eoqz eoqzVar, fbqp fbqpVar) {
        suggestionData.getClass();
        eoqzVar.getClass();
        fbqpVar.getClass();
        return f(suggestionData, eoqzVar, fbqpVar, false, -1.0f, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ctjm
            if (r0 == 0) goto L13
            r0 = r7
            ctjm r0 = (defpackage.ctjm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctjm r0 = new ctjm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.c
            ffhd r7 = defpackage.ekxi.a(r7)
            ctjl r2 = new ctjl
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 == r1) goto L78
        L46:
            java.util.List r7 = (java.util.List) r7
            cfva r6 = defpackage.ctjd.e
            java.lang.Object r6 = r6.e()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L77
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r7.next()
            r1 = r0
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r1 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r1
            boolean r1 = defpackage.bduu.c(r1)
            if (r1 == 0) goto L5f
            r6.add(r0)
            goto L5f
        L76:
            return r6
        L77:
            return r7
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctko.p(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, ffgu):java.lang.Object");
    }

    public final Object q(ConversationIdType conversationIdType, ffji ffjiVar, long j, ffgu ffguVar) {
        Object a = ffra.a(ekxi.a(this.h), new ctkg(null, this, conversationIdType, j, ffjiVar), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public final ffss r(MessageCoreData messageCoreData) {
        if (!((Boolean) ((cfup) ctjd.ae.get()).e()).booleanValue()) {
            int i = engw.d;
            return ffrr.a(enou.a);
        }
        ctqh ctqhVar = (ctqh) this.b.b();
        ffsk ffskVar = this.d;
        ffhe ffheVar = ffhe.a;
        return ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new ctjj(null, ctqhVar, messageCoreData));
    }

    public final ffss s(MessageIdType messageIdType) {
        ctiz ctizVar = (ctiz) this.e.b();
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return ffra.b(this.d, ekxi.a(ffheVar), ffsmVar, new ctjk(null, ctizVar, this, messageIdType));
    }
}
