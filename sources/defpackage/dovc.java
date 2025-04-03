package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dovc implements dqt, jzn {
    public boolean a;
    public boolean b;
    public final fgjb c = new fgjf();
    private final /* synthetic */ jzn d;

    public dovc(jzn jznVar) {
        this.d = jznVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dqt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.douz
            if (r0 == 0) goto L13
            r0 = r5
            douz r0 = (defpackage.douz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            douz r0 = new douz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 == r1) goto L4c
        L3a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L45
            ffcu r5 = defpackage.ffcu.a
            return r5
        L45:
            dpv r5 = new dpv
            r0 = 0
            r5.<init>(r0)
            throw r5
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dovc.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dqt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dovb
            if (r0 == 0) goto L13
            r0 = r5
            dovb r0 = (defpackage.dovb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dovb r0 = new dovb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dovc r0 = r0.d
            defpackage.ffci.b(r5)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            boolean r5 = r4.a
            if (r5 != 0) goto L50
            boolean r5 = r4.b
            if (r5 != 0) goto L50
            fgjb r5 = r4.c
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = defpackage.fgja.a(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            fgjb r5 = r0.c
            defpackage.fgja.c(r5)
            goto L51
        L50:
            r0 = r4
        L51:
            boolean r5 = r0.a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dovc.b(ffgu):java.lang.Object");
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.d.ec();
    }

    @Override // defpackage.jzx
    public final float ed() {
        return this.d.ed();
    }

    @Override // defpackage.jzx
    public final float ef(long j) {
        return jzw.a(this.d, j);
    }

    @Override // defpackage.jzn
    public final float eg(float f) {
        return jzm.a(this.d, f);
    }

    @Override // defpackage.jzn
    public final float ek(int i) {
        return jzm.b(this.d, i);
    }

    @Override // defpackage.jzn
    public final float el(long j) {
        return jzm.c(this.d, j);
    }

    @Override // defpackage.jzn
    public final float em(float f) {
        return jzm.d(this.d, f);
    }

    @Override // defpackage.jzn
    public final int en(long j) {
        return jzm.e(this.d, j);
    }

    @Override // defpackage.jzn
    public final int eo(float f) {
        return jzm.f(this.d, f);
    }

    @Override // defpackage.jzn
    public final long ep(long j) {
        return jzm.g(this.d, j);
    }

    @Override // defpackage.jzn
    public final long eq(long j) {
        return jzm.h(this.d, j);
    }

    @Override // defpackage.jzx
    public final long er(float f) {
        return jzw.b(this.d, f);
    }

    @Override // defpackage.jzn
    public final long es(float f) {
        return jzm.i(this.d, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dova
            if (r0 == 0) goto L13
            r0 = r5
            dova r0 = (defpackage.dova) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dova r0 = new dova
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dovc r0 = r0.d
            defpackage.ffci.b(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            fgjb r5 = r4.c
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = defpackage.fgja.a(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            r5 = 0
            r0.a = r5
            r0.b = r5
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dovc.p(ffgu):java.lang.Object");
    }
}
