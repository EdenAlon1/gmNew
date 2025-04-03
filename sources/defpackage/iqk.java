package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iqk implements ipr {
    public int a;
    public int b;
    public long c = 0;
    public long d = iqm.b;
    public long e = 0;

    private final void ew() {
        long j = this.c >> 32;
        long j2 = this.d;
        this.a = ffmk.i((int) j, jzk.d(j2), jzk.b(j2));
        long j3 = this.c & 4294967295L;
        long j4 = this.d;
        this.b = ffmk.i((int) j3, jzk.c(j4), jzk.a(j4));
        int i = this.a;
        long j5 = this.c;
        this.e = (((i - ((int) (j5 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j5 & 4294967295L))) / 2));
    }

    protected abstract void ee(long j, float f, ffji ffjiVar);

    public /* synthetic */ Object f() {
        return null;
    }

    public int v() {
        return (int) (this.c & 4294967295L);
    }

    public int w() {
        return (int) (this.c >> 32);
    }

    public void x(long j, float f, iga igaVar) {
        ee(j, f, null);
    }

    protected final void y(long j) {
        if (kaf.e(this.c, j)) {
            return;
        }
        this.c = j;
        ew();
    }

    protected final void z(long j) {
        if (jzk.g(this.d, j)) {
            return;
        }
        this.d = j;
        ew();
    }
}
