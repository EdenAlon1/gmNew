package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class nji {
    public ndu c;
    public ncr d;
    public nje e;
    public long f;
    public long g;
    public long h;
    public int i;
    public int j;
    public long l;
    public boolean m;
    public boolean n;
    public final njc b = new njc();
    public njg k = new njg();

    protected abstract long a(luv luvVar);

    protected void b(boolean z) {
        int i;
        if (z) {
            this.k = new njg();
            this.g = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.i = i;
        this.f = -1L;
        this.h = 0L;
    }

    protected abstract boolean c(luv luvVar, long j, njg njgVar);

    protected final long e(long j) {
        return (j * 1000000) / this.j;
    }

    protected final long f(long j) {
        return (this.j * j) / 1000000;
    }

    protected void g(long j) {
        this.h = j;
    }
}
