package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjog extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cjok c;
    final /* synthetic */ cjmw d;
    final /* synthetic */ azsu e;
    final /* synthetic */ avkl f;
    final /* synthetic */ cjmu g;
    final /* synthetic */ cjnz h;
    final /* synthetic */ fjay i;
    final /* synthetic */ bdhg j;
    final /* synthetic */ fayv k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjog(cjok cjokVar, cjmw cjmwVar, azsu azsuVar, avkl avklVar, cjmu cjmuVar, cjnz cjnzVar, fjay fjayVar, bdhg bdhgVar, fayv fayvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cjokVar;
        this.d = cjmwVar;
        this.e = azsuVar;
        this.f = avklVar;
        this.g = cjmuVar;
        this.h = cjnzVar;
        this.i = fjayVar;
        this.j = bdhgVar;
        this.k = fayvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjog) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r15.b.b(r3, r14) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r2.b(r3, r4, r5, null, 1, r8, r9, r10, r11, r12, r13) == r1) goto L26;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            r14 = this;
            ffhh r1 = defpackage.ffhh.a
            int r0 = r14.b
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L10
            java.lang.Object r0 = r14.a
            defpackage.ffci.b(r15)
            r13 = r14
            goto L58
        L10:
            defpackage.ffci.b(r15)     // Catch: java.lang.Exception -> L16
            r13 = r14
            goto L80
        L16:
            r0 = move-exception
            r15 = r0
            r13 = r14
            goto L41
        L1a:
            defpackage.ffci.b(r15)
            r15 = r2
            cjok r2 = r14.c     // Catch: java.lang.Exception -> L3e
            cjmw r3 = r14.d     // Catch: java.lang.Exception -> L3e
            azsu r4 = r14.e     // Catch: java.lang.Exception -> L3e
            avkl r5 = r14.f     // Catch: java.lang.Exception -> L3e
            cjmu r8 = r14.g     // Catch: java.lang.Exception -> L3e
            cjnz r9 = r14.h     // Catch: java.lang.Exception -> L3e
            fjay r10 = r14.i     // Catch: java.lang.Exception -> L3e
            bdhg r11 = r14.j     // Catch: java.lang.Exception -> L3e
            fayv r12 = r14.k     // Catch: java.lang.Exception -> L3e
            r14.b = r15     // Catch: java.lang.Exception -> L3e
            r6 = 0
            r7 = 1
            r13 = r14
            java.lang.Object r15 = r2.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L3c
            if (r15 != r1) goto L80
            goto L83
        L3c:
            r0 = move-exception
            goto L40
        L3e:
            r0 = move-exception
            r13 = r14
        L40:
            r15 = r0
        L41:
            cjok r15 = r13.c
            cjmw r2 = r13.d
            cjof r3 = new cjof
            r4 = 0
            r3.<init>(r2, r4)
            r13.a = r0
            r2 = 2
            r13.b = r2
            azei r15 = r15.b
            java.lang.Object r15 = r15.b(r3, r14)
            if (r15 == r1) goto L83
        L58:
            enru r15 = defpackage.cjok.a
            ensk r15 = r15.i()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleSending"
            r15.Y(r1, r2)
            enrr r15 = (defpackage.enrr) r15
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            ensk r15 = r15.g(r0)
            java.lang.String r0 = "invokeSuspend"
            r1 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/pipeline/rcs/send/SendingMessagePipeline$launchSendMessage$1"
            java.lang.String r3 = "SendingMessagePipeline.kt"
            ensk r15 = r15.h(r2, r0, r1, r3)
            enrr r15 = (defpackage.enrr) r15
            java.lang.String r0 = "Failed to send message with exception."
            r15.q(r0)
        L80:
            ffcu r15 = defpackage.ffcu.a
            return r15
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjog.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjog(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, ffguVar);
    }
}
