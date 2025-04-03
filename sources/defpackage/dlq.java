package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlq<T> extends dpb {
    public dly a;
    public dqs b;
    public dpq c;
    public dpq d;
    private jzn j;

    public dlq(dly dlyVar, dqs dqsVar, dpq dpqVar) {
        super(dlj.a, true, null, dqsVar);
        this.a = dlyVar;
        this.b = dqsVar;
        this.c = dpqVar;
    }

    @Override // defpackage.dpb
    public final Object b(ffjm ffjmVar, ffgu ffguVar) {
        Object l = dly.l(this.a, new dll(ffjmVar, this, null), ffguVar);
        return l == ffhh.a ? l : ffcu.a;
    }

    @Override // defpackage.dpb, defpackage.hvh
    public final void dL() {
        dU();
        if (this.z) {
            jzn g = isx.g(this);
            jzn jznVar = this.j;
            if (jznVar == null || !ffkj.e(jznVar, g)) {
                this.j = g;
                i(this.c);
            }
        }
    }

    @Override // defpackage.hvh
    public final void dT() {
        i(this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(float r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dlm
            if (r0 == 0) goto L13
            r0 = r8
            dlm r0 = (defpackage.dlm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlm r0 = new dlm
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            if (r2 == 0) goto L38
            r7 = 1
            if (r2 == r7) goto L34
            if (r2 != r3) goto L2c
            ffky r7 = r0.d
            defpackage.ffci.b(r8)
            goto L55
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.ffci.b(r8)
            return r8
        L38:
            defpackage.ffci.b(r8)
            ffky r8 = new ffky
            r8.<init>()
            r8.a = r7
            dly r2 = r6.a
            dlo r4 = new dlo
            r5 = 0
            r4.<init>(r6, r8, r7, r5)
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = defpackage.dly.l(r2, r4, r0)
            if (r7 == r1) goto L5d
            r7 = r8
        L55:
            float r7 = r7.a
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlq.f(float, ffgu):java.lang.Object");
    }

    @Override // defpackage.dpb
    public final void h(long j) {
        if (this.z) {
            ffqy.d(D(), null, null, new dlp(this, j, null), 3);
        }
    }

    public final void i(dpq dpqVar) {
        if (dpqVar == null) {
            cxt cxtVar = dky.a;
            cxt cxtVar2 = dky.a;
            ffji ffjiVar = dky.b;
            jzn g = isx.g(this);
            this.j = g;
            dpqVar = dlj.a(this.a, g, ffjiVar, cxtVar2);
        }
        this.d = dpqVar;
    }

    public final boolean j() {
        return isx.h(this) == kah.b && this.b == dqs.b;
    }

    @Override // defpackage.dpb
    public final boolean k() {
        return this.a.e() != null;
    }

    @Override // defpackage.dpb
    public final void g(long j) {
    }
}
