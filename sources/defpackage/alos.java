package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alos implements alnu {
    public final ffbr a;
    public final eixo b;
    public final alqf c;
    public final alop d;
    public final alol e;
    public final atxt f;
    private final ffsk g;

    public alos(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ctvs ctvsVar, eixo eixoVar, alqf alqfVar, alop alopVar, cqoh cqohVar, alol alolVar, atxt atxtVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ctvsVar.getClass();
        eixoVar.getClass();
        alqfVar.getClass();
        cqohVar.getClass();
        this.g = ffskVar;
        this.a = ffbrVar2;
        this.b = eixoVar;
        this.c = alqfVar;
        this.d = alopVar;
        this.e = alolVar;
        this.f = atxtVar;
    }

    @Override // defpackage.alnu
    public final void a() {
        axol.k(this.g, null, new alor(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r5 != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064 A[LOOP:0: B:11:0x005e->B:13:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v0, types: [ffhh] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.LinkedHashMap, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aloq
            if (r0 == 0) goto L13
            r0 = r5
            aloq r0 = (defpackage.aloq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aloq r0 = new aloq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            eixo r5 = r4.b
            com.google.common.util.concurrent.ListenableFuture r5 = r5.e()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto L77
        L40:
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = 10
            int r0 = defpackage.ffdx.n(r5, r0)
            int r0 = defpackage.ffew.a(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = 16
            int r0 = defpackage.ffmk.f(r0, r2)
            r1.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L5e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r5.next()
            eisx r0 = (defpackage.eisx) r0
            int r2 = r0.a()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            r1.put(r3, r0)
            goto L5e
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alos.b(ffgu):java.lang.Object");
    }
}
