package defpackage;

import j$.util.Objects;
import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvb implements ndu {
    private boolean B;
    public final muw a;
    public mva c;
    public mpa d;
    public int e;
    public int f;
    private final mpm i;
    private final mph j;
    private lqc k;
    private int s;
    private int t;
    private boolean w;
    private lqc z;
    public final muy b = new muy();
    private int l = 1000;
    private long[] m = new long[1000];
    private long[] n = new long[1000];
    private long[] q = new long[1000];
    private int[] p = new int[1000];
    private int[] o = new int[1000];
    private ndt[] r = new ndt[1000];
    private final mvj h = new mvj(new lts() { // from class: mux
        @Override // defpackage.lts
        public final void a(Object obj) {
            ((muz) obj).b.a();
        }
    });
    public long g = Long.MIN_VALUE;
    private long u = Long.MIN_VALUE;
    private long v = Long.MIN_VALUE;
    private boolean y = true;
    private boolean x = true;
    private boolean A = true;

    protected mvb(mxt mxtVar, mpm mpmVar, mph mphVar) {
        this.i = mpmVar;
        this.j = mphVar;
        this.a = new muw(mxtVar);
    }

    private final long A(int i) {
        long j = this.u;
        long j2 = Long.MIN_VALUE;
        int i2 = 0;
        if (i != 0) {
            int y = y(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.q[y]);
                if ((this.p[y] & 1) != 0) {
                    break;
                }
                y--;
                if (y == -1) {
                    y = this.l - 1;
                }
            }
        }
        this.u = Math.max(j, j2);
        this.s -= i;
        int i4 = this.e + i;
        this.e = i4;
        int i5 = this.t + i;
        this.t = i5;
        int i6 = this.l;
        if (i5 >= i6) {
            this.t = i5 - i6;
        }
        int i7 = this.f - i;
        this.f = i7;
        if (i7 < 0) {
            this.f = 0;
        }
        mvj mvjVar = this.h;
        while (i2 < mvjVar.b.size() - 1) {
            int i8 = i2 + 1;
            if (i4 < mvjVar.b.keyAt(i8)) {
                break;
            }
            mvjVar.c.a(mvjVar.b.valueAt(i2));
            mvjVar.b.removeAt(i2);
            int i9 = mvjVar.a;
            if (i9 > 0) {
                mvjVar.a = i9 - 1;
            }
            i2 = i8;
        }
        if (this.s != 0) {
            return this.n[this.t];
        }
        int i10 = this.t;
        if (i10 == 0) {
            i10 = this.l;
        }
        return this.n[i10 - 1] + this.o[r12];
    }

    private final synchronized void B(long j, int i, long j2, int i2, ndt ndtVar) {
        int i3 = this.s;
        if (i3 > 0) {
            int y = y(i3 - 1);
            lti.a(this.n[y] + ((long) this.o[y]) <= j2);
        }
        this.w = (536870912 & i) != 0;
        this.v = Math.max(this.v, j);
        int y2 = y(this.s);
        this.q[y2] = j;
        this.n[y2] = j2;
        this.o[y2] = i2;
        this.p[y2] = i;
        this.r[y2] = ndtVar;
        this.m[y2] = 0;
        if (this.h.c() || !((muz) this.h.b()).a.equals(this.z)) {
            lqc lqcVar = this.z;
            lti.f(lqcVar);
            mpm mpmVar = this.i;
            mph mphVar = this.j;
            mvj mvjVar = this.h;
            mpl d = mpmVar.d(mphVar, lqcVar);
            int c = c();
            muz muzVar = new muz(lqcVar, d);
            if (mvjVar.a == -1) {
                lti.c(mvjVar.b.size() == 0);
                mvjVar.a = 0;
            }
            if (mvjVar.b.size() > 0) {
                int keyAt = mvjVar.b.keyAt(r10.size() - 1);
                lti.a(c >= keyAt);
                if (keyAt == c) {
                    mvjVar.c.a(mvjVar.b.valueAt(r11.size() - 1));
                }
            }
            mvjVar.b.append(c, muzVar);
        }
        int i4 = this.s + 1;
        this.s = i4;
        int i5 = this.l;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            ndt[] ndtVarArr = new ndt[i6];
            int i7 = this.t;
            int i8 = i5 - i7;
            System.arraycopy(this.n, i7, jArr2, 0, i8);
            System.arraycopy(this.q, this.t, jArr3, 0, i8);
            System.arraycopy(this.p, this.t, iArr, 0, i8);
            System.arraycopy(this.o, this.t, iArr2, 0, i8);
            System.arraycopy(this.r, this.t, ndtVarArr, 0, i8);
            System.arraycopy(this.m, this.t, jArr, 0, i8);
            int i9 = this.t;
            System.arraycopy(this.n, 0, jArr2, i8, i9);
            System.arraycopy(this.q, 0, jArr3, i8, i9);
            System.arraycopy(this.p, 0, iArr, i8, i9);
            System.arraycopy(this.o, 0, iArr2, i8, i9);
            System.arraycopy(this.r, 0, ndtVarArr, i8, i9);
            System.arraycopy(this.m, 0, jArr, i8, i9);
            this.n = jArr2;
            this.q = jArr3;
            this.p = iArr;
            this.o = iArr2;
            this.r = ndtVarArr;
            this.m = jArr;
            this.t = 0;
            this.l = i6;
        }
    }

    private final void C(lqc lqcVar, mgz mgzVar) {
        lqc lqcVar2 = this.k;
        lpw lpwVar = lqcVar2 == null ? null : lqcVar2.s;
        this.k = lqcVar;
        lpw lpwVar2 = lqcVar.s;
        mgzVar.b = lqcVar.b(this.i.a(lqcVar));
        mgzVar.a = this.d;
        if (lqcVar2 != null) {
            int i = lvf.a;
            if (Objects.equals(lpwVar, lpwVar2)) {
                return;
            }
        }
        mpa mpaVar = this.d;
        mpa b = this.i.b(this.j, lqcVar);
        this.d = b;
        mgzVar.a = b;
        if (mpaVar != null) {
            mpaVar.j(this.j);
        }
    }

    private final synchronized void D() {
        this.f = 0;
        muw muwVar = this.a;
        muwVar.c = muwVar.b;
    }

    private final boolean E() {
        return this.f != this.s;
    }

    private final boolean F(int i) {
        mpa mpaVar = this.d;
        if (mpaVar == null || mpaVar.a() == 4) {
            return true;
        }
        return (this.p[i] & 1073741824) == 0 && this.d.n();
    }

    private final synchronized boolean G(lqc lqcVar) {
        this.y = false;
        lqc lqcVar2 = this.z;
        int i = lvf.a;
        if (Objects.equals(lqcVar, lqcVar2)) {
            return false;
        }
        if (this.h.c() || !((muz) this.h.b()).a.equals(lqcVar)) {
            this.z = lqcVar;
        } else {
            this.z = ((muz) this.h.b()).a;
        }
        boolean z = this.A;
        lqc lqcVar3 = this.z;
        this.A = z & lre.g(lqcVar3.o, lqcVar3.k);
        this.B = false;
        return true;
    }

    private final int x(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.q[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.p[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.l) {
                i = 0;
            }
        }
        return i3;
    }

    private final int y(int i) {
        int i2 = this.t + i;
        int i3 = this.l;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized long z() {
        int i = this.s;
        if (i == 0) {
            return -1L;
        }
        return A(i);
    }

    public final int a() {
        return this.e + this.f;
    }

    public final synchronized int b(long j, boolean z) {
        Throwable th;
        try {
            try {
                int i = this.f;
                int y = y(i);
                if (E() && j >= this.q[y]) {
                    if (j <= this.v || !z) {
                        int x = x(y, this.s - i, j, true);
                        if (x == -1) {
                            return 0;
                        }
                        return x;
                    }
                    try {
                        return this.s - i;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                return 0;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final int c() {
        return this.e + this.s;
    }

    public final synchronized int d(mgz mgzVar, lxz lxzVar, boolean z, boolean z2, muy muyVar) {
        lxzVar.e = false;
        if (!E()) {
            if (!z2 && !this.w) {
                lqc lqcVar = this.z;
                if (lqcVar == null || (!z && lqcVar == this.k)) {
                    return -3;
                }
                C(lqcVar, mgzVar);
                return -5;
            }
            lxzVar.a = 4;
            lxzVar.f = Long.MIN_VALUE;
            return -4;
        }
        lqc lqcVar2 = ((muz) this.h.a(a())).a;
        if (!z && lqcVar2 == this.k) {
            int y = y(this.f);
            if (!F(y)) {
                lxzVar.e = true;
                return -3;
            }
            lxzVar.a = this.p[y];
            if (this.f == this.s - 1 && (z2 || this.w)) {
                lxzVar.eP(536870912);
            }
            lxzVar.f = this.q[y];
            muyVar.a = this.o[y];
            muyVar.b = this.n[y];
            muyVar.c = this.r[y];
            return -4;
        }
        C(lqcVar2, mgzVar);
        return -5;
    }

    @Override // defpackage.ndu
    public final /* synthetic */ int e(lpp lppVar, int i, boolean z) {
        return nds.a(this, lppVar, i, z);
    }

    public final synchronized long f() {
        return this.v;
    }

    public final synchronized lqc g() {
        if (this.y) {
            return null;
        }
        return this.z;
    }

    public final void h() {
        this.a.c(z());
    }

    @Override // defpackage.ndu
    public final void i(lqc lqcVar) {
        boolean G = G(lqcVar);
        mva mvaVar = this.c;
        if (mvaVar == null || !G) {
            return;
        }
        muq muqVar = (muq) mvaVar;
        muqVar.j.post(muqVar.h);
    }

    public final void j() {
        mpa mpaVar = this.d;
        if (mpaVar != null) {
            mpaVar.j(this.j);
            this.d = null;
            this.k = null;
        }
    }

    public final void k() {
        l(false);
    }

    public final void l(boolean z) {
        muw muwVar = this.a;
        muv muvVar = muwVar.b;
        if (muvVar.c != null) {
            muwVar.f.g(muvVar);
            muvVar.b();
        }
        muwVar.b.c(0L);
        muv muvVar2 = muwVar.b;
        muwVar.c = muvVar2;
        muwVar.d = muvVar2;
        muwVar.e = 0L;
        muwVar.f.f();
        this.s = 0;
        this.e = 0;
        this.t = 0;
        this.f = 0;
        this.x = true;
        this.g = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        mvj mvjVar = this.h;
        for (int i = 0; i < mvjVar.b.size(); i++) {
            mvjVar.c.a(mvjVar.b.valueAt(i));
        }
        mvjVar.a = -1;
        mvjVar.b.clear();
        if (z) {
            this.z = null;
            this.y = true;
            this.A = true;
        }
    }

    @Override // defpackage.ndu
    public final /* synthetic */ void m(luv luvVar, int i) {
        nds.b(this, luvVar, i);
    }

    @Override // defpackage.ndu
    public final void n(luv luvVar, int i, int i2) {
        while (i > 0) {
            muw muwVar = this.a;
            int a = muwVar.a(i);
            muv muvVar = muwVar.d;
            luvVar.F(muvVar.c.a, muvVar.a(muwVar.e), a);
            i -= a;
            muwVar.d(a);
        }
    }

    @Override // defpackage.ndu
    public final void o(long j, int i, int i2, int i3, ndt ndtVar) {
        if (this.x) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.x = false;
            }
        }
        if (this.A) {
            if (j < this.g) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.B) {
                    luj.f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.z))));
                    this.B = true;
                }
                i |= 1;
            }
        }
        B(j, i, (this.a.e - i2) - i3, i2, ndtVar);
    }

    public final synchronized void p(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f + i <= this.s) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lti.a(z);
        this.f += i;
    }

    public final synchronized boolean q() {
        return this.w;
    }

    public final synchronized boolean r(boolean z) {
        boolean z2 = true;
        if (E()) {
            if (((muz) this.h.a(a())).a != this.k) {
                return true;
            }
            return F(y(this.f));
        }
        if (!z && !this.w) {
            lqc lqcVar = this.z;
            if (lqcVar == null) {
                z2 = false;
            } else if (lqcVar == this.k) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean s(int i) {
        D();
        int i2 = this.e;
        if (i >= i2 && i <= this.s + i2) {
            this.g = Long.MIN_VALUE;
            this.f = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean t(long j, boolean z) {
        Throwable th;
        mvb mvbVar;
        long j2;
        int i;
        try {
            try {
                D();
                int i2 = this.f;
                int y = y(i2);
                if (E() && j >= this.q[y]) {
                    if (j > this.v) {
                        if (z) {
                            z = true;
                        }
                    }
                    if (this.A) {
                        try {
                            int i3 = this.s - i2;
                            int i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    if (this.q[y] >= j) {
                                        mvbVar = this;
                                        j2 = j;
                                        i = i4;
                                        break;
                                    }
                                    y++;
                                    if (y == this.l) {
                                        y = 0;
                                    }
                                    i4++;
                                } else if (z) {
                                    j2 = j;
                                    i = i3;
                                    mvbVar = this;
                                } else {
                                    mvbVar = this;
                                    j2 = j;
                                    i = -1;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        mvbVar = this;
                        j2 = j;
                        i = mvbVar.x(y, this.s - i2, j2, true);
                    }
                    if (i == -1) {
                        return false;
                    }
                    mvbVar.g = j2;
                    mvbVar.f += i;
                    return true;
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized long u(long j, boolean z) {
        Throwable th;
        try {
            try {
                int i = this.s;
                if (i != 0) {
                    long[] jArr = this.q;
                    int i2 = this.t;
                    if (j >= jArr[i2]) {
                        if (z) {
                            try {
                                int i3 = this.f;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int x = x(i2, i, j, false);
                        if (x != -1) {
                            return A(x);
                        }
                        return -1L;
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.ndu
    public final int w(lpp lppVar, int i, boolean z) {
        muw muwVar = this.a;
        int a = muwVar.a(i);
        muv muvVar = muwVar.d;
        int a2 = lppVar.a(muvVar.c.a, muvVar.a(muwVar.e), a);
        if (a2 != -1) {
            muwVar.d(a2);
            return a2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.ndu
    public final /* synthetic */ void v() {
    }
}
