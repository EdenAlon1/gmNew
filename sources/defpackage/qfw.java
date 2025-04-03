package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qfw implements qfn {
    private final hkx h;
    private final hho i;
    private final hho j;
    private final hho k;
    private final hho l;
    private final hkx m;
    private final dif n;
    private final hho f = new hic(false, hla.a);
    private final hho g = new hic(1, hla.a);
    public final hho a = new hic(1, hla.a);
    public final hho b = new hic(false, hla.a);
    public final hho c = new hic(null, hla.a);
    public final hho d = new hic(Float.valueOf(1.0f), hla.a);
    public final hho e = new hic(false, hla.a);

    public qfw() {
        ffix ffixVar = new ffix() { // from class: qfq
            @Override // defpackage.ffix
            public final Object invoke() {
                qfw qfwVar = qfw.this;
                return Float.valueOf((qfwVar.p() && qfwVar.g() % 2 == 0) ? -qfwVar.f() : qfwVar.f());
            }
        };
        hqg hqgVar = hkg.a;
        this.h = new hgk(ffixVar, null);
        this.i = new hic(null, hla.a);
        Float valueOf = Float.valueOf(0.0f);
        this.j = new hic(valueOf, hla.a);
        this.k = new hic(valueOf, hla.a);
        this.l = new hic(Long.MIN_VALUE, hla.a);
        this.m = new hgk(new ffix() { // from class: qfr
            @Override // defpackage.ffix
            public final Object invoke() {
                qfw qfwVar = qfw.this;
                qci j = qfwVar.j();
                float f = 0.0f;
                if (j != null) {
                    if (qfwVar.f() < 0.0f) {
                        qgk k = qfwVar.k();
                        if (k != null) {
                            f = k.b(j);
                        }
                    } else {
                        qgk k2 = qfwVar.k();
                        f = k2 != null ? k2.a(j) : 1.0f;
                    }
                }
                return Float.valueOf(f);
            }
        }, null);
        new hgk(new ffix() { // from class: qfs
            @Override // defpackage.ffix
            public final Object invoke() {
                qfw qfwVar = qfw.this;
                boolean z = false;
                if (qfwVar.g() == qfwVar.h() && qfwVar.e() == qfwVar.d()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, null);
        this.n = new dif();
    }

    private final float s() {
        return ((Number) this.h.a()).floatValue();
    }

    private final float t() {
        return ((Number) this.j.a()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(long j) {
        this.l.b(Long.valueOf(j));
    }

    @Override // defpackage.hkx
    public final /* bridge */ /* synthetic */ Object a() {
        return Float.valueOf(e());
    }

    @Override // defpackage.qfn
    public final Object b(qci qciVar, int i, int i2, boolean z, float f, qgk qgkVar, float f2, qgh qghVar, ffgu ffguVar) {
        Object a;
        a = this.n.a(dhy.a, new qfu(this, i, i2, z, f, qgkVar, qciVar, f2, qghVar, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.qfn
    public final Object c(qci qciVar, float f, boolean z, ffgu ffguVar) {
        Object a;
        a = this.n.a(dhy.a, new qfv(this, qciVar, f, z, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public final float d() {
        return ((Number) this.m.a()).floatValue();
    }

    @Override // defpackage.qgg
    public final float e() {
        return ((Number) this.k.a()).floatValue();
    }

    @Override // defpackage.qgg
    public final float f() {
        return ((Number) this.d.a()).floatValue();
    }

    @Override // defpackage.qgg
    public final int g() {
        return ((Number) this.g.a()).intValue();
    }

    @Override // defpackage.qgg
    public final int h() {
        return ((Number) this.a.a()).intValue();
    }

    public final long i() {
        return ((Number) this.l.a()).longValue();
    }

    @Override // defpackage.qgg
    public final qci j() {
        return (qci) this.i.a();
    }

    @Override // defpackage.qgg
    public final qgk k() {
        return (qgk) this.c.a();
    }

    public final void l(qci qciVar) {
        this.i.b(qciVar);
    }

    public final void m(int i) {
        this.g.b(Integer.valueOf(i));
    }

    public final void n(boolean z) {
        this.f.b(Boolean.valueOf(z));
    }

    public final void o(float f) {
        qci j;
        this.j.b(Float.valueOf(f));
        if (((Boolean) this.e.a()).booleanValue() && (j = j()) != null) {
            f -= f % (1.0f / j.l);
        }
        this.k.b(Float.valueOf(f));
    }

    @Override // defpackage.qgg
    public final boolean p() {
        return ((Boolean) this.b.a()).booleanValue();
    }

    public final boolean q(int i, long j) {
        qci j2 = j();
        if (j2 == null) {
            return true;
        }
        long i2 = i() == Long.MIN_VALUE ? 0L : j - i();
        u(j);
        qgk k = k();
        float b = k != null ? k.b(j2) : 0.0f;
        qgk k2 = k();
        float a = k2 != null ? k2.a(j2) : 1.0f;
        float a2 = ((i2 / 1000000) / j2.a()) * s();
        float t = s() < 0.0f ? b - (t() + a2) : (t() + a2) - a;
        if (t < 0.0f) {
            o(ffmk.e(t(), b, a) + a2);
            return true;
        }
        float f = a - b;
        int i3 = (int) (t / f);
        int i4 = i3 + 1;
        if (g() + i4 > i) {
            o(d());
            m(i);
            return false;
        }
        m(g() + i4);
        float f2 = t - (i3 * f);
        o(s() < 0.0f ? a - f2 : b + f2);
        return true;
    }
}
