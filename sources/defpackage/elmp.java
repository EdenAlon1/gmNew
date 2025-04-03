package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class elmp extends elno {
    public final eloy a;

    public elmp(eloy eloyVar) {
        if (eloyVar == null) {
            throw new NullPointerException("Null capability");
        }
        this.a = eloyVar;
    }

    @Override // defpackage.elno
    public final eloy a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elno) {
            return this.a.equals(((elno) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "IdentifiableActionCapability{capability=" + this.a.toString() + "}";
    }
}
