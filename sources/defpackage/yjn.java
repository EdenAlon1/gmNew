package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjn implements yjo {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/MapiMessageSender");
    public final ffhd b;
    public final alxs c;
    public final alxu d;
    public final xyg e;
    public final drlk f;
    public final xhg g;
    public final ffbr h;
    public final apct i;
    private final ffxx j;
    private final ConversationId k;
    private final ffxx l;
    private final aqnu m;
    private final ffbr n;

    public yjn(ffhd ffhdVar, alxs alxsVar, alxu alxuVar, ffxx ffxxVar, ConversationId conversationId, ffxx ffxxVar2, aqnu aqnuVar, ffbr ffbrVar, xyg xygVar, drlk drlkVar, apct apctVar, xhg xhgVar, ffbr ffbrVar2) {
        ffhdVar.getClass();
        alxsVar.getClass();
        alxuVar.getClass();
        ffxxVar.getClass();
        conversationId.getClass();
        ffxxVar2.getClass();
        ffbrVar.getClass();
        apctVar.getClass();
        xhgVar.getClass();
        ffbrVar2.getClass();
        this.b = ffhdVar;
        this.c = alxsVar;
        this.d = alxuVar;
        this.j = ffxxVar;
        this.k = conversationId;
        this.l = ffxxVar2;
        this.m = aqnuVar;
        this.n = ffbrVar;
        this.e = xygVar;
        this.f = drlkVar;
        this.i = apctVar;
        this.g = xhgVar;
        this.h = ffbrVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.yjg
            if (r0 == 0) goto L13
            r0 = r7
            yjg r0 = (defpackage.yjg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yjg r0 = new yjg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yjn r2 = r0.d
            defpackage.ffci.b(r7)
            goto L48
        L38:
            defpackage.ffci.b(r7)
            ffxx r7 = r6.j
            r0.d = r6
            r0.c = r4
            java.lang.Object r7 = defpackage.fgbj.c(r7, r0)
            if (r7 == r1) goto L66
            r2 = r6
        L48:
            engw r7 = (defpackage.engw) r7
            if (r7 == 0) goto L60
            aqnu r2 = r2.m
            yjb r4 = new yjb
            r4.<init>()
            r5 = 0
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = r2.a(r7, r4, r0)
            if (r7 != r1) goto L5f
            goto L66
        L5f:
            return r7
        L60:
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjn.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r12, java.lang.String r13, java.lang.Long r14, defpackage.ffgu r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.yjh
            if (r0 == 0) goto L13
            r0 = r15
            yjh r0 = (defpackage.yjh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yjh r0 = new yjh
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ekzz r12 = r0.d
            defpackage.ffci.b(r15)     // Catch: java.lang.Throwable -> L29
            goto L5e
        L29:
            r0 = move-exception
            r13 = r0
            goto L6a
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            defpackage.ffci.b(r15)
            ffhd r15 = r0.u()
            boolean r15 = defpackage.ekxi.b(r15)
            if (r15 == 0) goto L71
            java.lang.String r15 = "MapiMessageSender#convertAttachments"
            ekzz r15 = defpackage.eleg.f(r15)
            yjj r4 = new yjj     // Catch: java.lang.Throwable -> L66
            r9 = 0
            r7 = r11
            r6 = r12
            r5 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L66
            r0.d = r15     // Catch: java.lang.Throwable -> L66
            r0.c = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r12 = defpackage.ffsl.a(r4, r0)     // Catch: java.lang.Throwable -> L66
            if (r12 == r1) goto L65
            r10 = r15
            r15 = r12
            r12 = r10
        L5e:
            java.util.List r15 = (java.util.List) r15     // Catch: java.lang.Throwable -> L29
            r13 = 0
            defpackage.ffig.a(r12, r13)
            return r15
        L65:
            return r1
        L66:
            r0 = move-exception
            r12 = r0
            r13 = r12
            r12 = r15
        L6a:
            throw r13     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            r14 = r0
            defpackage.ffig.a(r12, r13)
            throw r14
        L71:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjn.b(java.util.List, java.lang.String, java.lang.Long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.yjk
            if (r0 == 0) goto L13
            r0 = r5
            yjk r0 = (defpackage.yjk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yjk r0 = new yjk
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            ffbr r5 = r4.n
            java.lang.Object r5 = r5.b()
            aspy r5 = (defpackage.aspy) r5
            boolean r5 = r5.a()
            if (r5 == 0) goto L45
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r4.k
            boolean r5 = r5 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId
            goto L57
        L45:
            ffxx r5 = r4.l
            r0.c = r3
            java.lang.Object r5 = defpackage.fgbj.c(r5, r0)
            if (r5 == r1) goto L5c
        L4f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r5 = defpackage.ffkj.e(r5, r0)
        L57:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjn.c(ffgu):java.lang.Object");
    }
}
