package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caia extends ceut {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/ftd/FtdDataCleanUpWorkHandler");
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffsk h;
    private final ffhd i;
    private final ffhd j;

    public caia(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffsk ffskVar, ffhd ffhdVar, ffhd ffhdVar2) {
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.a = ffbrVar3;
        this.b = ffbrVar4;
        this.c = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffskVar;
        this.i = ffhdVar;
        this.j = ffhdVar2;
    }

    private final Instant o() {
        Instant f = ((cqoh) this.e.b()).f();
        f.getClass();
        return f;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("FtdDataCleanUpWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cahr.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cahr cahrVar = (cahr) eyhsVar;
        cahrVar.getClass();
        c = axol.c(this.h, ffhe.a, ffsm.a, new cahx(cahrVar, this, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.ffgu r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.cahs
            if (r0 == 0) goto L13
            r0 = r11
            cahs r0 = (defpackage.cahs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cahs r0 = new cahs
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "cleanUpPendingDecryptedMessages"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/ftd/FtdDataCleanUpWorkHandler"
            java.lang.String r5 = "FtdDataCleanUpWorkHandler.kt"
            java.lang.String r6 = "BugleEtouffee"
            r7 = 1
            if (r2 == 0) goto L37
            if (r2 != r7) goto L2f
            defpackage.ffci.b(r11)
            goto L86
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L37:
            defpackage.ffci.b(r11)
            enru r11 = defpackage.caia.d
            ensk r11 = r11.e()
            ensn r2 = defpackage.ente.a
            r11.Y(r2, r6)
            r2 = 154(0x9a, float:2.16E-43)
            ensk r11 = r11.h(r4, r3, r2, r5)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r2 = "Deleting old decrypted messages."
            r11.q(r2)
            ffbr r11 = r10.e
            java.lang.Object r11 = r11.b()
            cqoh r11 = (defpackage.cqoh) r11
            j$.time.Instant r11 = r11.f()
            r11.getClass()
            cfva r2 = defpackage.bzwf.k
            java.lang.Object r2 = r2.e()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            long r8 = (long) r2
            j$.time.Duration r2 = j$.time.Duration.ofDays(r8)
            j$.time.Instant r11 = r11.minus(r2)
            ffhd r2 = r10.i
            caht r8 = new caht
            r9 = 0
            r8.<init>(r10, r11, r9)
            r0.c = r7
            java.lang.Object r11 = defpackage.ffra.a(r2, r8, r0)
            if (r11 == r1) goto La9
        L86:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 <= 0) goto La6
            enru r0 = defpackage.caia.d
            ensk r0 = r0.h()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            r1 = 165(0xa5, float:2.31E-43)
            ensk r0 = r0.h(r4, r3, r1, r5)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "Deleted pending decrypted messages: %d."
            r0.r(r1, r11)
        La6:
            ffcu r11 = defpackage.ffcu.a
            return r11
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caia.k(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ed, code lost:
    
        if (r14 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.awui r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caia.l(awui, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r2.n(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.cahr r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cahw
            if (r0 == 0) goto L13
            r0 = r8
            cahw r0 = (defpackage.cahw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cahw r0 = new cahw
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.ffci.b(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            cahr r7 = r0.e
            caia r2 = r0.d
            defpackage.ffci.b(r8)
            goto L61
        L3d:
            cahr r7 = r0.e
            caia r2 = r0.d
            defpackage.ffci.b(r8)
            goto L55
        L45:
            defpackage.ffci.b(r8)
            r0.d = r6
            r0.e = r7
            r0.c = r5
            java.lang.Object r8 = r6.k(r0)
            if (r8 == r1) goto L79
            r2 = r6
        L55:
            r0.d = r2
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = r2.n(r0)
            if (r8 == r1) goto L79
        L61:
            awui r7 = r7.c
            if (r7 != 0) goto L67
            awui r7 = defpackage.awui.a
        L67:
            r7.getClass()
            r8 = 0
            r0.d = r8
            r0.e = r8
            r0.c = r3
            java.lang.Object r7 = r2.l(r7, r0)
            if (r7 != r1) goto L78
            goto L79
        L78:
            return r7
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caia.m(cahr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cahy
            if (r0 == 0) goto L13
            r0 = r8
            cahy r0 = (defpackage.cahy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cahy r0 = new cahy
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            caia r0 = r0.d
            defpackage.ffci.b(r8)
            goto L84
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.ffci.b(r8)
            enru r8 = defpackage.caia.d
            ensk r8 = r8.e()
            ensn r2 = defpackage.ente.a
            java.lang.String r4 = "BugleEtouffee"
            r8.Y(r2, r4)
            java.lang.String r2 = "removePendingMessageCutoff"
            r4 = 131(0x83, float:1.84E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/ftd/FtdDataCleanUpWorkHandler"
            java.lang.String r6 = "FtdDataCleanUpWorkHandler.kt"
            ensk r8 = r8.h(r5, r2, r4, r6)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r2 = "Removing pending message cutoff"
            r8.q(r2)
            j$.time.Instant r8 = r7.o()
            cfva r2 = defpackage.bzwf.j
            java.lang.Object r2 = r2.e()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            long r4 = (long) r2
            j$.time.Duration r2 = j$.time.Duration.ofDays(r4)
            j$.time.Instant r8 = r8.minus(r2)
            long r4 = r8.toEpochMilli()
            ffhd r8 = r7.i
            cahz r2 = new cahz
            r6 = 0
            r2.<init>(r7, r4, r6)
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 == r1) goto L9c
            r0 = r7
        L84:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 <= 0) goto L99
            ffbr r0 = r0.g
            java.lang.Object r0 = r0.b()
            akzt r0 = (defpackage.akzt) r0
            java.lang.String r1 = "Bugle.Etouffee.OutdatedPendingMessages.Removed.Count"
            r0.e(r1, r8)
        L99:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caia.n(ffgu):java.lang.Object");
    }
}
