package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class muq implements mtj, ncr, mxz, myc, mva {
    public static final Map a;
    public static final lqc b;
    private final lwn A;
    private final mpm B;
    private final mph C;
    private final lqc D;
    private final long E;
    private boolean H;
    private boolean I;
    private boolean J;
    private mup K;
    private boolean M;
    private boolean N;
    private int O;
    private final mxt Q;
    public final mtv c;
    public final mum d;
    public final long e;
    public final muf g;
    public mti k;
    public nfs l;
    public boolean n;
    public ndn o;
    public long p;
    public boolean q;
    public boolean r;
    public boolean s;
    public long t;
    public boolean u;
    public int v;
    public boolean w;
    public boolean x;
    private final Uri z;
    public final myf f = new myf(new myk(lvf.Q("ExoPlayer:Loader:ProgressiveMediaPeriod"), new lts() { // from class: mxy
        @Override // defpackage.lts
        public final void a(Object obj) {
            ((ExecutorService) obj).shutdown();
        }
    }));
    private final ltq F = new ltq();
    public final Runnable h = new Runnable() { // from class: muh
        @Override // java.lang.Runnable
        public final void run() {
            muq.this.s();
        }
    };
    public final Runnable i = new Runnable() { // from class: mui
        @Override // java.lang.Runnable
        public final void run() {
            muq muqVar = muq.this;
            if (muqVar.x) {
                return;
            }
            mti mtiVar = muqVar.k;
            lti.f(mtiVar);
            mtiVar.b(muqVar);
        }
    };
    public final Handler j = lvf.C();
    private muo[] G = new muo[0];
    public mvb[] m = new mvb[0];
    private long P = -9223372036854775807L;
    private int L = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        a = DesugarCollections.unmodifiableMap(hashMap);
        lqb lqbVar = new lqb();
        lqbVar.a = "icy";
        lqbVar.c("application/x-icy");
        b = new lqc(lqbVar);
    }

    public muq(Uri uri, lwn lwnVar, muf mufVar, mpm mpmVar, mph mphVar, mtv mtvVar, mum mumVar, mxt mxtVar, int i, lqc lqcVar, long j) {
        this.z = uri;
        this.A = lwnVar;
        this.B = mpmVar;
        this.C = mphVar;
        this.c = mtvVar;
        this.d = mumVar;
        this.Q = mxtVar;
        this.e = i;
        this.D = lqcVar;
        this.g = mufVar;
        this.E = j;
    }

    private final void A() {
        lti.c(this.n);
        lti.f(this.K);
        lti.f(this.o);
    }

    private final void B() {
        mul mulVar = new mul(this, this.z, this.A, this.g, this, this.F);
        if (this.n) {
            lti.c(C());
            long j = this.p;
            if (j != -9223372036854775807L && this.P > j) {
                this.w = true;
                this.P = -9223372036854775807L;
                return;
            }
            ndn ndnVar = this.o;
            lti.f(ndnVar);
            mulVar.b(ndnVar.b(this.P).a.c, this.P);
            for (mvb mvbVar : this.m) {
                mvbVar.g = this.P;
            }
            this.P = -9223372036854775807L;
        }
        this.v = b();
        myf myfVar = this.f;
        Looper myLooper = Looper.myLooper();
        lti.g(myLooper);
        myfVar.d = null;
        SystemClock.elapsedRealtime();
        new myb(myfVar, myLooper, mulVar, this).b(0L);
    }

    private final boolean C() {
        return this.P != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[RETURN] */
    @Override // defpackage.mtj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r23, defpackage.min r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = r25
            r0.A()
            ndn r4 = r0.o
            boolean r4 = r4.y()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            ndn r4 = r0.o
            ndl r4 = r4.b(r1)
            ndo r7 = r4.a
            ndo r4 = r4.b
            long r8 = r3.c
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L2c
            long r8 = r3.d
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L2b
            return r1
        L2b:
            r8 = r5
        L2c:
            long r10 = r7.b
            int r7 = defpackage.lvf.a
            long r12 = r1 - r8
            long r8 = r8 ^ r1
            long r14 = r1 ^ r12
            r16 = r5
            long r5 = r3.d
            long r18 = r1 + r5
            long r20 = r1 ^ r18
            long r5 = r5 ^ r18
            long r8 = r8 & r14
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 >= 0) goto L46
            r12 = -9223372036854775808
        L46:
            long r5 = r20 & r5
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 >= 0) goto L51
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L51:
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 > 0) goto L5d
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 > 0) goto L5d
            r3 = r5
            goto L5e
        L5d:
            r3 = r6
        L5e:
            long r7 = r4.b
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 > 0) goto L69
            int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r4 > 0) goto L69
            goto L6a
        L69:
            r5 = r6
        L6a:
            if (r3 == 0) goto L7f
            if (r5 == 0) goto L7f
            long r3 = r10 - r1
            long r1 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L84
            goto L81
        L7f:
            if (r3 == 0) goto L82
        L81:
            return r10
        L82:
            if (r5 == 0) goto L85
        L84:
            return r7
        L85:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.muq.a(long, min):long");
    }

    public final int b() {
        int i = 0;
        for (mvb mvbVar : this.m) {
            i += mvbVar.c();
        }
        return i;
    }

    public final long c(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (i < this.m.length) {
            if (!z) {
                mup mupVar = this.K;
                lti.f(mupVar);
                i = mupVar.c[i] ? 0 : i + 1;
            }
            j = Math.max(j, this.m[i].f());
        }
        return j;
    }

    @Override // defpackage.mtj, defpackage.mve
    public final long d() {
        long j;
        A();
        if (this.w || this.O == 0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.P;
        }
        if (this.I) {
            int length = this.m.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                mup mupVar = this.K;
                if (mupVar.b[i] && mupVar.c[i] && !this.m[i].q()) {
                    j = Math.min(j, this.m[i].f());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = c(false);
        }
        return j == Long.MIN_VALUE ? this.t : j;
    }

    @Override // defpackage.mtj, defpackage.mve
    public final long e() {
        return d();
    }

    @Override // defpackage.mtj
    public final long f() {
        if (this.N) {
            this.N = false;
        } else {
            if (!this.r) {
                return -9223372036854775807L;
            }
            if (!this.w && b() <= this.v) {
                return -9223372036854775807L;
            }
            this.r = false;
        }
        return this.t;
    }

    @Override // defpackage.mtj
    public final long g(long j) {
        A();
        boolean[] zArr = this.K.b;
        if (true != this.o.y()) {
            j = 0;
        }
        int i = 0;
        this.r = false;
        long j2 = this.t;
        this.t = j;
        if (C()) {
            this.P = j;
            return j;
        }
        if (this.L != 7 && (this.w || this.f.b())) {
            int length = this.m.length;
            for (int i2 = 0; i2 < length; i2++) {
                mvb mvbVar = this.m[i2];
                if (mvbVar.a() != 0 || j2 != j) {
                    if (this.J ? mvbVar.s(mvbVar.e) : mvbVar.t(j, false)) {
                        continue;
                    } else if (!zArr[i2] && this.I) {
                    }
                }
            }
            return j;
        }
        this.u = false;
        this.P = j;
        this.w = false;
        this.N = false;
        myf myfVar = this.f;
        if (myfVar.b()) {
            mvb[] mvbVarArr = this.m;
            int length2 = mvbVarArr.length;
            while (i < length2) {
                mvbVarArr[i].h();
                i++;
            }
            this.f.a();
            return j;
        }
        myfVar.d = null;
        mvb[] mvbVarArr2 = this.m;
        int length3 = mvbVarArr2.length;
        while (i < length3) {
            mvbVarArr2[i].k();
            i++;
        }
        return j;
    }

    @Override // defpackage.mtj
    public final long h(mxf[] mxfVarArr, boolean[] zArr, mvc[] mvcVarArr, boolean[] zArr2, long j) {
        mxf mxfVar;
        A();
        mup mupVar = this.K;
        mvo mvoVar = mupVar.a;
        boolean[] zArr3 = mupVar.c;
        int i = this.O;
        int i2 = 0;
        for (int i3 = 0; i3 < mxfVarArr.length; i3++) {
            mvc mvcVar = mvcVarArr[i3];
            if (mvcVar != null && (mxfVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((mun) mvcVar).a;
                lti.c(zArr3[i4]);
                this.O--;
                zArr3[i4] = false;
                mvcVarArr[i3] = null;
            }
        }
        boolean z = !this.M ? j == 0 || this.J : i != 0;
        for (int i5 = 0; i5 < mxfVarArr.length; i5++) {
            if (mvcVarArr[i5] == null && (mxfVar = mxfVarArr[i5]) != null) {
                lti.c(mxfVar.d() == 1);
                lti.c(mxfVar.a(0) == 0);
                int a2 = mvoVar.a(mxfVar.g());
                lti.c(!zArr3[a2]);
                this.O++;
                zArr3[a2] = true;
                this.N = mxfVar.f().u | this.N;
                mvcVarArr[i5] = new mun(this, a2);
                zArr2[i5] = true;
                if (!z) {
                    mvb mvbVar = this.m[a2];
                    z = (mvbVar.a() == 0 || mvbVar.t(j, true)) ? false : true;
                }
            }
        }
        if (this.O == 0) {
            this.u = false;
            this.r = false;
            this.N = false;
            if (this.f.b()) {
                mvb[] mvbVarArr = this.m;
                int length = mvbVarArr.length;
                while (i2 < length) {
                    mvbVarArr[i2].h();
                    i2++;
                }
                this.f.a();
            } else {
                this.w = false;
                mvb[] mvbVarArr2 = this.m;
                int length2 = mvbVarArr2.length;
                while (i2 < length2) {
                    mvbVarArr2[i2].k();
                    i2++;
                }
            }
        } else if (z) {
            j = g(j);
            while (i2 < mvcVarArr.length) {
                if (mvcVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.M = true;
        return j;
    }

    @Override // defpackage.mtj
    public final mvo i() {
        A();
        return this.K.a;
    }

    @Override // defpackage.mtj
    public final void j() {
        v();
        if (this.w && !this.n) {
            throw new lrg("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    @Override // defpackage.mtj
    public final void k(mti mtiVar, long j) {
        this.k = mtiVar;
        if (this.D == null) {
            this.F.d();
            B();
        } else {
            p(0, 3).i(this.D);
            x(new ndf(new long[]{0}, new long[]{0}, -9223372036854775807L));
            r();
            this.P = j;
        }
    }

    public final ndu m(muo muoVar) {
        int length = this.m.length;
        for (int i = 0; i < length; i++) {
            if (muoVar.equals(this.G[i])) {
                return this.m[i];
            }
        }
        if (this.H) {
            luj.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + muoVar.a + ") after finishing tracks.");
            return new nck();
        }
        mvb mvbVar = new mvb(this.Q, this.B, this.C);
        mvbVar.c = this;
        int i2 = length + 1;
        muo[] muoVarArr = (muo[]) Arrays.copyOf(this.G, i2);
        muoVarArr[length] = muoVar;
        int i3 = lvf.a;
        this.G = muoVarArr;
        mvb[] mvbVarArr = (mvb[]) Arrays.copyOf(this.m, i2);
        mvbVarArr[length] = mvbVar;
        this.m = mvbVarArr;
        return mvbVar;
    }

    @Override // defpackage.mtj, defpackage.mve
    public final boolean n(mhc mhcVar) {
        if (this.w) {
            return false;
        }
        myf myfVar = this.f;
        if (myfVar.d != null || this.u) {
            return false;
        }
        if ((this.n || this.D != null) && this.O == 0) {
            return false;
        }
        boolean d = this.F.d();
        if (myfVar.b()) {
            return d;
        }
        B();
        return true;
    }

    @Override // defpackage.mtj, defpackage.mve
    public final boolean o() {
        return this.f.b() && this.F.c();
    }

    @Override // defpackage.ncr
    public final ndu p(int i, int i2) {
        return m(new muo(i, false));
    }

    @Override // defpackage.mtj
    public final void q(long j) {
        if (this.J) {
            return;
        }
        A();
        if (C()) {
            return;
        }
        boolean[] zArr = this.K.c;
        int length = this.m.length;
        for (int i = 0; i < length; i++) {
            mvb mvbVar = this.m[i];
            mvbVar.a.c(mvbVar.u(j, zArr[i]));
        }
    }

    @Override // defpackage.ncr
    public final void r() {
        this.H = true;
        this.j.post(this.h);
    }

    public final void s() {
        int i;
        if (this.x || this.n || !this.H || this.o == null) {
            return;
        }
        for (mvb mvbVar : this.m) {
            if (mvbVar.g() == null) {
                return;
            }
        }
        this.F.e();
        int length = this.m.length;
        lrv[] lrvVarArr = new lrv[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            lqc g = this.m[i2].g();
            lti.f(g);
            String str = g.o;
            boolean i3 = lre.i(str);
            boolean z = i3 || lre.l(str);
            zArr[i2] = z;
            this.I = z | this.I;
            this.J = this.E != -9223372036854775807L && length == 1 && lre.j(str);
            nfs nfsVar = this.l;
            if (nfsVar != null) {
                if (i3 || this.G[i2].b) {
                    lrb lrbVar = g.l;
                    lrb lrbVar2 = lrbVar == null ? new lrb(nfsVar) : lrbVar.c(nfsVar);
                    lqb lqbVar = new lqb(g);
                    lqbVar.k = lrbVar2;
                    g = new lqc(lqbVar);
                }
                if (i3 && g.h == -1 && g.i == -1 && (i = nfsVar.a) != -1) {
                    lqb lqbVar2 = new lqb(g);
                    lqbVar2.h = i;
                    g = new lqc(lqbVar2);
                }
            }
            lqc b2 = g.b(this.B.a(g));
            lrvVarArr[i2] = new lrv(Integer.toString(i2), b2);
            this.N = b2.u | this.N;
        }
        this.K = new mup(new mvo(lrvVarArr), zArr);
        if (this.J && this.p == -9223372036854775807L) {
            this.p = this.E;
            this.o = new muk(this, this.o);
        }
        this.d.a(this.p, this.o, this.q);
        this.n = true;
        mti mtiVar = this.k;
        lti.f(mtiVar);
        mtiVar.c(this);
    }

    public final void t(int i) {
        A();
        mup mupVar = this.K;
        boolean[] zArr = mupVar.d;
        if (zArr[i]) {
            return;
        }
        lqc a2 = mupVar.a.b(i).a(0);
        this.c.b(new mth(lre.b(a2.o), a2, lvf.z(this.t), -9223372036854775807L));
        zArr[i] = true;
    }

    public final void u(int i) {
        A();
        if (this.u) {
            if (!this.I || this.K.b[i]) {
                if (this.m[i].r(false)) {
                    return;
                }
                this.P = 0L;
                this.u = false;
                this.r = true;
                this.t = 0L;
                this.v = 0;
                for (mvb mvbVar : this.m) {
                    mvbVar.k();
                }
                mti mtiVar = this.k;
                lti.f(mtiVar);
                mtiVar.b(this);
            }
        }
    }

    final void v() {
        IOException iOException;
        int a2 = mxw.a(this.L);
        myf myfVar = this.f;
        IOException iOException2 = myfVar.d;
        if (iOException2 != null) {
            throw iOException2;
        }
        myb mybVar = myfVar.c;
        if (mybVar != null && (iOException = mybVar.a) != null && mybVar.b > a2) {
            throw iOException;
        }
    }

    @Override // defpackage.ncr
    public final void w(final ndn ndnVar) {
        this.j.post(new Runnable() { // from class: muj
            @Override // java.lang.Runnable
            public final void run() {
                muq.this.x(ndnVar);
            }
        });
    }

    public final void x(ndn ndnVar) {
        this.o = this.l == null ? ndnVar : new ndm(-9223372036854775807L);
        this.p = ndnVar.w();
        boolean z = false;
        if (!this.s && ndnVar.w() == -9223372036854775807L) {
            z = true;
        }
        this.q = z;
        this.L = true == z ? 7 : 1;
        if (this.n) {
            this.d.a(this.p, ndnVar, z);
        } else {
            s();
        }
    }

    public final boolean y() {
        return this.r || C();
    }

    @Override // defpackage.mxz
    public final /* bridge */ /* synthetic */ void z(mul mulVar, boolean z) {
        lxo lxoVar = mulVar.c;
        long j = mulVar.a;
        lwv lwvVar = mulVar.k;
        this.c.c(new mtc(), new mth(-1, null, lvf.z(mulVar.j), lvf.z(this.p)));
        if (z) {
            return;
        }
        for (mvb mvbVar : this.m) {
            mvbVar.k();
        }
        if (this.O > 0) {
            mti mtiVar = this.k;
            lti.f(mtiVar);
            mtiVar.b(this);
        }
    }

    @Override // defpackage.mtj, defpackage.mve
    public final void l(long j) {
    }
}
