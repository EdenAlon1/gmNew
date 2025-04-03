package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctrg {
    public final ctsv a;
    private final ffhd b;
    private final ffhd c;
    private final cqoh d;

    public ctrg(ffhd ffhdVar, ffhd ffhdVar2, ctsv ctsvVar, cqoh cqohVar) {
        ffhdVar.getClass();
        ffhdVar2.getClass();
        cqohVar.getClass();
        this.b = ffhdVar;
        this.c = ffhdVar2;
        this.a = ctsvVar;
        this.d = cqohVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        if (defpackage.ffra.a(r14, r7, r1) == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[LOOP:0: B:18:0x0078->B:20:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r14, defpackage.fbri r15, defpackage.fbre r16, defpackage.ffgu r17) {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.ctrf
            if (r1 == 0) goto L15
            r1 = r0
            ctrf r1 = (defpackage.ctrf) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            ctrf r1 = new ctrf
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.a
            ffhh r2 = defpackage.ffhh.a
            int r3 = r1.c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L41
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            defpackage.ffci.b(r0)
            goto Lbd
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L36:
            fbri r15 = r1.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r14 = r1.e
            ctrg r3 = r1.d
            defpackage.ffci.b(r0)
            r10 = r3
            goto L62
        L41:
            defpackage.ffci.b(r0)
            bvhc r0 = defpackage.ctrt.c(r14, r15, r16)
            ffhd r3 = r13.c
            ffhd r3 = defpackage.ekxi.a(r3)
            ctrd r7 = new ctrd
            r7.<init>(r6, r0)
            r1.d = r13
            r1.e = r14
            r1.f = r15
            r1.c = r5
            java.lang.Object r0 = defpackage.ffra.a(r3, r7, r1)
            if (r0 == r2) goto Lc6
            r10 = r13
        L62:
            r12 = r14
            r11 = r15
            engw r0 = (defpackage.engw) r0
            r0.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            r15 = 10
            int r15 = defpackage.ffdx.n(r0, r15)
            r14.<init>(r15)
            java.util.Iterator r15 = r0.iterator()
        L78:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r15.next()
            bvfs r0 = (defpackage.bvfs) r0
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData r0 = defpackage.bdut.a(r0)
            r14.add(r0)
            goto L78
        L8c:
            engw r9 = defpackage.engq.a(r14)
            cqoh r14 = r10.d
            engw r14 = defpackage.ctpm.a(r9, r14)
            boolean r15 = r9.isEmpty()
            if (r15 != 0) goto Lc5
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto Lc5
            ffhd r14 = r10.b
            ffhd r14 = defpackage.ekxi.a(r14)
            ctre r7 = new ctre
            r8 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r1.d = r6
            r1.e = r6
            r1.f = r6
            r1.c = r4
            java.lang.Object r14 = defpackage.ffra.a(r14, r7, r1)
            if (r14 != r2) goto Lbd
            goto Lc6
        Lbd:
            int r14 = defpackage.engw.d
            engw r14 = defpackage.enou.a
            r14.getClass()
            return r14
        Lc5:
            return r9
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctrg.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fbri, fbre, ffgu):java.lang.Object");
    }
}
