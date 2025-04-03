package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijo extends hvh implements ixv, ijf {
    public ijf a;
    public ijj b;
    private ijo c;
    private final Object d;

    public ijo(ijf ijfVar, ijj ijjVar) {
        this.a = ijfVar;
        this.b = ijjVar == null ? new ijj() : ijjVar;
        this.d = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    private final ijf j() {
        if (this.z) {
            return f();
        }
        return null;
    }

    @Override // defpackage.ijf
    public final long a(long j, long j2, int i) {
        long a = this.a.a(j, j2, i);
        ijf j3 = j();
        return iak.f(a, j3 != null ? j3.a(iak.f(j, a), iak.e(j2, a), i) : 0L);
    }

    @Override // defpackage.ijf
    public final long b(long j, int i) {
        ijf j2 = j();
        long b = j2 != null ? j2.b(j, i) : 0L;
        return iak.f(b, this.a.b(iak.e(j, b), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ijf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r11, long r13, defpackage.ffgu r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.ijl
            if (r0 == 0) goto L13
            r0 = r15
            ijl r0 = (defpackage.ijl) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ijl r0 = new ijl
            r0.<init>(r10, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.c
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.e
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L35
            if (r1 != r7) goto L2d
            long r11 = r6.a
            defpackage.ffci.b(r15)
            goto L7f
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            long r13 = r6.b
            long r11 = r6.a
            ijo r1 = r6.f
            defpackage.ffci.b(r15)
            goto L57
        L3f:
            defpackage.ffci.b(r15)
            ijf r1 = r10.a
            r6.f = r10
            r6.a = r11
            r6.b = r13
            r6.e = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.c(r2, r4, r6)
            if (r15 == r0) goto L91
            r1 = r10
            r11 = r2
            r13 = r4
        L57:
            kan r15 = (defpackage.kan) r15
            long r8 = r15.a
            boolean r15 = r1.z
            if (r15 == 0) goto L64
            ijf r15 = r1.j()
            goto L66
        L64:
            ijo r15 = r1.c
        L66:
            r1 = r15
            if (r1 == 0) goto L85
            long r2 = defpackage.kan.d(r11, r8)
            long r4 = defpackage.kan.c(r13, r8)
            r11 = 0
            r6.f = r11
            r6.a = r8
            r6.e = r7
            java.lang.Object r15 = r1.c(r2, r4, r6)
            if (r15 == r0) goto L91
            r11 = r8
        L7f:
            kan r15 = (defpackage.kan) r15
            long r13 = r15.a
            r8 = r11
            goto L87
        L85:
            r13 = 0
        L87:
            long r11 = defpackage.kan.d(r8, r13)
            kan r13 = new kan
            r13.<init>(r11)
            return r13
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijo.c(long, long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ijf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r7, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ijm
            if (r0 == 0) goto L13
            r0 = r9
            ijm r0 = (defpackage.ijm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ijm r0 = new ijm
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r7 = r0.a
            defpackage.ffci.b(r9)
            goto L6e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            long r7 = r0.a
            ijo r2 = r0.e
            defpackage.ffci.b(r9)
            goto L52
        L3c:
            defpackage.ffci.b(r9)
            ijf r9 = r6.j()
            if (r9 == 0) goto L57
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r9.d(r7, r0)
            if (r9 == r1) goto L7c
            r2 = r6
        L52:
            kan r9 = (defpackage.kan) r9
            long r4 = r9.a
            goto L5a
        L57:
            r4 = 0
            r2 = r6
        L5a:
            ijf r9 = r2.a
            long r7 = defpackage.kan.c(r7, r4)
            r2 = 0
            r0.e = r2
            r0.a = r4
            r0.d = r3
            java.lang.Object r9 = r9.d(r7, r0)
            if (r9 == r1) goto L7c
            r7 = r4
        L6e:
            kan r9 = (defpackage.kan) r9
            long r0 = r9.a
            long r7 = defpackage.kan.d(r7, r0)
            kan r9 = new kan
            r9.<init>(r7)
            return r9
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijo.d(long, ffgu):java.lang.Object");
    }

    @Override // defpackage.hvh
    public final void dT() {
        i();
    }

    @Override // defpackage.ixv
    public final Object e() {
        return this.d;
    }

    public final ijo f() {
        if (this.z) {
            return (ijo) ixw.a(this);
        }
        return null;
    }

    public final ffsk g() {
        ffsk g;
        ijo f = f();
        if (f != null && (g = f.g()) != null) {
            return g;
        }
        ffsk ffskVar = this.b.d;
        if (ffskVar != null) {
            return ffskVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final void h() {
        ijj ijjVar = this.b;
        if (ijjVar.a == this) {
            ijjVar.a = null;
        }
    }

    public final void i() {
        ijj ijjVar = this.b;
        ijjVar.a = this;
        ijjVar.b = null;
        this.c = null;
        ijjVar.c = new ijn(this);
        ijjVar.d = D();
    }

    @Override // defpackage.hvh
    public final void t() {
        fflb fflbVar = new fflb();
        ixw.b(this, new ijp(fflbVar));
        ijo ijoVar = (ijo) ((ixv) fflbVar.a);
        this.c = ijoVar;
        this.b.b = ijoVar;
        h();
    }
}
