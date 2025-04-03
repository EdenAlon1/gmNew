package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apbk implements aotl {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository");
    public final ffbr a;
    public final ffbr b;
    private final ffsk d;
    private final ffbr e;
    private final aotl f;
    private final ffbz g = ffca.a(new ffix() { // from class: apar
        @Override // defpackage.ffix
        public final Object invoke() {
            apbk apbkVar = apbk.this;
            return ((aptw) apbkVar.b.b()).a(apbkVar);
        }
    });

    public apbk(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, aotl aotlVar) {
        this.d = ffskVar;
        this.e = ffbrVar;
        this.a = ffbrVar2;
        this.b = ffbrVar3;
        this.f = aotlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.apbk r4, defpackage.alxw r5, int r6, defpackage.ffgu r7) {
        /*
            boolean r0 = r7 instanceof defpackage.apbc
            if (r0 == 0) goto L13
            r0 = r7
            apbc r0 = (defpackage.apbc) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            apbc r0 = new apbc
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            apbk r4 = r0.c
            defpackage.ffci.b(r7)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.ffci.b(r7)
            aotl r7 = r4.f
            elfl r5 = r7.ai(r5, r6)
            r5.getClass()
            r0.c = r4
            r0.b = r3
            java.lang.Object r7 = defpackage.fgfz.c(r5, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            engw r7 = (defpackage.engw) r7
            r7.getClass()
            engw r4 = r4.as(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbk.ad(apbk, alxw, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ae(defpackage.apbk r4, defpackage.alxw r5, int r6, defpackage.ffgu r7) {
        /*
            boolean r0 = r7 instanceof defpackage.apbe
            if (r0 == 0) goto L13
            r0 = r7
            apbe r0 = (defpackage.apbe) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            apbe r0 = new apbe
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            apbk r4 = r0.c
            defpackage.ffci.b(r7)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.ffci.b(r7)
            aotl r7 = r4.f
            elfl r5 = r7.aj(r5, r6)
            r5.getClass()
            r0.c = r4
            r0.b = r3
            java.lang.Object r7 = defpackage.fgfz.c(r5, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            engw r7 = (defpackage.engw) r7
            r7.getClass()
            engw r4 = r4.as(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbk.ae(apbk, alxw, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object al(defpackage.apbk r4, int r5, defpackage.ffgu r6) {
        /*
            boolean r0 = r6 instanceof defpackage.apau
            if (r0 == 0) goto L13
            r0 = r6
            apau r0 = (defpackage.apau) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            apau r0 = new apau
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            apbk r4 = r0.c
            defpackage.ffci.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.ffci.b(r6)
            aotl r6 = r4.f
            elfl r5 = r6.L(r5)
            r0.c = r4
            r0.b = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            engw r6 = (defpackage.engw) r6
            r6.getClass()
            engw r4 = r4.as(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbk.al(apbk, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object ao(defpackage.apbk r4, int r5, defpackage.ffgu r6) {
        /*
            boolean r0 = r6 instanceof defpackage.apaw
            if (r0 == 0) goto L13
            r0 = r6
            apaw r0 = (defpackage.apaw) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            apaw r0 = new apaw
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            apbk r4 = r0.c
            defpackage.ffci.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.ffci.b(r6)
            aotl r6 = r4.f
            elfl r5 = r6.M(r5)
            r0.c = r4
            r0.b = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            engw r6 = (defpackage.engw) r6
            r6.getClass()
            engw r4 = r4.as(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbk.ao(apbk, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (r10 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ap(defpackage.apbk r5, com.google.android.apps.messaging.shared.api.messaging.MessageId r6, j$.util.Optional r7, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r8, int r9, defpackage.ffgu r10) {
        /*
            boolean r0 = r10 instanceof defpackage.apbh
            if (r0 == 0) goto L13
            r0 = r10
            apbh r0 = (defpackage.apbh) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            apbh r0 = new apbh
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r10)
            goto L7c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            int r9 = r0.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r8 = r0.e
            j$.util.Optional r7 = r0.d
            apbk r5 = r0.c
            defpackage.ffci.b(r10)
            goto L59
        L3e:
            defpackage.ffci.b(r10)
            aotl r10 = r5.f
            aoyd r10 = (defpackage.aoyd) r10
            elfl r6 = r10.ae(r6)
            r0.c = r5
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.b = r4
            java.lang.Object r10 = defpackage.fgfz.c(r6, r0)
            if (r10 == r1) goto L81
        L59:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r7.get()
            aqbs r6 = (defpackage.aqbs) r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r5.g()
            elfl r5 = r6.e(r5, r8, r10, r9)
            r6 = 0
            r0.c = r6
            r0.d = r6
            r0.e = r6
            r6 = 0
            r0.f = r6
            r0.b = r3
            java.lang.Object r10 = defpackage.fgfz.c(r5, r0)
            if (r10 != r1) goto L7c
            goto L81
        L7c:
            java.lang.Void r10 = (java.lang.Void) r10
            ffcu r5 = defpackage.ffcu.a
            return r5
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbk.ap(apbk, com.google.android.apps.messaging.shared.api.messaging.MessageId, j$.util.Optional, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (r10 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object aq(defpackage.apbk r5, com.google.android.apps.messaging.shared.api.messaging.MessageId r6, j$.util.Optional r7, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r8, int r9, defpackage.ffgu r10) {
        /*
            boolean r0 = r10 instanceof defpackage.apbj
            if (r0 == 0) goto L13
            r0 = r10
            apbj r0 = (defpackage.apbj) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            apbj r0 = new apbj
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r10)
            goto L7c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            int r9 = r0.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r8 = r0.e
            j$.util.Optional r7 = r0.d
            apbk r5 = r0.c
            defpackage.ffci.b(r10)
            goto L59
        L3e:
            defpackage.ffci.b(r10)
            aotl r10 = r5.f
            aoyd r10 = (defpackage.aoyd) r10
            elfl r6 = r10.ae(r6)
            r0.c = r5
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.b = r4
            java.lang.Object r10 = defpackage.fgfz.c(r6, r0)
            if (r10 == r1) goto L81
        L59:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r7.get()
            aqbs r6 = (defpackage.aqbs) r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r5.g()
            elfl r5 = r6.f(r5, r8, r10, r9)
            r6 = 0
            r0.c = r6
            r0.d = r6
            r0.e = r6
            r6 = 0
            r0.f = r6
            r0.b = r3
            java.lang.Object r10 = defpackage.fgfz.c(r5, r0)
            if (r10 != r1) goto L7c
            goto L81
        L7c:
            java.lang.Void r10 = (java.lang.Void) r10
            ffcu r5 = defpackage.ffcu.a
            return r5
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbk.aq(apbk, com.google.android.apps.messaging.shared.api.messaging.MessageId, j$.util.Optional, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, int, ffgu):java.lang.Object");
    }

    private final apvl ar() {
        Object a = this.g.a();
        a.getClass();
        return (apvl) a;
    }

    private final engw as(engw engwVar) {
        ((enrr) c.h().h("com/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository", "applyAllMutationsOptimistically", 245, "OptimisticBugleMessageRepository.kt")).q("OMv2: Optimistically applying any pending mutations to message list.");
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            alxr alxrVar = (alxr) it.next();
            alxrVar.getClass();
            alxr alxrVar2 = alxrVar;
            for (apss apssVar : ((apuj) this.a.b()).a(alxrVar.b())) {
                apssVar.getClass();
                ((enrr) c.h().h("com/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository", "applyMessageMutationsOptimistically", 215, "OptimisticBugleMessageRepository.kt")).D("OMv2: Applying %s optimistically to message %s.", apssVar.b, alxrVar.b());
                apst apstVar = apssVar.b;
                boolean z = true;
                if (apstVar != apst.a && apstVar != apst.b) {
                    z = false;
                }
                alxrVar2 = new apas(alxrVar, z, apssVar);
            }
            arrayList.add(alxrVar2);
        }
        engw n = engw.n(arrayList);
        n.getClass();
        return n;
    }

    private final void at(MessageId messageId, apst apstVar, ffji ffjiVar) {
        apuj apujVar = (apuj) this.a.b();
        BugleConversationId S = S();
        S.getClass();
        axol.k(this.d, null, new apbf(ffjiVar, this, messageId, apujVar.e(S, messageId, apstVar), null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.apbk r4, int r5, int r6, defpackage.ffgu r7) {
        /*
            boolean r0 = r7 instanceof defpackage.apay
            if (r0 == 0) goto L13
            r0 = r7
            apay r0 = (defpackage.apay) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            apay r0 = new apay
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            apbk r4 = r0.c
            defpackage.ffci.b(r7)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.ffci.b(r7)
            aotl r7 = r4.f
            elfl r5 = r7.ag(r5, r6)
            r5.getClass()
            r0.c = r4
            r0.b = r3
            java.lang.Object r7 = defpackage.fgfz.c(r5, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            engw r7 = (defpackage.engw) r7
            r7.getClass()
            engw r4 = r4.as(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbk.b(apbk, int, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.apbk r4, defpackage.alxw r5, int r6, defpackage.ffgu r7) {
        /*
            boolean r0 = r7 instanceof defpackage.apba
            if (r0 == 0) goto L13
            r0 = r7
            apba r0 = (defpackage.apba) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            apba r0 = new apba
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            apbk r4 = r0.c
            defpackage.ffci.b(r7)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.ffci.b(r7)
            aotl r7 = r4.f
            elfl r5 = r7.ah(r5, r6)
            r5.getClass()
            r0.c = r4
            r0.b = r3
            java.lang.Object r7 = defpackage.fgfz.c(r5, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            engw r7 = (defpackage.engw) r7
            r7.getClass()
            engw r4 = r4.as(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbk.c(apbk, alxw, int, ffgu):java.lang.Object");
    }

    @Override // defpackage.alye
    public final elfl A(MessageId messageId) {
        return this.f.A(messageId);
    }

    @Override // defpackage.alye
    public final elfl B(MessageId messageId, String str, fjay fjayVar) {
        return this.f.B(messageId, str, fjayVar);
    }

    @Override // defpackage.alye
    public final elfl C(MessageId messageId) {
        return this.f.C(messageId);
    }

    @Override // defpackage.alye
    public final elfl D(MessageId messageId) {
        return this.f.D(messageId);
    }

    @Override // defpackage.alye
    public final elfl E(MessageId messageId) {
        return this.f.E(messageId);
    }

    @Override // defpackage.alye
    public final elfl F(alyv alyvVar) {
        return this.f.F(alyvVar);
    }

    @Override // defpackage.alye
    public final elfl G(MessageId messageId) {
        return this.f.G(messageId);
    }

    @Override // defpackage.alye
    public final elfl H(MessageId messageId, int i) {
        return this.f.H(messageId, i);
    }

    @Override // defpackage.alye
    public final void I(MessageId messageId, int i) {
        this.f.I(messageId, i);
    }

    @Override // defpackage.alye
    public final void J(alxr alxrVar, int i) {
        this.f.J(alxrVar, i);
    }

    @Override // defpackage.alye
    public final elfl K(MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar, apxz apxzVar) {
        return this.f.K(messageId, apyvVar, cmrxVar, fjayVar, apxzVar);
    }

    @Override // defpackage.alye
    public final elfl L(int i) {
        return axol.b(new apat(this), this.d);
    }

    @Override // defpackage.alye
    public final elfl M(int i) {
        return axol.b(new apav(this, i), this.d);
    }

    @Override // defpackage.alye
    public final elfl N() {
        return this.f.N();
    }

    @Override // defpackage.alye
    public final void O(MessageId messageId, int i) {
        Throwable th;
        ekzz f = eleg.f("MessageRepository#starMessage");
        try {
            MessageIdType ad = aoyd.ad(messageId);
            ad.getClass();
            Optional optional = (Optional) this.e.b();
            if (!optional.isEmpty()) {
                try {
                    at(messageId, apst.a, new apbg(this, messageId, optional, ad, i));
                    ffig.a(f, null);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
            }
            try {
                ((enrr) c.j().h("com/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository", "starMessage", 75, "OptimisticBugleMessageRepository.kt")).q("starMessage called when message starring not available");
                ffig.a(f, null);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ffig.a(f, th);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.alye
    public final void P(MessageId messageId, int i) {
        Throwable th;
        ekzz f = eleg.f("MessageRepository#starMessage");
        try {
            MessageIdType ad = aoyd.ad(messageId);
            ad.getClass();
            Optional optional = (Optional) this.e.b();
            if (!optional.isEmpty()) {
                try {
                    at(messageId, apst.b, new apbi(this, messageId, optional, ad, i));
                    ffig.a(f, null);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
            }
            try {
                ((enrr) c.j().h("com/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository", "unstarMessage", 97, "OptimisticBugleMessageRepository.kt")).q("unstarMessage called when message starring not available");
                ffig.a(f, null);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ffig.a(f, th);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.alye
    public final void Q(int i) {
        this.f.Q(i);
    }

    @Override // defpackage.alye
    public final elfl R(MessageId messageId) {
        return this.f.R(messageId);
    }

    @Override // defpackage.aotl
    public final BugleConversationId S() {
        return ((aoyd) this.f).j;
    }

    @Override // defpackage.aotl
    public final elfl T(String str) {
        return this.f.T(str);
    }

    @Override // defpackage.aotl
    public final elfl U(cnbt cnbtVar) {
        return this.f.U(cnbtVar);
    }

    @Override // defpackage.aotl
    public final elfl V(Instant instant) {
        return this.f.V(instant);
    }

    @Override // defpackage.aotl
    public final elfl W(int i) {
        return this.f.W(i);
    }

    @Override // defpackage.aotl
    public final elfl X(aqvj aqvjVar) {
        return this.f.X(aqvjVar);
    }

    @Override // defpackage.aotl
    public final void Y() {
        this.f.Y();
    }

    @Override // defpackage.aotl
    public final elfl Z(aqux aquxVar, appj appjVar, bdhg bdhgVar, Instant instant, Instant instant2, MessageId messageId) {
        return this.f.Z(aquxVar, appjVar, bdhgVar, instant, instant2, messageId);
    }

    @Override // defpackage.alye
    public final alxs a() {
        return this.f.a();
    }

    @Override // defpackage.aptx
    public final alxw aa(MessageId messageId, Instant instant) {
        return this.f.aa(messageId, instant);
    }

    @Override // defpackage.aptx
    public final apvd ab() {
        return ((aoyd) this.f).g;
    }

    @Override // defpackage.aptx
    public final apvk ac() {
        return this.f.ac();
    }

    @Override // defpackage.aptx
    public final elfl af(MessageId messageId) {
        return this.f.af(messageId);
    }

    @Override // defpackage.aptx
    public final elfl ag(int i, int i2) {
        return axol.b(new apax(this, i, i2), this.d);
    }

    @Override // defpackage.aptx
    public final elfl ah(alxw alxwVar, int i) {
        return axol.b(new apaz(this, alxwVar, i), this.d);
    }

    @Override // defpackage.aptx
    public final elfl ai(alxw alxwVar, int i) {
        return axol.b(new apbb(this, alxwVar, i), this.d);
    }

    @Override // defpackage.aptx
    public final elfl aj(alxw alxwVar, int i) {
        return axol.b(new apbd(this, alxwVar, i), this.d);
    }

    @Override // defpackage.aptx
    public final Instant ak(MessageId messageId) {
        return this.f.ak(messageId);
    }

    @Override // defpackage.aqbr
    public final void am(alxv alxvVar) {
        this.f.am(alxvVar);
    }

    @Override // defpackage.aptx
    public final void an() {
        ekzz f = eleg.f("MessageRepository#startPreload");
        try {
            ar().k();
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.aptx, java.lang.AutoCloseable
    public final void close() {
        ar().close();
    }

    @Override // defpackage.alye
    public final alxu d() {
        return this.f.d();
    }

    @Override // defpackage.alye
    public final alxy e() {
        return ar();
    }

    @Override // defpackage.alye
    public final alym f() {
        throw null;
    }

    @Override // defpackage.alye
    public final ConversationId g() {
        return ((aoyd) this.f).j;
    }

    @Override // defpackage.alye
    public final aqge h(MessageId messageId) {
        return this.f.h(messageId);
    }

    @Override // defpackage.alye
    public final aqge i() {
        return this.f.i();
    }

    @Override // defpackage.alye
    public final aqge j() {
        return this.f.j();
    }

    @Override // defpackage.alye
    public final ctbx k(alyd alydVar) {
        return this.f.k(alydVar);
    }

    @Override // defpackage.alye
    public final /* synthetic */ elfl l(MessageId messageId, engw engwVar) {
        return alyb.a();
    }

    @Override // defpackage.alye
    public final elfl m(MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar) {
        return this.f.m(messageId, apyvVar, cmrxVar, fjayVar);
    }

    @Override // defpackage.alye
    public final elfl n(MessageId messageId) {
        return this.f.n(messageId);
    }

    @Override // defpackage.alye
    public final elfl o(engw engwVar) {
        return this.f.o(engwVar);
    }

    @Override // defpackage.alye
    public final elfl p() {
        return this.f.p();
    }

    @Override // defpackage.alye
    public final elfl q(engw engwVar) {
        return this.f.q(engwVar);
    }

    @Override // defpackage.alye
    public final elfl r(engw engwVar, cgrr cgrrVar) {
        return this.f.r(engwVar, cgrrVar);
    }

    @Override // defpackage.alye
    public final elfl s(engw engwVar) {
        return this.f.s(engwVar);
    }

    @Override // defpackage.alye
    public final elfl t() {
        return this.f.t();
    }

    @Override // defpackage.alye
    public final elfl u(MessageId messageId) {
        return this.f.u(messageId);
    }

    @Override // defpackage.alye
    public final elfl v() {
        return this.f.v();
    }

    @Override // defpackage.alye
    public final elfl w() {
        return this.f.w();
    }

    @Override // defpackage.alye
    public final elfl x() {
        return this.f.x();
    }

    @Override // defpackage.alye
    public final elfl y() {
        return this.f.y();
    }

    @Override // defpackage.alye
    public final elfl z(MessageId messageId) {
        return this.f.z(messageId);
    }
}
