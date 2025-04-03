package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eei implements ejs {
    public final int a;
    public final boolean b;
    public final int c;
    public final Object d;
    public final Object e;
    public final LazyLayoutItemAnimator f;
    public int g;
    public final int h;
    public final int i;
    public final int j;
    public boolean k;
    public int l = Integer.MIN_VALUE;
    public int m;
    public final int[] n;
    private final List o;
    private final hun p;
    private final kah q;
    private final boolean r;
    private final int s;
    private final int t;
    private final long u;
    private final long v;
    private int w;
    private final hus x;

    public eei(int i, List list, boolean z, hun hunVar, hus husVar, kah kahVar, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2) {
        this.a = i;
        this.o = list;
        this.b = z;
        this.p = hunVar;
        this.x = husVar;
        this.q = kahVar;
        this.r = z2;
        this.s = i2;
        this.c = i3;
        this.t = i4;
        this.u = j;
        this.d = obj;
        this.e = obj2;
        this.f = lazyLayoutItemAnimator;
        this.v = j2;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iqk iqkVar = (iqk) list.get(i7);
            boolean z3 = this.b;
            i5 += z3 ? iqkVar.b : iqkVar.a;
            i6 = Math.max(i6, !z3 ? iqkVar.b : iqkVar.a);
        }
        this.h = i5;
        this.i = ffmk.f(i5 + this.t, 0);
        this.j = i6;
        int size2 = this.o.size();
        this.n = new int[size2 + size2];
    }

    private final int o(long j) {
        return this.b ? kaa.b(j) : kaa.a(j);
    }

    private final int p(iqk iqkVar) {
        return this.b ? iqkVar.b : iqkVar.a;
    }

    @Override // defpackage.ejs
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ejs
    public final int b() {
        return 0;
    }

    @Override // defpackage.ejs
    public final int c() {
        return this.i;
    }

    @Override // defpackage.ejs
    public final int d() {
        return this.o.size();
    }

    @Override // defpackage.ejs
    public final int e() {
        return 1;
    }

    @Override // defpackage.ejs
    public final long f() {
        return this.v;
    }

    @Override // defpackage.ejs
    public final long g(int i) {
        int[] iArr = this.n;
        int i2 = i + i;
        return (iArr[i2] << 32) | (iArr[i2 + 1] & 4294967295L);
    }

    @Override // defpackage.ejs
    public final Object h() {
        return this.d;
    }

    @Override // defpackage.ejs
    public final Object i(int i) {
        return ((iqk) this.o.get(i)).f();
    }

    public final void j(iqj iqjVar, boolean z) {
        iga igaVar;
        if (this.l == Integer.MIN_VALUE) {
            dwv.c("position() should be called first");
        }
        int d = d();
        for (int i = 0; i < d; i++) {
            iqk iqkVar = (iqk) this.o.get(i);
            int p = this.w - p(iqkVar);
            int i2 = this.m;
            long g = g(i);
            eiq b = this.f.b(this.d, i);
            if (b != null) {
                if (z) {
                    b.g = g;
                } else {
                    long j = b.g;
                    if (true != kaa.f(j, 9223372034707292159L)) {
                        g = j;
                    }
                    long d2 = kaa.d(g, b.a());
                    if ((o(g) <= p && o(d2) <= p) || (o(g) >= i2 && o(d2) >= i2)) {
                        b.c();
                    }
                    g = d2;
                }
                igaVar = b.d;
            } else {
                igaVar = null;
            }
            if (this.r) {
                g = this.b ? (kaa.a(g) << 32) | (((this.l - kaa.b(g)) - p(iqkVar)) & 4294967295L) : (((this.l - kaa.a(g)) - p(iqkVar)) << 32) | (kaa.b(g) & 4294967295L);
            }
            long d3 = kaa.d(g, this.u);
            if (!z && b != null) {
                b.c = d3;
            }
            if (this.b) {
                if (igaVar != null) {
                    iqjVar.i(iqkVar, d3, igaVar, 0.0f);
                } else {
                    iqjVar.h(iqkVar, d3, 0.0f, iqm.a);
                }
            } else if (igaVar == null) {
                iqj.o(iqjVar, iqkVar, d3);
            } else if (iqjVar.c() == kah.a || iqjVar.a() == 0) {
                iqjVar.d(iqkVar);
                iqkVar.x(kaa.d(d3, iqkVar.e), 0.0f, igaVar);
            } else {
                int a = iqjVar.a() - iqkVar.a;
                int a2 = kaa.a(d3);
                iqjVar.d(iqkVar);
                iqkVar.x(kaa.d(((a - a2) << 32) | (4294967295L & kaa.b(d3)), iqkVar.e), 0.0f, igaVar);
            }
        }
    }

    public final void k(int i, int i2, int i3) {
        int i4;
        this.g = i;
        this.l = true != this.b ? i2 : i3;
        List list = this.o;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            iqk iqkVar = (iqk) list.get(i5);
            int i6 = i5 + i5;
            if (this.b) {
                int[] iArr = this.n;
                hun hunVar = this.p;
                if (hunVar == null) {
                    dwv.a("null horizontalAlignment when isVertical == true");
                    throw new ffbx();
                }
                iArr[i6] = hunVar.a(iqkVar.a, i2, this.q);
                this.n[i6 + 1] = i;
                i4 = iqkVar.b;
            } else {
                int i7 = i6 + 1;
                int[] iArr2 = this.n;
                iArr2[i6] = i;
                hus husVar = this.x;
                if (husVar == null) {
                    dwv.a("null verticalAlignment when isVertical == false");
                    throw new ffbx();
                }
                iArr2[i7] = husVar.a(iqkVar.b, i3);
                i4 = iqkVar.a;
            }
            i += i4;
        }
        this.w = -this.s;
        this.m = this.l + this.c;
    }

    @Override // defpackage.ejs
    public final void l(int i, int i2, int i3, int i4) {
        k(i, i3, i4);
    }

    @Override // defpackage.ejs
    public final boolean m() {
        return this.b;
    }

    @Override // defpackage.ejs
    public final void n() {
        this.k = true;
    }
}
