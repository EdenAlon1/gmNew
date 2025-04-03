package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgr implements hld {
    public final hho a;

    public hgr(hho hhoVar) {
        this.a = hhoVar;
    }

    @Override // defpackage.hld
    public final Object a(hqb hqbVar) {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgr) && ffkj.e(this.a, ((hgr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
