package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgs extends hvh implements ixl {
    public dwn a;
    private dwk b;

    public dgs(dwn dwnVar) {
        this.a = dwnVar;
    }

    @Override // defpackage.ixl
    public final /* synthetic */ long a() {
        return ixt.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dgo
            if (r0 == 0) goto L13
            r0 = r5
            dgo r0 = (defpackage.dgo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dgo r0 = new dgo
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dwk r1 = r0.e
            dgs r0 = r0.d
            defpackage.ffci.b(r5)
            goto L4f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.ffci.b(r5)
            dwk r5 = r4.b
            if (r5 != 0) goto L53
            dwk r5 = new dwk
            r5.<init>()
            dwn r2 = r4.a
            r0.d = r4
            r0.e = r5
            r0.c = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 == r1) goto L52
            r0 = r4
            r1 = r5
        L4f:
            r0.b = r1
            goto L53
        L52:
            return r1
        L53:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgs.b(ffgu):java.lang.Object");
    }

    @Override // defpackage.hvh
    public final /* synthetic */ void dL() {
        ixk.a(this);
    }

    @Override // defpackage.ixl
    public final void dU() {
        f();
    }

    @Override // defpackage.ixl
    public final void dV(iki ikiVar, ikk ikkVar, long j) {
        if (ikkVar == ikk.b) {
            int i = ikiVar.e;
            if (ikm.a(i, 4)) {
                ffqy.d(D(), null, null, new dgq(this, null), 3);
            } else if (ikm.a(i, 5)) {
                ffqy.d(D(), null, null, new dgr(this, null), 3);
            }
        }
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void dW() {
        ixk.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dgp
            if (r0 == 0) goto L13
            r0 = r5
            dgp r0 = (defpackage.dgp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dgp r0 = new dgp
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dgs r0 = r0.d
            defpackage.ffci.b(r5)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            dwk r5 = r4.b
            if (r5 == 0) goto L4f
            dwl r2 = new dwl
            r2.<init>(r5)
            dwn r5 = r4.a
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 == r1) goto L4e
            r0 = r4
        L4a:
            r5 = 0
            r0.b = r5
            goto L4f
        L4e:
            return r1
        L4f:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgs.e(ffgu):java.lang.Object");
    }

    public final void f() {
        dwk dwkVar = this.b;
        if (dwkVar != null) {
            this.a.b(new dwl(dwkVar));
            this.b = null;
        }
    }

    @Override // defpackage.hvh
    public final void t() {
        f();
    }

    @Override // defpackage.ixl
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void y() {
    }
}
