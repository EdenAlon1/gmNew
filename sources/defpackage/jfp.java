package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfp implements iwu {
    private static final ffjm a = jfn.a;
    private final AndroidComposeView b;
    private ffjm c;
    private ffix d;
    private boolean e;
    private boolean g;
    private boolean h;
    private ict i;
    private final jdu m;
    private int n;
    private final jfe f = new jfe();
    private final jex j = new jex(a);
    private final ibu k = new ibu();
    private long l = idr.a;

    public jfp(AndroidComposeView androidComposeView, ffjm ffjmVar, ffix ffixVar) {
        this.b = androidComposeView;
        this.c = ffjmVar;
        this.d = ffixVar;
        jdu jfmVar = Build.VERSION.SDK_INT >= 29 ? new jfm() : new jfl(androidComposeView);
        jfmVar.M();
        jfmVar.s(false);
        this.m = jfmVar;
    }

    private final void n(boolean z) {
        if (z != this.e) {
            this.e = z;
            this.b.H(this, z);
        }
    }

    private final void o() {
        jhl.a(this.b);
    }

    @Override // defpackage.iwu
    public final long a(long j, boolean z) {
        return z ? this.j.b(this.m, j) : this.j.a(this.m, j);
    }

    @Override // defpackage.iwu
    public final void b() {
        if (this.m.K()) {
            this.m.i();
        }
        this.c = null;
        this.d = null;
        this.g = true;
        n(false);
        this.b.K();
        this.b.R(this);
    }

    @Override // defpackage.iwu
    public final void c(ibt ibtVar, iga igaVar) {
        Canvas a2 = iav.a(ibtVar);
        if (a2.isHardwareAccelerated()) {
            j();
            boolean z = this.m.b() > 0.0f;
            this.h = z;
            if (z) {
                ibtVar.i();
            }
            this.m.j(a2);
            if (this.h) {
                ibtVar.c();
                return;
            }
            return;
        }
        float e = this.m.e();
        float g = this.m.g();
        float f = this.m.f();
        float c = this.m.c();
        if (this.m.a() < 1.0f) {
            ict ictVar = this.i;
            if (ictVar == null) {
                ictVar = new iba();
                this.i = ictVar;
            }
            ictVar.i(this.m.a());
            a2.saveLayer(e, g, f, c, ((iba) ictVar).a);
        } else {
            ibtVar.l();
        }
        ibtVar.o(e, g);
        ibtVar.b(this.j.h(this.m));
        if (this.m.J() || this.m.I()) {
            this.f.c(ibtVar);
        }
        ffjm ffjmVar = this.c;
        if (ffjmVar != null) {
            ffjmVar.a(ibtVar, null);
        }
        ibtVar.j();
        n(false);
    }

    @Override // defpackage.iwu
    public final void d(float[] fArr) {
        float[] g = this.j.g(this.m);
        if (g != null) {
            icm.d(fArr, g);
        }
    }

    @Override // defpackage.iwu
    public final void e(iah iahVar, boolean z) {
        if (z) {
            this.j.e(this.m, iahVar);
        } else {
            this.j.d(this.m, iahVar);
        }
    }

    @Override // defpackage.iwu
    public final void f(long j) {
        jdu jduVar = this.m;
        int e = jduVar.e();
        int g = jduVar.g();
        int b = kaa.b(j);
        int a2 = kaa.a(j);
        if (e == a2 && g == b) {
            return;
        }
        if (e != a2) {
            this.m.l(a2 - e);
        }
        if (g != b) {
            this.m.m(b - g);
        }
        o();
        this.j.c();
    }

    @Override // defpackage.iwu
    public final void g(long j) {
        int i = (int) (j >> 32);
        this.m.x(idr.a(this.l) * i);
        int i2 = (int) (j & 4294967295L);
        this.m.y(idr.b(this.l) * i2);
        jdu jduVar = this.m;
        if (this.m.L(jduVar.e(), jduVar.g(), jduVar.e() + i, this.m.g() + i2)) {
            this.m.w(this.f.a());
            invalidate();
            this.j.c();
        }
    }

    @Override // defpackage.iwu
    public final void h(ffjm ffjmVar, ffix ffixVar) {
        this.j.f();
        n(false);
        this.g = false;
        this.h = false;
        this.l = idr.a;
        this.c = ffjmVar;
        this.d = ffixVar;
    }

    @Override // defpackage.iwu
    public final void i(float[] fArr) {
        icm.d(fArr, this.j.h(this.m));
    }

    @Override // defpackage.iwu
    public final void invalidate() {
        if (this.e || this.g) {
            return;
        }
        this.b.invalidate();
        n(true);
    }

    @Override // defpackage.iwu
    public final void j() {
        if (this.e || !this.m.K()) {
            icv icvVar = null;
            if (this.m.J()) {
                jfe jfeVar = this.f;
                if (!jfeVar.d()) {
                    icvVar = jfeVar.b();
                }
            }
            ffjm ffjmVar = this.c;
            if (ffjmVar != null) {
                this.m.n(this.k, icvVar, new jfo(ffjmVar));
            }
            n(false);
        }
    }

    @Override // defpackage.iwu
    public final void k(idd iddVar) {
        ffix ffixVar;
        int i = iddVar.a | this.n;
        int i2 = i & 4096;
        if (i2 != 0) {
            this.l = iddVar.n;
        }
        boolean z = this.m.J() && !this.f.d();
        if ((i & 1) != 0) {
            this.m.D(iddVar.b);
        }
        if ((i & 2) != 0) {
            this.m.E(iddVar.c);
        }
        if ((i & 4) != 0) {
            this.m.o(iddVar.d);
        }
        if ((i & 8) != 0) {
            this.m.G(iddVar.e);
        }
        if ((i & 16) != 0) {
            this.m.H(iddVar.f);
        }
        if ((i & 32) != 0) {
            this.m.v(iddVar.g);
        }
        if ((i & 64) != 0) {
            this.m.p(iby.b(iddVar.h));
        }
        if ((i & 128) != 0) {
            this.m.F(iby.b(iddVar.i));
        }
        if ((i & 1024) != 0) {
            this.m.C(iddVar.l);
        }
        if ((i & 256) != 0) {
            this.m.A(iddVar.j);
        }
        if ((i & 512) != 0) {
            this.m.B(iddVar.k);
        }
        if ((i & 2048) != 0) {
            this.m.r(iddVar.m);
        }
        if (i2 != 0) {
            this.m.x(idr.a(this.l) * this.m.h());
            this.m.y(idr.b(this.l) * this.m.d());
        }
        boolean z2 = iddVar.p && iddVar.o != idb.a;
        if ((i & 24576) != 0) {
            this.m.t(z2);
            this.m.s(iddVar.p && iddVar.o == idb.a);
        }
        if ((131072 & i) != 0) {
            this.m.z(iddVar.u);
        }
        if ((262144 & i) != 0) {
            jdu jduVar = this.m;
            ibx ibxVar = iddVar.v;
            jduVar.N();
        }
        if ((524288 & i) != 0) {
            this.m.q(iddVar.w);
        }
        if ((32768 & i) != 0) {
            this.m.u(iddVar.q);
        }
        boolean f = this.f.f(iddVar.x, iddVar.d, z2, iddVar.g, iddVar.r);
        jfe jfeVar = this.f;
        if (jfeVar.a) {
            this.m.w(jfeVar.a());
        }
        boolean z3 = z2 && !this.f.d();
        if (z != z3 || (z3 && f)) {
            invalidate();
        } else {
            o();
        }
        if (!this.h && this.m.b() > 0.0f && (ffixVar = this.d) != null) {
            ffixVar.invoke();
        }
        if ((i & 7963) != 0) {
            this.j.c();
        }
        this.n = iddVar.a;
    }

    @Override // defpackage.iwu
    public final boolean l(long j) {
        jdu jduVar = this.m;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (jduVar.I()) {
            return intBitsToFloat >= 0.0f && intBitsToFloat < ((float) this.m.h()) && intBitsToFloat2 >= 0.0f && intBitsToFloat2 < ((float) this.m.d());
        }
        if (this.m.J()) {
            return this.f.e(j);
        }
        return true;
    }

    @Override // defpackage.iwu
    public final float[] m() {
        return this.j.h(this.m);
    }
}
