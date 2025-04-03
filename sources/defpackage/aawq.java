package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawq implements aawn, xik {
    private final alye a;
    private final ffsk b;
    private final fgcl c;
    private final fgcq d;

    public aawq(alye alyeVar, ffsk ffskVar) {
        alyeVar.getClass();
        ffskVar.getClass();
        this.a = alyeVar;
        this.b = ffskVar;
        fgcl e = fgcu.e(1, 0, 2, 2);
        this.c = e;
        this.d = e;
    }

    @Override // defpackage.xik
    public final void a(xhu xhuVar) {
        axol.k(this.b, null, new aawo(this, null), 3);
    }

    @Override // defpackage.aawn
    public final Object b(int i, ffgu ffguVar) {
        Object fQ = this.c.fQ(new Integer(i), ffguVar);
        return fQ == ffhh.a ? fQ : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r6.fQ(r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.aawn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.api.messaging.MessageId r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aawp
            if (r0 == 0) goto L13
            r0 = r7
            aawp r0 = (defpackage.aawp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aawp r0 = new aawp
            r0.<init>(r5, r7)
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
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            aawq r6 = r0.d
            defpackage.ffci.b(r7)
            goto L53
        L38:
            defpackage.ffci.b(r7)
            alye r7 = r5.a
            alxy r7 = r7.e()
            elfl r6 = r7.d(r6)
            r6.getClass()
            r0.d = r5
            r0.c = r4
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)
            if (r7 == r1) goto L69
            r6 = r5
        L53:
            java.lang.Integer r7 = (java.lang.Integer) r7
            fgcl r6 = r6.c
            r7.getClass()
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r6.fQ(r7, r0)
            if (r6 != r1) goto L66
            goto L69
        L66:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aawq.c(com.google.android.apps.messaging.shared.api.messaging.MessageId, ffgu):java.lang.Object");
    }

    @Override // defpackage.aawn
    public final fgcq d() {
        return this.d;
    }
}
