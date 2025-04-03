package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbr extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ fflb c;
    final /* synthetic */ lcc d;
    final /* synthetic */ ffkz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbr(fflb fflbVar, lcc lccVar, ffkz ffkzVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = fflbVar;
        this.d = lccVar;
        this.e = ffkzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6 != r0) goto L19;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            java.lang.Object r0 = r5.a
            ffkz r0 = (defpackage.ffkz) r0
            defpackage.ffci.b(r6)
            goto L68
        L14:
            java.lang.Object r1 = r5.a
            ffkz r1 = (defpackage.ffkz) r1
            defpackage.ffci.b(r6)     // Catch: defpackage.laf -> L53
            goto L4a
        L1c:
            java.lang.Object r1 = r5.a
            fflb r1 = (defpackage.fflb) r1
            defpackage.ffci.b(r6)     // Catch: defpackage.laf -> L53
            goto L36
        L24:
            defpackage.ffci.b(r6)
            fflb r1 = r5.c     // Catch: defpackage.laf -> L53
            lcc r6 = r5.d     // Catch: defpackage.laf -> L53
            r5.a = r1     // Catch: defpackage.laf -> L53
            r5.b = r3     // Catch: defpackage.laf -> L53
            java.lang.Object r6 = r6.j(r5)     // Catch: defpackage.laf -> L53
            if (r6 != r0) goto L36
            goto L73
        L36:
            r1.a = r6     // Catch: defpackage.laf -> L53
            ffkz r1 = r5.e     // Catch: defpackage.laf -> L53
            lcc r6 = r5.d     // Catch: defpackage.laf -> L53
            lcs r6 = r6.c()     // Catch: defpackage.laf -> L53
            r5.a = r1     // Catch: defpackage.laf -> L53
            r5.b = r2     // Catch: defpackage.laf -> L53
            java.lang.Object r6 = r6.d()     // Catch: defpackage.laf -> L53
            if (r6 == r0) goto L73
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: defpackage.laf -> L53
            int r6 = r6.intValue()     // Catch: defpackage.laf -> L53
            r1.a = r6     // Catch: defpackage.laf -> L53
            goto L70
        L53:
            ffkz r6 = r5.e
            lcc r1 = r5.d
            fflb r2 = r5.c
            java.lang.Object r2 = r2.a
            r5.a = r6
            r4 = 3
            r5.b = r4
            java.lang.Object r1 = r1.l(r2, r3, r5)
            if (r1 == r0) goto L73
            r0 = r6
            r6 = r1
        L68:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0.a = r6
        L70:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new lbr(this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
