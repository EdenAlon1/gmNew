package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfm implements hfd {
    public int A;
    public hqb B;
    private final Set C;
    private hig E;
    private int F;
    private int G;
    private int H;
    private cnu J;
    private int L;
    private final hfg M;
    private final ArrayList N;
    private hen O;
    private hlg P;
    private final hua Q;
    private htx R;
    public final hep a;
    public final hfr b;
    public final hjr c;
    public final hle d;
    public final hle e;
    public final hgh f;
    public int[] g;
    public boolean h;
    public boolean i;
    public cnw k;
    public boolean l;
    public boolean n;
    public int p;
    public boolean q;
    public boolean r;
    public hjq s;
    public hjr t;
    public hjv u;
    public boolean v;
    public hle w;
    public final hlf x;
    public final ffhd y;
    public boolean z;
    private final ArrayList D = new ArrayList();
    private final hgx I = new hgx();
    public final List j = new ArrayList();
    private final hgx K = new hgx();
    private hqb S = hqb.d;
    public final hgx m = new hgx();
    public int o = -1;

    public hfm(hep hepVar, hfr hfrVar, hjr hjrVar, Set set, hle hleVar, hle hleVar2, hgh hghVar) {
        this.a = hepVar;
        this.b = hfrVar;
        this.c = hjrVar;
        this.C = set;
        this.d = hleVar;
        this.e = hleVar2;
        this.f = hghVar;
        this.q = hfrVar.s() || hfrVar.q();
        this.M = new hfg(this);
        this.N = new ArrayList();
        hjq c = hjrVar.c();
        c.r();
        this.s = c;
        hjr hjrVar2 = new hjr();
        if (hfrVar.s()) {
            hjrVar2.f();
        }
        if (hfrVar.q()) {
            hjrVar2.e();
        }
        this.t = hjrVar2;
        hjv d = hjrVar2.d();
        d.A(true);
        this.u = d;
        this.x = new hlf(this, hleVar);
        hjq c2 = this.t.c();
        try {
            hen g = c2.g(0);
            c2.r();
            this.O = g;
            this.P = new hlg();
            this.Q = new hua(this);
            ffhd d2 = hfrVar.d();
            ffhd P = P();
            this.y = d2.plus(P == null ? ffhe.a : P);
        } catch (Throwable th) {
            c2.r();
            throw th;
        }
    }

    private final void aA(int i) {
        ab(i, null, 0, null);
    }

    private final void aB(boolean z, Object obj) {
        if (z) {
            hjq hjqVar = this.s;
            if (hjqVar.i <= 0) {
                if ((hjqVar.b[(hjqVar.f * 5) + 1] & 1073741824) == 0) {
                    hih.a("Expected a node group");
                }
                hjqVar.v();
                return;
            }
            return;
        }
        if (obj != null && this.s.h() != obj) {
            hlf hlfVar = this.x;
            hlfVar.j(false);
            hmx hmxVar = hlfVar.a.a;
            hmxVar.c(hml.a);
            hmw.a(hmxVar, 0, obj);
        }
        this.s.v();
    }

    private final void aC(int i, int i2) {
        int N = N(i);
        if (N != i2) {
            int size = this.D.size() - 1;
            while (i != -1) {
                int N2 = N(i) + (i2 - N);
                af(i, N2);
                int i3 = size;
                while (true) {
                    if (i3 < 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    hig higVar = (hig) this.D.get(i3);
                    if (higVar != null && higVar.d(i, N2)) {
                        size = i4;
                        break;
                    }
                    i3 = i4;
                }
                if (i < 0) {
                    i = this.s.h;
                } else if (this.s.B(i)) {
                    return;
                } else {
                    i = this.s.e(i);
                }
            }
        }
    }

    private final void aD(Object obj) {
        Q();
        ag(obj);
    }

    private final void aE() {
        if (!this.i) {
            hfp.j("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.i = false;
    }

    private final void aF() {
        if (this.i) {
            hfp.j("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final hqb aG(int i) {
        hqb hqbVar;
        if (this.z && this.v) {
            int i2 = this.u.s;
            while (i2 > 0) {
                if (this.u.i(i2) == 202 && ffkj.e(this.u.v(i2), hfp.c)) {
                    Object u = this.u.u(i2);
                    u.getClass();
                    hqb hqbVar2 = (hqb) u;
                    this.B = hqbVar2;
                    return hqbVar2;
                }
                i2 = this.u.l(i2);
            }
        }
        if (this.s.c > 0) {
            while (i > 0) {
                if (this.s.b(i) == 202 && ffkj.e(this.s.m(i), hfp.c)) {
                    cnw cnwVar = this.k;
                    if (cnwVar == null || (hqbVar = (hqb) cnwVar.a(i)) == null) {
                        Object j = this.s.j(i);
                        j.getClass();
                        hqbVar = (hqb) j;
                    }
                    this.B = hqbVar;
                    return hqbVar;
                }
                i = this.s.e(i);
            }
        }
        hqb hqbVar3 = this.S;
        this.B = hqbVar3;
        return hqbVar3;
    }

    private static final int aH(int i) {
        return (-2) - i;
    }

    public static final /* synthetic */ void al(hfm hfmVar, hhk hhkVar, hqb hqbVar, Object obj) {
        hfmVar.u(126665345, hhkVar);
        hfmVar.aD(obj);
        int i = hfmVar.A;
        try {
            hfmVar.A = 126665345;
            if (hfmVar.z) {
                hjv.Y(hfmVar.u);
            }
            boolean z = (hfmVar.z || ffkj.e(hfmVar.s.h(), hqbVar)) ? false : true;
            if (z) {
                hfmVar.ak(hqbVar);
            }
            hfmVar.ab(BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, hfp.c, 0, hqbVar);
            hfmVar.B = null;
            boolean z2 = hfmVar.l;
            hfmVar.l = z;
            hpy.a(hfmVar, new hpw(316014703, true, new hfk()));
            hfmVar.l = z2;
        } finally {
            hfmVar.Z();
            hfmVar.B = null;
            hfmVar.A = i;
            hfmVar.Z();
        }
    }

    private final int an(int i) {
        int e = this.s.e(i) + 1;
        int i2 = 0;
        while (e < i) {
            if (!this.s.z(e)) {
                i2++;
            }
            e += this.s.c(e);
        }
        return i2;
    }

    private static final int ao(hfm hfmVar, int i, int i2, boolean z, int i3) {
        hjq hjqVar = hfmVar.s;
        if (!hjqVar.y(i2)) {
            if (!hjqVar.w(i2)) {
                if (hjqVar.B(i2)) {
                    return 1;
                }
                return hjqVar.d(i2);
            }
            int c = hjqVar.c(i2) + i2;
            int i4 = 0;
            for (int i5 = i2 + 1; i5 < c; i5 += hjqVar.c(i5)) {
                boolean B = hjqVar.B(i5);
                if (B) {
                    hfmVar.x.i();
                    hfmVar.x.d(hjqVar.o(i5));
                }
                i4 += ao(hfmVar, i, i5, B || z, B ? 0 : i3 + i4);
                if (B) {
                    hfmVar.x.i();
                    hfmVar.x.f();
                }
            }
            if (hjqVar.B(i2)) {
                return 1;
            }
            return i4;
        }
        int b = hjqVar.b(i2);
        Object m = hjqVar.m(i2);
        if (b == 126665345) {
            if (m instanceof hhk) {
                hhn ap = ap(hfmVar, i2);
                if (ap != null) {
                    hfmVar.b.f(ap);
                    hfmVar.x.k();
                    hlf hlfVar = hfmVar.x;
                    hgh hghVar = hfmVar.f;
                    hfr hfrVar = hfmVar.b;
                    hmx hmxVar = hlfVar.a.a;
                    hmxVar.c(hmb.a);
                    hmw.c(hmxVar, hghVar, hfrVar, ap);
                }
                if (!z || i2 == i) {
                    return hjqVar.d(i2);
                }
                hlf hlfVar2 = hfmVar.x;
                hlfVar2.i();
                hlfVar2.g();
                int d = hlfVar2.a().B(i2) ? 1 : hlfVar2.a().d(i2);
                if (d <= 0) {
                    return 0;
                }
                hlfVar2.l(i3, d);
                return 0;
            }
        } else if (b == 206 && ffkj.e(m, hfp.e)) {
            Object l = hjqVar.l(i2, 0);
            hfe hfeVar = l instanceof hfe ? (hfe) l : null;
            if (hfeVar != null) {
                for (hfm hfmVar2 : hfeVar.a.a) {
                    hjr hjrVar = hfmVar2.c;
                    if (hjrVar.b > 0 && (hjrVar.a[1] & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
                        hgh hghVar2 = hfmVar2.f;
                        synchronized (((hfu) hghVar2).c) {
                            Object andSet = ((hfu) hghVar2).b.getAndSet(ffen.a);
                            if (!ffkj.e(andSet, hfv.a) && andSet != null) {
                                if (andSet instanceof Set) {
                                    ((hfu) hghVar2).h((Set) andSet, false);
                                } else {
                                    if (!(andSet instanceof Object[])) {
                                        AtomicReference atomicReference = ((hfu) hghVar2).b;
                                        Objects.toString(atomicReference);
                                        hfp.h("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                                        throw new ffbx();
                                    }
                                    for (Set set : (Set[]) andSet) {
                                        ((hfu) hghVar2).h(set, false);
                                    }
                                }
                            }
                            cop f = ((hfu) hghVar2).f();
                            try {
                                ((hfu) hghVar2).m.ae(f);
                            } catch (Exception e) {
                                ((hfu) hghVar2).j = f;
                                throw e;
                            }
                        }
                        hle hleVar = new hle();
                        hfmVar2.w = hleVar;
                        hjq c2 = hfmVar2.c.c();
                        try {
                            hfmVar2.s = c2;
                            hlf hlfVar3 = hfmVar2.x;
                            hle hleVar2 = hlfVar3.a;
                            try {
                                hlfVar3.a = hleVar;
                                hfmVar2.ax(0);
                                hlf hlfVar4 = hfmVar2.x;
                                hlfVar4.g();
                                if (hlfVar4.b) {
                                    hlfVar4.m();
                                    hlfVar4.b();
                                }
                            } finally {
                            }
                        } finally {
                            c2.r();
                        }
                    }
                    hfmVar.b.m(hfmVar2.f);
                }
            }
            return hjqVar.d(i2);
        }
        if (hjqVar.B(i2)) {
            return 1;
        }
        return hjqVar.d(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[LOOP:1: B:18:0x007e->B:19:0x0080, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.hhn ap(defpackage.hfm r13, int r14) {
        /*
            hjq r0 = r13.s
            int r0 = r0.b(r14)
            hjq r1 = r13.s
            java.lang.Object r1 = r1.m(r14)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r3 = 0
            if (r0 != r2) goto La3
            boolean r0 = r1 instanceof defpackage.hhk
            if (r0 == 0) goto La3
            hjq r0 = r13.s
            boolean r0 = r0.w(r14)
            if (r0 == 0) goto L2f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ay(r13, r0, r14)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2d
            goto L2f
        L2d:
            r12 = r0
            goto L30
        L2f:
            r12 = r3
        L30:
            hjq r0 = r13.s
            java.lang.Object r0 = r0.m(r14)
            r0.getClass()
            r5 = r0
            hhk r5 = (defpackage.hhk) r5
            hjq r0 = r13.s
            r1 = 0
            java.lang.Object r6 = r0.l(r14, r1)
            hjq r0 = r13.s
            hen r9 = r0.g(r14)
            hjq r0 = r13.s
            int r0 = r0.c(r14)
            int r0 = r0 + r14
            java.util.List r2 = r13.j
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = defpackage.hfp.c(r2, r14)
        L5b:
            int r7 = r2.size()
            if (r4 >= r7) goto L71
            java.lang.Object r7 = r2.get(r4)
            hgy r7 = (defpackage.hgy) r7
            int r8 = r7.b
            if (r8 >= r0) goto L71
            r3.add(r7)
            int r4 = r4 + 1
            goto L5b
        L71:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r3.size()
            r10.<init>(r0)
            int r0 = r3.size()
        L7e:
            if (r1 >= r0) goto L95
            java.lang.Object r2 = r3.get(r1)
            hgy r2 = (defpackage.hgy) r2
            hio r4 = r2.a
            java.lang.Object r2 = r2.c
            ffcf r7 = new ffcf
            r7.<init>(r4, r2)
            r10.add(r7)
            int r1 = r1 + 1
            goto L7e
        L95:
            hgh r7 = r13.f
            hjr r8 = r13.c
            hhn r4 = new hhn
            hqb r11 = r13.aG(r14)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfm.ap(hfm, int):hhn");
    }

    private final void aq(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        aq(this.s.e(i), i2);
        if (this.s.B(i)) {
            this.x.d(this.s.o(i));
        }
    }

    private final void ar() {
        if (this.u.t) {
            hjv d = this.t.d();
            this.u = d;
            d.K();
            this.v = false;
            this.B = null;
        }
    }

    private final void as(boolean z, hig higVar) {
        this.D.add(this.E);
        this.E = higVar;
        this.I.d(this.G);
        this.I.d(this.H);
        this.I.d(this.F);
        if (z) {
            this.F = 0;
        }
        this.G = 0;
        this.H = 0;
    }

    private final void at() {
        hjr hjrVar = new hjr();
        if (this.q) {
            hjrVar.f();
        }
        if (this.b.q()) {
            hjrVar.e();
        }
        this.t = hjrVar;
        hjv d = hjrVar.d();
        d.A(true);
        this.u = d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0054, code lost:
    
        if (defpackage.hio.p((defpackage.hgl) r13, r15) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void au() {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfm.au():void");
    }

    private final void av() {
        ax(this.s.f);
        hlf hlfVar = this.x;
        hlfVar.h();
        hlfVar.a.a.c(hmd.a);
        int i = hlfVar.e;
        hjq a = hlfVar.a();
        hlfVar.e = i + hjt.a(a.b, a.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aw(int r7, int r8, int r9) {
        /*
            r6 = this;
            hjq r0 = r6.s
            if (r7 != r8) goto L5
            goto L17
        L5:
            if (r7 == r9) goto L55
            if (r8 == r9) goto L55
            int r1 = r0.e(r7)
            if (r1 != r8) goto L11
            r9 = r8
            goto L55
        L11:
            int r1 = r0.e(r8)
            if (r1 != r7) goto L19
        L17:
            r9 = r7
            goto L55
        L19:
            int r1 = r0.e(r7)
            int r2 = r0.e(r8)
            if (r1 != r2) goto L28
            int r9 = r0.e(r7)
            goto L55
        L28:
            int r1 = defpackage.hfp.b(r0, r7, r9)
            int r9 = defpackage.hfp.b(r0, r8, r9)
            int r2 = r1 - r9
            r3 = 0
            r5 = r7
            r4 = r3
        L35:
            if (r4 >= r2) goto L3e
            int r5 = r0.e(r5)
            int r4 = r4 + 1
            goto L35
        L3e:
            int r9 = r9 - r1
            r1 = r8
        L40:
            if (r3 >= r9) goto L49
            int r1 = r0.e(r1)
            int r3 = r3 + 1
            goto L40
        L49:
            if (r5 == r1) goto L54
            int r5 = r0.e(r5)
            int r1 = r0.e(r1)
            goto L49
        L54:
            r9 = r5
        L55:
            if (r7 <= 0) goto L69
            if (r7 == r9) goto L69
            boolean r1 = r0.B(r7)
            if (r1 == 0) goto L64
            hlf r1 = r6.x
            r1.f()
        L64:
            int r7 = r0.e(r7)
            goto L55
        L69:
            r6.aq(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfm.aw(int, int, int):void");
    }

    private final void ax(int i) {
        boolean B = this.s.B(i);
        if (B) {
            this.x.i();
            this.x.d(this.s.o(i));
        }
        ao(this, i, i, B, 0);
        this.x.i();
        if (B) {
            this.x.f();
        }
    }

    private static final void ay(hfm hfmVar, List list, int i) {
        int c = hfmVar.s.c(i) + i;
        int i2 = i + 1;
        while (i2 < c) {
            if (hfmVar.s.y(i2)) {
                hhn ap = ap(hfmVar, i2);
                if (ap != null) {
                    list.add(ap);
                }
            } else if (hfmVar.s.w(i2)) {
                ay(hfmVar, list, i2);
            }
            i2 += hfmVar.s.c(i2);
        }
    }

    private final void az() {
        hjq hjqVar = this.s;
        int i = hjqVar.h;
        this.G = i >= 0 ? hjqVar.b[(i * 5) + 1] & 67108863 : 0;
        hjqVar.u();
    }

    @Override // defpackage.hfd
    public final boolean A(float f) {
        Object Q = Q();
        if ((Q instanceof Float) && f == ((Number) Q).floatValue()) {
            return false;
        }
        ag(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.hfd
    public final boolean B(int i) {
        Object Q = Q();
        if ((Q instanceof Integer) && i == ((Number) Q).intValue()) {
            return false;
        }
        ag(Integer.valueOf(i));
        return true;
    }

    @Override // defpackage.hfd
    public final boolean C(long j) {
        Object Q = Q();
        if ((Q instanceof Long) && j == ((Number) Q).longValue()) {
            return false;
        }
        ag(Long.valueOf(j));
        return true;
    }

    @Override // defpackage.hfd
    public final boolean D(Object obj) {
        if (ffkj.e(Q(), obj)) {
            return false;
        }
        ag(obj);
        return true;
    }

    @Override // defpackage.hfd
    public final boolean E(boolean z) {
        Object Q = Q();
        if ((Q instanceof Boolean) && z == ((Boolean) Q).booleanValue()) {
            return false;
        }
        ag(Boolean.valueOf(z));
        return true;
    }

    @Override // defpackage.hfd
    public final boolean F(Object obj) {
        if (Q() == obj) {
            return false;
        }
        ag(obj);
        return true;
    }

    @Override // defpackage.hfd
    public final boolean G() {
        if (!I() || this.l) {
            return true;
        }
        hio O = O();
        return (O == null || (O.a & 4) == 0) ? false : true;
    }

    @Override // defpackage.hfd
    public final boolean H() {
        return this.z;
    }

    @Override // defpackage.hfd
    public final boolean I() {
        hio O;
        return (this.z || this.n || this.l || (O = O()) == null || (O.a & 8) != 0) ? false : true;
    }

    @Override // defpackage.hfd
    public final boolean J(boolean z, int i) {
        return (i == 0 && (this.z || this.n)) || z || !I();
    }

    @Override // defpackage.hfd
    public final void K(Object obj) {
        if (!this.z && this.s.a() == 207 && !ffkj.e(this.s.h(), obj) && this.o < 0) {
            this.o = this.s.f;
            this.n = true;
        }
        ab(207, null, 0, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // defpackage.hfd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hio L() {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfm.L():hio");
    }

    public final int N(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.g;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.s.d(i) : i2;
        }
        cnu cnuVar = this.J;
        if (cnuVar == null || cnuVar.a(i) < 0) {
            return 0;
        }
        int a = cnuVar.a(i);
        if (a < 0) {
            cpx.d(a.h(i, "Cannot find value for key "));
        }
        return cnuVar.c[a];
    }

    public final hio O() {
        if (this.p != 0) {
            return null;
        }
        ArrayList arrayList = this.N;
        if (hkw.b(arrayList)) {
            return (hio) arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public final hua P() {
        if (this.q) {
            return this.Q;
        }
        return null;
    }

    public final Object Q() {
        if (this.z) {
            aF();
            return hfc.a;
        }
        Object n = this.s.n();
        return (!this.n || (n instanceof hfe)) ? n : hfc.a;
    }

    public final Object R() {
        if (this.z) {
            aF();
            return hfc.a;
        }
        Object n = this.s.n();
        return (!this.n || (n instanceof hfe)) ? n instanceof hjl ? ((hjl) n).a : n : hfc.a;
    }

    public final List S() {
        hfr hfrVar = this.b;
        hfq b = hfrVar.b();
        if (true != (b instanceof hfu)) {
            b = null;
        }
        if (b == null) {
            return ffel.a;
        }
        hfu hfuVar = (hfu) b;
        hjq c = hfuVar.e.c();
        try {
            Integer a = htu.a(c, hfrVar, 0, c.c);
            if (a == null) {
                return ffel.a;
            }
            try {
                return htu.b(hfuVar.e.c(), a.intValue(), 0);
            } finally {
            }
        } finally {
        }
    }

    public final void T() {
        U();
        this.D.clear();
        this.I.c();
        this.K.c();
        this.m.c();
        this.k = null;
        hlg hlgVar = this.P;
        hlgVar.b.a();
        hlgVar.a.a();
        this.A = 0;
        this.p = 0;
        this.i = false;
        this.z = false;
        this.n = false;
        this.r = false;
        this.o = -1;
        hjq hjqVar = this.s;
        if (!hjqVar.e) {
            hjqVar.r();
        }
        if (this.u.t) {
            return;
        }
        at();
    }

    public final void U() {
        this.E = null;
        this.F = 0;
        this.G = 0;
        this.A = 0;
        this.i = false;
        hlf hlfVar = this.x;
        hlfVar.b = false;
        hlfVar.c.c();
        hlfVar.e = 0;
        this.N.clear();
        this.g = null;
        this.J = null;
    }

    public final void V() {
        if (!this.u.t) {
            hfp.j("Check failed");
        }
        at();
    }

    public final void W() {
        this.N.clear();
        this.j.clear();
        this.d.a();
        this.k = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r3 != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(defpackage.cop r12, defpackage.ffjm r13) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfm.X(cop, ffjm):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final void Y(boolean z) {
        int hashCode;
        int i;
        int rotateRight;
        int i2;
        boolean z2;
        ?? r8;
        int i3;
        List list;
        List list2;
        HashSet hashSet;
        LinkedHashSet linkedHashSet;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        Object[] objArr;
        long j2;
        Object[] objArr2;
        int i8;
        int hashCode2;
        int i9;
        int rotateRight2;
        int i10 = -1;
        int i11 = this.I.a[r1.b - 2] - 1;
        int i12 = 207;
        if (this.z) {
            hjv hjvVar = this.u;
            int i13 = hjvVar.s;
            int i14 = hjvVar.i(i13);
            Object v = this.u.v(i13);
            Object u = this.u.u(i13);
            if (v == null) {
                if (u == null || i14 != 207) {
                    i12 = i14;
                } else if (!ffkj.e(u, hfc.a)) {
                    rotateRight2 = Integer.rotateRight(i11 ^ this.A, 3) ^ u.hashCode();
                }
                rotateRight2 = Integer.rotateRight(i11 ^ this.A, 3) ^ i12;
            } else {
                if (v instanceof Enum) {
                    hashCode2 = ((Enum) v).ordinal();
                    i9 = this.A;
                } else {
                    hashCode2 = v.hashCode();
                    i9 = this.A;
                }
                rotateRight2 = hashCode2 ^ Integer.rotateRight(i9, 3);
            }
            this.A = Integer.rotateRight(rotateRight2, 3);
        } else {
            hjq hjqVar = this.s;
            int i15 = hjqVar.h;
            int b = hjqVar.b(i15);
            Object m = this.s.m(i15);
            Object j3 = this.s.j(i15);
            if (m == null) {
                if (j3 == null || b != 207) {
                    i12 = b;
                } else if (!ffkj.e(j3, hfc.a)) {
                    rotateRight = Integer.rotateRight(i11 ^ this.A, 3) ^ j3.hashCode();
                }
                rotateRight = Integer.rotateRight(i11 ^ this.A, 3) ^ i12;
            } else {
                if (m instanceof Enum) {
                    hashCode = ((Enum) m).ordinal();
                    i = this.A;
                } else {
                    hashCode = m.hashCode();
                    i = this.A;
                }
                rotateRight = hashCode ^ Integer.rotateRight(i, 3);
            }
            this.A = Integer.rotateRight(rotateRight, 3);
        }
        int i16 = this.G;
        hig higVar = this.E;
        if (higVar == null || higVar.a.size() <= 0) {
            i2 = -1;
        } else {
            List list3 = higVar.a;
            List list4 = higVar.d;
            HashSet hashSet2 = new HashSet(list4.size());
            int size = list4.size();
            for (int i17 = 0; i17 < size; i17++) {
                hashSet2.add(list4.get(i17));
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            int size2 = list4.size();
            int size3 = list3.size();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i18 < size3) {
                hha hhaVar = (hha) list3.get(i18);
                if (hashSet2.contains(hhaVar)) {
                    i3 = i10;
                    if (linkedHashSet2.contains(hhaVar)) {
                        i18++;
                    } else if (i19 < size2) {
                        hha hhaVar2 = (hha) list4.get(i19);
                        if (hhaVar2 != hhaVar) {
                            int a = higVar.a(hhaVar2);
                            linkedHashSet2.add(hhaVar2);
                            if (a != i20) {
                                int b2 = higVar.b(hhaVar2);
                                hlf hlfVar = this.x;
                                list = list3;
                                int i21 = higVar.b;
                                if (b2 > 0) {
                                    int i22 = i20 + i21;
                                    list2 = list4;
                                    int i23 = a + i21;
                                    hashSet = hashSet2;
                                    int i24 = hlfVar.h;
                                    if (i24 > 0) {
                                        linkedHashSet = linkedHashSet2;
                                        if (hlfVar.f == i23 - i24 && hlfVar.g == i22 - i24) {
                                            hlfVar.h = i24 + b2;
                                        }
                                    } else {
                                        linkedHashSet = linkedHashSet2;
                                    }
                                    hlfVar.i();
                                    hlfVar.f = i23;
                                    hlfVar.g = i22;
                                    hlfVar.h = b2;
                                } else {
                                    list2 = list4;
                                    hashSet = hashSet2;
                                    linkedHashSet = linkedHashSet2;
                                }
                                if (a > i20) {
                                    cnw cnwVar = higVar.e;
                                    Object[] objArr3 = cnwVar.c;
                                    long[] jArr = cnwVar.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i25 = 0;
                                        while (true) {
                                            long j4 = jArr[i25];
                                            i4 = size2;
                                            i5 = size3;
                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i26 = 8 - ((~(i25 - length)) >>> 31);
                                                int i27 = 0;
                                                while (i27 < i26) {
                                                    if ((j4 & 255) < 128) {
                                                        j2 = j4;
                                                        hgu hguVar = (hgu) objArr3[(i25 << 3) + i27];
                                                        int i28 = hguVar.b;
                                                        objArr2 = objArr3;
                                                        if (a <= i28 && i28 < a + b2) {
                                                            i8 = (i28 - a) + i20;
                                                        } else if (i20 <= i28 && i28 < a) {
                                                            i8 = i28 + b2;
                                                        }
                                                        hguVar.b = i8;
                                                    } else {
                                                        j2 = j4;
                                                        objArr2 = objArr3;
                                                    }
                                                    j4 = j2 >> 8;
                                                    i27++;
                                                    objArr3 = objArr2;
                                                }
                                                objArr = objArr3;
                                                if (i26 != 8) {
                                                    break;
                                                }
                                            } else {
                                                objArr = objArr3;
                                            }
                                            if (i25 == length) {
                                                break;
                                            }
                                            i25++;
                                            size2 = i4;
                                            size3 = i5;
                                            objArr3 = objArr;
                                        }
                                    }
                                } else {
                                    i4 = size2;
                                    i5 = size3;
                                    if (i20 > a) {
                                        cnw cnwVar2 = higVar.e;
                                        Object[] objArr4 = cnwVar2.c;
                                        long[] jArr2 = cnwVar2.a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i29 = 0;
                                            while (true) {
                                                long j5 = jArr2[i29];
                                                long[] jArr3 = jArr2;
                                                Object[] objArr5 = objArr4;
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                                    int i31 = 0;
                                                    while (i31 < i30) {
                                                        if ((j5 & 255) < 128) {
                                                            i6 = i31;
                                                            hgu hguVar2 = (hgu) objArr5[(i29 << 3) + i31];
                                                            j = j5;
                                                            int i32 = hguVar2.b;
                                                            if (a <= i32 && i32 < a + b2) {
                                                                i7 = (i32 - a) + i20;
                                                            } else if (a + 1 <= i32 && i32 < i20) {
                                                                i7 = i32 - b2;
                                                            }
                                                            hguVar2.b = i7;
                                                        } else {
                                                            i6 = i31;
                                                            j = j5;
                                                        }
                                                        j5 = j >> 8;
                                                        i31 = i6 + 1;
                                                    }
                                                    if (i30 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i29 == length2) {
                                                    break;
                                                }
                                                i29++;
                                                objArr4 = objArr5;
                                                jArr2 = jArr3;
                                            }
                                        }
                                    }
                                }
                            } else {
                                list = list3;
                                list2 = list4;
                                hashSet = hashSet2;
                                linkedHashSet = linkedHashSet2;
                            }
                            i4 = size2;
                            i5 = size3;
                        } else {
                            list = list3;
                            list2 = list4;
                            hashSet = hashSet2;
                            linkedHashSet = linkedHashSet2;
                            i4 = size2;
                            i5 = size3;
                            i18++;
                        }
                        i19++;
                        i20 += higVar.b(hhaVar2);
                        i10 = i3;
                        list3 = list;
                        hashSet2 = hashSet;
                        list4 = list2;
                        linkedHashSet2 = linkedHashSet;
                        size2 = i4;
                        size3 = i5;
                    }
                } else {
                    i18++;
                    i3 = i10;
                    this.x.l(higVar.a(hhaVar) + higVar.b, hhaVar.d);
                    higVar.d(hhaVar.c, 0);
                    this.x.e(hhaVar.c);
                    this.s.t(hhaVar.c);
                    av();
                    this.s.f();
                    List list5 = this.j;
                    int i33 = hhaVar.c;
                    hfp.m(list5, i33, this.s.c(i33) + i33);
                }
                i10 = i3;
            }
            i2 = i10;
            this.x.i();
            if (list3.size() > 0) {
                this.x.e(this.s.g);
                this.s.u();
            }
        }
        boolean z3 = this.z;
        if (!z3) {
            hjq hjqVar2 = this.s;
            int i34 = hjqVar2.k - hjqVar2.j;
            if (i34 > 0) {
                hlf hlfVar2 = this.x;
                hlfVar2.h();
                hmx hmxVar = hlfVar2.a.a;
                hmxVar.c(hmj.a);
                hmxVar.c[hmxVar.d - hmxVar.a[hmxVar.b - 1].b] = i34;
            }
        }
        int i35 = this.F;
        while (!this.s.A()) {
            int i36 = this.s.f;
            av();
            this.x.l(i35, this.s.f());
            hfp.m(this.j, i36, this.s.f);
        }
        if (z3) {
            if (z) {
                hlg hlgVar = this.P;
                if (!hlgVar.b.e()) {
                    hfp.j("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                hmx hmxVar2 = hlgVar.b;
                hmx hmxVar3 = hlgVar.a;
                hmq[] hmqVarArr = hmxVar2.a;
                int i37 = hmxVar2.b - 1;
                hmxVar2.b = i37;
                hmq hmqVar = hmqVarArr[i37];
                hmqVarArr[i37] = null;
                hmxVar3.c(hmqVar);
                Object[] objArr6 = hmxVar2.e;
                Object[] objArr7 = hmxVar3.e;
                int i38 = hmxVar3.f;
                int i39 = hmqVar.c;
                int i40 = i38 - i39;
                int i41 = hmxVar2.f;
                int i42 = i41 - i39;
                System.arraycopy(objArr6, i42, objArr7, i40, i41 - i42);
                Object[] objArr8 = hmxVar2.e;
                int i43 = hmxVar2.f;
                ffdo.d(objArr8, null, i43 - hmqVar.c, i43);
                int[] iArr = hmxVar2.c;
                int[] iArr2 = hmxVar3.c;
                int i44 = hmxVar3.d;
                int i45 = hmqVar.b;
                int i46 = hmxVar2.d;
                ffdo.l(iArr, iArr2, i44 - i45, i46 - i45, i46);
                hmxVar2.f -= hmqVar.c;
                hmxVar2.d -= hmqVar.b;
                i16 = 1;
            }
            if (this.s.i <= 0) {
                hih.a("Unbalanced begin/end empty");
            }
            r4.i--;
            hjv hjvVar2 = this.u;
            int i47 = hjvVar2.s;
            hjvVar2.X();
            if (!this.s.x()) {
                int aH = aH(i47);
                this.u.B();
                this.u.A(true);
                hen henVar = this.O;
                hlg hlgVar2 = this.P;
                if (hlgVar2.a.d()) {
                    hlf hlfVar3 = this.x;
                    hjr hjrVar = this.t;
                    hlfVar3.g();
                    hlfVar3.h();
                    hlfVar3.i();
                    hmx hmxVar4 = hlfVar3.a.a;
                    hmxVar4.c(hlw.a);
                    r8 = 0;
                    hmw.b(hmxVar4, 0, henVar, 1, hjrVar);
                } else {
                    hlf hlfVar4 = this.x;
                    hjr hjrVar2 = this.t;
                    hlfVar4.g();
                    hlfVar4.h();
                    hlfVar4.i();
                    hmx hmxVar5 = hlfVar4.a.a;
                    hmxVar5.c(hlx.a);
                    hmw.c(hmxVar5, henVar, hjrVar2, hlgVar2);
                    this.P = new hlg();
                    r8 = 0;
                }
                this.z = r8;
                if (this.c.b != 0) {
                    af(aH, r8);
                    aC(aH, i16);
                }
            }
        } else {
            if (z) {
                this.x.f();
                z2 = true;
            } else {
                z2 = false;
            }
            hlf hlfVar5 = this.x;
            int i48 = hlfVar5.a().h;
            int i49 = i2;
            if (hlfVar5.c.a(i49) > i48) {
                hfp.j("Missed recording an endGroup");
            }
            if (hlfVar5.c.a(i49) == i48) {
                hlfVar5.j(false);
                hlfVar5.c.b();
                hlfVar5.a.c();
            }
            int i50 = this.s.h;
            if (i16 != N(i50)) {
                aC(i50, i16);
            }
            if (true == z2) {
                i16 = 1;
            }
            this.s.s();
            this.x.i();
        }
        hig higVar2 = (hig) hkw.a(this.D);
        if (higVar2 != null && !z3) {
            higVar2.c++;
        }
        this.E = higVar2;
        this.F = this.I.b() + i16;
        this.H = this.I.b();
        this.G = this.I.b() + i16;
    }

    public final void Z() {
        Y(false);
    }

    @Override // defpackage.hfd
    public final int a() {
        return this.A;
    }

    public final void aa() {
        this.G += this.s.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ab(int r26, java.lang.Object r27, int r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfm.ab(int, java.lang.Object, int, java.lang.Object):void");
    }

    public final void ac(int i, Object obj) {
        ab(i, obj, 0, null);
    }

    public final void ad(Object obj) {
        int i;
        hjq hjqVar;
        int i2;
        hjv hjvVar;
        if (obj instanceof hjk) {
            hjk hjkVar = (hjk) obj;
            hen henVar = null;
            if (this.z) {
                hjv hjvVar2 = this.u;
                int i3 = hjvVar2.q;
                if (i3 > hjvVar2.s + 1) {
                    int i4 = i3 - 1;
                    int l = hjvVar2.l(i4);
                    while (true) {
                        i2 = i4;
                        i4 = l;
                        hjvVar = this.u;
                        if (i4 == hjvVar.s || i4 < 0) {
                            break;
                        } else {
                            l = hjvVar.l(i4);
                        }
                    }
                    henVar = hjvVar.r(i2);
                }
            } else {
                hjq hjqVar2 = this.s;
                int i5 = hjqVar2.f;
                if (i5 > hjqVar2.h + 1) {
                    int i6 = i5 - 1;
                    int e = hjqVar2.e(i6);
                    while (true) {
                        i = i6;
                        i6 = e;
                        hjqVar = this.s;
                        if (i6 == hjqVar.h || i6 < 0) {
                            break;
                        } else {
                            e = hjqVar.e(i6);
                        }
                    }
                    henVar = hjqVar.g(i);
                }
            }
            hjl hjlVar = new hjl(hjkVar, henVar);
            if (this.z) {
                hmx hmxVar = this.x.a.a;
                hmxVar.c(hmc.a);
                hmw.a(hmxVar, 0, hjlVar);
            }
            this.C.add(obj);
            obj = hjlVar;
        }
        ag(obj);
    }

    public final void ae(cop copVar) {
        int i;
        Object[] objArr = copVar.b;
        Object[] objArr2 = copVar.c;
        long[] jArr = copVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            obj.getClass();
                            hio hioVar = (hio) obj;
                            hen henVar = hioVar.c;
                            if (henVar != null) {
                                List list = this.j;
                                int i6 = henVar.a;
                                if (obj2 == hjp.a) {
                                    obj2 = null;
                                }
                                list.add(new hgy(hioVar, i6, obj2));
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ffdx.q(this.j, hfp.f);
    }

    public final void af(int i, int i2) {
        if (N(i) != i2) {
            if (i < 0) {
                cnu cnuVar = this.J;
                if (cnuVar == null) {
                    cnuVar = new cnu(null);
                    this.J = cnuVar;
                }
                cnuVar.d(i, i2);
                return;
            }
            int[] iArr = this.g;
            if (iArr == null) {
                iArr = new int[this.s.c];
                Arrays.fill(iArr, 0, iArr.length, -1);
                this.g = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final void ag(Object obj) {
        if (this.z) {
            this.u.aa(obj);
            return;
        }
        hjq hjqVar = this.s;
        if (!hjqVar.l) {
            hlf hlfVar = this.x;
            hen g = hjqVar.g(hjqVar.h);
            hmx hmxVar = hlfVar.a.a;
            hmxVar.c(hli.a);
            hmw.b(hmxVar, 0, g, 1, obj);
            return;
        }
        int e = hjqVar.j - hjt.e(hjqVar.b, hjqVar.h);
        hlf hlfVar2 = this.x;
        int i = e - 1;
        if (hlfVar2.a().h - hlfVar2.e >= 0) {
            hlf hlfVar3 = this.x;
            hlfVar3.j(true);
            hmx hmxVar2 = hlfVar3.a.a;
            hmxVar2.c(hmn.a);
            hmw.a(hmxVar2, 0, obj);
            hmxVar2.c[hmxVar2.d - hmxVar2.a[hmxVar2.b - 1].b] = i;
            return;
        }
        hlf hlfVar4 = this.x;
        hjq hjqVar2 = this.s;
        hen g2 = hjqVar2.g(hjqVar2.h);
        hmx hmxVar3 = hlfVar4.a.a;
        hmxVar3.c(hmk.a);
        hmw.b(hmxVar3, 0, obj, 1, g2);
        hmxVar3.c[hmxVar3.d - hmxVar3.a[hmxVar3.b - 1].b] = i;
    }

    public final boolean ah(hio hioVar, Object obj) {
        hen henVar = hioVar.c;
        if (henVar == null) {
            return false;
        }
        int a = this.s.a.a(henVar);
        if (!this.r || a < this.s.f) {
            return false;
        }
        List list = this.j;
        int d = hfp.d(list, a);
        if (d < 0) {
            int i = d + 1;
            if (true != (obj instanceof hgl)) {
                obj = null;
            }
            list.add(-i, new hgy(hioVar, a, obj));
        } else {
            hgy hgyVar = (hgy) list.get(d);
            if (obj instanceof hgl) {
                Object obj2 = hgyVar.c;
                if (obj2 == null) {
                    hgyVar.c = obj;
                } else if (obj2 instanceof coq) {
                    ((coq) obj2).g(obj);
                } else {
                    int i2 = cpj.a;
                    coq coqVar = new coq(2);
                    coqVar.e(obj2);
                    coqVar.e(obj);
                    hgyVar.c = coqVar;
                }
            } else {
                hgyVar.c = null;
            }
        }
        return true;
    }

    public final hqb ai() {
        hqb hqbVar = this.B;
        return hqbVar != null ? hqbVar : aG(this.s.h);
    }

    public final hqb aj(hqb hqbVar, hqb hqbVar2) {
        hqa hqaVar = new hqa(hqbVar);
        hqaVar.putAll(hqbVar2);
        hqb a = hqaVar.a();
        ac(204, hfp.d);
        aD(a);
        aD(hqbVar2);
        Z();
        return a;
    }

    public final void ak(hqb hqbVar) {
        cnw cnwVar = this.k;
        if (cnwVar == null) {
            cnwVar = new cnw((byte[]) null);
            this.k = cnwVar;
        }
        cnwVar.f(this.s.f, hqbVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r10 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void am(defpackage.hgh r9, defpackage.hgh r10, java.lang.Integer r11, java.util.List r12, defpackage.ffix r13) {
        /*
            r8 = this;
            boolean r0 = r8.r
            int r1 = r8.F
            r2 = 1
            r8.r = r2     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r8.F = r2     // Catch: java.lang.Throwable -> L71
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L71
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2a
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L71
            ffcf r6 = (defpackage.ffcf) r6     // Catch: java.lang.Throwable -> L71
            java.lang.Object r7 = r6.a     // Catch: java.lang.Throwable -> L71
            hio r7 = (defpackage.hio) r7     // Catch: java.lang.Throwable -> L71
            java.lang.Object r6 = r6.b     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L24
            r8.ah(r7, r6)     // Catch: java.lang.Throwable -> L71
            goto L27
        L24:
            r8.ah(r7, r5)     // Catch: java.lang.Throwable -> L71
        L27:
            int r4 = r4 + 1
            goto Lf
        L2a:
            if (r9 == 0) goto L69
            if (r11 == 0) goto L33
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L71
            goto L34
        L33:
            r11 = -1
        L34:
            if (r10 == 0) goto L63
            boolean r12 = defpackage.ffkj.e(r10, r9)     // Catch: java.lang.Throwable -> L71
            if (r12 != 0) goto L63
            if (r11 < 0) goto L63
            hfu r10 = (defpackage.hfu) r10     // Catch: java.lang.Throwable -> L71
            r12 = r9
            hfu r12 = (defpackage.hfu) r12     // Catch: java.lang.Throwable -> L71
            r12.k = r10     // Catch: java.lang.Throwable -> L71
            r10 = r9
            hfu r10 = (defpackage.hfu) r10     // Catch: java.lang.Throwable -> L71
            r10.l = r11     // Catch: java.lang.Throwable -> L71
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L58
            r11 = r9
            hfu r11 = (defpackage.hfu) r11     // Catch: java.lang.Throwable -> L71
            r11.k = r5     // Catch: java.lang.Throwable -> L71
            hfu r9 = (defpackage.hfu) r9     // Catch: java.lang.Throwable -> L71
            r9.l = r2     // Catch: java.lang.Throwable -> L71
            goto L67
        L58:
            r10 = move-exception
            r11 = r9
            hfu r11 = (defpackage.hfu) r11     // Catch: java.lang.Throwable -> L71
            r11.k = r5     // Catch: java.lang.Throwable -> L71
            hfu r9 = (defpackage.hfu) r9     // Catch: java.lang.Throwable -> L71
            r9.l = r2     // Catch: java.lang.Throwable -> L71
            throw r10     // Catch: java.lang.Throwable -> L71
        L63:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L71
        L67:
            if (r10 != 0) goto L6c
        L69:
            r13.invoke()     // Catch: java.lang.Throwable -> L71
        L6c:
            r8.r = r0
            r8.F = r1
            return
        L71:
            r9 = move-exception
            r8.r = r0
            r8.F = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfm.am(hgh, hgh, java.lang.Integer, java.util.List, ffix):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Type inference failed for: r0v5, types: [hgh, hiq] */
    /* JADX WARN: Type inference failed for: r5v16, types: [hgh, hiq] */
    @Override // defpackage.hfd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hfd b(int r5) {
        /*
            r4 = this;
            r4.v(r5)
            boolean r5 = r4.z
            if (r5 == 0) goto L1c
            hgh r5 = r4.f
            hio r0 = new hio
            r0.<init>(r5)
            java.util.ArrayList r5 = r4.N
            r5.add(r0)
            r4.ag(r0)
            int r5 = r4.L
            r0.h(r5)
            return r4
        L1c:
            java.util.List r5 = r4.j
            hjq r0 = r4.s
            int r0 = r0.h
            hgy r5 = defpackage.hfp.f(r5, r0)
            hjq r0 = r4.s
            java.lang.Object r0 = r0.n()
            java.lang.Object r1 = defpackage.hfc.a
            boolean r1 = defpackage.ffkj.e(r0, r1)
            if (r1 == 0) goto L3f
            hgh r0 = r4.f
            hio r1 = new hio
            r1.<init>(r0)
            r4.ag(r1)
            goto L45
        L3f:
            r0.getClass()
            r1 = r0
            hio r1 = (defpackage.hio) r1
        L45:
            r0 = 0
            r2 = 1
            if (r5 != 0) goto L56
            int r5 = r1.a
            r3 = r5 & 64
            if (r3 == 0) goto L54
            r5 = r5 & (-65)
            r1.a = r5
            goto L56
        L54:
            r5 = r0
            goto L57
        L56:
            r5 = r2
        L57:
            r1.d(r5)
            java.util.ArrayList r5 = r4.N
            r5.add(r1)
            int r5 = r4.L
            r1.h(r5)
            int r5 = r1.a
            r3 = r5 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L7f
            r5 = r5 & (-257(0xfffffffffffffeff, float:NaN))
            r1.a = r5
            r1.f(r2)
            hlf r5 = r4.x
            hle r5 = r5.a
            hmx r5 = r5.a
            hmi r2 = defpackage.hmi.a
            r5.c(r2)
            defpackage.hmw.a(r5, r0, r1)
        L7f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfm.b(int):hfd");
    }

    @Override // defpackage.hfd
    public final hgb c() {
        return ai();
    }

    @Override // defpackage.hfd
    public final htx d() {
        htx htxVar = this.R;
        if (htxVar != null) {
            return htxVar;
        }
        hft hftVar = new hft(this.f);
        this.R = hftVar;
        return hftVar;
    }

    @Override // defpackage.hfd
    public final Object e(hfw hfwVar) {
        return hgc.b(ai(), hfwVar);
    }

    @Override // defpackage.hfd
    public final Object f() {
        return R();
    }

    @Override // defpackage.hfd
    public final ffhd g() {
        return this.y;
    }

    @Override // defpackage.hfd
    public final void h(Object obj, ffjm ffjmVar) {
        if (this.z) {
            hmx hmxVar = this.P.a;
            hmxVar.c(hmm.a);
            hmw.a(hmxVar, 0, obj);
            ffjmVar.getClass();
            fflf.e(ffjmVar, 2);
            hmw.a(hmxVar, 1, ffjmVar);
            return;
        }
        hlf hlfVar = this.x;
        hlfVar.g();
        hmx hmxVar2 = hlfVar.a.a;
        hmxVar2.c(hmm.a);
        ffjmVar.getClass();
        fflf.e(ffjmVar, 2);
        hmw.b(hmxVar2, 0, obj, 1, ffjmVar);
    }

    @Override // defpackage.hfd
    public final void i() {
        this.h = true;
        this.q = true;
        this.c.f();
        this.t.f();
        hjv hjvVar = this.u;
        hjr hjrVar = hjvVar.a;
        hjvVar.e = hjrVar.i;
        hjvVar.f = hjrVar.j;
    }

    @Override // defpackage.hfd
    public final void j(ffix ffixVar) {
        aE();
        if (!this.z) {
            hfp.j("createNode() can only be called when inserting");
        }
        int i = this.I.a[r0.b - 1];
        hjv hjvVar = this.u;
        hen r = hjvVar.r(hjvVar.s);
        this.G++;
        hlg hlgVar = this.P;
        hmx hmxVar = hlgVar.a;
        hmxVar.c(hlv.a);
        hmw.a(hmxVar, 0, ffixVar);
        hmxVar.c[hmxVar.d - hmxVar.a[hmxVar.b - 1].b] = i;
        hmw.a(hmxVar, 1, r);
        hmx hmxVar2 = hlgVar.b;
        hmxVar2.c(hma.a);
        hmxVar2.c[hmxVar2.d - hmxVar2.a[hmxVar2.b - 1].b] = i;
        hmw.a(hmxVar2, 0, r);
    }

    @Override // defpackage.hfd
    public final void k(boolean z) {
        if (this.G != 0) {
            hfp.j("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.z) {
            return;
        }
        if (!z) {
            az();
            return;
        }
        hjq hjqVar = this.s;
        int i = hjqVar.f;
        int i2 = hjqVar.g;
        hlf hlfVar = this.x;
        hlfVar.j(false);
        hlfVar.a.a.c(hlm.a);
        hfp.m(this.j, i, i2);
        this.s.u();
    }

    @Override // defpackage.hfd
    public final void l() {
        Z();
        hio O = O();
        if (O == null || !O.k()) {
            return;
        }
        O.a |= 2;
    }

    @Override // defpackage.hfd
    public final void m() {
        Z();
    }

    @Override // defpackage.hfd
    public final void n() {
        Y(true);
    }

    @Override // defpackage.hfd
    public final void o() {
        Z();
    }

    @Override // defpackage.hfd
    public final void p() {
        Z();
    }

    @Override // defpackage.hfd
    public final void q() {
        if (this.n && this.s.h == this.o) {
            this.o = -1;
            this.n = false;
        }
        Y(false);
    }

    @Override // defpackage.hfd
    public final void r(ffix ffixVar) {
        hmx hmxVar = this.x.a.a;
        hmxVar.c(hmg.a);
        hmw.a(hmxVar, 0, ffixVar);
    }

    @Override // defpackage.hfd
    public final void s() {
        if (this.G != 0) {
            hfp.j("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.z) {
            return;
        }
        hio O = O();
        if (O != null && !O.i()) {
            O.g(true);
        }
        if (this.j.isEmpty()) {
            az();
        } else {
            au();
        }
    }

    @Override // defpackage.hfd
    public final void t() {
        ab(NetError.ERR_PROXY_AUTH_REQUESTED, null, 0, null);
    }

    @Override // defpackage.hfd
    public final void u(int i, Object obj) {
        ab(i, obj, 0, null);
    }

    @Override // defpackage.hfd
    public final void v(int i) {
        int i2;
        if (this.E != null) {
            ab(i, null, 0, null);
            return;
        }
        aF();
        this.A = this.H ^ Integer.rotateLeft(Integer.rotateLeft(this.A, 3) ^ i, 3);
        this.H++;
        hjq hjqVar = this.s;
        if (this.z) {
            hjqVar.q();
            this.u.N(i, hfc.a);
            as(false, null);
            return;
        }
        if (hjqVar.a() == i && ((i2 = hjqVar.f) >= hjqVar.g || (hjqVar.b[(i2 * 5) + 1] & 536870912) == 0)) {
            hjqVar.v();
            as(false, null);
            return;
        }
        if (!hjqVar.A()) {
            int i3 = this.F;
            int i4 = hjqVar.f;
            av();
            this.x.l(i3, hjqVar.f());
            hfp.m(this.j, i4, hjqVar.f);
        }
        hjqVar.q();
        this.z = true;
        this.B = null;
        ar();
        hjv hjvVar = this.u;
        hjvVar.z();
        int i5 = hjvVar.q;
        hjvVar.N(i, hfc.a);
        this.O = hjvVar.r(i5);
        as(false, null);
    }

    @Override // defpackage.hfd
    public final void w(int i) {
        ab(i, null, 0, null);
    }

    @Override // defpackage.hfd
    public final void x() {
        ab(125, null, 2, null);
        this.i = true;
    }

    @Override // defpackage.hfd
    public final void y(Object obj) {
        ad(obj);
    }

    @Override // defpackage.hfd
    public final void z() {
        aE();
        if (this.z) {
            hfp.j("useNode() called while inserting");
        }
        hjq hjqVar = this.s;
        Object o = hjqVar.o(hjqVar.h);
        this.x.d(o);
        if (this.n && (o instanceof hez)) {
            hlf hlfVar = this.x;
            hlfVar.g();
            hlfVar.a.a.c(hmp.a);
        }
    }

    @Override // defpackage.hfd
    public final void M() {
    }
}
