package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guo implements gul {
    public boolean a;
    private final hho b;
    private final hjz c;
    private final hjz d;

    public guo(int i, int i2, boolean z) {
        if (i < 0 || i >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i2 < 0 || i2 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.a = z;
        this.b = new hic(new guk(0), hla.a);
        this.c = new hhy(i);
        this.d = new hhy(i2);
    }

    @Override // defpackage.gul
    public final int d() {
        return this.c.c();
    }

    @Override // defpackage.gul
    public final int e() {
        return this.d.c();
    }

    @Override // defpackage.gul
    public final int f() {
        return ((guk) this.b.a()).a;
    }

    @Override // defpackage.gul
    public final void h(int i) {
        this.c.i(i);
    }

    @Override // defpackage.gul
    public final void i(int i) {
        this.d.i(i);
    }

    @Override // defpackage.gul
    public final void j(int i) {
        this.b.b(new guk(i));
    }

    @Override // defpackage.gul
    public final boolean k() {
        return this.a;
    }
}
