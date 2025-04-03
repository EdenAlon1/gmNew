package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frc {
    public final hkx a;
    public final hho b;
    public final dif c;
    public final hjx d;
    public final hjx e;
    public final hjx f;
    private final ffsk g;
    private final hkx h;
    private final hjx i;

    public frc(ffsk ffskVar, hkx hkxVar, float f, float f2) {
        this.g = ffskVar;
        this.a = hkxVar;
        fqy fqyVar = new fqy(this);
        hqg hqgVar = hkg.a;
        this.h = new hgk(fqyVar, null);
        this.b = new hic(false, hla.a);
        this.d = new hhw(0.0f);
        this.i = new hhw(0.0f);
        this.e = new hhw(f2);
        this.f = new hhw(f);
        this.c = new dif();
    }

    public final float a() {
        return ((Number) this.h.a()).floatValue();
    }

    public final float b() {
        return this.i.c();
    }

    public final float c() {
        return this.e.c();
    }

    public final void d(float f) {
        this.i.i(f);
    }

    public final void e(float f) {
        this.d.i(f);
    }

    public final boolean f() {
        return ((Boolean) this.b.a()).booleanValue();
    }

    public final void g(float f) {
        ffqy.d(this.g, null, null, new frb(this, f, null), 3);
    }
}
