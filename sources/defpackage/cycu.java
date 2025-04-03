package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cycu implements cyco {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice2/AddContactBanner2DataServiceImpl");
    public final ConversationId b;
    public final ffxx c;
    public final ffxx d;
    public final ffbr e;
    private final alye f;
    private final cuye g;
    private final ffbr h;
    private final Integer i;

    public cycu(ConversationId conversationId, ffxx ffxxVar, ffxx ffxxVar2, alye alyeVar, ffbr ffbrVar, cuye cuyeVar, ffbr ffbrVar2) {
        conversationId.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        alyeVar.getClass();
        ffbrVar.getClass();
        cuyeVar.getClass();
        ffbrVar2.getClass();
        this.b = conversationId;
        this.c = ffxxVar;
        this.d = ffxxVar2;
        this.f = alyeVar;
        this.e = ffbrVar;
        this.g = cuyeVar;
        this.h = ffbrVar2;
        this.i = (Integer) cybw.a.e();
    }

    private final boolean f(ResolvedRecipient resolvedRecipient) {
        ekzz f = eleg.f("AddContactBanner2DataServiceImpl#isRecipientVerifiableBusiness");
        try {
            boolean z = false;
            if (this.g.c()) {
                if (resolvedRecipient.I().a()) {
                    z = true;
                }
            }
            ffig.a(f, null);
            return z;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:11:0x0025, B:12:0x005b, B:15:0x0080, B:20:0x0069, B:21:0x006d, B:23:0x0073), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cycp
            if (r0 == 0) goto L13
            r0 = r7
            cycp r0 = (defpackage.cycp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cycp r0 = new cycp
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ekzz r0 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L5b
        L29:
            r7 = move-exception
            goto L8e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            defpackage.ffci.b(r7)
            java.lang.String r7 = "AddContactBanner2DataServiceImpl#anyLatestMessageIsOtp"
            ekzz r7 = defpackage.eleg.f(r7)
            alye r2 = r6.f     // Catch: java.lang.Throwable -> L8a
            java.lang.Integer r4 = r6.i     // Catch: java.lang.Throwable -> L8a
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L8a
            int r4 = r4 * 10
            int r4 = java.lang.Math.max(r4, r3)     // Catch: java.lang.Throwable -> L8a
            elfl r2 = r2.M(r4)     // Catch: java.lang.Throwable -> L8a
            r0.d = r7     // Catch: java.lang.Throwable -> L8a
            r0.c = r3     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = defpackage.fgfz.c(r2, r0)     // Catch: java.lang.Throwable -> L8a
            if (r0 == r1) goto L89
            r5 = r0
            r0 = r7
            r7 = r5
        L5b:
            engw r7 = (defpackage.engw) r7     // Catch: java.lang.Throwable -> L29
            r7.getClass()     // Catch: java.lang.Throwable -> L29
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Throwable -> L29
            r2 = 0
            if (r1 == 0) goto L69
        L67:
            r3 = r2
            goto L80
        L69:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L29
        L6d:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L67
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L29
            alxr r1 = (defpackage.alxr) r1     // Catch: java.lang.Throwable -> L29
            int r1 = r1.C()     // Catch: java.lang.Throwable -> L29
            r4 = 2
            if (r1 != r4) goto L6d
        L80:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L29
            r1 = 0
            defpackage.ffig.a(r0, r1)
            return r7
        L89:
            return r1
        L8a:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r1 = move-exception
            defpackage.ffig.a(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cycu.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r13v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.engw r13, defpackage.alxj r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cycu.b(engw, alxj, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:11:0x0025, B:12:0x0050, B:13:0x0059, B:15:0x0061, B:20:0x0076, B:27:0x007e), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cycs
            if (r0 == 0) goto L13
            r0 = r8
            cycs r0 = (defpackage.cycs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cycs r0 = new cycs
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ekzz r0 = r0.d
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L50
        L29:
            r8 = move-exception
            goto L8b
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.ffci.b(r8)
            java.lang.String r8 = "AddContactBanner2DataServiceImpl#isEarliestNonSystemMessageIncoming"
            ekzz r8 = defpackage.eleg.f(r8)
            alye r2 = r7.f     // Catch: java.lang.Throwable -> L87
            r4 = 5
            elfl r2 = r2.L(r4)     // Catch: java.lang.Throwable -> L87
            r0.d = r8     // Catch: java.lang.Throwable -> L87
            r0.c = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = defpackage.fgfz.c(r2, r0)     // Catch: java.lang.Throwable -> L87
            if (r0 == r1) goto L86
            r6 = r0
            r0 = r8
            r8 = r6
        L50:
            engw r8 = (defpackage.engw) r8     // Catch: java.lang.Throwable -> L29
            enqv r8 = r8.iterator()     // Catch: java.lang.Throwable -> L29
            r8.getClass()     // Catch: java.lang.Throwable -> L29
        L59:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r4 = 0
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L29
            alxr r1 = (defpackage.alxr) r1     // Catch: java.lang.Throwable -> L29
            alya r1 = r1.d()     // Catch: java.lang.Throwable -> L29
            int r1 = r1.d()     // Catch: java.lang.Throwable -> L29
            r5 = 3
            if (r1 == r5) goto L59
            if (r1 != r3) goto L75
            goto L76
        L75:
            r3 = r4
        L76:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L29
            defpackage.ffig.a(r0, r2)
            return r8
        L7e:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L29
            defpackage.ffig.a(r0, r2)
            return r8
        L86:
            return r1
        L87:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L8b:
            throw r8     // Catch: java.lang.Throwable -> L8c
        L8c:
            r1 = move-exception
            defpackage.ffig.a(r0, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cycu.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cyct
            if (r0 == 0) goto L13
            r0 = r6
            cyct r0 = (defpackage.cyct) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cyct r0 = new cyct
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            ekzz r1 = r0.e
            cycu r0 = r0.d
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L5f
        L2b:
            r6 = move-exception
            goto L9e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            defpackage.ffci.b(r6)
            java.lang.String r6 = "AddContactBanner2DataServiceImpl#isNotDismissed"
            ekzz r6 = defpackage.eleg.f(r6)
            ffbr r2 = r5.e     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L9b
            cycv r2 = (defpackage.cycv) r2     // Catch: java.lang.Throwable -> L9b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = r5.b     // Catch: java.lang.Throwable -> L9b
            elfl r2 = r2.a(r4)     // Catch: java.lang.Throwable -> L9b
            r2.getClass()     // Catch: java.lang.Throwable -> L9b
            r0.d = r5     // Catch: java.lang.Throwable -> L9b
            r0.e = r6     // Catch: java.lang.Throwable -> L9b
            r0.c = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r0 = defpackage.fgfz.c(r2, r0)     // Catch: java.lang.Throwable -> L9b
            if (r0 == r1) goto L9a
            r1 = r6
            r6 = r0
            r0 = r5
        L5f:
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r2 = r0.i     // Catch: java.lang.Throwable -> L2b
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L2b
            int r2 = r2 + r3
            if (r6 != 0) goto L6b
            goto L83
        L6b:
            int r4 = r6.intValue()     // Catch: java.lang.Throwable -> L2b
            if (r4 != r2) goto L83
            boolean r2 = defpackage.cybw.a()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L83
            ffbr r2 = r0.h     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L2b
            altk r2 = (defpackage.altk) r2     // Catch: java.lang.Throwable -> L2b
            r4 = 3
            r2.aw(r4)     // Catch: java.lang.Throwable -> L2b
        L83:
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r0 = r0.i     // Catch: java.lang.Throwable -> L2b
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2b
            if (r6 > r0) goto L90
            goto L91
        L90:
            r3 = 0
        L91:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L2b
            r0 = 0
            defpackage.ffig.a(r1, r0)
            return r6
        L9a:
            return r1
        L9b:
            r0 = move-exception
            r1 = r6
            r6 = r0
        L9e:
            throw r6     // Catch: java.lang.Throwable -> L9f
        L9f:
            r0 = move-exception
            defpackage.ffig.a(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cycu.d(ffgu):java.lang.Object");
    }

    public final boolean e(ResolvedRecipient resolvedRecipient) {
        return (resolvedRecipient == null || resolvedRecipient.g().D()) ? false : true;
    }
}
