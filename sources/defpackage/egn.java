package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egn implements ejs {
    public final int a;
    public final Object b;
    public final int c;
    public final LazyLayoutItemAnimator d;
    public final int e;
    public final int f;
    public int g = Integer.MIN_VALUE;
    public int h;
    public final long i;
    public long j;
    public int k;
    public int l;
    public boolean m;
    private final int n;
    private final kah o;
    private final int p;
    private final List q;
    private final long r;
    private final long s;
    private final int t;
    private final int u;
    private int v;

    public egn(int i, Object obj, int i2, int i3, kah kahVar, int i4, int i5, List list, long j, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.n = i2;
        this.o = kahVar;
        this.p = i4;
        this.c = i5;
        this.q = list;
        this.r = j;
        this.d = lazyLayoutItemAnimator;
        this.s = j2;
        this.t = i6;
        this.u = i7;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = Math.max(i8, ((iqk) list.get(i9)).b);
        }
        this.e = i8;
        this.f = ffmk.f(i3 + i8, 0);
        this.i = (this.n << 32) | (i8 & 4294967295L);
        this.j = 0L;
        this.k = -1;
        this.l = -1;
    }

    @Override // defpackage.ejs
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ejs
    public final int b() {
        return this.t;
    }

    @Override // defpackage.ejs
    public final int c() {
        return this.f;
    }

    @Override // defpackage.ejs
    public final int d() {
        return this.q.size();
    }

    @Override // defpackage.ejs
    public final int e() {
        return this.u;
    }

    @Override // defpackage.ejs
    public final long f() {
        return this.s;
    }

    @Override // defpackage.ejs
    public final long g(int i) {
        return this.j;
    }

    @Override // defpackage.ejs
    public final Object h() {
        return this.b;
    }

    @Override // defpackage.ejs
    public final Object i(int i) {
        return ((iqk) this.q.get(i)).f();
    }

    public final void j(iqj iqjVar, boolean z) {
        iga igaVar;
        if (this.g == Integer.MIN_VALUE) {
            dwv.c("position() should be called first");
        }
        int d = d();
        for (int i = 0; i < d; i++) {
            iqk iqkVar = (iqk) this.q.get(i);
            int i2 = this.v - iqkVar.b;
            int i3 = this.h;
            long j = this.j;
            eiq b = this.d.b(this.b, i);
            if (b != null) {
                if (z) {
                    b.g = j;
                } else {
                    long j2 = b.g;
                    if (true == kaa.f(j2, 9223372034707292159L)) {
                        j2 = j;
                    }
                    long d2 = kaa.d(j2, b.a());
                    if ((kaa.b(j) <= i2 && kaa.b(d2) <= i2) || (kaa.b(j) >= i3 && kaa.b(d2) >= i3)) {
                        b.c();
                    }
                    j = d2;
                }
                igaVar = b.d;
            } else {
                igaVar = null;
            }
            long d3 = kaa.d(j, this.r);
            if (!z && b != null) {
                b.c = d3;
            }
            if (igaVar != null) {
                iqjVar.i(iqkVar, d3, igaVar, 0.0f);
            } else {
                iqjVar.h(iqkVar, d3, 0.0f, iqm.a);
            }
        }
    }

    public final void k(int i, int i2, int i3, int i4, int i5, int i6) {
        this.g = i4;
        if (this.o == kah.b) {
            i2 = (i3 - i2) - this.n;
        }
        this.j = (i2 << 32) | (i & 4294967295L);
        this.k = i5;
        this.l = i6;
        this.v = -this.p;
        this.h = i4 + this.c;
    }

    @Override // defpackage.ejs
    public final void l(int i, int i2, int i3, int i4) {
        k(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.ejs
    public final boolean m() {
        return true;
    }

    @Override // defpackage.ejs
    public final void n() {
        this.m = true;
    }
}
