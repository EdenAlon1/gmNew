package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iga {
    public final igd a;
    public icv e;
    public icv f;
    public boolean g;
    public ifm h;
    public ict i;
    public int j;
    public boolean l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    private Outline s;
    private float v;
    private icr w;
    private RectF x;
    public jzn b = ifp.a;
    public kah c = kah.a;
    private ffji q = ifz.a;
    private final ffji r = new ify(this);
    public boolean d = true;
    private long t = 0;
    private long u = 9205357640488583168L;
    public final ifw k = new ifw();

    static {
        int i = igj.a;
    }

    public iga(igd igdVar) {
        this.a = igdVar;
        igdVar.x(false);
        this.m = 0L;
        this.n = 0L;
        this.o = 9205357640488583168L;
    }

    private final Outline n() {
        Outline outline = this.s;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.s = outline2;
        return outline2;
    }

    private final void o() {
        this.j--;
        e();
    }

    private final void p() {
        this.w = null;
        this.e = null;
        this.u = 9205357640488583168L;
        this.t = 0L;
        this.v = 0.0f;
        this.d = true;
        this.g = false;
    }

    public final float a() {
        return this.a.a();
    }

    public final float b() {
        return this.a.h();
    }

    public final icr c() {
        icr icpVar;
        icr icrVar = this.w;
        icv icvVar = this.e;
        if (icrVar != null) {
            return icrVar;
        }
        if (icvVar != null) {
            ico icoVar = new ico(icvVar);
            this.w = icoVar;
            return icoVar;
        }
        long d = kag.d(this.n);
        long j = this.t;
        long j2 = this.u;
        if (j2 != 9205357640488583168L) {
            d = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = intBitsToFloat + Float.intBitsToFloat((int) (d >> 32));
        float intBitsToFloat4 = intBitsToFloat2 + Float.intBitsToFloat((int) (d & 4294967295L));
        if (this.v > 0.0f) {
            icpVar = new icq(iap.b(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r1) & 4294967295L)));
        } else {
            icpVar = new icp(new iam(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.w = icpVar;
        return icpVar;
    }

    public final void d() {
        Outline n;
        if (this.d) {
            boolean z = this.p;
            Outline outline = null;
            if (z || b() > 0.0f) {
                icv icvVar = this.e;
                if (icvVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    ibc ibcVar = (ibc) icvVar;
                    ibcVar.a.computeBounds(rectF, false);
                    if (Build.VERSION.SDK_INT > 28 || icvVar.o()) {
                        n = n();
                        if (Build.VERSION.SDK_INT >= 30) {
                            n.setPath(ibcVar.a);
                        } else {
                            n.setConvexPath(ibcVar.a);
                        }
                        this.g = !n.canClip();
                    } else {
                        Outline outline2 = this.s;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        this.g = true;
                        n = null;
                    }
                    this.e = icvVar;
                    if (n != null) {
                        n.setAlpha(a());
                        outline = n;
                    }
                    this.a.z(outline, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.g && this.p) {
                        this.a.x(false);
                        this.a.q();
                    } else {
                        this.a.x(this.p);
                    }
                } else {
                    this.a.x(z);
                    Outline n2 = n();
                    long d = kag.d(this.n);
                    long j = this.t;
                    long j2 = this.u;
                    if (j2 != 9205357640488583168L) {
                        d = j2;
                    }
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    n2.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (d >> 32))), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (4294967295L & d))), this.v);
                    n2.setAlpha(a());
                    this.a.z(n2, kag.c(d));
                }
            } else {
                this.a.x(false);
                this.a.z(null, 0L);
            }
        }
        this.d = false;
    }

    public final void e() {
        int i;
        if (this.l && this.j == 0) {
            ifw ifwVar = this.k;
            iga igaVar = ifwVar.a;
            if (igaVar != null) {
                igaVar.o();
                ifwVar.a = null;
            }
            coq coqVar = ifwVar.c;
            if (coqVar != null) {
                Object[] objArr = coqVar.b;
                long[] jArr = coqVar.a;
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
                                    ((iga) objArr[(i2 << 3) + i4]).o();
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
                coqVar.a();
            }
            this.a.q();
        }
    }

    public final void f(ifr ifrVar) {
        int i;
        ifw ifwVar = this.k;
        ifwVar.b = ifwVar.a;
        coq coqVar = ifwVar.c;
        if (coqVar != null && coqVar.l()) {
            coq coqVar2 = ifwVar.d;
            if (coqVar2 == null) {
                int i2 = cpj.a;
                coqVar2 = new coq((byte[]) null);
                ifwVar.d = coqVar2;
            }
            coqVar2.c(coqVar);
            coqVar.a();
        }
        ifwVar.e = true;
        this.q.invoke(ifrVar);
        ifwVar.e = false;
        iga igaVar = ifwVar.b;
        if (igaVar != null) {
            igaVar.o();
        }
        coq coqVar3 = ifwVar.d;
        if (coqVar3 == null || !coqVar3.l()) {
            return;
        }
        Object[] objArr = coqVar3.b;
        long[] jArr = coqVar3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            ((iga) objArr[(i3 << 3) + i5]).o();
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        coqVar3.a();
    }

    public final void g(jzn jznVar, kah kahVar, long j, ffji ffjiVar) {
        if (!kaf.e(this.n, j)) {
            this.n = j;
            l(this.m, j);
            if (this.u == 9205357640488583168L) {
                this.d = true;
                d();
            }
        }
        this.b = jznVar;
        this.c = kahVar;
        this.q = ffjiVar;
        h();
    }

    public final void h() {
        this.a.s(this.b, this.c, this, this.r);
    }

    public final void i(float f) {
        igd igdVar = this.a;
        if (igdVar.a() == f) {
            return;
        }
        igdVar.t(f);
    }

    public final void j(icv icvVar) {
        p();
        this.e = icvVar;
        d();
    }

    public final void k(long j) {
        if (iak.i(this.o, j)) {
            return;
        }
        this.o = j;
        this.a.A(j);
    }

    public final void l(long j, long j2) {
        this.a.B(kaa.a(j), kaa.b(j), j2);
    }

    public final void m(long j, long j2, float f) {
        if (iak.i(this.t, j) && iar.f(this.u, j2) && this.v == f && this.e == null) {
            return;
        }
        p();
        this.t = j;
        this.u = j2;
        this.v = f;
        d();
    }
}
