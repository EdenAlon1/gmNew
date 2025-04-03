package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhl extends hvh implements iti, itg, ixn, iwn {
    private hkx A;
    private kaf B;
    public ffji a;
    public ffji b;
    public dio i;
    public View j;
    public jzn k;
    public ffwm n;
    public dip o;
    public float c = Float.NaN;
    public boolean d = true;
    public long e = 9205357640488583168L;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public boolean h = true;
    public final hho l = new hic(null, hhs.a);
    public long m = 9205357640488583168L;

    public dhl(ffji ffjiVar, ffji ffjiVar2, dio dioVar) {
        this.a = ffjiVar;
        this.b = ffjiVar2;
        this.i = dioVar;
    }

    private final long f() {
        if (this.A == null) {
            dhg dhgVar = new dhg(this);
            hqg hqgVar = hkg.a;
            this.A = new hgk(dhgVar, null);
        }
        hkx hkxVar = this.A;
        if (hkxVar != null) {
            return ((iak) hkxVar.a()).a;
        }
        return 9205357640488583168L;
    }

    private final void i() {
        jzn jznVar;
        dip dipVar = this.o;
        if (dipVar == null || (jznVar = this.k) == null || kaf.d(dipVar.a(), this.B)) {
            return;
        }
        ffji ffjiVar = this.b;
        if (ffjiVar != null) {
            ffjiVar.invoke(new jzv(jznVar.ep(kag.d(dipVar.a()))));
        }
        this.B = new kaf(dipVar.a());
    }

    @Override // defpackage.iwn
    public final void a() {
        iwo.a(this, new dhk(this));
    }

    public final void b() {
        dip dipVar = this.o;
        if (dipVar != null) {
            dipVar.b();
        }
        View view = this.j;
        if (view == null) {
            view = isy.a(this);
        }
        View view2 = view;
        this.j = view2;
        jzn jznVar = this.k;
        if (jznVar == null) {
            jznVar = isx.g(this);
        }
        jzn jznVar2 = jznVar;
        this.k = jznVar2;
        this.o = this.i.b(view2, this.d, this.e, this.f, this.g, this.h, jznVar2, this.c);
        i();
    }

    @Override // defpackage.ixn
    public final void dO(jkv jkvVar) {
        jkvVar.e(dhm.a, new dhh(this));
    }

    @Override // defpackage.iti
    public final void dQ(ioc iocVar) {
        this.l.b(iocVar);
    }

    @Override // defpackage.hvh
    public final void dT() {
        a();
        this.n = ffwp.a(0, 0, 7);
        ffqy.d(D(), null, ffsm.d, new dhj(this, null), 1);
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    public final void e() {
        jzn jznVar = this.k;
        if (jznVar == null) {
            jznVar = isx.g(this);
            this.k = jznVar;
        }
        long j = ((iak) this.a.invoke(jznVar)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & f()) == 9205357640488583168L) {
            this.m = 9205357640488583168L;
            dip dipVar = this.o;
            if (dipVar != null) {
                dipVar.b();
                return;
            }
            return;
        }
        this.m = iak.f(f(), j);
        if (this.o == null) {
            b();
        }
        dip dipVar2 = this.o;
        if (dipVar2 != null) {
            dipVar2.c(this.m, this.c);
        }
        i();
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean ea() {
        return false;
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        ifoVar.p();
        ffwm ffwmVar = this.n;
        if (ffwmVar != null) {
            ffwmVar.b(ffcu.a);
        }
    }

    @Override // defpackage.hvh
    public final void t() {
        dip dipVar = this.o;
        if (dipVar != null) {
            dipVar.b();
        }
        this.o = null;
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }
}
