package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqes implements aqeo {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final cqoh d;
    public final ffbr e;
    public final ffbr f;
    private final ffhd g;
    private final ffsk h;

    public aqes(ffbr ffbrVar, ffbr ffbrVar2, ffhd ffhdVar, ffbr ffbrVar3, cqoh cqohVar, ffbr ffbrVar4, ffbr ffbrVar5, dtuu dtuuVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffhdVar.getClass();
        ffbrVar3.getClass();
        cqohVar.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        dtuuVar.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.g = ffhdVar;
        this.c = ffbrVar3;
        this.d = cqohVar;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.h = ffskVar;
    }

    @Override // defpackage.aqeo
    public final elfl a(aqvj aqvjVar, BugleConversationId bugleConversationId, aqge aqgeVar) {
        elfl c;
        aqvjVar.getClass();
        bugleConversationId.getClass();
        aqgeVar.getClass();
        c = axol.c(this.h, ffhe.a, ffsm.a, new aqer(this, aqvjVar, bugleConversationId, aqgeVar, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (defpackage.aojl.b(((com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) defpackage.ffdx.T(r9)).g().n()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (defpackage.ffra.a(r12, r5, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aqvj r12, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r13, defpackage.aqge r14, defpackage.ffgu r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.aqep
            if (r0 == 0) goto L13
            r0 = r15
            aqep r0 = (defpackage.aqep) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqep r0 = new aqep
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r15)
            goto La5
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r13 = r0.f
            aqvj r12 = r0.e
            aqes r14 = r0.d
            defpackage.ffci.b(r15)
            r7 = r14
            goto L57
        L3e:
            defpackage.ffci.b(r15)
            elfl r14 = r14.b()
            r14.getClass()
            r0.d = r11
            r0.e = r12
            r0.f = r13
            r0.c = r4
            java.lang.Object r15 = defpackage.fgfz.c(r14, r0)
            if (r15 == r1) goto La8
            r7 = r11
        L57:
            r8 = r12
            r6 = r13
            r9 = r15
            engw r9 = (defpackage.engw) r9
            int r12 = r9.size()
            if (r12 != r4) goto L8d
            r9.getClass()
            java.lang.Object r12 = defpackage.ffdx.T(r9)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r12 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r12
            aoku r12 = r12.g()
            java.lang.String r12 = r12.n()
            boolean r12 = defpackage.aojl.a(r12)
            if (r12 != 0) goto La5
            java.lang.Object r12 = defpackage.ffdx.T(r9)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r12 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r12
            aoku r12 = r12.g()
            java.lang.String r12 = r12.n()
            boolean r12 = defpackage.aojl.b(r12)
            if (r12 != 0) goto La5
        L8d:
            ffhd r12 = r7.g
            aqeq r5 = new aqeq
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r13 = 0
            r0.d = r13
            r0.e = r13
            r0.f = r13
            r0.c = r3
            java.lang.Object r12 = defpackage.ffra.a(r12, r5, r0)
            if (r12 != r1) goto La5
            goto La8
        La5:
            ffcu r12 = defpackage.ffcu.a
            return r12
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqes.b(aqvj, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, aqge, ffgu):java.lang.Object");
    }
}
