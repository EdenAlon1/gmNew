package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgx implements Handler.Callback, mti, mxk, mhx, meh, mib {
    private static final long l = lvf.z(10000);
    private min A;
    private mhz B;
    private mgv C;
    private boolean E;
    private boolean F;
    private boolean H;
    private int I;
    private boolean J;
    private boolean K;
    private int L;
    private mgw M;
    private long N;
    private long O;
    private int P;
    private boolean Q;
    private mel R;
    private boolean U;
    private final mfk V;
    private final med W;
    public final mil[] a;
    public final mij[] b;
    public final mxl c;
    public final mxm d;
    public final lua e;
    public final Looper f;
    public final mhy g;
    public final mir h;
    public boolean i;
    public mey j;
    public final meg k;
    private final boolean[] m;
    private final mxs n;
    private final mia o;
    private final lrt p;
    private final lrs q;
    private final long r;
    private final mei s;
    private final ArrayList t;
    private final ltn u;
    private final mhh v;
    private final long w;
    private final mlu x;
    private final lua y;
    private final boolean z;
    private long T = -9223372036854775807L;
    private boolean D = false;
    private long S = -9223372036854775807L;
    private long G = -9223372036854775807L;

    public mgx(mig[] migVarArr, mig[] migVarArr2, mxl mxlVar, mxm mxmVar, meg megVar, mxs mxsVar, int i, boolean z, mir mirVar, min minVar, med medVar, long j, Looper looper, ltn ltnVar, mfk mfkVar, mlu mluVar, mey meyVar) {
        Looper looper2;
        this.V = mfkVar;
        this.c = mxlVar;
        this.d = mxmVar;
        this.k = megVar;
        this.n = mxsVar;
        this.I = i;
        this.J = z;
        this.A = minVar;
        this.W = medVar;
        this.w = j;
        boolean z2 = false;
        this.u = ltnVar;
        this.x = mluVar;
        this.j = meyVar;
        this.h = mirVar;
        this.r = megVar.d;
        lru lruVar = lru.a;
        this.B = mhz.h(mxmVar);
        this.C = new mgv(this.B);
        int length = migVarArr.length;
        this.b = new mij[length];
        this.m = new boolean[length];
        mii d = mxlVar.d();
        this.a = new mil[length];
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            int length2 = migVarArr.length;
            if (i2 >= length2) {
                break;
            }
            migVarArr[i2].s(i2, mluVar, ltnVar);
            this.b[i2] = migVarArr[i2].l();
            this.b[i2].H(d);
            mig migVar = migVarArr2[i2];
            if (migVar != null) {
                migVar.s(length2 + i2, mluVar, ltnVar);
                z3 = true;
            }
            this.a[i2] = new mil(migVarArr[i2], migVarArr2[i2], i2);
            i2++;
        }
        this.z = z3;
        this.s = new mei(this);
        this.t = new ArrayList();
        this.p = new lrt();
        this.q = new lrs();
        mxlVar.g = this;
        mxlVar.h = mxsVar;
        this.Q = true;
        lua b = ltnVar.b(looper, null);
        this.y = b;
        this.v = new mhh(mirVar, b, new mgm(this), meyVar);
        this.g = new mhy(this, mirVar, b, mluVar);
        mia miaVar = new mia();
        this.o = miaVar;
        synchronized (miaVar.a) {
            if (miaVar.b == null) {
                if (miaVar.d == 0 && miaVar.c == null) {
                    z2 = true;
                }
                lti.c(z2);
                miaVar.c = new HandlerThread("ExoPlayer:Playback", -16);
                miaVar.c.start();
                miaVar.b = miaVar.c.getLooper();
            }
            miaVar.d++;
            looper2 = miaVar.b;
        }
        this.f = looper2;
        this.e = ltnVar.b(looper2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02ff A[Catch: all -> 0x0233, TryCatch #0 {all -> 0x0233, blocks: (B:16:0x0222, B:18:0x022d, B:20:0x0230, B:55:0x023d, B:58:0x024a, B:60:0x0250, B:63:0x0257, B:64:0x0260, B:66:0x0269, B:68:0x026d, B:69:0x0291, B:73:0x02a3, B:76:0x02b6, B:78:0x02bc, B:83:0x02cb, B:90:0x02da, B:93:0x02f6, B:95:0x02fa, B:123:0x02ff, B:125:0x0303, B:127:0x02e4, B:130:0x02b2, B:71:0x02e7, B:131:0x0274, B:133:0x027a, B:135:0x0286, B:139:0x02f0, B:145:0x0246, B:146:0x0307, B:148:0x030d, B:150:0x0313, B:152:0x031d, B:154:0x032a, B:157:0x032d), top: B:15:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0269 A[Catch: all -> 0x0233, TryCatch #0 {all -> 0x0233, blocks: (B:16:0x0222, B:18:0x022d, B:20:0x0230, B:55:0x023d, B:58:0x024a, B:60:0x0250, B:63:0x0257, B:64:0x0260, B:66:0x0269, B:68:0x026d, B:69:0x0291, B:73:0x02a3, B:76:0x02b6, B:78:0x02bc, B:83:0x02cb, B:90:0x02da, B:93:0x02f6, B:95:0x02fa, B:123:0x02ff, B:125:0x0303, B:127:0x02e4, B:130:0x02b2, B:71:0x02e7, B:131:0x0274, B:133:0x027a, B:135:0x0286, B:139:0x02f0, B:145:0x0246, B:146:0x0307, B:148:0x030d, B:150:0x0313, B:152:0x031d, B:154:0x032a, B:157:0x032d), top: B:15:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02fa A[Catch: all -> 0x0233, TryCatch #0 {all -> 0x0233, blocks: (B:16:0x0222, B:18:0x022d, B:20:0x0230, B:55:0x023d, B:58:0x024a, B:60:0x0250, B:63:0x0257, B:64:0x0260, B:66:0x0269, B:68:0x026d, B:69:0x0291, B:73:0x02a3, B:76:0x02b6, B:78:0x02bc, B:83:0x02cb, B:90:0x02da, B:93:0x02f6, B:95:0x02fa, B:123:0x02ff, B:125:0x0303, B:127:0x02e4, B:130:0x02b2, B:71:0x02e7, B:131:0x0274, B:133:0x027a, B:135:0x0286, B:139:0x02f0, B:145:0x0246, B:146:0x0307, B:148:0x030d, B:150:0x0313, B:152:0x031d, B:154:0x032a, B:157:0x032d), top: B:15:0x0222 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A(defpackage.lru r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgx.A(lru, boolean):void");
    }

    private final void B(lri lriVar, boolean z) {
        C(lriVar, lriVar.b, true, z);
    }

    private final void C(lri lriVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.C.a(1);
            }
            this.B = this.B.e(lriVar);
        }
        float f2 = lriVar.b;
        mhe mheVar = this.v.e;
        while (true) {
            i = 0;
            if (mheVar == null) {
                break;
            }
            mxf[] mxfVarArr = mheVar.k.c;
            int length = mxfVarArr.length;
            while (i < length) {
                mxf mxfVar = mxfVarArr[i];
                i++;
            }
            mheVar = mheVar.i;
        }
        mil[] milVarArr = this.a;
        while (i < milVarArr.length) {
            mil milVar = milVarArr[i];
            float f3 = lriVar.b;
            milVar.a.I(f, f3);
            mig migVar = milVar.c;
            if (migVar != null) {
                migVar.I(f, f3);
            }
            i++;
        }
    }

    private final void D() {
        boolean e;
        if (ag(this.v.h)) {
            mhe mheVar = this.v.h;
            long l2 = l(mheVar.c());
            if (mheVar == this.v.e) {
                mheVar.e(this.N);
            } else {
                mheVar.e(this.N);
                long j = mheVar.g.b;
            }
            long j2 = af(this.B.b, mheVar.g.a) ? this.W.l : -9223372036854775807L;
            mlu mluVar = this.x;
            lru lruVar = this.B.b;
            mtl mtlVar = mheVar.g.a;
            float f = this.s.b().b;
            boolean z = this.B.m;
            mha mhaVar = new mha(mluVar, l2, f, this.F, j2);
            e = this.k.e(mhaVar);
            mhe mheVar2 = this.v.e;
            if (!e && mheVar2.e && l2 < 500000 && this.r > 0) {
                mheVar2.a.q(this.B.t);
                e = this.k.e(mhaVar);
            }
        } else {
            e = false;
        }
        this.H = e;
        if (e) {
            mhe mheVar3 = this.v.h;
            lti.f(mheVar3);
            mhb mhbVar = new mhb();
            mhbVar.a = mheVar3.e(this.N);
            mhbVar.b(this.s.b().b);
            mhbVar.a(this.G);
            mheVar3.g(new mhc(mhbVar));
        }
        W();
    }

    private final void E() {
        this.v.i();
        mhe mheVar = this.v.i;
        if (mheVar != null) {
            if ((!mheVar.d || mheVar.e) && !mheVar.a.o()) {
                meg megVar = this.k;
                lru lruVar = this.B.b;
                mtl mtlVar = mheVar.g.a;
                if (mheVar.e) {
                    mheVar.a.d();
                }
                Iterator it = megVar.e.values().iterator();
                while (it.hasNext()) {
                    if (((mef) it.next()).a) {
                        return;
                    }
                }
                if (!mheVar.d) {
                    mheVar.h(this, mheVar.g.b);
                    return;
                }
                mhb mhbVar = new mhb();
                mhbVar.a = mheVar.e(this.N);
                mhbVar.b(this.s.b().b);
                mhbVar.a(this.G);
                mheVar.g(new mhc(mhbVar));
            }
        }
    }

    private final void F() {
        mgv mgvVar = this.C;
        mhz mhzVar = this.B;
        boolean z = mgvVar.a | (mgvVar.b != mhzVar);
        mgvVar.a = z;
        mgvVar.b = mhzVar;
        if (z) {
            this.V.a(mgvVar);
            this.C = new mgv(this.B);
        }
    }

    private final void G(int i) {
        mil milVar = this.a[i];
        try {
            mhe mheVar = this.v.e;
            lti.f(mheVar);
            mig d = milVar.d(mheVar);
            lti.f(d);
            d.t();
        } catch (IOException | RuntimeException e) {
            int b = milVar.b();
            if (b != 3 && b != 5) {
                throw e;
            }
            mxm mxmVar = this.v.e.k;
            luj.d("ExoPlayerImplInternal", "Disabling track due to error: ".concat(lqc.c(mxmVar.c[i].f())), e);
            mxm mxmVar2 = new mxm((mik[]) mxmVar.b.clone(), (mxf[]) mxmVar.c.clone(), mxmVar.d, mxmVar.e);
            mxmVar2.b[i] = null;
            mxmVar2.c[i] = null;
            s(i);
            this.v.e.o(mxmVar2, this.B.t);
        }
    }

    private final void H(final int i, final boolean z) {
        boolean[] zArr = this.m;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.y.b(new Runnable() { // from class: mgo
                @Override // java.lang.Runnable
                public final void run() {
                    mgx mgxVar = mgx.this;
                    mgxVar.a[i].b();
                    mlh mlhVar = (mlh) mgxVar.h;
                    mlhVar.J(mlhVar.I(), 1033, new lud() { // from class: mjw
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }

    private final void I() {
        int i;
        float f = this.s.b().b;
        mhh mhhVar = this.v;
        mhe mheVar = mhhVar.e;
        mhe mheVar2 = mhhVar.f;
        mxm mxmVar = null;
        boolean z = true;
        while (mheVar != null && mheVar.e) {
            mhz mhzVar = this.B;
            lru lruVar = mhzVar.b;
            boolean z2 = mhzVar.m;
            mxm q = mheVar.q();
            mxm mxmVar2 = mheVar == this.v.e ? q : mxmVar;
            mxm mxmVar3 = mheVar.k;
            boolean z3 = false;
            if (mxmVar3 != null) {
                if (mxmVar3.c.length == q.c.length) {
                    for (int i2 = 0; i2 < q.c.length; i2++) {
                        if (q.a(mxmVar3, i2)) {
                        }
                    }
                    if (mheVar != mheVar2) {
                        z3 = true;
                    }
                    z &= z3;
                    mheVar = mheVar.i;
                    mxmVar = mxmVar2;
                }
            }
            if (z) {
                mhh mhhVar2 = this.v;
                mhe mheVar3 = mhhVar2.e;
                boolean z4 = 1 == (mhhVar2.a(mheVar3) & 1);
                boolean[] zArr = new boolean[this.a.length];
                lti.f(mxmVar2);
                long a = mheVar3.a(mxmVar2, this.B.t, z4, zArr);
                mhz mhzVar2 = this.B;
                boolean z5 = (mhzVar2.f == 4 || a == mhzVar2.t) ? false : true;
                mhz mhzVar3 = this.B;
                i = 4;
                this.B = q(mhzVar3.c, a, mhzVar3.d, mhzVar3.e, z5, 5);
                if (z5) {
                    M(a);
                }
                r();
                boolean[] zArr2 = new boolean[this.a.length];
                int i3 = 0;
                while (true) {
                    mil[] milVarArr = this.a;
                    if (i3 >= milVarArr.length) {
                        break;
                    }
                    int a2 = milVarArr[i3].a();
                    zArr2[i3] = this.a[i3].n();
                    mil milVar = this.a[i3];
                    mvc mvcVar = mheVar3.c[i3];
                    mei meiVar = this.s;
                    long j = this.N;
                    boolean z6 = zArr[i3];
                    milVar.f(milVar.a, mvcVar, meiVar, j, z6);
                    mig migVar = milVar.c;
                    if (migVar != null) {
                        milVar.f(migVar, mvcVar, meiVar, j, z6);
                    }
                    if (a2 - this.a[i3].a() > 0) {
                        H(i3, false);
                    }
                    this.L -= a2 - this.a[i3].a();
                    i3++;
                }
                x(zArr2, this.N);
                mheVar3.h = true;
            } else {
                i = 4;
                this.v.a(mheVar);
                if (mheVar.e) {
                    long max = Math.max(mheVar.g.b, mheVar.e(this.N));
                    if (this.z && ab() && this.v.g == mheVar) {
                        r();
                    }
                    mheVar.o(q, max);
                }
            }
            z(true);
            if (this.B.f != i) {
                D();
                X();
                this.e.i(2);
                return;
            }
            return;
        }
    }

    private final void J() {
        I();
        P(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r2.equals(r33.B.c) == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void K(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgx.K(boolean, boolean, boolean, boolean):void");
    }

    private final void L() {
        mhe mheVar = this.v.e;
        boolean z = false;
        if (mheVar != null && mheVar.g.i && this.D) {
            z = true;
        }
        this.E = z;
    }

    private final void M(long j) {
        mhe mheVar = this.v.e;
        long f = mheVar == null ? j + 1000000000000L : mheVar.f(j);
        this.N = f;
        this.s.a.c(f);
        for (mil milVar : this.a) {
            long j2 = this.N;
            mig d = milVar.d(mheVar);
            if (d != null) {
                d.F(j2);
            }
        }
        for (mhe mheVar2 = this.v.e; mheVar2 != null; mheVar2 = mheVar2.i) {
            for (mxf mxfVar : mheVar2.k.c) {
            }
        }
    }

    private final void N(lru lruVar, lru lruVar2) {
        if (lruVar.q() && lruVar2.q()) {
            return;
        }
        int size = this.t.size() - 1;
        if (size < 0) {
            Collections.sort(this.t);
            return;
        }
        mgu mguVar = (mgu) this.t.get(size);
        Object obj = mguVar.b;
        mid midVar = mguVar.a;
        throw null;
    }

    private final void O(long j) {
        ((lva) this.e).b.sendEmptyMessageAtTime(2, j + ((this.B.f != 3 || ae()) ? l : 1000L));
    }

    private final void P(boolean z) {
        mtl mtlVar = this.v.e.g.a;
        long n = n(mtlVar, this.B.t, true, false);
        if (n != this.B.t) {
            mhz mhzVar = this.B;
            this.B = q(mtlVar, n, mhzVar.d, mhzVar.e, z, 5);
        }
    }

    private final void Q(lri lriVar) {
        this.e.a(16);
        this.s.d(lriVar);
    }

    private final void R(boolean z, int i, boolean z2, int i2) {
        this.C.a(z2 ? 1 : 0);
        this.B = this.B.c(z, i2, i);
        Z(false, false);
        for (mhe mheVar = this.v.e; mheVar != null; mheVar = mheVar.i) {
            for (mxf mxfVar : mheVar.k.c) {
            }
        }
        if (!ae()) {
            V();
            X();
            this.v.k(this.N);
            return;
        }
        int i3 = this.B.f;
        if (i3 == 3) {
            this.s.e();
            T();
            this.e.i(2);
        } else if (i3 == 2) {
            this.e.i(2);
        }
    }

    private final void S(int i) {
        mhz mhzVar = this.B;
        if (mhzVar.f != i) {
            if (i != 2) {
                this.S = -9223372036854775807L;
            }
            this.B = mhzVar.f(i);
        }
    }

    private final void T() {
        mhe mheVar = this.v.e;
        if (mheVar == null) {
            return;
        }
        mxm mxmVar = mheVar.k;
        for (int i = 0; i < this.a.length; i++) {
            if (mxmVar.b(i)) {
                this.a[i].i();
            }
        }
    }

    private final void U(boolean z, boolean z2) {
        K(z || !this.K, false, true, false);
        this.C.a(z2 ? 1 : 0);
        this.k.c(this.x);
        S(1);
    }

    private final void V() {
        this.s.f();
        int i = 0;
        while (true) {
            mil[] milVarArr = this.a;
            if (i >= milVarArr.length) {
                return;
            }
            mil milVar = milVarArr[i];
            if (mil.o(milVar.a)) {
                mil.r(milVar.a);
            }
            mig migVar = milVar.c;
            if (migVar != null && mil.o(migVar)) {
                mil.r(milVar.c);
            }
            i++;
        }
    }

    private final void W() {
        mhe mheVar = this.v.h;
        boolean z = this.H || (mheVar != null && mheVar.a.o());
        mhz mhzVar = this.B;
        if (z != mhzVar.h) {
            lru lruVar = mhzVar.b;
            mtl mtlVar = mhzVar.c;
            long j = mhzVar.d;
            long j2 = mhzVar.e;
            int i = mhzVar.f;
            mel melVar = mhzVar.g;
            mvo mvoVar = mhzVar.i;
            mxm mxmVar = mhzVar.j;
            List list = mhzVar.k;
            mtl mtlVar2 = mhzVar.l;
            boolean z2 = mhzVar.m;
            int i2 = mhzVar.n;
            int i3 = mhzVar.o;
            lri lriVar = mhzVar.p;
            long j3 = mhzVar.r;
            long j4 = mhzVar.s;
            long j5 = mhzVar.t;
            long j6 = mhzVar.u;
            boolean z3 = mhzVar.q;
            this.B = new mhz(lruVar, mtlVar, j, j2, i, melVar, z, mvoVar, mxmVar, list, mtlVar2, z2, i2, i3, lriVar, j3, j4, j5, j6, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x013d, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void X() {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgx.X():void");
    }

    private final void Y(lru lruVar, mtl mtlVar, lru lruVar2, mtl mtlVar2, long j, boolean z) {
        if (!af(lruVar, mtlVar)) {
            lri lriVar = mtlVar.b() ? lri.a : this.B.p;
            if (this.s.b().equals(lriVar)) {
                return;
            }
            Q(lriVar);
            C(this.B.p, lriVar.b, false, false);
            return;
        }
        lruVar.p(lruVar.o(mtlVar.a, this.q).c, this.p);
        med medVar = this.W;
        lqs lqsVar = this.p.j;
        int i = lvf.a;
        medVar.h = lvf.u(lqsVar.a);
        medVar.j = lvf.u(lqsVar.b);
        medVar.k = lvf.u(lqsVar.c);
        float f = lqsVar.d;
        if (f == -3.4028235E38f) {
            float f2 = medVar.a;
            f = 0.97f;
        }
        medVar.n = f;
        float f3 = lqsVar.e;
        if (f3 == -3.4028235E38f) {
            float f4 = medVar.b;
            f3 = 1.03f;
        }
        medVar.m = f3;
        if (f == 1.0f && f3 == 1.0f) {
            medVar.h = -9223372036854775807L;
        }
        medVar.a();
        if (j != -9223372036854775807L) {
            this.W.b(i(lruVar, mtlVar.a, j));
            return;
        }
        if (!Objects.equals(!lruVar2.q() ? lruVar2.p(lruVar2.o(mtlVar2.a, this.q).c, this.p).b : null, this.p.b) || z) {
            this.W.b(-9223372036854775807L);
        }
    }

    private final void Z(boolean z, boolean z2) {
        this.F = z;
        long j = -9223372036854775807L;
        if (z && !z2) {
            j = SystemClock.elapsedRealtime();
        }
        this.G = j;
    }

    static int a(lrt lrtVar, lrs lrsVar, int i, boolean z, Object obj, lru lruVar, lru lruVar2) {
        lrs lrsVar2;
        Object obj2 = lruVar.p(lruVar.o(obj, lrsVar).c, lrtVar).b;
        int i2 = 0;
        for (int i3 = 0; i3 < lruVar2.c(); i3++) {
            if (lruVar2.p(i3, lrtVar).b.equals(obj2)) {
                return i3;
            }
        }
        int a = lruVar.a(obj);
        int b = lruVar.b();
        int i4 = a;
        int i5 = -1;
        while (i2 < b && i5 == -1) {
            lrt lrtVar2 = lrtVar;
            lrsVar2 = lrsVar;
            int i6 = i;
            boolean z2 = z;
            lru lruVar3 = lruVar;
            i4 = lruVar3.i(i4, lrsVar2, lrtVar2, i6, z2);
            if (i4 == -1) {
                i5 = -1;
                break;
            }
            i5 = lruVar2.a(lruVar3.f(i4));
            i2++;
            lruVar = lruVar3;
            lrsVar = lrsVar2;
            lrtVar = lrtVar2;
            i = i6;
            z = z2;
        }
        lrsVar2 = lrsVar;
        if (i5 == -1) {
            return -1;
        }
        return lruVar2.n(i5, lrsVar2).c;
    }

    private final synchronized void aa(emyl emylVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) emylVar.get()).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean ab() {
        if (!this.z) {
            return false;
        }
        for (mil milVar : this.a) {
            if (milVar.l()) {
                return true;
            }
        }
        return false;
    }

    private final boolean ac() {
        mhe mheVar = this.v.e;
        long j = mheVar.g.e;
        if (mheVar.e) {
            return j == -9223372036854775807L || this.B.t < j || !ae();
        }
        return false;
    }

    private static boolean ad(mhz mhzVar, lrs lrsVar) {
        mtl mtlVar = mhzVar.c;
        lru lruVar = mhzVar.b;
        return lruVar.q() || lruVar.o(mtlVar.a, lrsVar).f;
    }

    private final boolean ae() {
        mhz mhzVar = this.B;
        return mhzVar.m && mhzVar.o == 0;
    }

    private final boolean af(lru lruVar, mtl mtlVar) {
        if (!mtlVar.b() && !lruVar.q()) {
            lruVar.p(lruVar.o(mtlVar.a, this.q).c, this.p);
            if (this.p.c()) {
                lrt lrtVar = this.p;
                if (lrtVar.i && lrtVar.f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean ag(mhe mheVar) {
        if (mheVar != null) {
            try {
                if (mheVar.e) {
                    for (mvc mvcVar : mheVar.c) {
                        if (mvcVar != null) {
                            mvcVar.c();
                        }
                    }
                } else {
                    mheVar.a.j();
                }
                if (mheVar.c() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void ah(mxm mxmVar) {
        mhe mheVar = this.v.h;
        lti.f(mheVar);
        if (mheVar != this.v.e) {
            long j = mheVar.g.b;
        }
        long l2 = l(mheVar.b());
        long j2 = af(this.B.b, mheVar.g.a) ? this.W.l : -9223372036854775807L;
        meg megVar = this.k;
        mlu mluVar = this.x;
        lru lruVar = this.B.b;
        float f = this.s.b().b;
        boolean z = this.B.m;
        mha mhaVar = new mha(mluVar, l2, f, this.F, j2);
        mxf[] mxfVarArr = mxmVar.c;
        mef mefVar = (mef) megVar.e.get(mhaVar.a);
        lti.f(mefVar);
        int length = mxfVarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i >= length) {
                mefVar.b = Math.max(13107200, i2);
                megVar.d();
                return;
            }
            mxf mxfVar = mxfVarArr[i];
            if (mxfVar != null) {
                switch (mxfVar.g().c) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i3 = 144310272;
                        break;
                    case 2:
                        i3 = 131072000;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    default:
                        i3 = 131072;
                        break;
                }
                i2 += i3;
            }
            i++;
        }
    }

    public static final void h(mid midVar) {
        midVar.b();
        try {
            midVar.a.r(midVar.b, midVar.c);
        } finally {
            midVar.a(true);
        }
    }

    private final long i(lru lruVar, Object obj, long j) {
        lruVar.p(lruVar.o(obj, this.q).c, this.p);
        lrt lrtVar = this.p;
        if (lrtVar.f != -9223372036854775807L && lrtVar.c()) {
            lrt lrtVar2 = this.p;
            if (lrtVar2.i) {
                long j2 = lrtVar2.g;
                int i = lvf.a;
                return lvf.u((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.p.f) - (j + this.q.e);
            }
        }
        return -9223372036854775807L;
    }

    private final long j(mhe mheVar) {
        long j = mheVar.l;
        if (mheVar.e) {
            int i = 0;
            while (true) {
                mil[] milVarArr = this.a;
                if (i >= milVarArr.length) {
                    break;
                }
                if (milVarArr[i].m(mheVar)) {
                    mig d = this.a[i].d(mheVar);
                    d.getClass();
                    long f = d.f();
                    if (f == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j = Math.max(f, j);
                }
                i++;
            }
        }
        return j;
    }

    private final long k() {
        return l(this.B.r);
    }

    private final long l(long j) {
        mhe mheVar = this.v.h;
        if (mheVar == null) {
            return 0L;
        }
        return Math.max(0L, j - mheVar.e(this.N));
    }

    private final long m(mtl mtlVar, long j, boolean z) {
        mhh mhhVar = this.v;
        return n(mtlVar, j, mhhVar.e != mhhVar.f, z);
    }

    private final long n(mtl mtlVar, long j, boolean z, boolean z2) {
        mhh mhhVar;
        V();
        Z(false, true);
        if (z2 || this.B.f == 3) {
            S(2);
        }
        mhe mheVar = this.v.e;
        mhe mheVar2 = mheVar;
        while (mheVar2 != null && !mtlVar.equals(mheVar2.g.a)) {
            mheVar2 = mheVar2.i;
        }
        if (z || mheVar != mheVar2 || (mheVar2 != null && mheVar2.f(j) < 0)) {
            t();
            if (mheVar2 != null) {
                while (true) {
                    mhhVar = this.v;
                    if (mhhVar.e == mheVar2) {
                        break;
                    }
                    mhhVar.c();
                }
                mhhVar.a(mheVar2);
                mheVar2.l = 1000000000000L;
                w();
                mheVar2.h = true;
            }
        }
        r();
        if (mheVar2 != null) {
            this.v.a(mheVar2);
            if (!mheVar2.e) {
                mheVar2.g = mheVar2.g.b(j);
            } else if (mheVar2.f) {
                j = mheVar2.a.g(j);
                mheVar2.a.q(j - this.r);
            }
            M(j);
            D();
        } else {
            this.v.h();
            M(j);
        }
        z(false);
        this.e.i(2);
        return j;
    }

    private final Pair o(lru lruVar) {
        long j = 0;
        if (lruVar.q()) {
            return Pair.create(mhz.a, 0L);
        }
        Pair l2 = lruVar.l(this.p, this.q, lruVar.g(this.J), -9223372036854775807L);
        mtl g = this.v.g(lruVar, l2.first, 0L);
        long longValue = ((Long) l2.second).longValue();
        if (g.b()) {
            lruVar.o(g.a, this.q);
            if (g.c == this.q.d(g.b)) {
                this.q.i();
            }
        } else {
            j = longValue;
        }
        return Pair.create(g, Long.valueOf(j));
    }

    private static Pair p(lru lruVar, mgw mgwVar, boolean z, int i, boolean z2, lrt lrtVar, lrs lrsVar) {
        Pair l2;
        lru lruVar2;
        lru lruVar3 = mgwVar.a;
        if (lruVar.q()) {
            return null;
        }
        if (true == lruVar3.q()) {
            lruVar3 = lruVar;
        }
        try {
            l2 = lruVar3.l(lrtVar, lrsVar, mgwVar.b, mgwVar.c);
            lruVar2 = lruVar3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (!lruVar.equals(lruVar2)) {
            if (lruVar.a(l2.first) == -1) {
                int a = a(lrtVar, lrsVar, i, z2, l2.first, lruVar2, lruVar);
                if (a != -1) {
                    return lruVar.l(lrtVar, lrsVar, a, -9223372036854775807L);
                }
                return null;
            }
            if (lruVar2.o(l2.first, lrsVar).f && lruVar2.p(lrsVar.c, lrtVar).n == lruVar2.a(l2.first)) {
                return lruVar.l(lrtVar, lrsVar, lruVar.o(l2.first, lrsVar).c, mgwVar.c);
            }
        }
        return l2;
    }

    private final mhz q(mtl mtlVar, long j, long j2, long j3, boolean z, int i) {
        engw engwVar;
        this.Q = (!this.Q && j == this.B.t && mtlVar.equals(this.B.c)) ? false : true;
        L();
        mhz mhzVar = this.B;
        mvo mvoVar = mhzVar.i;
        mxm mxmVar = mhzVar.j;
        List list = mhzVar.k;
        if (this.g.i) {
            mhe mheVar = this.v.e;
            mvoVar = mheVar == null ? mvo.a : mheVar.j;
            mxmVar = mheVar == null ? this.d : mheVar.k;
            mxf[] mxfVarArr = mxmVar.c;
            engr engrVar = new engr();
            boolean z2 = false;
            for (mxf mxfVar : mxfVarArr) {
                if (mxfVar != null) {
                    lrb lrbVar = mxfVar.e(0).l;
                    if (lrbVar == null) {
                        engrVar.h(new lrb(new lra[0]));
                    } else {
                        engrVar.h(lrbVar);
                        z2 = true;
                    }
                }
            }
            if (z2) {
                engwVar = engrVar.g();
            } else {
                int i2 = engw.d;
                engwVar = enou.a;
            }
            list = engwVar;
            if (mheVar != null) {
                mhf mhfVar = mheVar.g;
                if (mhfVar.c != j2) {
                    mheVar.g = mhfVar.a(j2);
                }
            }
            mhe mheVar2 = this.v.e;
            if (mheVar2 != null) {
                mxm mxmVar2 = mheVar2.k;
                for (int i3 = 0; i3 < this.a.length; i3++) {
                    if (mxmVar2.b(i3)) {
                        if (this.a[i3].b() != 1) {
                            break;
                        }
                        int i4 = mxmVar2.b[i3].b;
                    }
                }
            }
        } else if (!mtlVar.equals(mhzVar.c)) {
            mxmVar = this.d;
            mvoVar = mvo.a;
            int i5 = engw.d;
            list = enou.a;
        }
        mvo mvoVar2 = mvoVar;
        mxm mxmVar3 = mxmVar;
        List list2 = list;
        if (z) {
            mgv mgvVar = this.C;
            if (!mgvVar.d || mgvVar.e == 5) {
                mgvVar.a = true;
                mgvVar.d = true;
                mgvVar.e = i;
            } else {
                lti.a(i == 5);
            }
        }
        return this.B.b(mtlVar, j, j2, j3, k(), mvoVar2, mxmVar3, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r() {
        /*
            r11 = this;
            boolean r0 = r11.z
            if (r0 == 0) goto L59
            boolean r0 = r11.ab()
            if (r0 != 0) goto Lb
            goto L59
        Lb:
            mil[] r0 = r11.a
            r1 = 0
            r2 = r1
        Lf:
            int r3 = r0.length
            if (r2 >= r3) goto L52
            r3 = r0[r2]
            int r4 = r3.a()
            mei r5 = r11.s
            boolean r6 = r3.l()
            if (r6 != 0) goto L21
            goto L45
        L21:
            int r6 = r3.d
            r7 = 4
            r8 = 1
            if (r6 == r7) goto L2e
            r9 = 2
            if (r6 != r9) goto L2c
            r6 = r9
            goto L2e
        L2c:
            r9 = r1
            goto L2f
        L2e:
            r9 = r8
        L2f:
            if (r9 == 0) goto L34
            mig r10 = r3.a
            goto L39
        L34:
            mig r10 = r3.c
            defpackage.lti.f(r10)
        L39:
            r3.e(r10, r5)
            r3.g(r9)
            if (r6 != r7) goto L42
            goto L43
        L42:
            r8 = r1
        L43:
            r3.d = r8
        L45:
            int r5 = r11.L
            int r3 = r3.a()
            int r4 = r4 - r3
            int r5 = r5 - r4
            r11.L = r5
            int r2 = r2 + 1
            goto Lf
        L52:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.T = r0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgx.r():void");
    }

    private final void s(int i) {
        int a = this.a[i].a();
        mil milVar = this.a[i];
        mig migVar = milVar.a;
        mei meiVar = this.s;
        milVar.e(migVar, meiVar);
        mig migVar2 = milVar.c;
        if (migVar2 != null) {
            boolean z = mil.o(migVar2) && milVar.d != 3;
            milVar.e(milVar.c, meiVar);
            milVar.g(false);
            if (z) {
                milVar.j(true);
            }
        }
        milVar.d = 0;
        H(i, false);
        this.L -= a;
    }

    private final void t() {
        for (int i = 0; i < this.a.length; i++) {
            s(i);
        }
        this.T = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:438:0x073d, code lost:
    
        if (r6 != false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x023c, code lost:
    
        if (r2.g != r2.f) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0436 A[EDGE_INSN: B:216:0x0436->B:217:0x0436 BREAK  A[LOOP:6: B:208:0x0400->B:214:0x0422], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0633 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0840 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u() {
        /*
            Method dump skipped, instructions count: 2131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgx.u():void");
    }

    private final void v(mhe mheVar, int i, boolean z, long j) {
        mil milVar = this.a[i];
        if (milVar.n()) {
            return;
        }
        boolean z2 = mheVar == this.v.e;
        mxm mxmVar = mheVar.k;
        mik mikVar = mxmVar.b[i];
        mxf mxfVar = mxmVar.c[i];
        boolean z3 = ae() && this.B.f == 3;
        boolean z4 = !z && z3;
        this.L++;
        mvc mvcVar = mheVar.c[i];
        long j2 = mheVar.l;
        mtl mtlVar = mheVar.g.a;
        mei meiVar = this.s;
        lqc[] q = mil.q(mxfVar);
        int i2 = milVar.d;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            milVar.e = true;
            milVar.a.P(mikVar, q, mvcVar, z4, z2, j, j2, mtlVar);
            meiVar.c(milVar.a);
        } else {
            milVar.f = true;
            mig migVar = milVar.c;
            lti.f(migVar);
            migVar.P(mikVar, q, mvcVar, z4, z2, j, j2, mtlVar);
            meiVar.c(milVar.c);
        }
        mgr mgrVar = new mgr(this);
        mig d = milVar.d(mheVar);
        lti.f(d);
        d.r(11, mgrVar);
        if (z3 && z2) {
            milVar.i();
        }
    }

    private final void w() {
        x(new boolean[this.a.length], this.v.f.d());
    }

    private final void x(boolean[] zArr, long j) {
        long j2;
        mhe mheVar = this.v.f;
        mxm mxmVar = mheVar.k;
        for (int i = 0; i < this.a.length; i++) {
            if (!mxmVar.b(i)) {
                this.a[i].h();
            }
        }
        int i2 = 0;
        while (i2 < this.a.length) {
            if (!mxmVar.b(i2) || this.a[i2].m(mheVar)) {
                j2 = j;
            } else {
                j2 = j;
                v(mheVar, i2, zArr[i2], j2);
            }
            i2++;
            j = j2;
        }
    }

    private final void y(IOException iOException, int i) {
        mel melVar = new mel(0, iOException, i);
        mhe mheVar = this.v.e;
        if (mheVar != null) {
            melVar = melVar.a(mheVar.g.a);
        }
        luj.d("ExoPlayerImplInternal", "Playback error", melVar);
        U(false, false);
        this.B = this.B.d(melVar);
    }

    private final void z(boolean z) {
        mhe mheVar = this.v.h;
        mtl mtlVar = mheVar == null ? this.B.c : mheVar.g.a;
        boolean equals = this.B.l.equals(mtlVar);
        if (!equals) {
            this.B = this.B.a(mtlVar);
        }
        mhz mhzVar = this.B;
        mhzVar.r = mheVar == null ? mhzVar.t : mheVar.b();
        this.B.s = k();
        if ((!equals || z) && mheVar != null && mheVar.e) {
            mtl mtlVar2 = mheVar.g.a;
            ah(mheVar.k);
        }
    }

    @Override // defpackage.mvd
    public final /* bridge */ /* synthetic */ void b(mve mveVar) {
        this.e.d(9, (mtj) mveVar).b();
    }

    @Override // defpackage.mti
    public final void c(mtj mtjVar) {
        this.e.d(8, mtjVar).b();
    }

    @Override // defpackage.mib
    public final synchronized void d(mid midVar) {
        if (!this.i && this.f.getThread().isAlive()) {
            this.e.d(14, midVar).b();
            return;
        }
        luj.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        midVar.a(false);
    }

    public final void e(lpk lpkVar) {
        this.e.d(31, lpkVar).b();
    }

    public final synchronized boolean f() {
        if (!this.i && this.f.getThread().isAlive()) {
            this.e.i(7);
            aa(new emyl() { // from class: mgn
                @Override // defpackage.emyl
                public final Object get() {
                    return Boolean.valueOf(mgx.this.i);
                }
            }, this.w);
            return this.i;
        }
        return true;
    }

    public final synchronized boolean g(Object obj, long j) {
        if (!this.i && this.f.getThread().isAlive()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.e.d(30, new Pair(obj, atomicBoolean)).b();
            if (j != -9223372036854775807L) {
                aa(new emyl() { // from class: mgp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return Boolean.valueOf(atomicBoolean.get());
                    }
                }, j);
                return atomicBoolean.get();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7 A[Catch: RuntimeException -> 0x0664, IOException -> 0x068d, msb -> 0x0694, lwr -> 0x069b, lrg -> 0x06a2, moz -> 0x06b5, mel -> 0x06be, TryCatch #15 {RuntimeException -> 0x0664, blocks: (B:3:0x000a, B:5:0x0013, B:9:0x0019, B:11:0x0026, B:15:0x003b, B:16:0x002f, B:18:0x0038, B:25:0x003e, B:26:0x0049, B:28:0x0059, B:32:0x0077, B:33:0x0062, B:37:0x0069, B:39:0x006f, B:42:0x007a, B:46:0x0089, B:54:0x0095, B:55:0x0082, B:56:0x0096, B:62:0x00b8, B:64:0x00c7, B:65:0x00d1, B:68:0x00ef, B:69:0x00ff, B:71:0x0107, B:73:0x011a, B:76:0x0123, B:77:0x013a, B:80:0x014d, B:83:0x0156, B:86:0x0164, B:88:0x016a, B:90:0x0182, B:93:0x018b, B:94:0x0190, B:95:0x0195, B:98:0x019c, B:100:0x01a5, B:102:0x01ad, B:104:0x01b5, B:105:0x01c0, B:107:0x01d5, B:108:0x01e9, B:109:0x01f4, B:112:0x0207, B:115:0x0210, B:117:0x0221, B:120:0x023d, B:122:0x024b, B:124:0x025a, B:125:0x025e, B:126:0x026b, B:128:0x0278, B:129:0x028c, B:130:0x02aa, B:131:0x02b3, B:133:0x02c3, B:134:0x02cf, B:135:0x02df, B:137:0x02eb, B:140:0x02f6, B:141:0x02fd, B:142:0x0308, B:145:0x030f, B:147:0x0317, B:149:0x031b, B:151:0x0321, B:154:0x032b, B:162:0x0337, B:164:0x0338, B:167:0x033f, B:169:0x0351, B:170:0x035b, B:171:0x0355, B:173:0x0358, B:175:0x0360, B:177:0x0374, B:178:0x037e, B:179:0x0378, B:181:0x037b, B:182:0x0383, B:183:0x0388, B:185:0x0394, B:186:0x03a0, B:188:0x03a8, B:189:0x03ad, B:191:0x03b9, B:193:0x03c4, B:194:0x03d5, B:196:0x03e4, B:197:0x0406, B:198:0x040b, B:199:0x040e, B:201:0x0416, B:203:0x0424, B:207:0x0429, B:209:0x0448, B:392:0x048c, B:393:0x0491, B:401:0x049b, B:211:0x04ad, B:212:0x04b3, B:213:0x04ba, B:222:0x04cb, B:225:0x04fb, B:304:0x0520, B:307:0x0539, B:309:0x0549, B:311:0x0560, B:313:0x056c, B:404:0x049d, B:405:0x04a2, B:409:0x04a9, B:413:0x04ac), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107 A[Catch: RuntimeException -> 0x0664, IOException -> 0x068d, msb -> 0x0694, lwr -> 0x069b, lrg -> 0x06a2, moz -> 0x06b5, mel -> 0x06be, LOOP:2: B:69:0x00ff->B:71:0x0107, LOOP_END, TryCatch #15 {RuntimeException -> 0x0664, blocks: (B:3:0x000a, B:5:0x0013, B:9:0x0019, B:11:0x0026, B:15:0x003b, B:16:0x002f, B:18:0x0038, B:25:0x003e, B:26:0x0049, B:28:0x0059, B:32:0x0077, B:33:0x0062, B:37:0x0069, B:39:0x006f, B:42:0x007a, B:46:0x0089, B:54:0x0095, B:55:0x0082, B:56:0x0096, B:62:0x00b8, B:64:0x00c7, B:65:0x00d1, B:68:0x00ef, B:69:0x00ff, B:71:0x0107, B:73:0x011a, B:76:0x0123, B:77:0x013a, B:80:0x014d, B:83:0x0156, B:86:0x0164, B:88:0x016a, B:90:0x0182, B:93:0x018b, B:94:0x0190, B:95:0x0195, B:98:0x019c, B:100:0x01a5, B:102:0x01ad, B:104:0x01b5, B:105:0x01c0, B:107:0x01d5, B:108:0x01e9, B:109:0x01f4, B:112:0x0207, B:115:0x0210, B:117:0x0221, B:120:0x023d, B:122:0x024b, B:124:0x025a, B:125:0x025e, B:126:0x026b, B:128:0x0278, B:129:0x028c, B:130:0x02aa, B:131:0x02b3, B:133:0x02c3, B:134:0x02cf, B:135:0x02df, B:137:0x02eb, B:140:0x02f6, B:141:0x02fd, B:142:0x0308, B:145:0x030f, B:147:0x0317, B:149:0x031b, B:151:0x0321, B:154:0x032b, B:162:0x0337, B:164:0x0338, B:167:0x033f, B:169:0x0351, B:170:0x035b, B:171:0x0355, B:173:0x0358, B:175:0x0360, B:177:0x0374, B:178:0x037e, B:179:0x0378, B:181:0x037b, B:182:0x0383, B:183:0x0388, B:185:0x0394, B:186:0x03a0, B:188:0x03a8, B:189:0x03ad, B:191:0x03b9, B:193:0x03c4, B:194:0x03d5, B:196:0x03e4, B:197:0x0406, B:198:0x040b, B:199:0x040e, B:201:0x0416, B:203:0x0424, B:207:0x0429, B:209:0x0448, B:392:0x048c, B:393:0x0491, B:401:0x049b, B:211:0x04ad, B:212:0x04b3, B:213:0x04ba, B:222:0x04cb, B:225:0x04fb, B:304:0x0520, B:307:0x0539, B:309:0x0549, B:311:0x0560, B:313:0x056c, B:404:0x049d, B:405:0x04a2, B:409:0x04a9, B:413:0x04ac), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARN: Type inference failed for: r2v138, types: [lxp, mxs] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r26) {
        /*
            Method dump skipped, instructions count: 2036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgx.handleMessage(android.os.Message):boolean");
    }
}
