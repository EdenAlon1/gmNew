package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aloj implements aloc {
    public final lap a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffsk e;
    private final ffbr f;

    public aloj(ffsk ffskVar, lap lapVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffskVar.getClass();
        lapVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.e = ffskVar;
        this.a = lapVar;
        this.f = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.aloc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.aloe
            if (r0 == 0) goto L13
            r0 = r8
            aloe r0 = (defpackage.aloe) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aloe r0 = new aloe
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.a
            java.lang.Integer r0 = (java.lang.Integer) r0
            defpackage.ffci.b(r8)
            goto L77
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            java.lang.Object r2 = r0.a
            aloj r2 = (defpackage.aloj) r2
            defpackage.ffci.b(r8)
            goto L5c
        L3f:
            defpackage.ffci.b(r8)
            ffsk r8 = r7.e
            ffhd r8 = r8.hT()
            ffhd r8 = defpackage.ekxi.a(r8)
            alod r2 = new alod
            r2.<init>(r3, r7)
            r0.a = r7
            r0.d = r5
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 == r1) goto L9b
            r2 = r7
        L5c:
            java.lang.Integer r8 = (java.lang.Integer) r8
            ffbr r2 = r2.f
            java.lang.Object r2 = r2.b()
            eixo r2 = (defpackage.eixo) r2
            com.google.common.util.concurrent.ListenableFuture r2 = r2.e()
            r0.a = r8
            r0.d = r4
            java.lang.Object r0 = defpackage.fgfz.c(r2, r0)
            if (r0 == r1) goto L9b
            r6 = r0
            r0 = r8
            r8 = r6
        L77:
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L80:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r8.next()
            r2 = r1
            eisx r2 = (defpackage.eisx) r2
            int r2 = r2.a()
            if (r0 == 0) goto L80
            int r4 = r0.intValue()
            if (r2 != r4) goto L80
            return r1
        L9a:
            return r3
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aloj.a(ffgu):java.lang.Object");
    }

    @Override // defpackage.aloc
    public final void b(eisx eisxVar) {
        axol.k(this.e, null, new aloi(this, eisxVar, null), 3);
    }

    @Override // defpackage.aloc
    public final void c() {
        axol.k(this.e, null, new alog(this, null), 3);
    }
}
