package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hio {
    public int a;
    public hiq b;
    public hen c;
    public ffjm d;
    public int e;
    public cog f;
    public cop g;

    public hio(hiq hiqVar) {
        this.b = hiqVar;
    }

    public static final boolean p(hgl hglVar, cop copVar) {
        hglVar.getClass();
        hke c = hglVar.c();
        if (c == null) {
            c = hla.a;
        }
        return !c.a(hglVar.f().e, copVar.f(hglVar));
    }

    public final void a() {
        hiq hiqVar = this.b;
        if (hiqVar != null) {
            hiqVar.c(this, null);
        }
    }

    public final void b() {
        hiq hiqVar = this.b;
        if (hiqVar != null) {
            hiqVar.b();
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void c(boolean z) {
        this.a = z ? this.a | 4 : this.a & (-5);
    }

    public final void d(boolean z) {
        this.a = z ? this.a | 8 : this.a & (-9);
    }

    public final void e(boolean z) {
        this.a = z ? this.a | 32 : this.a & (-33);
    }

    public final void f(boolean z) {
        this.a = z ? this.a | 512 : this.a & (-513);
    }

    public final void g(boolean z) {
        this.a = z ? this.a | 16 : this.a & (-17);
    }

    public final void h(int i) {
        this.e = i;
        g(false);
    }

    public final boolean i() {
        return (this.a & 128) != 0;
    }

    public final boolean j() {
        return (this.a & 16) != 0;
    }

    public final boolean k() {
        return (this.a & 1) != 0;
    }

    public final boolean l() {
        hen henVar;
        return (this.b == null || (henVar = this.c) == null || !henVar.a()) ? false : true;
    }

    public final boolean m() {
        return this.g != null;
    }

    public final void n() {
        this.a |= 1;
    }

    public final int o(Object obj) {
        hiq hiqVar = this.b;
        if (hiqVar != null) {
            return hiqVar.c(this, obj);
        }
        return 1;
    }
}
