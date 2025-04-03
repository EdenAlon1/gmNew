package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvr {
    public static final hrh a = hqn.a(gvp.a, gvq.a);
    public float b;
    private final hjx c;
    private final hjx d;

    public gvr(float f, float f2, float f3) {
        this.b = f;
        this.c = new hhw(f3);
        this.d = new hhw(f2);
    }

    public final float a() {
        if (this.b == 0.0f) {
            return 0.0f;
        }
        return c() / this.b;
    }

    public final float b() {
        return this.c.c();
    }

    public final float c() {
        return this.d.c();
    }

    public final void d(float f) {
        this.c.i(f);
    }

    public final void e(float f) {
        this.d.i(ffmk.e(f, this.b, 0.0f));
    }
}
