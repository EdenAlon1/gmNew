package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhz {
    public static final mtl a = new mtl(new Object());
    public final lru b;
    public final mtl c;
    public final long d;
    public final long e;
    public final int f;
    public final mel g;
    public final boolean h;
    public final mvo i;
    public final mxm j;
    public final List k;
    public final mtl l;
    public final boolean m;
    public final int n;
    public final int o;
    public final lri p;
    public final boolean q = false;
    public volatile long r;
    public volatile long s;
    public volatile long t;
    public volatile long u;

    public mhz(lru lruVar, mtl mtlVar, long j, long j2, int i, mel melVar, boolean z, mvo mvoVar, mxm mxmVar, List list, mtl mtlVar2, boolean z2, int i2, int i3, lri lriVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.b = lruVar;
        this.c = mtlVar;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = melVar;
        this.h = z;
        this.i = mvoVar;
        this.j = mxmVar;
        this.k = list;
        this.l = mtlVar2;
        this.m = z2;
        this.n = i2;
        this.o = i3;
        this.p = lriVar;
        this.r = j3;
        this.s = j4;
        this.t = j5;
        this.u = j6;
    }

    public static mhz h(mxm mxmVar) {
        lru lruVar = lru.a;
        mtl mtlVar = a;
        mvo mvoVar = mvo.a;
        int i = engw.d;
        return new mhz(lruVar, mtlVar, -9223372036854775807L, 0L, 1, null, false, mvoVar, mxmVar, enou.a, mtlVar, false, 1, 0, lri.a, 0L, 0L, 0L, 0L, false);
    }

    public final mhz a(mtl mtlVar) {
        return new mhz(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, mtlVar, this.m, this.n, this.o, this.p, this.r, this.s, this.t, this.u, false);
    }

    public final mhz b(mtl mtlVar, long j, long j2, long j3, long j4, mvo mvoVar, mxm mxmVar, List list) {
        mtl mtlVar2 = this.l;
        boolean z = this.m;
        int i = this.n;
        int i2 = this.o;
        lri lriVar = this.p;
        long j5 = this.r;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new mhz(this.b, mtlVar, j2, j3, this.f, this.g, this.h, mvoVar, mxmVar, list, mtlVar2, z, i, i2, lriVar, j5, j4, j, elapsedRealtime, false);
    }

    public final mhz c(boolean z, int i, int i2) {
        return new mhz(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, z, i, i2, this.p, this.r, this.s, this.t, this.u, false);
    }

    public final mhz d(mel melVar) {
        return new mhz(this.b, this.c, this.d, this.e, this.f, melVar, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.r, this.s, this.t, this.u, false);
    }

    public final mhz e(lri lriVar) {
        return new mhz(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, lriVar, this.r, this.s, this.t, this.u, false);
    }

    public final mhz f(int i) {
        return new mhz(this.b, this.c, this.d, this.e, i, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.r, this.s, this.t, this.u, false);
    }

    public final mhz g(lru lruVar) {
        return new mhz(lruVar, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.r, this.s, this.t, this.u, false);
    }

    public final boolean i() {
        return this.f == 3 && this.m && this.o == 0;
    }
}
