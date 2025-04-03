package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgg implements hld {
    public final ffji a;

    public hgg(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.hld
    public final Object a(hqb hqbVar) {
        return this.a.invoke(hqbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgg) && ffkj.e(this.a, ((hgg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
