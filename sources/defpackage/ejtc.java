package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ejtc extends ejvi {
    public final enip a;

    public ejtc(enip enipVar) {
        if (enipVar == null) {
            throw new NullPointerException("Null childKeys");
        }
        this.a = enipVar;
    }

    @Override // defpackage.ejvi
    public final enip a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejvi) {
            return this.a.equals(((ejvi) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MergedKey{childKeys=" + this.a.toString() + "}";
    }
}
