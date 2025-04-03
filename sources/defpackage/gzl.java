package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzl {
    public final ffix a;
    public final ffji b;
    public final hbl c = new hbl();
    public final dpp d = new gzh(this);
    public final hkx e;
    public final hho f;
    public final hjx g;
    public final gzd h;
    private final ffji i;
    private final ffix j;
    private final hho k;
    private final hkx l;
    private final hho m;
    private final hjx n;

    public gzl(Object obj, ffji ffjiVar, ffix ffixVar, ffix ffixVar2, ffji ffjiVar2) {
        this.i = ffjiVar;
        this.j = ffixVar;
        this.a = ffixVar2;
        this.b = ffjiVar2;
        this.k = new hic(obj, hla.a);
        gzj gzjVar = new gzj(this);
        hqg hqgVar = hkg.a;
        this.l = new hgk(gzjVar, null);
        this.e = new hgk(new gze(this), null);
        this.n = new hhw(Float.NaN);
        new hgk(new gzi(this), hla.a);
        this.g = new hhw(0.0f);
        this.m = new hic(null, hla.a);
        this.f = new hic(new hbq(ffem.a), hla.a);
        this.h = new gzd(this);
    }

    public final float a(float f) {
        float c = c(f);
        float b = Float.isNaN(b()) ? 0.0f : b();
        n(c);
        return c - b;
    }

    public final float b() {
        return this.n.c();
    }

    public final float c(float f) {
        float b = (Float.isNaN(b()) ? 0.0f : b()) + f;
        float a = p().a();
        Float H = ffdx.H(p().a.values());
        return ffmk.e(b, a, H != null ? H.floatValue() : Float.NaN);
    }

    public final float d() {
        if (Float.isNaN(b())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return b();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dhy r7, defpackage.ffjn r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.gyv
            if (r0 == 0) goto L13
            r0 = r9
            gyv r0 = (defpackage.gyv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gyv r0 = new gyv
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            gzl r7 = r0.d
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L2b
            goto L4c
        L2b:
            r8 = move-exception
            goto L86
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.ffci.b(r9)
            hbl r9 = r6.c     // Catch: java.lang.Throwable -> L83
            gyy r2 = new gyy     // Catch: java.lang.Throwable -> L83
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L83
            r0.d = r6     // Catch: java.lang.Throwable -> L83
            r0.c = r4     // Catch: java.lang.Throwable -> L83
            java.lang.Object r7 = r9.a(r7, r2, r0)     // Catch: java.lang.Throwable -> L83
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r7 = r6
        L4c:
            hbq r8 = r7.p()
            float r9 = r7.b()
            java.lang.Object r8 = r8.c(r9)
            if (r8 == 0) goto L80
            float r9 = r7.b()
            hbq r0 = r7.p()
            float r0 = r0.b(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L80
            ffji r9 = r7.b
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L80
            r7.l(r8)
        L80:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L83:
            r7 = move-exception
            r8 = r7
            r7 = r6
        L86:
            hbq r9 = r7.p()
            float r0 = r7.b()
            java.lang.Object r9 = r9.c(r0)
            if (r9 == 0) goto Lba
            float r0 = r7.b()
            hbq r1 = r7.p()
            float r1 = r1.b(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lba
            ffji r0 = r7.b
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lba
            r7.l(r9)
        Lba:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzl.e(dhy, ffjn, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Object r7, defpackage.dhy r8, defpackage.ffjo r9, defpackage.ffgu r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.gyz
            if (r0 == 0) goto L13
            r0 = r10
            gyz r0 = (defpackage.gyz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gyz r0 = new gyz
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            gzl r7 = r0.d
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L2c
            goto L55
        L2c:
            r8 = move-exception
            goto L91
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.ffci.b(r10)
            hbq r10 = r6.p()
            boolean r10 = r10.e(r7)
            if (r10 == 0) goto Lc9
            hbl r10 = r6.c     // Catch: java.lang.Throwable -> L8e
            gzc r2 = new gzc     // Catch: java.lang.Throwable -> L8e
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L8e
            r0.d = r6     // Catch: java.lang.Throwable -> L8e
            r0.c = r4     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = r10.a(r8, r2, r0)     // Catch: java.lang.Throwable -> L8e
            if (r7 == r1) goto L8d
            r7 = r6
        L55:
            r7.m(r5)
            hbq r8 = r7.p()
            float r9 = r7.b()
            java.lang.Object r8 = r8.c(r9)
            if (r8 == 0) goto Lcc
            float r9 = r7.b()
            hbq r10 = r7.p()
            float r10 = r10.b(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lcc
            ffji r9 = r7.b
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lcc
            r7.l(r8)
            goto Lcc
        L8d:
            return r1
        L8e:
            r7 = move-exception
            r8 = r7
            r7 = r6
        L91:
            r7.m(r5)
            hbq r9 = r7.p()
            float r10 = r7.b()
            java.lang.Object r9 = r9.c(r10)
            if (r9 == 0) goto Lc8
            float r10 = r7.b()
            hbq r0 = r7.p()
            float r0 = r0.b(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto Lc8
            ffji r10 = r7.b
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lc8
            r7.l(r9)
        Lc8:
            throw r8
        Lc9:
            r6.l(r7)
        Lcc:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzl.f(java.lang.Object, dhy, ffjo, ffgu):java.lang.Object");
    }

    public final Object g(float f, Object obj, float f2) {
        hbq p = p();
        float b = p.b(obj);
        float floatValue = ((Number) this.j.invoke()).floatValue();
        if (b != f && !Float.isNaN(b)) {
            if (b < f) {
                if (f2 >= floatValue) {
                    Object d = p.d(f, true);
                    d.getClass();
                    return d;
                }
                Object d2 = p.d(f, true);
                d2.getClass();
                if (f >= Math.abs(b + Math.abs(((Number) this.i.invoke(Float.valueOf(Math.abs(p.b(d2) - b)))).floatValue()))) {
                    return d2;
                }
            } else {
                if (f2 <= (-floatValue)) {
                    Object d3 = p.d(f, false);
                    d3.getClass();
                    return d3;
                }
                Object d4 = p.d(f, false);
                d4.getClass();
                float abs = Math.abs(b - Math.abs(((Number) this.i.invoke(Float.valueOf(Math.abs(b - p.b(d4))))).floatValue()));
                if (f >= 0.0f ? f <= abs : Math.abs(f) >= abs) {
                    return d4;
                }
            }
        }
        return obj;
    }

    public final Object h() {
        return this.k.a();
    }

    public final Object i() {
        return this.m.a();
    }

    public final Object j() {
        return this.l.a();
    }

    public final Object k(float f, ffgu ffguVar) {
        Object h = h();
        Object g = g(d(), h, f);
        if (((Boolean) this.b.invoke(g)).booleanValue()) {
            Object b = gyu.b(this, g, f, ffguVar);
            if (b == ffhh.a) {
                return b;
            }
        } else {
            Object b2 = gyu.b(this, h, f, ffguVar);
            if (b2 == ffhh.a) {
                return b2;
            }
        }
        return ffcu.a;
    }

    public final void l(Object obj) {
        this.k.b(obj);
    }

    public final void m(Object obj) {
        this.m.b(obj);
    }

    public final void n(float f) {
        this.n.i(f);
    }

    public final boolean o() {
        return i() != null;
    }

    public final hbq p() {
        return (hbq) this.f.a();
    }
}
