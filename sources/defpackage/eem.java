package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eem {
    public boolean a;
    public Object b;
    public final ejx c;
    private final hjz d;
    private final hjz e;

    public eem() {
        this(0, 0);
    }

    public final int a() {
        return this.d.c();
    }

    public final int b() {
        return this.e.c();
    }

    public final void c(int i) {
        this.d.i(i);
    }

    public final void d(int i) {
        this.e.i(i);
    }

    public final void e(int i, int i2) {
        if (i < 0.0f) {
            dwv.c("Index should be non-negative (" + i + ')');
        }
        c(i);
        this.c.c(i);
        d(i2);
    }

    public eem(int i, int i2) {
        this.d = new hhy(i);
        this.e = new hhy(i2);
        this.c = new ejx(i, 30, 100);
    }
}
