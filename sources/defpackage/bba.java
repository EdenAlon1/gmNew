package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bba extends bel {
    public final bgl a;
    public final bcf b;
    private final bcq c;
    private lld d;

    public bba(bcq bcqVar, bcf bcfVar) {
        super(bcqVar);
        this.d = null;
        this.c = bcqVar;
        this.b = bcfVar;
        this.a = bcfVar.b();
        ((Boolean) bfy.c(bcfVar, bcf.d, false)).booleanValue();
        ((Boolean) bfy.c(bcfVar, bcf.e, false)).booleanValue();
    }

    public static float d(float f, float f2, float f3) {
        if (f3 == f2) {
            return 0.0f;
        }
        if (f == f3) {
            return 1.0f;
        }
        if (f == f2) {
            return 0.0f;
        }
        float f4 = 1.0f / f2;
        return ((1.0f / f) - f4) / ((1.0f / f3) - f4);
    }

    public static float t(float f, float f2, float f3) {
        if (f == 1.0f) {
            return f3;
        }
        if (f == 0.0f) {
            return f2;
        }
        double d = 1.0f / f2;
        double d2 = 1.0d / (d + (((1.0f / f3) - d) * f));
        double d3 = f2;
        double d4 = f3;
        if (d2 < d3) {
            d2 = d3;
        } else if (d2 > d4) {
            d2 = d4;
        }
        return (float) d2;
    }

    @Override // defpackage.bel, defpackage.bcq
    public final bcq e() {
        return this.c;
    }

    @Override // defpackage.bel, defpackage.ati
    public final lld h() {
        return !biu.a(this.a, 6) ? new llg(0) : this.c.h();
    }

    @Override // defpackage.bel, defpackage.ati
    public final lld i() {
        if (!biu.a(this.a, 0)) {
            return new llg(new bkt(1.0f, 1.0f, 1.0f, 0.0f));
        }
        if (this.a != null) {
            axz axzVar = (axz) this.c.i().a();
            final Range a = this.a.a();
            if (a != null && (((Float) a.getLower()).floatValue() != axzVar.b() || ((Float) a.getUpper()).floatValue() != axzVar.a())) {
                if (this.d == null) {
                    this.d = bik.a(this.c.i(), new afd() { // from class: baz
                        @Override // defpackage.afd
                        public final Object a(Object obj) {
                            axz axzVar2 = (axz) obj;
                            float c = axzVar2.c();
                            Range range = a;
                            return new bkt(c, ((Float) range.getUpper()).floatValue(), ((Float) range.getLower()).floatValue(), bba.d(axzVar2.c(), ((Float) range.getLower()).floatValue(), ((Float) range.getUpper()).floatValue()));
                        }
                    });
                }
                return this.d;
            }
        }
        return this.c.i();
    }

    @Override // defpackage.bel, defpackage.bcq
    public final boolean r() {
        int[] f;
        bgl bglVar = this.a;
        if (bglVar == null || (f = bglVar.f()) == null) {
            return super.r();
        }
        for (int i : f) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
