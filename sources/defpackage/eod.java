package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eod {
    public final eot a;
    public boolean b;
    public Object c;
    public final ejx d;
    public final hjz e;
    private final hjx f;

    public eod(int i, float f, eot eotVar) {
        this.a = eotVar;
        this.e = new hhy(i);
        this.f = new hhw(f);
        this.d = new ejx(i, 30, 100);
    }

    public final float a() {
        return this.f.c();
    }

    public final void b(int i) {
        this.e.i(i);
    }

    public final void c(float f) {
        this.f.i(f);
    }

    public final void d(int i, float f) {
        b(i);
        this.d.c(i);
        c(f);
    }
}
