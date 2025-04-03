package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kil implements kii, kib {
    public final kie a;
    public int b;
    public int c = -1;
    public int d = -1;
    public float e = 0.0f;
    public Object f;
    private kiy g;

    public kil(kie kieVar) {
        this.a = kieVar;
    }

    @Override // defpackage.kib
    public final kii a() {
        return null;
    }

    @Override // defpackage.kii, defpackage.kib
    public final kiu b() {
        if (this.g == null) {
            this.g = new kiy();
        }
        return this.g;
    }

    public final void c(float f) {
        this.c = -1;
        this.d = -1;
        this.e = f;
    }

    @Override // defpackage.kib
    public final Object d() {
        return this.f;
    }

    @Override // defpackage.kii, defpackage.kib
    public final void e() {
        this.g.ag(this.b);
        int i = this.c;
        if (i != -1) {
            this.g.c(i);
            return;
        }
        int i2 = this.d;
        if (i2 != -1) {
            this.g.ae(i2);
        } else {
            this.g.af(this.e);
        }
    }

    @Override // defpackage.kib
    public final void f(kiu kiuVar) {
        this.g = kiuVar instanceof kiy ? (kiy) kiuVar : null;
    }
}
