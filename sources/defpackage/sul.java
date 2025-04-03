package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sul implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ sup b;

    public sul(ffxy ffxyVar, sup supVar) {
        this.a = ffxyVar;
        this.b = supVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.suk
            if (r0 == 0) goto L13
            r0 = r11
            suk r0 = (defpackage.suk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            suk r0 = new suk
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r11)
            goto L8a
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            defpackage.ffci.b(r11)
            ffxy r11 = r9.a
            engw r10 = (defpackage.engw) r10
            java.util.Iterator r2 = r10.iterator()
        L3a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L63
            java.lang.Object r4 = r2.next()
            r6 = r4
            amop r6 = (defpackage.amop) r6
            axcl r7 = r6.a
            axcl r8 = defpackage.axcl.CONVERSATION_CLASSIFICATION_TYPE_SAVE_BIRTHDAY
            if (r7 != r8) goto L3a
            java.lang.String r6 = r6.d
            sup r7 = r9.b
            cqoh r7 = r7.a
            j$.time.MonthDay r7 = defpackage.sth.c(r7)
            java.lang.String r7 = r7.toString()
            boolean r6 = defpackage.ffkj.e(r6, r7)
            if (r6 == 0) goto L3a
            goto L64
        L63:
            r4 = r5
        L64:
            java.util.Iterator r10 = r10.iterator()
        L68:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r10.next()
            r6 = r2
            amop r6 = (defpackage.amop) r6
            axcl r6 = r6.a
            axcl r7 = defpackage.axcl.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY
            if (r6 != r7) goto L68
            r5 = r2
        L7c:
            ffcf r10 = new ffcf
            r10.<init>(r4, r5)
            r0.b = r3
            java.lang.Object r10 = r11.fQ(r10, r0)
            if (r10 != r1) goto L8a
            return r1
        L8a:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sul.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
