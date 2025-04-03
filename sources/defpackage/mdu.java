package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mdu extends lru {
    private final int b;
    private final mvf c;

    public mdu(mvf mvfVar) {
        this.c = mvfVar;
        this.b = mvfVar.a();
    }

    private final int A(int i, boolean z) {
        if (!z) {
            if (i >= this.b - 1) {
                return -1;
            }
            return i + 1;
        }
        mvf mvfVar = this.c;
        int i2 = mvfVar.c[i] + 1;
        int[] iArr = mvfVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    private final int B(int i, boolean z) {
        if (!z) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        mvf mvfVar = this.c;
        int i2 = mvfVar.c[i] - 1;
        if (i2 >= 0) {
            return mvfVar.b[i2];
        }
        return -1;
    }

    public static Object x(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object y(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // defpackage.lru
    public final int a(Object obj) {
        int a;
        if (obj instanceof Pair) {
            Object y = y(obj);
            Object x = x(obj);
            int r = r(y);
            if (r != -1 && (a = w(r).a(x)) != -1) {
                return u(r) + a;
            }
        }
        return -1;
    }

    @Override // defpackage.lru
    public final lrs d(int i, lrs lrsVar, boolean z) {
        int s = s(i);
        int v = v(s);
        w(s).d(i - u(s), lrsVar, z);
        lrsVar.c += v;
        if (z) {
            Object z2 = z(s);
            Object obj = lrsVar.b;
            lti.f(obj);
            lrsVar.b = Pair.create(z2, obj);
        }
        return lrsVar;
    }

    @Override // defpackage.lru
    public final lrt e(int i, lrt lrtVar, long j) {
        int t = t(i);
        int v = v(t);
        int u = u(t);
        w(t).e(i - v, lrtVar, j);
        Object z = z(t);
        if (!lrt.a.equals(lrtVar.b)) {
            z = Pair.create(z, lrtVar.b);
        }
        lrtVar.b = z;
        lrtVar.n += u;
        lrtVar.o += u;
        return lrtVar;
    }

    @Override // defpackage.lru
    public final Object f(int i) {
        int s = s(i);
        return Pair.create(z(s), w(s).f(i - u(s)));
    }

    @Override // defpackage.lru
    public final int g(boolean z) {
        if (this.b != 0) {
            int i = 0;
            if (z) {
                int[] iArr = this.c.b;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            while (w(i).q()) {
                i = A(i, z);
                if (i == -1) {
                }
            }
            return v(i) + w(i).g(z);
        }
        return -1;
    }

    @Override // defpackage.lru
    public final int h(boolean z) {
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            if (z) {
                int[] iArr = this.c.b;
                int length = iArr.length;
                i = length > 0 ? iArr[length - 1] : -1;
            } else {
                i = i2 - 1;
            }
            while (w(i).q()) {
                i = B(i, z);
                if (i == -1) {
                }
            }
            return v(i) + w(i).h(z);
        }
        return -1;
    }

    @Override // defpackage.lru
    public final int j(int i, int i2, boolean z) {
        int t = t(i);
        int v = v(t);
        int j = w(t).j(i - v, i2 == 2 ? 0 : i2, z);
        if (j != -1) {
            return v + j;
        }
        int A = A(t, z);
        while (A != -1 && w(A).q()) {
            A = A(A, z);
        }
        if (A != -1) {
            return v(A) + w(A).g(z);
        }
        if (i2 == 2) {
            return g(z);
        }
        return -1;
    }

    @Override // defpackage.lru
    public final int k(int i, int i2, boolean z) {
        int t = t(i);
        int v = v(t);
        int k = w(t).k(i - v, i2 == 2 ? 0 : i2, z);
        if (k != -1) {
            return v + k;
        }
        int B = B(t, z);
        while (B != -1 && w(B).q()) {
            B = B(B, z);
        }
        if (B != -1) {
            return v(B) + w(B).h(z);
        }
        if (i2 == 2) {
            return h(z);
        }
        return -1;
    }

    @Override // defpackage.lru
    public final lrs o(Object obj, lrs lrsVar) {
        Object y = y(obj);
        Object x = x(obj);
        int r = r(y);
        int v = v(r);
        w(r).o(x, lrsVar);
        lrsVar.c += v;
        lrsVar.b = obj;
        return lrsVar;
    }

    protected abstract int r(Object obj);

    protected abstract int s(int i);

    protected abstract int t(int i);

    protected abstract int u(int i);

    protected abstract int v(int i);

    protected abstract lru w(int i);

    protected abstract Object z(int i);
}
