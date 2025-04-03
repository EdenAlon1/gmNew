package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkz implements hld {
    public final Object a;

    public hkz(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.hld
    public final Object a(hqb hqbVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hkz) && ffkj.e(this.a, ((hkz) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
