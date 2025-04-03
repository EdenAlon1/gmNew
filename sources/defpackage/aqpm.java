package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqpm implements aqpf {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final int m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;

    public aqpm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = i;
        this.n = z13;
        this.o = z14;
        this.p = z15;
        this.q = z16;
        this.r = z17;
        this.s = z18;
        this.t = z19;
        this.u = i > 0;
    }

    @Override // defpackage.aqpf
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.aqpf
    public final boolean b() {
        return this.g;
    }

    @Override // defpackage.aqpf
    public final boolean c() {
        return this.l;
    }

    @Override // defpackage.aqpf
    public final boolean d() {
        return this.k;
    }

    @Override // defpackage.aqpf
    public final boolean e() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqpm)) {
            return false;
        }
        aqpm aqpmVar = (aqpm) obj;
        return this.a == aqpmVar.a && this.b == aqpmVar.b && this.c == aqpmVar.c && this.d == aqpmVar.d && this.e == aqpmVar.e && this.f == aqpmVar.f && this.g == aqpmVar.g && this.h == aqpmVar.h && this.i == aqpmVar.i && this.j == aqpmVar.j && this.k == aqpmVar.k && this.l == aqpmVar.l && this.m == aqpmVar.m && this.n == aqpmVar.n && this.o == aqpmVar.o && this.p == aqpmVar.p && this.q == aqpmVar.q && this.r == aqpmVar.r && this.s == aqpmVar.s && this.t == aqpmVar.t;
    }

    @Override // defpackage.aqpf
    public final boolean f() {
        return this.h;
    }

    @Override // defpackage.aqpf
    public final boolean g() {
        return this.r;
    }

    @Override // defpackage.aqpf
    public final boolean h() {
        return this.u;
    }

    public final int hashCode() {
        int a = aqpl.a(this.a);
        boolean z = this.t;
        boolean z2 = this.s;
        boolean z3 = this.r;
        boolean z4 = this.q;
        boolean z5 = this.p;
        boolean z6 = this.o;
        boolean z7 = this.n;
        boolean z8 = this.l;
        boolean z9 = this.k;
        boolean z10 = this.j;
        boolean z11 = this.i;
        boolean z12 = this.h;
        boolean z13 = this.g;
        boolean z14 = this.f;
        boolean z15 = this.e;
        boolean z16 = this.d;
        return (((((((((((((((((((((((((((((((((((((a * 31) + aqpl.a(this.b)) * 31) + aqpl.a(this.c)) * 31) + aqpl.a(z16)) * 31) + aqpl.a(z15)) * 31) + aqpl.a(z14)) * 31) + aqpl.a(z13)) * 31) + aqpl.a(z12)) * 31) + aqpl.a(z11)) * 31) + aqpl.a(z10)) * 31) + aqpl.a(z9)) * 31) + aqpl.a(z8)) * 31) + this.m) * 31) + aqpl.a(z7)) * 31) + aqpl.a(z6)) * 31) + aqpl.a(z5)) * 31) + aqpl.a(z4)) * 31) + aqpl.a(z3)) * 31) + aqpl.a(z2)) * 31) + aqpl.a(z);
    }

    @Override // defpackage.aqpf
    public final boolean i() {
        return this.n;
    }

    @Override // defpackage.aqpf
    public final boolean j() {
        return this.j;
    }

    @Override // defpackage.aqpf
    public final boolean k() {
        return this.i;
    }

    @Override // defpackage.aqpf
    public final boolean l() {
        return this.p;
    }

    @Override // defpackage.aqpf
    public final boolean m() {
        return this.q;
    }

    @Override // defpackage.aqpf
    public final boolean n() {
        return this.s;
    }

    @Override // defpackage.aqpf
    public final boolean o() {
        return this.o;
    }

    @Override // defpackage.aqpf
    public final boolean p() {
        return this.d;
    }

    @Override // defpackage.aqpf
    public final boolean q() {
        return this.e;
    }

    @Override // defpackage.aqpf
    public final boolean r() {
        return this.a;
    }

    @Override // defpackage.aqpf
    public final boolean s() {
        return this.c;
    }

    @Override // defpackage.aqpf
    public final boolean t() {
        return this.f;
    }

    public aqpm() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, false);
    }
}
