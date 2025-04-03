package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhw extends hvh implements itu, itg, hyk {
    public int c;
    public final hho f;
    private ffud i;
    private iga j;
    private final hkx k;
    public int a = Alert.DURATION_SHOW_INDEFINITELY;
    public int b = 1200;
    public float d = 30.0f;
    private final hjz l = new hhy(0);
    private final hjz m = new hhy(0);
    public final hho e = new hic(false, hla.a);
    public final hho g = new hic(new dhn(), hla.a);
    public final cxj h = cxk.a(0.0f);

    public dhw(int i, dhx dhxVar) {
        this.c = i;
        this.f = new hic(dhxVar, hla.a);
        dhv dhvVar = new dhv(this);
        hqg hqgVar = hkg.a;
        this.k = new hgk(dhvVar, null);
    }

    public final float a() {
        float signum = Math.signum(this.d);
        int ordinal = isx.h(this).ordinal();
        int i = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new ffcd();
            }
            i = -1;
        }
        return signum * i;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        iqk e = iplVar.e(jzk.m(j, 0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13));
        this.m.i(jzl.c(j, e.a));
        this.l.i(e.a);
        ei = ipqVar.ei(i(), e.b, ffem.a, new dhq(e, this));
        return ei;
    }

    @Override // defpackage.hyk
    public final void dP(hzo hzoVar) {
        this.e.b(Boolean.valueOf(hzoVar.a()));
    }

    @Override // defpackage.hvh
    public final void dT() {
        iga igaVar = this.j;
        iaw k = isx.k(this);
        if (igaVar != null) {
            k.b(igaVar);
        }
        this.j = k.a();
        l();
    }

    @Override // defpackage.itu
    public final int e(iny inyVar, inx inxVar, int i) {
        return inxVar.a(Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.itu
    public final int f(iny inyVar, inx inxVar, int i) {
        return inxVar.b(i);
    }

    @Override // defpackage.itu
    public final int g(iny inyVar, inx inxVar, int i) {
        return inxVar.c(Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.itu
    public final int h(iny inyVar, inx inxVar, int i) {
        return 0;
    }

    public final int i() {
        return this.m.c();
    }

    public final int j() {
        return this.l.c();
    }

    public final int k() {
        return ((Number) this.k.a()).intValue();
    }

    public final void l() {
        ffud ffudVar = this.i;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        if (this.z) {
            this.i = ffqy.d(D(), null, null, new dhr(ffudVar, this, null), 3);
        }
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        float floatValue = ((Number) this.h.d()).floatValue() * a();
        boolean z = a() != 1.0f ? ((Number) this.h.d()).floatValue() < ((float) i()) : ((Number) this.h.d()).floatValue() < ((float) j());
        boolean z2 = a() != 1.0f ? ((Number) this.h.d()).floatValue() > ((float) k()) : ((Number) this.h.d()).floatValue() > ((float) ((j() + k()) - i()));
        int j = a() == 1.0f ? j() + k() : (-j()) - k();
        float intBitsToFloat = Float.intBitsToFloat((int) (ifoVar.b() & 4294967295L));
        iga igaVar = this.j;
        if (igaVar != null) {
            ifoVar.s(igaVar, (j() << 32) | (ffln.b(intBitsToFloat) & 4294967295L), new dhp(ifoVar));
        }
        float i = floatValue + i();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & ifoVar.b()));
        ifl t = ifoVar.t();
        long a = t.a();
        t.b().l();
        try {
            t.c.b(floatValue, 0.0f, i, intBitsToFloat2, 1);
            iga igaVar2 = this.j;
            float f = j;
            if (igaVar2 != null) {
                if (z) {
                    ige.a(ifoVar, igaVar2);
                }
                if (z2) {
                    ifoVar.t().c.e(f, 0.0f);
                    try {
                        ige.a(ifoVar, igaVar2);
                        ifoVar.t().c.e(-f, 0.0f);
                    } finally {
                    }
                }
            }
            if (z) {
                ifoVar.p();
            }
            if (z2) {
                ifoVar.t().c.e(f, 0.0f);
                try {
                    ifoVar.p();
                    ifoVar.t().c.e(-f, 0.0f);
                } finally {
                }
            }
        } finally {
            t.b().j();
            t.h(a);
        }
    }

    @Override // defpackage.hvh
    public final void t() {
        ffud ffudVar = this.i;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.i = null;
        iga igaVar = this.j;
        if (igaVar != null) {
            isx.k(this).b(igaVar);
            this.j = null;
        }
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }
}
