package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lrz {
    public final boolean C;
    public final enhk D;
    public final enip E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final engw m;
    public final engw n;
    public final engw p;
    public final int r;
    public final int s;
    public final engw t;
    public final lrx u;
    public final engw v;
    public final boolean x;
    public final int y;
    public final int e = 0;
    public final int f = 0;
    public final int g = 0;
    public final int h = 0;
    public final int o = 0;
    public final int q = 0;
    public final int w = 0;
    public final boolean z = false;
    public final boolean A = false;
    public final boolean B = false;

    static {
        new lrz(new lry());
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
        lvf.N(5);
        lvf.N(6);
        lvf.N(7);
        lvf.N(8);
        lvf.N(9);
        lvf.N(10);
        lvf.N(11);
        lvf.N(12);
        lvf.N(13);
        lvf.N(14);
        lvf.N(15);
        lvf.N(16);
        lvf.N(17);
        lvf.N(18);
        lvf.N(19);
        lvf.N(20);
        lvf.N(21);
        lvf.N(22);
        lvf.N(23);
        lvf.N(24);
        lvf.N(25);
        lvf.N(26);
        lvf.N(27);
        lvf.N(28);
        lvf.N(29);
        lvf.N(30);
        lvf.N(31);
        lvf.N(32);
        lvf.N(33);
        lvf.N(34);
    }

    protected lrz(lry lryVar) {
        this.a = lryVar.a;
        this.b = lryVar.b;
        this.c = lryVar.c;
        this.d = lryVar.d;
        this.i = lryVar.e;
        this.j = lryVar.f;
        this.k = lryVar.g;
        this.l = lryVar.h;
        this.m = lryVar.i;
        this.n = lryVar.j;
        this.p = lryVar.k;
        this.r = lryVar.l;
        this.s = lryVar.m;
        this.t = lryVar.n;
        this.u = lryVar.o;
        this.v = lryVar.p;
        this.x = lryVar.q;
        this.y = lryVar.r;
        this.C = lryVar.s;
        this.D = enhk.j(lryVar.t);
        this.E = enip.o(lryVar.u);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lrz lrzVar = (lrz) obj;
            if (this.a == lrzVar.a && this.b == lrzVar.b && this.c == lrzVar.c && this.d == lrzVar.d && this.l == lrzVar.l && this.i == lrzVar.i && this.j == lrzVar.j && this.k == lrzVar.k && enkr.h(this.m, lrzVar.m) && enkr.h(this.n, lrzVar.n) && enkr.h(this.p, lrzVar.p) && this.r == lrzVar.r && this.s == lrzVar.s && enkr.h(this.t, lrzVar.t) && this.u.equals(lrzVar.u) && enkr.h(this.v, lrzVar.v) && this.x == lrzVar.x && this.y == lrzVar.y && this.C == lrzVar.C && this.D.equals(lrzVar.D) && this.E.equals(lrzVar.E)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 961) + this.p.hashCode()) * 961) + this.r) * 31) + this.s) * 31) + this.t.hashCode()) * 31) + 29791) * 31) + this.v.hashCode()) * 961) + (this.x ? 1 : 0)) * 31) + this.y) * 923521) + (this.C ? 1 : 0)) * 31) + this.D.hashCode()) * 31) + this.E.hashCode();
    }
}
