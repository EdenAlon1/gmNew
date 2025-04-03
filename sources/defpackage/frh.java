package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frh extends fsa {
    public final cop a;

    public frh(dwn dwnVar, boolean z, float f, ibz ibzVar, ffix ffixVar) {
        super(dwnVar, z, f, ibzVar, ffixVar);
        this.a = new cop((byte[]) null);
    }

    @Override // defpackage.fsa
    public final void a(dwp dwpVar, long j, float f) {
        int i;
        cop copVar = this.a;
        Object[] objArr = copVar.b;
        Object[] objArr2 = copVar.c;
        long[] jArr = copVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            ((frr) objArr2[i5]).b();
                        }
                        j2 >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        boolean z = ((fsa) this).b;
        frr frrVar = new frr(z ? new iak(dwpVar.a) : null, f, z);
        this.a.e(dwpVar, frrVar);
        ffqy.d(D(), null, null, new frg(frrVar, this, dwpVar, null), 3);
        ith.a(this);
    }

    @Override // defpackage.fsa
    public final void b(ifr ifrVar) {
        float f;
        long[] jArr;
        Object[] objArr;
        int i;
        float f2;
        Object[] objArr2;
        char c;
        long[] jArr2;
        long f3;
        long f4;
        frh frhVar = this;
        float f5 = ((frj) ((fsa) frhVar).c.invoke()).d;
        if (f5 == 0.0f) {
            return;
        }
        cop copVar = frhVar.a;
        Object[] objArr3 = copVar.b;
        Object[] objArr4 = copVar.c;
        long[] jArr3 = copVar.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr3[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = (~(i2 - length)) >>> 31;
                int i4 = 0;
                while (true) {
                    i = 8 - i3;
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr3[i5];
                        frr frrVar = (frr) objArr4[i5];
                        f3 = iby.f(ibw.d(r14), ibw.c(r14), ibw.b(r14), f5, ibw.f(frhVar.j()));
                        if (frrVar.d == null) {
                            long b = ifrVar.b();
                            c = '\b';
                            frrVar.d = Float.valueOf(Math.max(iar.c(b), iar.a(b)) * 0.3f);
                        } else {
                            c = '\b';
                        }
                        if (frrVar.a == null) {
                            f2 = f5;
                            frrVar.a = new iak(ifrVar.a());
                        } else {
                            f2 = f5;
                        }
                        if (frrVar.e == null) {
                            frrVar.e = new iak(ial.a(iar.c(ifrVar.b()) / 2.0f, iar.a(ifrVar.b()) / 2.0f));
                        }
                        float floatValue = (!((Boolean) frrVar.j.a()).booleanValue() || ((Boolean) frrVar.i.a()).booleanValue()) ? ((Number) frrVar.f.d()).floatValue() : 1.0f;
                        Float f6 = frrVar.d;
                        f6.getClass();
                        float f7 = floatValue;
                        float b2 = kav.b(f6.floatValue(), frrVar.b, ((Number) frrVar.g.d()).floatValue());
                        iak iakVar = frrVar.a;
                        iakVar.getClass();
                        float b3 = iak.b(iakVar.a);
                        iak iakVar2 = frrVar.e;
                        iakVar2.getClass();
                        jArr2 = jArr3;
                        float b4 = kav.b(b3, iak.b(iakVar2.a), ((Number) frrVar.h.d()).floatValue());
                        iak iakVar3 = frrVar.a;
                        iakVar3.getClass();
                        float c2 = iak.c(iakVar3.a);
                        iak iakVar4 = frrVar.e;
                        iakVar4.getClass();
                        objArr2 = objArr3;
                        float b5 = kav.b(c2, iak.c(iakVar4.a), ((Number) frrVar.h.d()).floatValue());
                        float a = ibw.a(f3);
                        long a2 = ial.a(b4, b5);
                        f4 = iby.f(ibw.d(f3), ibw.c(f3), ibw.b(f3), a * f7, ibw.f(f3));
                        if (frrVar.c) {
                            float c3 = iar.c(ifrVar.b());
                            float a3 = iar.a(ifrVar.b());
                            ifl t = ifrVar.t();
                            long a4 = t.a();
                            t.b().l();
                            try {
                                t.c.b(0.0f, 0.0f, c3, a3, 1);
                                ifq.e(ifrVar, f4, b2, a2, null, 0, 120);
                            } finally {
                                t.b().j();
                                t.h(a4);
                            }
                        } else {
                            ifq.e(ifrVar, f4, b2, a2, null, 0, 120);
                        }
                    } else {
                        f2 = f5;
                        objArr2 = objArr3;
                        c = '\b';
                        jArr2 = jArr3;
                    }
                    j >>= c;
                    i4++;
                    frhVar = this;
                    f5 = f2;
                    jArr3 = jArr2;
                    objArr3 = objArr2;
                }
                f = f5;
                objArr = objArr3;
                jArr = jArr3;
                if (i != 8) {
                    return;
                }
            } else {
                f = f5;
                jArr = jArr3;
                objArr = objArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            frhVar = this;
            f5 = f;
            jArr3 = jArr;
            objArr3 = objArr;
        }
    }

    @Override // defpackage.fsa
    public final void g(dwp dwpVar) {
        frr frrVar = (frr) this.a.f(dwpVar);
        if (frrVar != null) {
            frrVar.b();
        }
    }

    @Override // defpackage.hvh
    public final void t() {
        this.a.d();
    }
}
