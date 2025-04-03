package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeud implements aetu {
    private final effy a;

    public aeud(effy effyVar) {
        effyVar.getClass();
        this.a = effyVar;
    }

    @Override // defpackage.aetu
    public final Object a(ffgu ffguVar) {
        return ctzl.a(this.a, new ffji() { // from class: aetw
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                aeul aeulVar = (aeul) obj;
                aeulVar.getClass();
                return Boolean.valueOf(aeulVar.c);
            }
        }, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.aetu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aeub
            if (r0 == 0) goto L13
            r0 = r5
            aeub r0 = (defpackage.aeub) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aeub r0 = new aeub
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            effy r5 = r4.a
            aetz r2 = new aetz
            r2.<init>()
            r0.c = r3
            java.lang.Object r5 = defpackage.ctzl.a(r5, r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeud.b(ffgu):java.lang.Object");
    }

    @Override // defpackage.aetu
    public final Object c(ffgu ffguVar) {
        Object b = ctzl.b(this.a, new ffji() { // from class: aetx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                aeui aeuiVar = (aeui) obj;
                aeuiVar.copyOnWrite();
                aeul aeulVar = (aeul) aeuiVar.instance;
                aeul aeulVar2 = aeul.a;
                aeulVar.b |= 1;
                aeulVar.c = true;
                return ffcu.a;
            }
        }, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    @Override // defpackage.aetu
    public final Object d(final aeuk aeukVar, ffgu ffguVar) {
        Object b = ctzl.b(this.a, new ffji() { // from class: aetv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                aeui aeuiVar = (aeui) obj;
                aeuiVar.copyOnWrite();
                aeul aeulVar = (aeul) aeuiVar.instance;
                aeul aeulVar2 = aeul.a;
                aeulVar.e = aeuk.this.d;
                aeulVar.b |= 4;
                return ffcu.a;
            }
        }, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    @Override // defpackage.aetu
    public final Object e(final aeuk aeukVar, ffgu ffguVar) {
        Object b = ctzl.b(this.a, new ffji() { // from class: aeua
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                aeui aeuiVar = (aeui) obj;
                aeuiVar.copyOnWrite();
                aeul aeulVar = (aeul) aeuiVar.instance;
                aeul aeulVar2 = aeul.a;
                aeulVar.d = aeuk.this.d;
                aeulVar.b |= 2;
                return ffcu.a;
            }
        }, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.aetu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aeuc
            if (r0 == 0) goto L13
            r0 = r5
            aeuc r0 = (defpackage.aeuc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aeuc r0 = new aeuc
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            effy r5 = r4.a
            aety r2 = new aety
            r2.<init>()
            r0.c = r3
            java.lang.Object r5 = defpackage.ctzl.a(r5, r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeud.f(ffgu):java.lang.Object");
    }
}
