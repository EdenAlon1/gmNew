package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvi implements dvw {
    final /* synthetic */ eot a;
    final /* synthetic */ ffjn b;
    final /* synthetic */ eog c;

    public dvi(eot eotVar, ffjn ffjnVar, eog eogVar) {
        this.a = eotVar;
        this.b = ffjnVar;
        this.c = eogVar;
    }

    @Override // defpackage.dvw
    public final float a(float f, float f2) {
        eot eotVar = this.a;
        int k = eotVar.k() + eotVar.m();
        if (k != 0) {
            int i = f < 0.0f ? this.a.f + 1 : this.a.f;
            int i2 = ffmk.i(((int) (f2 / k)) + i, 0, this.a.b());
            eog eogVar = this.c;
            this.a.k();
            this.a.m();
            int f3 = ffmk.f(Math.abs((ffmk.i(eogVar.a(i, i2), 0, this.a.b()) - i) * k) - k, 0);
            if (f3 != 0) {
                return f3 * Math.signum(f);
            }
        }
        return 0.0f;
    }

    @Override // defpackage.dvw
    public final float b(float f) {
        dvz dvzVar = this.a.x().n;
        List list = c().a;
        int size = list.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            eot eotVar = this.a;
            emu emuVar = (emu) list.get(i);
            float a = dwa.a(enp.a(c()), c().a(), c().d, c().b, emuVar.h, emuVar.a, dvzVar, eotVar.b());
            if (a <= 0.0f && a > f3) {
                f3 = a;
            }
            if (a >= 0.0f && a < f2) {
                f2 = a;
            }
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f2;
        }
        if (f2 == Float.POSITIVE_INFINITY) {
            f2 = f3;
        }
        if (!this.a.h()) {
            if (dvj.b(this.a, f)) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
        }
        if (!this.a.g()) {
            if (dvj.b(this.a, f)) {
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
                f2 = 0.0f;
            }
        }
        ffcf ffcfVar = new ffcf(Float.valueOf(f3), Float.valueOf(f2));
        float floatValue = ((Number) ffcfVar.a).floatValue();
        float floatValue2 = ((Number) ffcfVar.b).floatValue();
        float floatValue3 = ((Number) this.b.a(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
        if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != 0.0f) {
            dwv.d("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0");
        }
        if (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return floatValue3;
    }

    public final eob c() {
        return this.a.x();
    }
}
