package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeh implements eea, ipo {
    public final eei a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final ffsk f;
    public final jzn g;
    public final long h;
    public final List i;
    public final int j;
    public final int k;
    private final ipo l;
    private final boolean m;
    private final int n;
    private final boolean o;
    private final dqs p;
    private final int q;
    private final int r;

    public eeh(eei eeiVar, int i, boolean z, float f, ipo ipoVar, float f2, boolean z2, ffsk ffskVar, jzn jznVar, long j, List list, int i2, int i3, int i4, boolean z3, dqs dqsVar, int i5, int i6) {
        this.a = eeiVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.l = ipoVar;
        this.e = f2;
        this.m = z2;
        this.f = ffskVar;
        this.g = jznVar;
        this.h = j;
        this.i = list;
        this.n = i2;
        this.j = i3;
        this.k = i4;
        this.o = z3;
        this.p = dqsVar;
        this.q = i5;
        this.r = i6;
    }

    @Override // defpackage.eea
    public final int a() {
        return this.q;
    }

    @Override // defpackage.eea
    public final int b() {
        return -this.n;
    }

    @Override // defpackage.eea
    public final int c() {
        return this.r;
    }

    @Override // defpackage.eea
    public final int d() {
        return this.k;
    }

    @Override // defpackage.eea
    public final int e() {
        return this.j;
    }

    @Override // defpackage.eea
    public final int f() {
        return this.n;
    }

    @Override // defpackage.eea
    public final long g() {
        return (k() << 32) | (j() & 4294967295L);
    }

    @Override // defpackage.eea
    public final dqs h() {
        return this.p;
    }

    @Override // defpackage.eea
    public final List i() {
        return this.i;
    }

    @Override // defpackage.ipo
    public final int j() {
        return this.l.j();
    }

    @Override // defpackage.ipo
    public final int k() {
        return this.l.k();
    }

    public final eeh l(int i, boolean z) {
        eei eeiVar;
        int i2;
        int i3;
        long b;
        if (!this.m && !this.i.isEmpty() && (eeiVar = this.a) != null && (i2 = this.b - i) >= 0 && i2 < eeiVar.i) {
            eei eeiVar2 = (eei) ffdx.K(this.i);
            eei eeiVar3 = (eei) ffdx.P(this.i);
            if (!eeiVar2.k && !eeiVar3.k) {
                if (i < 0) {
                    if (Math.min((eeiVar2.g + eeiVar2.i) - this.n, (eeiVar3.g + eeiVar3.i) - this.j) <= (-i)) {
                        return null;
                    }
                } else if (Math.min(this.n - eeiVar2.g, this.j - eeiVar3.g) <= i) {
                    return null;
                }
                List list = this.i;
                int size = list.size();
                int i4 = 0;
                while (i4 < size) {
                    eei eeiVar4 = (eei) list.get(i4);
                    if (!eeiVar4.k) {
                        eeiVar4.g += i;
                        int length = eeiVar4.n.length;
                        for (int i5 = 0; i5 < length; i5++) {
                            int i6 = i5 & 1;
                            boolean z2 = eeiVar4.b;
                            if (z2) {
                                if (i6 == 0) {
                                    i6 = 0;
                                }
                                int[] iArr = eeiVar4.n;
                                iArr[i5] = iArr[i5] + i;
                            }
                            if (!z2) {
                                if (i6 != 0) {
                                }
                                int[] iArr2 = eeiVar4.n;
                                iArr2[i5] = iArr2[i5] + i;
                            }
                        }
                        if (z) {
                            int d = eeiVar4.d();
                            int i7 = 0;
                            while (i7 < d) {
                                eiq b2 = eeiVar4.f.b(eeiVar4.d, i7);
                                if (b2 != null) {
                                    boolean z3 = eeiVar4.b;
                                    long j = b2.b;
                                    if (z3) {
                                        i3 = i4;
                                        b = (kaa.a(j) << 32) | (Integer.valueOf(kaa.b(j) + i).intValue() & 4294967295L);
                                    } else {
                                        i3 = i4;
                                        b = (kaa.b(j) & 4294967295L) | (Integer.valueOf(kaa.a(j) + i).intValue() << 32);
                                    }
                                    b2.b = b;
                                } else {
                                    i3 = i4;
                                }
                                i7++;
                                i4 = i3;
                            }
                        }
                    }
                    i4++;
                }
                return new eeh(this.a, this.b - i, this.c || i > 0, i, this.l, this.e, this.m, this.f, this.g, this.h, this.i, this.n, this.j, this.k, this.o, this.p, this.q, this.r);
            }
        }
        return null;
    }

    @Override // defpackage.ipo
    public final Map m() {
        return this.l.m();
    }

    @Override // defpackage.ipo
    public final ffji n() {
        return this.l.n();
    }

    @Override // defpackage.ipo
    public final void o() {
        this.l.o();
    }
}
