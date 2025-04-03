package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egm implements egf, ipo {
    public final egp a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final ffsk f;
    public final jzn g;
    public final ffji h;
    public final List i;
    public final int j;
    public final dqs k;
    private final ipo l;
    private final boolean m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;

    public egm(egp egpVar, int i, boolean z, float f, ipo ipoVar, float f2, boolean z2, ffsk ffskVar, jzn jznVar, int i2, ffji ffjiVar, List list, int i3, int i4, int i5, dqs dqsVar, int i6, int i7) {
        this.a = egpVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.l = ipoVar;
        this.e = f2;
        this.m = z2;
        this.f = ffskVar;
        this.g = jznVar;
        this.n = i2;
        this.h = ffjiVar;
        this.i = list;
        this.o = i3;
        this.p = i4;
        this.j = i5;
        this.k = dqsVar;
        this.q = i6;
        this.r = i7;
    }

    @Override // defpackage.egf
    public final int a() {
        return this.q;
    }

    @Override // defpackage.egf
    public final int b() {
        return -this.o;
    }

    @Override // defpackage.egf
    public final int c() {
        return this.r;
    }

    @Override // defpackage.egf
    public final int d() {
        return this.j;
    }

    @Override // defpackage.egf
    public final int e() {
        return this.p;
    }

    @Override // defpackage.egf
    public final int f() {
        return this.o;
    }

    @Override // defpackage.egf
    public final long g() {
        return (k() << 32) | (j() & 4294967295L);
    }

    @Override // defpackage.egf
    public final dqs h() {
        return this.k;
    }

    @Override // defpackage.egf
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

    public final egm l(int i, boolean z) {
        egp egpVar;
        int i2;
        int i3;
        int i4;
        if (!this.m && !this.i.isEmpty() && (egpVar = this.a) != null && (i2 = this.b - i) >= 0 && i2 < egpVar.d) {
            egn egnVar = (egn) ffdx.K(this.i);
            egn egnVar2 = (egn) ffdx.P(this.i);
            if (!egnVar.m && !egnVar2.m) {
                if (i < 0) {
                    if (Math.min((dvf.a(egnVar, this.k) + egnVar.f) - this.o, (dvf.a(egnVar2, this.k) + egnVar2.f) - this.p) <= (-i)) {
                        return null;
                    }
                } else if (Math.min(this.o - dvf.a(egnVar, this.k), this.p - dvf.a(egnVar2, this.k)) <= i) {
                    return null;
                }
                List list = this.i;
                int size = list.size();
                int i5 = 0;
                while (i5 < size) {
                    egn egnVar3 = (egn) list.get(i5);
                    if (!egnVar3.m) {
                        long j = egnVar3.j;
                        int a = kaa.a(j);
                        long b = kaa.b(j) + i;
                        char c = ' ';
                        egnVar3.j = (a << 32) | (b & 4294967295L);
                        if (z) {
                            int d = egnVar3.d();
                            int i6 = 0;
                            while (i6 < d) {
                                eiq b2 = egnVar3.d.b(egnVar3.b, i6);
                                if (b2 != null) {
                                    long j2 = b2.b;
                                    i3 = i5;
                                    i4 = d;
                                    b2.b = (kaa.a(j2) << c) | (Integer.valueOf(kaa.b(j2) + i).intValue() & 4294967295L);
                                } else {
                                    i3 = i5;
                                    i4 = d;
                                }
                                i6++;
                                i5 = i3;
                                d = i4;
                                c = ' ';
                            }
                        }
                    }
                    i5++;
                }
                return new egm(this.a, this.b - i, this.c || i > 0, i, this.l, this.e, this.m, this.f, this.g, this.n, this.h, this.i, this.o, this.p, this.j, this.k, this.q, this.r);
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
