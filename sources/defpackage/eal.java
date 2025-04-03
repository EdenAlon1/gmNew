package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eal implements ebe {
    private final ecd a;
    private final jzn b;

    public eal(ecd ecdVar, jzn jznVar) {
        this.a = ecdVar;
        this.b = jznVar;
    }

    @Override // defpackage.ebe
    public final float a() {
        ecd ecdVar = this.a;
        jzn jznVar = this.b;
        return jznVar.ek(ecdVar.a(jznVar));
    }

    @Override // defpackage.ebe
    public final float b(kah kahVar) {
        ecd ecdVar = this.a;
        jzn jznVar = this.b;
        return jznVar.ek(ecdVar.b(jznVar, kahVar));
    }

    @Override // defpackage.ebe
    public final float c(kah kahVar) {
        ecd ecdVar = this.a;
        jzn jznVar = this.b;
        return jznVar.ek(ecdVar.c(jznVar, kahVar));
    }

    @Override // defpackage.ebe
    public final float d() {
        ecd ecdVar = this.a;
        jzn jznVar = this.b;
        return jznVar.ek(ecdVar.d(jznVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eal)) {
            return false;
        }
        eal ealVar = (eal) obj;
        return ffkj.e(this.a, ealVar.a) && ffkj.e(this.b, ealVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
