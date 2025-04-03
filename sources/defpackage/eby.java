package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eby implements ecd {
    private final ecd a;
    private final ecd b;

    public eby(ecd ecdVar, ecd ecdVar2) {
        this.a = ecdVar;
        this.b = ecdVar2;
    }

    @Override // defpackage.ecd
    public final int a(jzn jznVar) {
        return Math.max(this.a.a(jznVar), this.b.a(jznVar));
    }

    @Override // defpackage.ecd
    public final int b(jzn jznVar, kah kahVar) {
        return Math.max(this.a.b(jznVar, kahVar), this.b.b(jznVar, kahVar));
    }

    @Override // defpackage.ecd
    public final int c(jzn jznVar, kah kahVar) {
        return Math.max(this.a.c(jznVar, kahVar), this.b.c(jznVar, kahVar));
    }

    @Override // defpackage.ecd
    public final int d(jzn jznVar) {
        return Math.max(this.a.d(jznVar), this.b.d(jznVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eby)) {
            return false;
        }
        eby ebyVar = (eby) obj;
        return ffkj.e(ebyVar.a, this.a) && ffkj.e(ebyVar.b, this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
