package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxb implements ecd {
    public final int a;
    private final String b;
    private final hho c = new hic(kpt.a, hla.a);
    private final hho d = new hic(true, hla.a);

    public dxb(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.ecd
    public final int a(jzn jznVar) {
        return e().e;
    }

    @Override // defpackage.ecd
    public final int b(jzn jznVar, kah kahVar) {
        return e().b;
    }

    @Override // defpackage.ecd
    public final int c(jzn jznVar, kah kahVar) {
        return e().d;
    }

    @Override // defpackage.ecd
    public final int d(jzn jznVar) {
        return e().c;
    }

    public final kpt e() {
        return (kpt) this.c.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxb) && this.a == ((dxb) obj).a;
    }

    public final void f(kxh kxhVar) {
        this.c.b(kxhVar.f(this.a));
        this.d.b(Boolean.valueOf(kxhVar.u(this.a)));
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + '(' + e().b + ", " + e().c + ", " + e().d + ", " + e().e + ')';
    }
}
