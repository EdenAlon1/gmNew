package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjok implements cjmj {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/pipeline/rcs/send/SendingMessagePipeline");
    public final azei b;
    private final awtm c;
    private final cjkf d;
    private final ffsk e;

    public cjok(awtm awtmVar, cjkf cjkfVar, azei azeiVar, ffsk ffskVar, autg autgVar) {
        awtmVar.getClass();
        azeiVar.getClass();
        ffskVar.getClass();
        autgVar.getClass();
        this.c = awtmVar;
        this.d = cjkfVar;
        this.b = azeiVar;
        this.e = ffskVar;
    }

    public static final void d(ffrf ffrfVar, cjmw cjmwVar, cjmw cjmwVar2, int i) {
        if (ffkj.e(cjmwVar, cjmwVar2)) {
            ffrfVar.w(ckbx.j(i, 0).a());
        }
    }

    @Override // defpackage.cjmj
    public final awtm a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.cjmj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cjmw r19, defpackage.azsu r20, defpackage.avkl r21, defpackage.azcr r22, int r23, defpackage.cjmu r24, defpackage.cjnz r25, defpackage.fjay r26, defpackage.bdhg r27, defpackage.fayv r28, defpackage.ffgu r29) {
        /*
            r18 = this;
            r0 = r18
            r1 = r29
            boolean r2 = r1 instanceof defpackage.cjoh
            if (r2 == 0) goto L17
            r2 = r1
            cjoh r2 = (defpackage.cjoh) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            cjoh r2 = new cjoh
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            ffhh r3 = defpackage.ffhh.a
            int r4 = r2.c
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            defpackage.ffci.b(r1)
            goto L69
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            defpackage.ffci.b(r1)
            if (r21 == 0) goto L6e
            cjkf r1 = r0.d
            cjkh r4 = defpackage.cjkh.c
            cjoc r6 = new cjoc
            cjoe r7 = new cjoe
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            r16 = r26
            r15 = r27
            r17 = r28
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            cjmd r8 = new cjmd
            r9 = 0
            r8.<init>(r9, r9, r9)
            r6.<init>(r7, r8)
            r2.c = r5
            java.lang.Object r1 = r1.a(r4, r6, r2)
            if (r1 != r3) goto L69
            return r3
        L69:
            cjod r1 = (defpackage.cjod) r1
            ffcu r1 = defpackage.ffcu.a
            return r1
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Required value was null."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjok.b(cjmw, azsu, avkl, azcr, int, cjmu, cjnz, fjay, bdhg, fayv, ffgu):java.lang.Object");
    }

    @Override // defpackage.cjmj
    public final Object c(cjmw cjmwVar, azsu azsuVar, avkl avklVar, cjmu cjmuVar, cjnz cjnzVar, fjay fjayVar, bdhg bdhgVar, fayv fayvVar, ffgu ffguVar) {
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        cjoj cjojVar = new cjoj(this, ffrhVar, cjmwVar);
        this.b.e(cjojVar);
        ffrhVar.d(new cjoi(this, cjojVar));
        axol.m(this.e, new cjog(this, cjmwVar, azsuVar, avklVar, cjmuVar, cjnzVar, fjayVar, bdhgVar, fayvVar, null));
        return ffrhVar.m();
    }
}
