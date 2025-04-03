package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lru {
    public static final lru a = new lrr();

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
    }

    protected lru() {
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract lrs d(int i, lrs lrsVar, boolean z);

    public abstract lrt e(int i, lrt lrtVar, long j);

    public final boolean equals(Object obj) {
        int h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lru)) {
            return false;
        }
        lru lruVar = (lru) obj;
        if (lruVar.c() == c() && lruVar.b() == b()) {
            lrt lrtVar = new lrt();
            lrs lrsVar = new lrs();
            lrt lrtVar2 = new lrt();
            lrs lrsVar2 = new lrs();
            for (int i = 0; i < c(); i++) {
                if (!p(i, lrtVar).equals(lruVar.p(i, lrtVar2))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < b(); i2++) {
                if (!d(i2, lrsVar, true).equals(lruVar.d(i2, lrsVar2, true))) {
                    return false;
                }
            }
            int g = g(true);
            if (g == lruVar.g(true) && (h = h(true)) == lruVar.h(true)) {
                while (g != h) {
                    int j = j(g, 0, true);
                    if (j != lruVar.j(g, 0, true)) {
                        return false;
                    }
                    g = j;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i);

    public int g(boolean z) {
        return q() ? -1 : 0;
    }

    public int h(boolean z) {
        if (q()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i;
        lrt lrtVar = new lrt();
        lrs lrsVar = new lrs();
        int c = c() + 217;
        int i2 = 0;
        while (true) {
            i = c * 31;
            if (i2 >= c()) {
                break;
            }
            c = i + p(i2, lrtVar).hashCode();
            i2++;
        }
        int b = i + b();
        for (int i3 = 0; i3 < b(); i3++) {
            b = (b * 31) + d(i3, lrsVar, true).hashCode();
        }
        int g = g(true);
        while (g != -1) {
            b = (b * 31) + g;
            g = j(g, 0, true);
        }
        return b;
    }

    public final int i(int i, lrs lrsVar, lrt lrtVar, int i2, boolean z) {
        int i3 = n(i, lrsVar).c;
        if (p(i3, lrtVar).o != i) {
            return i + 1;
        }
        int j = j(i3, i2, z);
        if (j == -1) {
            return -1;
        }
        return p(j, lrtVar).n;
    }

    public int j(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == h(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == h(z) ? g(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == g(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == g(z) ? h(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public final Pair l(lrt lrtVar, lrs lrsVar, int i, long j) {
        Pair m = m(lrtVar, lrsVar, i, j, 0L);
        lti.f(m);
        return m;
    }

    public final Pair m(lrt lrtVar, lrs lrsVar, int i, long j, long j2) {
        lti.e(i, c());
        e(i, lrtVar, j2);
        if (j == -9223372036854775807L) {
            j = lrtVar.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = lrtVar.n;
        n(i2, lrsVar);
        while (i2 < lrtVar.o && lrsVar.e != j) {
            int i3 = i2 + 1;
            if (n(i3, lrsVar).e > j) {
                break;
            }
            i2 = i3;
        }
        d(i2, lrsVar, true);
        long j3 = j - lrsVar.e;
        long j4 = lrsVar.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = lrsVar.b;
        lti.f(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public final lrs n(int i, lrs lrsVar) {
        return d(i, lrsVar, false);
    }

    public lrs o(Object obj, lrs lrsVar) {
        return d(a(obj), lrsVar, true);
    }

    public final lrt p(int i, lrt lrtVar) {
        return e(i, lrtVar, 0L);
    }

    public final boolean q() {
        return c() == 0;
    }
}
