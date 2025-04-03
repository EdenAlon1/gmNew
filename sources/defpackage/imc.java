package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class imc implements iju, jzn, ffgu {
    public ffrf a;
    final /* synthetic */ imf b;
    private final ffgu c;
    private final /* synthetic */ imf d;
    private ikk e = ikk.b;
    private final ffhd f = ffhe.a;

    public imc(imf imfVar, ffgu ffguVar) {
        this.b = imfVar;
        this.c = ffguVar;
        this.d = imfVar;
    }

    @Override // defpackage.iju
    public final long a() {
        imf imfVar = this.b;
        long h = jzm.h(imfVar, imfVar.b().g());
        long j = imfVar.i;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (h >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (h & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    @Override // defpackage.iju
    public final long b() {
        return this.b.i;
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

    @Override // defpackage.iju
    public final iki p() {
        return this.b.f;
    }

    @Override // defpackage.iju
    public final jgi q() {
        return this.b.b();
    }

    @Override // defpackage.iju
    public final Object r(ikk ikkVar, ffgu ffguVar) {
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        this.e = ikkVar;
        this.a = ffrhVar;
        return ffrhVar.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ffud] */
    /* JADX WARN: Type inference failed for: r7v4, types: [ffud] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ffjm] */
    @Override // defpackage.iju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(long r7, defpackage.ffjm r9, defpackage.ffgu r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.ilz
            if (r0 == 0) goto L13
            r0 = r10
            ilz r0 = (defpackage.ilz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ilz r0 = new ilz
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.a
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L29
            goto L67
        L29:
            r8 = move-exception
            goto L6e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.ffci.b(r10)
            r4 = 0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L4c
            ffrf r10 = r6.a
            if (r10 == 0) goto L4c
            ikl r2 = new ikl
            r2.<init>(r7)
            java.lang.Object r2 = defpackage.ffci.a(r2)
            r10.w(r2)
        L4c:
            imf r10 = r6.b
            ffsk r10 = r10.D()
            ima r2 = new ima
            r4 = 0
            r2.<init>(r7, r6, r4)
            r7 = 3
            ffud r7 = defpackage.ffqy.d(r10, r4, r4, r2, r7)
            r0.a = r7     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r9.a(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r10 == r1) goto L6d
        L67:
            ijv r8 = defpackage.ijv.a
            r7.t(r8)
            return r10
        L6d:
            return r1
        L6e:
            ijv r9 = defpackage.ijv.a
            r7.t(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imc.s(long, ffjm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.iju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(long r5, defpackage.ffjm r7, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.imb
            if (r0 == 0) goto L13
            r0 = r8
            imb r0 = (defpackage.imb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            imb r0 = new imb
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)     // Catch: defpackage.ikl -> L3c
            return r8
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r8)
            r0.c = r3     // Catch: defpackage.ikl -> L3c
            java.lang.Object r5 = r4.s(r5, r7, r0)     // Catch: defpackage.ikl -> L3c
            if (r5 != r1) goto L3b
            return r1
        L3b:
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imc.t(long, ffjm, ffgu):java.lang.Object");
    }

    @Override // defpackage.ffgu
    public final ffhd u() {
        return this.f;
    }

    public final void v(iki ikiVar, ikk ikkVar) {
        ffrf ffrfVar;
        if (ikkVar != this.e || (ffrfVar = this.a) == null) {
            return;
        }
        this.a = null;
        ffrfVar.w(ikiVar);
    }

    @Override // defpackage.ffgu
    public final void w(Object obj) {
        imf imfVar = this.b;
        synchronized (imfVar.h) {
            imfVar.g.m(this);
        }
        this.c.w(obj);
    }
}
