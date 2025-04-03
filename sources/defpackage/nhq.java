package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhq {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final luv f;
    private final luv g;
    private int h;
    private int i;

    public nhq(luv luvVar, luv luvVar2, boolean z) {
        this.g = luvVar;
        this.f = luvVar2;
        this.e = z;
        luvVar2.K(12);
        this.a = luvVar2.m();
        luvVar.K(12);
        this.i = luvVar.m();
        ncs.b(luvVar.e() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.s() : this.f.r();
        if (this.b == this.h) {
            this.c = this.g.m();
            this.g.L(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + this.g.m() : -1;
        }
        return true;
    }
}
