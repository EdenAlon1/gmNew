package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dly {
    public final ffji a = dlv.a;
    public final dif b = new dif();
    public final hho c;
    public final dlu d;
    public final hjx e;
    public final hjx f;
    private final hho g;
    private final hho h;
    private final hkx i;
    private final hho j;

    public dly(Object obj) {
        this.g = new hic(obj, hla.a);
        this.h = new hic(obj, hla.a);
        dlx dlxVar = new dlx(this);
        hqg hqgVar = hkg.a;
        this.i = new hgk(dlxVar, null);
        this.e = new hhw(Float.NaN);
        new hgk(new dlw(this), hla.a);
        this.f = new hhw(0.0f);
        this.j = new hic(null, hla.a);
        this.c = new hic(new dmu(ffel.a, new float[0]), hla.a);
        this.d = new dlu(this);
    }

    public static /* synthetic */ Object l(dly dlyVar, ffjn ffjnVar, ffgu ffguVar) {
        Object a = dlyVar.b.a(dhy.a, new dlt(dlyVar, ffjnVar, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public final float a() {
        return this.e.c();
    }

    public final float b(float f) {
        Float valueOf;
        float a = (Float.isNaN(a()) ? 0.0f : a()) + f;
        float[] fArr = k().a;
        Float f2 = null;
        int i = 1;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f3 = fArr[0];
            int y = ffdo.y(fArr);
            if (y > 0) {
                int i2 = 1;
                while (true) {
                    f3 = Math.min(f3, fArr[i2]);
                    if (i2 == y) {
                        break;
                    }
                    i2++;
                }
            }
            valueOf = Float.valueOf(f3);
        }
        float floatValue = valueOf != null ? valueOf.floatValue() : Float.NaN;
        float[] fArr2 = k().a;
        if (fArr2.length != 0) {
            float f4 = fArr2[0];
            int y2 = ffdo.y(fArr2);
            if (y2 > 0) {
                while (true) {
                    f4 = Math.max(f4, fArr2[i]);
                    if (i == y2) {
                        break;
                    }
                    i++;
                }
            }
            f2 = Float.valueOf(f4);
        }
        return ffmk.e(a, floatValue, f2 != null ? f2.floatValue() : Float.NaN);
    }

    public final float c() {
        if (Float.isNaN(a())) {
            dwv.d("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return a();
    }

    public final Object d() {
        return this.g.a();
    }

    public final Object e() {
        return this.j.a();
    }

    public final Object f() {
        return this.h.a();
    }

    public final Object g() {
        return this.i.a();
    }

    public final void h(Object obj) {
        this.g.b(obj);
    }

    public final void i(Object obj) {
        this.j.b(obj);
    }

    public final void j(Object obj) {
        this.h.b(obj);
    }

    public final dmu k() {
        return (dmu) this.c.a();
    }
}
