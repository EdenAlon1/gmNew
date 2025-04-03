package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mhh {
    public final mir a;
    public int b;
    public boolean c;
    public mey d;
    public mhe e;
    public mhe f;
    public mhe g;
    public mhe h;
    public mhe i;
    public int j;
    public Object k;
    public final mgm m;
    private final lua p;
    private long q;
    private long r;
    private final lrs n = new lrs();
    private final lrt o = new lrt();
    public List l = new ArrayList();

    public mhh(mir mirVar, lua luaVar, mgm mgmVar, mey meyVar) {
        this.a = mirVar;
        this.p = luaVar;
        this.m = mgmVar;
        this.d = meyVar;
    }

    static boolean m(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    private final long p(Object obj) {
        for (int i = 0; i < this.l.size(); i++) {
            mhe mheVar = (mhe) this.l.get(i);
            if (mheVar.b.equals(obj)) {
                return mheVar.g.a.d;
            }
        }
        return -1L;
    }

    private static mtl q(lru lruVar, Object obj, long j, long j2, lrt lrtVar, lrs lrsVar) {
        lruVar.o(obj, lrsVar);
        lruVar.p(lrsVar.c, lrtVar);
        lruVar.a(obj);
        lrsVar.m();
        lruVar.o(obj, lrsVar);
        int c = lrsVar.c(j);
        return c == -1 ? new mtl(obj, j2, lrsVar.b(j)) : new mtl(obj, c, lrsVar.d(c), j2);
    }

    private final boolean r(lru lruVar, mtl mtlVar, boolean z) {
        int a = lruVar.a(mtlVar.a);
        return !lruVar.p(lruVar.n(a, this.n).c, this.o).i && lruVar.i(a, this.n, this.o, this.b, this.c) == -1 && z;
    }

    private final boolean s(lru lruVar, mtl mtlVar) {
        if (t(mtlVar)) {
            return lruVar.p(lruVar.o(mtlVar.a, this.n).c, this.o).o == lruVar.a(mtlVar.a);
        }
        return false;
    }

    private static final boolean t(mtl mtlVar) {
        return !mtlVar.b() && mtlVar.e == -1;
    }

    private final mhf u(lru lruVar, Object obj, int i, int i2, long j, long j2) {
        mtl mtlVar = new mtl(obj, i, i2, j2);
        Object obj2 = mtlVar.a;
        long e = lruVar.o(obj2, this.n).e(mtlVar.b, mtlVar.c);
        if (i2 == this.n.d(i)) {
            this.n.i();
        }
        this.n.k(mtlVar.b);
        long j3 = 0;
        if (e != -9223372036854775807L && e <= 0) {
            j3 = Math.max(0L, (-1) + e);
        }
        return new mhf(mtlVar, j3, j, -9223372036854775807L, e, false, false, false);
    }

    private final mhf v(lru lruVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        lruVar.o(obj, this.n);
        int b = this.n.b(j7);
        if (b != -1) {
            this.n.o(b);
        }
        if (b == -1) {
            this.n.m();
        } else {
            this.n.k(b);
        }
        mtl mtlVar = new mtl(obj, j3, b);
        boolean t = t(mtlVar);
        boolean s = s(lruVar, mtlVar);
        boolean r = r(lruVar, mtlVar, t);
        if (b != -1) {
            this.n.k(b);
        }
        if (b != -1) {
            this.n.h(b);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.n.d;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0L, j5 - 1);
        }
        return new mhf(mtlVar, j7, j2, j6, j5, t, s, r);
    }

    private final void w(lru lruVar, Object obj, int i) {
        lruVar.o(obj, this.n);
        this.n.h(i);
        long j = this.n.g.a(i).h;
    }

    public final int a(mhe mheVar) {
        lti.g(mheVar);
        int i = 0;
        if (mheVar.equals(this.h)) {
            return 0;
        }
        this.h = mheVar;
        while (true) {
            mheVar = mheVar.i;
            if (mheVar == null) {
                mhe mheVar2 = this.h;
                lti.f(mheVar2);
                mheVar2.j(null);
                j();
                return i;
            }
            if (mheVar == this.f) {
                mhe mheVar3 = this.e;
                this.f = mheVar3;
                this.g = mheVar3;
                i = 3;
            }
            if (mheVar == this.g) {
                this.g = this.f;
                i |= 2;
            }
            mheVar.i();
            this.j--;
        }
    }

    public final int b(lru lruVar) {
        lru lruVar2;
        mhe mheVar;
        mhe mheVar2 = this.e;
        if (mheVar2 == null) {
            return 0;
        }
        int a = lruVar.a(mheVar2.b);
        while (true) {
            lruVar2 = lruVar;
            a = lruVar2.i(a, this.n, this.o, this.b, this.c);
            while (true) {
                lti.f(mheVar2);
                mheVar = mheVar2.i;
                if (mheVar == null || mheVar2.g.h) {
                    break;
                }
                mheVar2 = mheVar;
            }
            if (a == -1 || mheVar == null || lruVar2.a(mheVar.b) != a) {
                break;
            }
            mheVar2 = mheVar;
            lruVar = lruVar2;
        }
        int a2 = a(mheVar2);
        mheVar2.g = f(lruVar2, mheVar2.g);
        return a2;
    }

    public final mhe c() {
        mhe mheVar = this.e;
        if (mheVar == null) {
            return null;
        }
        if (mheVar == this.f) {
            this.f = mheVar.i;
        }
        if (mheVar == this.g) {
            this.g = mheVar.i;
        }
        mheVar.i();
        int i = this.j - 1;
        this.j = i;
        if (i == 0) {
            this.h = null;
            mhe mheVar2 = this.e;
            this.k = mheVar2.b;
            this.r = mheVar2.g.a.d;
        }
        this.e = this.e.i;
        j();
        return this.e;
    }

    public final mhf d(lru lruVar, mhe mheVar, long j) {
        lru lruVar2;
        Object obj;
        long j2;
        mhf mhfVar = mheVar.g;
        long j3 = (mheVar.l + mhfVar.e) - j;
        if (!mhfVar.h) {
            mtl mtlVar = mhfVar.a;
            lruVar.o(mtlVar.a, this.n);
            boolean z = mhfVar.g;
            if (!mtlVar.b()) {
                int i = mtlVar.e;
                if (i != -1) {
                    this.n.o(i);
                }
                lrs lrsVar = this.n;
                int i2 = mtlVar.e;
                int d = lrsVar.d(i2);
                lrsVar.k(i2);
                if (d != this.n.a(mtlVar.e)) {
                    return u(lruVar, mtlVar.a, mtlVar.e, d, mhfVar.e, mtlVar.d);
                }
                w(lruVar, mtlVar.a, mtlVar.e);
                return v(lruVar, mtlVar.a, 0L, mhfVar.e, mtlVar.d);
            }
            int i3 = mtlVar.b;
            if (this.n.a(i3) == -1) {
                return null;
            }
            int b = this.n.g.a(i3).b(mtlVar.c);
            if (b < 0) {
                return u(lruVar, mtlVar.a, i3, b, mhfVar.c, mtlVar.d);
            }
            long j4 = mhfVar.c;
            if (j4 == -9223372036854775807L) {
                lrt lrtVar = this.o;
                lrs lrsVar2 = this.n;
                Pair m = lruVar.m(lrtVar, lrsVar2, lrsVar2.c, -9223372036854775807L, Math.max(0L, j3));
                lruVar2 = lruVar;
                if (m == null) {
                    return null;
                }
                j4 = ((Long) m.second).longValue();
            } else {
                lruVar2 = lruVar;
            }
            w(lruVar2, mtlVar.a, mtlVar.b);
            return v(lruVar, mtlVar.a, Math.max(0L, j4), mhfVar.c, mtlVar.d);
        }
        long j5 = 0;
        int i4 = lruVar.i(lruVar.a(mhfVar.a.a), this.n, this.o, this.b, this.c);
        if (i4 == -1) {
            return null;
        }
        int i5 = lruVar.d(i4, this.n, true).c;
        Object obj2 = this.n.b;
        lti.f(obj2);
        long j6 = mhfVar.a.d;
        if (lruVar.p(i5, this.o).n == i4) {
            Pair m2 = lruVar.m(this.o, this.n, i5, -9223372036854775807L, Math.max(0L, j3));
            if (m2 == null) {
                return null;
            }
            Object obj3 = m2.first;
            long longValue = ((Long) m2.second).longValue();
            mhe mheVar2 = mheVar.i;
            if (mheVar2 == null || !mheVar2.b.equals(obj3)) {
                long p = p(obj3);
                if (p == -1) {
                    p = this.q;
                    this.q = 1 + p;
                }
                j6 = p;
            } else {
                j6 = mheVar2.g.a.d;
            }
            obj = obj3;
            j2 = longValue;
            j5 = -9223372036854775807L;
        } else {
            obj = obj2;
            j2 = 0;
        }
        mtl q = q(lruVar, obj, j2, j6, this.o, this.n);
        if (j5 != -9223372036854775807L && mhfVar.c != -9223372036854775807L) {
            lruVar.o(mhfVar.a.a, this.n).m();
            this.n.j();
        }
        return e(lruVar, q, j5, j2);
    }

    public final mhf e(lru lruVar, mtl mtlVar, long j, long j2) {
        lruVar.o(mtlVar.a, this.n);
        return mtlVar.b() ? u(lruVar, mtlVar.a, mtlVar.b, mtlVar.c, j, mtlVar.d) : v(lruVar, mtlVar.a, j2, j, mtlVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mhf f(defpackage.lru r14, defpackage.mhf r15) {
        /*
            r13 = this;
            mtl r1 = r15.a
            boolean r10 = t(r1)
            boolean r11 = r13.s(r14, r1)
            boolean r12 = r13.r(r14, r1, r10)
            mtl r0 = r15.a
            java.lang.Object r0 = r0.a
            lrs r2 = r13.n
            r14.o(r0, r2)
            boolean r14 = r1.b()
            r0 = -1
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 != 0) goto L31
            int r14 = r1.e
            if (r14 != r0) goto L2a
            goto L31
        L2a:
            lrs r6 = r13.n
            r6.h(r14)
            r6 = r2
            goto L32
        L31:
            r6 = r4
        L32:
            boolean r14 = r1.b()
            if (r14 == 0) goto L44
            lrs r14 = r13.n
            int r2 = r1.b
            int r3 = r1.c
            long r2 = r14.e(r2, r3)
        L42:
            r8 = r2
            goto L50
        L44:
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 == 0) goto L4b
            r6 = r2
            r8 = r6
            goto L50
        L4b:
            lrs r14 = r13.n
            long r2 = r14.d
            goto L42
        L50:
            boolean r14 = r1.b()
            if (r14 == 0) goto L5e
            lrs r14 = r13.n
            int r0 = r1.b
            r14.k(r0)
            goto L67
        L5e:
            int r14 = r1.e
            if (r14 == r0) goto L67
            lrs r0 = r13.n
            r0.k(r14)
        L67:
            mhf r0 = new mhf
            long r2 = r15.b
            long r4 = r15.c
            boolean r14 = r15.f
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhh.f(lru, mhf):mhf");
    }

    public final mtl g(lru lruVar, Object obj, long j) {
        long p;
        int a;
        int i = lruVar.o(obj, this.n).c;
        Object obj2 = this.k;
        if (obj2 == null || (a = lruVar.a(obj2)) == -1 || lruVar.n(a, this.n).c != i) {
            mhe mheVar = this.e;
            while (true) {
                if (mheVar == null) {
                    mhe mheVar2 = this.e;
                    while (true) {
                        if (mheVar2 != null) {
                            int a2 = lruVar.a(mheVar2.b);
                            if (a2 != -1 && lruVar.n(a2, this.n).c == i) {
                                p = mheVar2.g.a.d;
                                break;
                            }
                            mheVar2 = mheVar2.i;
                        } else {
                            p = p(obj);
                            if (p == -1) {
                                p = this.q;
                                this.q = 1 + p;
                                if (this.e == null) {
                                    this.k = obj;
                                    this.r = p;
                                }
                            }
                        }
                    }
                } else {
                    if (mheVar.b.equals(obj)) {
                        p = mheVar.g.a.d;
                        break;
                    }
                    mheVar = mheVar.i;
                }
            }
        } else {
            p = this.r;
        }
        lruVar.o(obj, this.n);
        lruVar.p(this.n.c, this.o);
        int a3 = lruVar.a(obj);
        Object obj3 = obj;
        while (true) {
            lrt lrtVar = this.o;
            if (a3 < lrtVar.n) {
                return q(lruVar, obj3, j, p, lrtVar, this.n);
            }
            lruVar.d(a3, this.n, true);
            this.n.m();
            lrs lrsVar = this.n;
            if (lrsVar.c(lrsVar.d) != -1) {
                obj3 = this.n.b;
                lti.f(obj3);
            }
            a3--;
        }
    }

    public final void h() {
        if (this.j == 0) {
            return;
        }
        mhe mheVar = this.e;
        lti.g(mheVar);
        this.k = mheVar.b;
        this.r = mheVar.g.a.d;
        while (mheVar != null) {
            mheVar.i();
            mheVar = mheVar.i;
        }
        this.e = null;
        this.h = null;
        this.f = null;
        this.g = null;
        this.j = 0;
        j();
    }

    public final void i() {
        mhe mheVar = this.i;
        if (mheVar == null || mheVar.m()) {
            this.i = null;
            for (int i = 0; i < this.l.size(); i++) {
                mhe mheVar2 = (mhe) this.l.get(i);
                if (!mheVar2.m()) {
                    this.i = mheVar2;
                    return;
                }
            }
        }
    }

    public final void j() {
        int i = engw.d;
        final engr engrVar = new engr();
        for (mhe mheVar = this.e; mheVar != null; mheVar = mheVar.i) {
            engrVar.h(mheVar.g.a);
        }
        mhe mheVar2 = this.f;
        final mtl mtlVar = mheVar2 == null ? null : mheVar2.g.a;
        this.p.b(new Runnable() { // from class: mhg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                mir mirVar = mhh.this.a;
                engw g = engrVar.g();
                mlh mlhVar = (mlh) mirVar;
                lro lroVar = mlhVar.e;
                lti.f(lroVar);
                engw n = engw.n(g);
                mlg mlgVar = mlhVar.b;
                mlgVar.b = n;
                if (!g.isEmpty()) {
                    mtl mtlVar2 = mtlVar;
                    mlgVar.d = (mtl) g.get(0);
                    lti.f(mtlVar2);
                    mlgVar.e = mtlVar2;
                }
                if (mlgVar.c == null) {
                    mlgVar.c = mlg.b(lroVar, mlgVar.b, mlgVar.d, mlgVar.a);
                }
                mlgVar.c(lroVar.I());
            }
        });
    }

    public final void k(long j) {
        mhe mheVar = this.h;
        if (mheVar != null) {
            lti.c(mheVar.n());
            if (mheVar.e) {
                mheVar.a.l(mheVar.e(j));
            }
        }
    }

    public final void l() {
        if (this.l.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l.size(); i++) {
            ((mhe) this.l.get(i)).i();
        }
        this.l = arrayList;
        this.i = null;
        i();
    }

    public final boolean n(mtj mtjVar) {
        mhe mheVar = this.h;
        return mheVar != null && mheVar.a == mtjVar;
    }

    public final boolean o(mtj mtjVar) {
        mhe mheVar = this.i;
        return mheVar != null && mheVar.a == mtjVar;
    }
}
