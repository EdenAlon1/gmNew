package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amvj {
    public final amhs b;
    public final ffbr c;
    private final cqoh e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final avru k;
    private final asqj l;
    private final atzs m;
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/api/messaging/conversation/mmsgroupupgrade/GroupRcsUpgradeEligibilityChecker");
    public static final ffji a = new ffji() { // from class: amuv
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            aoku aokuVar = (aoku) obj;
            aokuVar.getClass();
            Optional e = aokuVar.e();
            e.getClass();
            awui awuiVar = (awui) fflm.b(e);
            String str = awuiVar != null ? awuiVar.d : null;
            if (str != null) {
                return ffpc.aa(ffpc.q(str, "+", "")).toString();
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    };

    public amvj(amhs amhsVar, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, avru avruVar, asqj asqjVar, ckwz ckwzVar, atzs atzsVar) {
        amhsVar.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        asqjVar.getClass();
        ckwzVar.getClass();
        this.b = amhsVar;
        this.e = cqohVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.c = ffbrVar6;
        this.k = avruVar;
        this.l = asqjVar;
        this.m = atzsVar;
    }

    private final boolean g(azau azauVar, int i) {
        Integer g;
        String a2 = azauVar.a("mms-group-upgrade");
        return ((a2 == null || (g = ffpc.g(a2)) == null) ? Integer.parseInt("0") : g.intValue()) >= i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r5, defpackage.avrk r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.amva
            if (r0 == 0) goto L13
            r0 = r7
            amva r0 = (defpackage.amva) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amva r0 = new amva
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L6b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L3b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r5.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r2 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r2
            aoku r2 = r2.g()
            j$.util.Optional r2 = r2.e()
            r2.getClass()
            java.lang.Object r2 = defpackage.fflm.b(r2)
            awui r2 = (defpackage.awui) r2
            if (r2 == 0) goto L3b
            r7.add(r2)
            goto L3b
        L5e:
            elfl r5 = r6.a(r7)
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r5, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvj.a(java.util.List, avrk, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bd, code lost:
    
        if (r1 != r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00bd -> B:11:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r19, java.util.List r20, defpackage.ffgu r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof defpackage.amvc
            if (r2 == 0) goto L17
            r2 = r1
            amvc r2 = (defpackage.amvc) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            amvc r2 = new amvc
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.b
            ffhh r3 = defpackage.ffhh.a
            int r4 = r2.d
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L46
            if (r4 == r7) goto L3c
            if (r4 != r6) goto L34
            java.lang.Object r4 = r2.a
            java.util.Iterator r4 = (java.util.Iterator) r4
            defpackage.ffci.b(r1)
            goto Lbf
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r4 = r2.e
            java.lang.Object r8 = r2.a
            amvj r8 = (defpackage.amvj) r8
            defpackage.ffci.b(r1)
            goto L71
        L46:
            defpackage.ffci.b(r1)
            amhs r1 = r0.b
            anvc r8 = new anvc
            engw r9 = defpackage.engq.a(r20)
            r16 = 0
            r17 = 230(0xe6, float:3.22E-43)
            r10 = 0
            r11 = 0
            r12 = 4
            r13 = 1
            r14 = 0
            r15 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            elfl r1 = r1.g(r8)
            r2.a = r0
            r4 = r19
            r2.e = r4
            r2.d = r7
            java.lang.Object r1 = defpackage.fgfz.c(r1, r2)
            if (r1 == r3) goto Lcd
            r8 = r0
        L71:
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            ffnl r1 = defpackage.ffdx.as(r1)
            amvb r9 = defpackage.amvb.a
            ffng r10 = new ffng
            r10.<init>(r1, r7, r9)
            amuw r1 = new amuw
            r1.<init>()
            ffng r4 = new ffng
            r4.<init>(r10, r5, r1)
            amux r1 = new amux
            r1.<init>()
            ffnl r1 = defpackage.ffno.i(r4, r1)
            ffoj r4 = new ffoj
            ffok r1 = (defpackage.ffok) r1
            r4.<init>(r1)
        L9b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lc8
            java.lang.Object r1 = r4.next()
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r1 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation) r1
            aqge r1 = r1.n()
            elfl r1 = r1.b()
            r1.getClass()
            r2.a = r4
            r8 = 0
            r2.e = r8
            r2.d = r6
            java.lang.Object r1 = defpackage.fgfz.c(r1, r2)
            if (r1 == r3) goto Lcd
        Lbf:
            amfx r1 = (defpackage.amfx) r1
            boolean r1 = r1.M()
            if (r1 == 0) goto L9b
            r5 = r7
        Lc8:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            return r1
        Lcd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvj.b(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.amvd
            if (r0 == 0) goto L13
            r0 = r6
            amvd r0 = (defpackage.amvd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amvd r0 = new amvd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            amvj r5 = r0.d
            defpackage.ffci.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            aotl r5 = r5.m()
            elfl r5 = r5.M(r3)
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 == r1) goto L84
            r5 = r4
        L47:
            engw r6 = (defpackage.engw) r6
            r6.getClass()
            java.lang.Object r6 = defpackage.ffdx.M(r6)
            alxr r6 = (defpackage.alxr) r6
            if (r6 != 0) goto L5a
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5a:
            j$.time.Instant r6 = r6.n()
            cqoh r0 = r5.e
            j$.time.Instant r0 = r0.f()
            ffbr r5 = r5.f
            java.lang.Object r5 = r5.b()
            r5.getClass()
            java.lang.Number r5 = (java.lang.Number) r5
            long r1 = r5.longValue()
            j$.time.Duration r5 = j$.time.Duration.ofDays(r1)
            j$.time.Instant r5 = r0.minus(r5)
            boolean r5 = r6.isAfter(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvj.c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x02da, code lost:
    
        if (r2 != r4) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01c8, code lost:
    
        if (r2 != r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x041e, code lost:
    
        if (r2 == r4) goto L150;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x041e -> B:12:0x0422). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvj.d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.aqux r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.amvh
            if (r0 == 0) goto L13
            r0 = r7
            amvh r0 = (defpackage.amvh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amvh r0 = new amvh
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r7)
            goto L47
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.ffci.b(r7)
            aqge r6 = r6.e()
            if (r6 == 0) goto L51
            elfl r6 = r6.b()
            if (r6 == 0) goto L51
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)
            if (r7 == r1) goto L50
        L47:
            aqys r7 = (defpackage.aqys) r7
            if (r7 == 0) goto L51
            boolean r4 = r7.a()
            goto L51
        L50:
            return r1
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvj.e(aqux, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.aqux r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.amvi
            if (r0 == 0) goto L13
            r0 = r6
            amvi r0 = (defpackage.amvi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amvi r0 = new amvi
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            alyx r6 = defpackage.alyx.RICH
            elfl r5 = r5.l(r6)
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 == r1) goto L4f
        L40:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L49
            boolean r5 = r6.booleanValue()
            goto L4a
        L49:
            r5 = 0
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvj.f(aqux, ffgu):java.lang.Object");
    }
}
