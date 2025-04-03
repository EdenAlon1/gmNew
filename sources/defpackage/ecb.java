package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecb implements ecd {
    private final String a;
    private final hho b;

    public ecb(eam eamVar, String str) {
        this.a = str;
        this.b = new hic(eamVar, hla.a);
    }

    @Override // defpackage.ecd
    public final int a(jzn jznVar) {
        return e().d;
    }

    @Override // defpackage.ecd
    public final int b(jzn jznVar, kah kahVar) {
        return e().a;
    }

    @Override // defpackage.ecd
    public final int c(jzn jznVar, kah kahVar) {
        return e().c;
    }

    @Override // defpackage.ecd
    public final int d(jzn jznVar) {
        return e().b;
    }

    public final eam e() {
        return (eam) this.b.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecb) {
            return ffkj.e(e(), ((ecb) obj).e());
        }
        return false;
    }

    public final void f(eam eamVar) {
        this.b.b(eamVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ')';
    }
}
