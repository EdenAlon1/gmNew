package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cihx implements cihk {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/reflectedmessage/ReflectedReactionCpimHeadersDelegate");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public cihx(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0147, code lost:
    
        if (r14 == r0) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.cihk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fayv r12, defpackage.ciht r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cihx.a(fayv, ciht, ffgu):java.lang.Object");
    }

    @Override // defpackage.cihk
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fayv r11, java.lang.String r12, defpackage.aotl r13, defpackage.aqux r14, defpackage.ffgu r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.cihv
            if (r0 == 0) goto L13
            r0 = r15
            cihv r0 = (defpackage.cihv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cihv r0 = new cihv
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r11 = r0.h
            java.lang.Object r14 = r0.a
            java.lang.String r12 = r0.g
            fayv r13 = r0.f
            cihx r0 = r0.e
            defpackage.ffci.b(r15)     // Catch: java.lang.Exception -> Ld7
            r4 = r11
            r11 = r13
            goto L6a
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            defpackage.ffci.b(r15)
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r15 = r13.S()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r15 = r15.a
            j$.util.Optional r2 = defpackage.clbe.a(r11)     // Catch: java.lang.Exception -> Ld7
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> Ld7
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Ld7
            elfl r13 = r13.T(r2)     // Catch: java.lang.Exception -> Ld7
            r13.getClass()     // Catch: java.lang.Exception -> Ld7
            r0.e = r10     // Catch: java.lang.Exception -> Ld7
            r0.f = r11     // Catch: java.lang.Exception -> Ld7
            r0.g = r12     // Catch: java.lang.Exception -> Ld7
            r0.a = r14     // Catch: java.lang.Exception -> Ld7
            r0.h = r15     // Catch: java.lang.Exception -> Ld7
            r0.d = r3     // Catch: java.lang.Exception -> Ld7
            java.lang.Object r13 = defpackage.fgfz.c(r13, r0)     // Catch: java.lang.Exception -> Ld7
            if (r13 == r1) goto Ld6
            r0 = r10
            r4 = r15
            r15 = r13
        L6a:
            com.google.android.apps.messaging.shared.api.messaging.MessageId r15 = (com.google.android.apps.messaging.shared.api.messaging.MessageId) r15     // Catch: java.lang.Exception -> Ld7
            ffbr r13 = r0.b
            java.lang.Object r13 = r13.b()
            cstx r13 = (defpackage.cstx) r13
            boolean r13 = r13.e(r12)
            if (r13 == 0) goto Lce
            ffbr r13 = r0.c
            java.lang.Object r13 = r13.b()
            cmrq r13 = (defpackage.cmrq) r13
            cmrl r6 = r13.b(r12)
            r6.getClass()
            cmrs r12 = defpackage.cmrs.a
            eyfq r12 = r12.createBuilder()
            cmrr r12 = (defpackage.cmrr) r12
            r12.getClass()
            cmri r13 = defpackage.cmri.a
            eyfq r13 = r13.createBuilder()
            cmrh r13 = (defpackage.cmrh) r13
            r13.getClass()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r14 = r14.g()
            java.lang.String r14 = r14.b()
            defpackage.cmrj.c(r14, r13)
            defpackage.cmrj.b(r3, r13)
            cmri r13 = defpackage.cmrj.a(r13)
            defpackage.cmrt.b(r13, r12)
            cmrs r7 = defpackage.cmrt.a(r12)
            cmrm r8 = defpackage.cncq.a(r11)
            if (r15 == 0) goto Lc3
            java.lang.String r11 = r15.a()
            goto Lc4
        Lc3:
            r11 = 0
        Lc4:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r5 = defpackage.bdhb.b(r11)
            r9 = 0
            cnbt r11 = defpackage.cnbs.a(r4, r5, r6, r7, r8, r9)
            return r11
        Lce:
            cihm r11 = new cihm
            java.lang.String r12 = "ReflectedReactionCpimHeadersDelegate: The input text message is not an emoji."
            r11.<init>(r12)
            throw r11
        Ld6:
            return r1
        Ld7:
            r0 = move-exception
            r11 = r0
            cihm r12 = new cihm
            java.lang.String r13 = "ReflectedReactionCpimHeadersDelegate: Find Message with RcsMessageId failed."
            r12.<init>(r13, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cihx.c(fayv, java.lang.String, aotl, aqux, ffgu):java.lang.Object");
    }
}
