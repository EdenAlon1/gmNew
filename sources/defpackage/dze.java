package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dze implements ecd {
    private final ecd a;
    private final ecd b;

    public dze(ecd ecdVar, ecd ecdVar2) {
        this.a = ecdVar;
        this.b = ecdVar2;
    }

    @Override // defpackage.ecd
    public final int a(jzn jznVar) {
        return ffmk.f(this.a.a(jznVar) - this.b.a(jznVar), 0);
    }

    @Override // defpackage.ecd
    public final int b(jzn jznVar, kah kahVar) {
        return ffmk.f(this.a.b(jznVar, kahVar) - this.b.b(jznVar, kahVar), 0);
    }

    @Override // defpackage.ecd
    public final int c(jzn jznVar, kah kahVar) {
        return ffmk.f(this.a.c(jznVar, kahVar) - this.b.c(jznVar, kahVar), 0);
    }

    @Override // defpackage.ecd
    public final int d(jzn jznVar) {
        return ffmk.f(this.a.d(jznVar) - this.b.d(jznVar), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dze)) {
            return false;
        }
        dze dzeVar = (dze) obj;
        return ffkj.e(dzeVar.a, this.a) && ffkj.e(dzeVar.b, this.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
