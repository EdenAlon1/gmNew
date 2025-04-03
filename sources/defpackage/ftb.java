package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftb implements gul {
    public final gul a;
    public float c;
    public float d;
    public cxj e;
    public final hho b = new hic(new jzq(0.0f), hla.a);
    public final dif f = new dif();

    public ftb(gul gulVar) {
        this.a = gulVar;
        this.c = ((gulVar.d() % 12) * 0.5235988f) - 1.5707964f;
        this.d = (gulVar.e() * 0.10471976f) - 1.5707964f;
        this.e = cxk.a(this.c);
    }

    public static final float l(float f) {
        double d = f % 6.283185307179586d;
        if (d < eobe.a) {
            d += 6.283185307179586d;
        }
        return (float) d;
    }

    public static final float m(float f) {
        float f2 = f + 1.5707964f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    public static final int n(float f) {
        return ((int) ((f + 1.8325957218792777d) / 0.5235987901687622d)) % 12;
    }

    public static final int o(float f) {
        return ((int) ((f + 1.6231562058117728d) / 0.10471975803375244d)) % 60;
    }

    public final float a(float f) {
        float floatValue = ((Number) this.e.d()).floatValue() - f;
        while (floatValue > 3.1415927f) {
            floatValue -= 6.2831855f;
        }
        while (floatValue <= -3.1415927f) {
            floatValue += 6.2831855f;
        }
        return ((Number) this.e.d()).floatValue() - floatValue;
    }

    public final float b() {
        return ((Number) this.e.d()).floatValue();
    }

    public final float c() {
        return ((jzq) this.b.a()).a;
    }

    @Override // defpackage.gul
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.gul
    public final int e() {
        throw null;
    }

    @Override // defpackage.gul
    public final int f() {
        return this.a.f();
    }

    public final Object g(float f, cxt cxtVar, boolean z, ffgu ffguVar) {
        Object a = this.f.a(dhy.b, new fta(this, f, z, cxtVar, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.gul
    public final void h(int i) {
        this.c = ((i % 12) * 0.5235988f) - 1.5707964f;
        this.a.h(i);
        if (guk.b(f(), 0)) {
            this.e = cxk.a(this.c);
        }
    }

    @Override // defpackage.gul
    public final void i(int i) {
        throw null;
    }

    @Override // defpackage.gul
    public final void j(int i) {
        this.a.j(i);
    }

    @Override // defpackage.gul
    public final boolean k() {
        return ((guo) this.a).a;
    }
}
