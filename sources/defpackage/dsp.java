package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsp {
    public dsg a;
    public dik b;
    public dpq c;
    public dqs d;
    public boolean e;
    public ijj f;
    public final ffix g;
    public boolean h;
    public int i = 1;
    public drd j = drp.b;
    public final dsl k = new dsl(this);
    public final ffji l = new dsn(this);

    public dsp(dsg dsgVar, dik dikVar, dpq dpqVar, dqs dqsVar, boolean z, ijj ijjVar, ffix ffixVar) {
        this.a = dsgVar;
        this.b = dikVar;
        this.c = dpqVar;
        this.d = dqsVar;
        this.e = z;
        this.f = ijjVar;
        this.g = ffixVar;
    }

    public final float a(float f) {
        return this.e ? -f : f;
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.d == dqs.b ? j >> 32 : j & 4294967295L));
    }

    public final long c(drd drdVar, long j, int i) {
        long b = this.f.b(j, i);
        long e = iak.e(j, b);
        long d = d(f(drdVar.a(b(d(e(e))))));
        return iak.f(iak.f(b, d), this.f.a(d, iak.e(e, d), i));
    }

    public final long d(long j) {
        return this.e ? iak.g(j, -1.0f) : j;
    }

    public final long e(long j) {
        return iak.k(j, 0.0f, this.d == dqs.b ? 1 : 2);
    }

    public final long f(float f) {
        long floatToRawIntBits;
        long j;
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == dqs.b) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(f);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(f);
            j = floatToRawIntBits3 << 32;
        }
        return j | (4294967295L & floatToRawIntBits);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r12, defpackage.ffgu r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.dsi
            if (r0 == 0) goto L13
            r0 = r14
            dsi r0 = (defpackage.dsi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsi r0 = new dsi
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            ffla r12 = r0.e
            dsp r13 = r0.d
            defpackage.ffci.b(r14)     // Catch: java.lang.Throwable -> L2d
            r6 = r11
            goto L5d
        L2d:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L6e
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            defpackage.ffci.b(r14)
            ffla r7 = new ffla
            r7.<init>()
            r7.a = r12
            r11.h = r4
            dhy r14 = defpackage.dhy.a     // Catch: java.lang.Throwable -> L6a
            dsk r5 = new dsk     // Catch: java.lang.Throwable -> L6a
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L68
            r0.d = r6     // Catch: java.lang.Throwable -> L68
            r0.e = r7     // Catch: java.lang.Throwable -> L68
            r0.c = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r12 = r11.i(r14, r5, r0)     // Catch: java.lang.Throwable -> L68
            if (r12 == r1) goto L67
            r13 = r6
            r12 = r7
        L5d:
            r13.h = r3
            long r12 = r12.a
            kan r14 = new kan
            r14.<init>(r12)
            return r14
        L67:
            return r1
        L68:
            r0 = move-exception
            goto L6c
        L6a:
            r0 = move-exception
            r6 = r11
        L6c:
            r12 = r0
            r13 = r6
        L6e:
            r13.h = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsp.g(long, ffgu):java.lang.Object");
    }

    public final Object h(long j, boolean z, ffgu ffguVar) {
        if (!z) {
            long g = kan.g(j, 0.0f, 0.0f, this.d == dqs.b ? 1 : 2);
            dsm dsmVar = new dsm(this, null);
            dik dikVar = this.b;
            if (dikVar == null || !j()) {
                Object a = dsmVar.a(new kan(g), ffguVar);
                if (a == ffhh.a) {
                    return a;
                }
            } else {
                Object d = dikVar.d(g, dsmVar, ffguVar);
                if (d == ffhh.a) {
                    return d;
                }
            }
        }
        return ffcu.a;
    }

    public final Object i(dhy dhyVar, ffjm ffjmVar, ffgu ffguVar) {
        Object e = this.a.e(dhyVar, new dso(this, ffjmVar, null), ffguVar);
        return e == ffhh.a ? e : ffcu.a;
    }

    public final boolean j() {
        return this.a.h() || this.a.g();
    }

    public final boolean k() {
        return this.d == dqs.a;
    }
}
