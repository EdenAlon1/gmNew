package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akep implements ekrm {
    private static final entd b = entd.c("BugleBackup");
    public final cqoh a;
    private final ffsk c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public akep(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cqoh cqohVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        cqohVar.getClass();
        this.c = ffskVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.a = cqohVar;
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new akeo(this, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[LOOP:0: B:11:0x0062->B:13:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(j$.time.Duration r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.akel
            if (r0 == 0) goto L13
            r0 = r10
            akel r0 = (defpackage.akel) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akel r0 = new akel
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            j$.time.Duration r9 = r0.e
            akep r0 = r0.d
            defpackage.ffci.b(r10)
            goto L58
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.ffci.b(r10)
            entd r10 = defpackage.akep.b
            ensk r10 = r10.h()
            ensz r10 = (defpackage.ensz) r10
            java.lang.String r2 = "MessagesRestoreDailySynclet deleting restore database and attachments for inactive executions"
            r10.q(r2)
            ffbr r10 = r8.e
            java.lang.Object r10 = r10.b()
            ajwa r10 = (defpackage.ajwa) r10
            r0.d = r8
            r0.e = r9
            r0.c = r3
            java.lang.Object r10 = r10.e(r0)
            if (r10 == r1) goto L97
            r0 = r8
        L58:
            r5 = r9
            engw r10 = (defpackage.engw) r10
            enqv r9 = r10.iterator()
            r9.getClass()
        L62:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L94
            java.lang.Object r10 = r9.next()
            ajwc r10 = (defpackage.ajwc) r10
            ffbr r1 = r0.f
            java.lang.Object r1 = r1.b()
            r2 = r1
            ajyw r2 = (defpackage.ajyw) r2
            java.util.UUID r4 = r10.a
            eqza r3 = defpackage.eqza.CLEAN_UP
            eqyv r10 = defpackage.eqyv.a
            eyfq r10 = r10.createBuilder()
            eqyt r10 = (defpackage.eqyt) r10
            r10.getClass()
            r1 = 3
            defpackage.eqnb.b(r1, r10)
            eqyv r6 = defpackage.eqnb.a(r10)
            r7 = 120(0x78, float:1.68E-43)
            defpackage.ajyw.c(r2, r3, r4, r5, r6, r7)
            goto L62
        L94:
            ffcu r9 = defpackage.ffcu.a
            return r9
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akep.b(j$.time.Duration, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d A[LOOP:0: B:11:0x0077->B:13:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(j$.time.Duration r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.akem
            if (r0 == 0) goto L13
            r0 = r12
            akem r0 = (defpackage.akem) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akem r0 = new akem
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            j$.time.Duration r11 = r0.e
            akep r0 = r0.d
            defpackage.ffci.b(r12)
            goto L6d
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            defpackage.ffci.b(r12)
            entd r12 = defpackage.akep.b
            ensk r12 = r12.h()
            ensz r12 = (defpackage.ensz) r12
            java.lang.String r2 = "MessagesRestoreDailySynclet marking restore executions past the restore expiry as closed"
            r12.q(r2)
            ffbr r12 = r10.d
            java.lang.Object r12 = r12.b()
            ajyr r12 = (defpackage.ajyr) r12
            r2 = 3
            akci[] r2 = new defpackage.akci[r2]
            r5 = 0
            akci r6 = defpackage.akci.WAITING_ON_APP_UPDATE
            r2[r5] = r6
            akci r5 = defpackage.akci.WAITING_ON_APP_UPDATE_INITIAL_PROMPT_SHOWN
            r2[r4] = r5
            akci r5 = defpackage.akci.WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT
            r2[r3] = r5
            java.util.Set r2 = defpackage.fffi.d(r2)
            r0.d = r10
            r0.e = r11
            r0.c = r4
            java.lang.Object r12 = r12.e(r2, r0)
            if (r12 == r1) goto Lab
            r0 = r10
        L6d:
            r7 = r11
            engw r12 = (defpackage.engw) r12
            enqv r11 = r12.iterator()
            r11.getClass()
        L77:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto La8
            java.lang.Object r12 = r11.next()
            ajwc r12 = (defpackage.ajwc) r12
            ffbr r1 = r0.f
            java.lang.Object r1 = r1.b()
            r4 = r1
            ajyw r4 = (defpackage.ajyw) r4
            java.util.UUID r6 = r12.a
            eqza r5 = defpackage.eqza.CLEAN_UP
            eqyv r12 = defpackage.eqyv.a
            eyfq r12 = r12.createBuilder()
            eqyt r12 = (defpackage.eqyt) r12
            r12.getClass()
            defpackage.eqnb.b(r3, r12)
            eqyv r8 = defpackage.eqnb.a(r12)
            r9 = 120(0x78, float:1.68E-43)
            defpackage.ajyw.c(r4, r5, r6, r7, r8, r9)
            goto L77
        La8:
            ffcu r11 = defpackage.ffcu.a
            return r11
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akep.c(j$.time.Duration, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[LOOP:0: B:11:0x0066->B:13:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.aken
            if (r0 == 0) goto L13
            r0 = r11
            aken r0 = (defpackage.aken) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aken r0 = new aken
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            j$.time.Instant r1 = r0.e
            akep r0 = r0.d
            defpackage.ffci.b(r11)
            goto L60
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            defpackage.ffci.b(r11)
            entd r11 = defpackage.akep.b
            ensk r11 = r11.h()
            ensz r11 = (defpackage.ensz) r11
            java.lang.String r2 = "MessagesRestoreDailySynclet marking restore executions past the reprompt timeout as ready for reprompt"
            r11.q(r2)
            cqoh r11 = r10.a
            ffbr r2 = r10.d
            j$.time.Instant r11 = r11.f()
            java.lang.Object r2 = r2.b()
            ajyr r2 = (defpackage.ajyr) r2
            r0.d = r10
            r0.e = r11
            r0.c = r3
            java.lang.Object r0 = r2.p(r0)
            if (r0 == r1) goto L96
            r1 = r11
            r11 = r0
            r0 = r10
        L60:
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r11 = r11.iterator()
        L66:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r11.next()
            ajwc r2 = (defpackage.ajwc) r2
            ffbr r3 = r0.f
            java.lang.Object r3 = r3.b()
            r4 = r3
            ajyw r4 = (defpackage.ajyw) r4
            java.util.UUID r6 = r2.a
            eqza r5 = defpackage.eqza.WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT
            cqoh r2 = r0.a
            j$.time.Instant r2 = r2.f()
            j$.time.Duration r7 = j$.time.Duration.between(r1, r2)
            r7.getClass()
            r8 = 0
            r9 = 248(0xf8, float:3.48E-43)
            defpackage.ajyw.c(r4, r5, r6, r7, r8, r9)
            goto L66
        L93:
            ffcu r11 = defpackage.ffcu.a
            return r11
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akep.d(ffgu):java.lang.Object");
    }
}
